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
		
		WebElement password = driver.findElement(By.name("Password"));
		System.out.println(password);
		
		WebElement company = driver.findElement(By.name("company"));
		System.out.println(company);
		
		WebElement mobileNumber = driver.findElement(By.name("mobile number"));
		System.out.println(mobileNumber);
	}

}
