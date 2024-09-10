package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class BTVN3_Day16 extends CommonBase {
	
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_GURU99_DELETECUSTOMER);
	}
	
	@Test
	public void verifyAlertAccepted() {
		type(By.xpath("//input[@type='text']"), "12345");
		click(By.xpath("//input[@type='submit']"));
		waitAlertPresent();
		driver.switchTo().alert().accept();
		waitAlertPresent();
		driver.switchTo().alert().accept();
		assertEquals(driver.getTitle(), "Delete Customer");
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
	}

}
