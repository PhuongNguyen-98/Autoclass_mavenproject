package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day12_Dropdownlist extends CommonBase{
	
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASY3);
	}
	
	@Test
	public void case1_Dropdownlist()
	{
		Select dropdownDay = new Select(driver.findElement(By.id("select-demo")));
		// case 1 : kiem tra size cua dropdownlist la 8
		assertEquals(dropdownDay.getOptions().size(),8);
		
		//Case2: chon monday bang cach thu 1, kiem tra gia tri sau khi chon
		dropdownDay.selectByVisibleText("Monday");
		assertEquals(dropdownDay.getFirstSelectedOption().getText(), "Monday");
		
		//Case3: chon Tuesday bang cach 2, kiem tra gia tri sau khi chon
		dropdownDay.selectByValue("Tuesday");
		assertEquals(dropdownDay.getFirstSelectedOption().getText(),"Tuesday");
		
		//Case4: chon sunday bang cach 3, kiem tra gia tri sau khi chon
		dropdownDay.selectByIndex(1);
		assertEquals(dropdownDay.getFirstSelectedOption().getText(),"Sunday");
	}

}
