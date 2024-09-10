package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day16_Alert extends CommonBase {
	
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_AUTOMATIONTESTING);
	}
	
	@Test (priority = 1)
	public void verifyAlertMessage() {
		click(By.xpath("//a[text()='Alert with Textbox ']"));
		click(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		waitAlertPresent();
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Please enter your name");
	}
	
	@Test ( priority = 2)
	public void pressOkOnAlert() {
		click(By.xpath("//a[text()='Alert with Textbox ']"));
		click(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		waitAlertPresent();
		driver.switchTo().alert().sendKeys("Phuong Nguyen");
		driver.switchTo().alert().accept();
		WebElement helloLabel = getElementPresentDOM(By.id("demo1"));
		assertEquals(helloLabel.getText(), "Hello Phuong Nguyen How are you today");
	}
	
	@Test (priority = 3)
	public void pressCancel() {
		click(By.xpath("//a[text()='Alert with Textbox ']"));
		click(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		waitAlertPresent();
		driver.switchTo().alert().sendKeys("Phuong Nguyen");
		pause(2000);
		driver.switchTo().alert().dismiss();
		assertFalse(isElementVisibility(By.id("demo1")));
	}
}
