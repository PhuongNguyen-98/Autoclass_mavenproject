package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.LoginPage;
import automation.page.Loginpage_BTVN;

public class Logintest_codestar extends CommonBase {
	
	@BeforeMethod
	
	public void openFirefox() {
		driver = initFirefoxDriver(CT_PageURLs.URL_CRMSTAR);
	}
	
	@Test
	public void loginSuccessfully()
	{
		Loginpage_BTVN login = new Loginpage_BTVN(driver);
		login.LoginFunction("admin@gmail.com","12345678");
		assertTrue(driver.findElement(By.xpath("//p[text()='Quản lý người dùng']")).isDisplayed());
	}

}
