package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class BTVN2_Day16 extends CommonBase {
	
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMPRACTISE);
	}
	
	@Test
	public void verifyAlertMessage() {
		click(By.xpath("//button[text()='Try it']"));
		waitAlertPresent();
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Welcome to Selenium WebDriver Tutorials");
		driver.switchTo().alert().dismiss();
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
	}
	
	

}
