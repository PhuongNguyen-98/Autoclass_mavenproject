package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.LoginPageFactory;

public class Logintest_Factory extends CommonBase {
	LoginPageFactory loginFactory;
	// Ctrl + A -> Ctrl + shift + F
	
	@BeforeMethod
	public void openFirefox() {
		driver = initFirefoxDriver(CT_PageURLs.URL_CRMSTAR);
	}
	
	@Test
	public void loginSuccessfully() {
		loginFactory = new LoginPageFactory(driver);
		loginFactory.LoginFunction("admin@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//p[text()='Quản lý người dùng']")).isDisplayed());
		
	}
	
	@Test
	public void loginFail_IncorrectPass() {
		loginFactory = new LoginPageFactory(driver);
		loginFactory.LoginFunction("admin@gmail.com", "123456789");
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
		
	}

}
