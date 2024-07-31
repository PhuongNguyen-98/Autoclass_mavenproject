package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day8_Practice2 extends CommonBase{
	@BeforeMethod
	public void openBrowser(){
		driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
	}
	
	@Test
	public void findElementBy() {
		
		WebElement email = driver.findElement(By.name("email"));
		System.out.println(email);
	}

}