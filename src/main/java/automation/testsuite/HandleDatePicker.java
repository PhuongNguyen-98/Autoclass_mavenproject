package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.inject.Key;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

@Test
public class HandleDatePicker extends CommonBase {
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_GURU99);
	}
	
	@Test
	public void inputBirthDay() {
		WebElement bdayText = driver.findElement(By.xpath("//input[@name='bdaytime']"));
		bdayText.sendKeys("08281998");
		bdayText.sendKeys(Keys.TAB);
		bdayText.sendKeys("1000AM");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		assertTrue(driver.findElement(By.xpath("//div[text()='Your Birth Date is 1998-08-28']")).isDisplayed());
	}

}
