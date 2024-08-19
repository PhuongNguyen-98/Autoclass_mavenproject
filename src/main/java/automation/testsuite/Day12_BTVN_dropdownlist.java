package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day12_BTVN_dropdownlist extends CommonBase {
	
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_GLOBALSQA);
	}
	
	@Test
	public void Case1_DropdownlistCountry() {
		Select dropdownCountry = new Select(driver.findElement(By.xpath("//option[text()='Afghanistan']/ancestor::select")));
		assertEquals(dropdownCountry.getOptions().size(),249);
		
		dropdownCountry.selectByIndex(3);
		assertEquals(dropdownCountry.getFirstSelectedOption().getText(), "Algeria");
		
		dropdownCountry.selectByValue("VNM");
		assertEquals(dropdownCountry.getFirstSelectedOption().getText(), "Viet Nam");
		
		dropdownCountry.selectByVisibleText("Switzerland");
		assertEquals(dropdownCountry.getFirstSelectedOption().getText(), "Switzerland");
		
	}
	
	@Test
	public void case2_fillSearchField() {
		WebElement search = driver.findElement(By.id("s"));
		search.sendKeys("Moe test");
//		search.clear();
		
		WebElement buttonSearch = driver.findElement(By.xpath("//button[@class='button_search']"));
		buttonSearch.click();
	}
	
//	@AfterMethod
//	public void closeBrowser()
//	{
//		driver.close();
//	}
	

}
