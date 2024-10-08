package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.LoginPageFactory;
import automation.page.LogoutPageFactory;
import automation.page.LoginPageFactory;

public class LogoutestFactory extends CommonBase {
	LoginPageFactory loginFactory;
	LogoutPageFactory logoutFactory;
	
	@BeforeMethod
	@Parameters("browser")
	public void openChrome(@Optional("firefox") String browser)
	{
		setupDriver(browser);
		driver.get(CT_PageURLs.URL_CRMSTAR);
		//driver = initFirefoxDriver(CT_PageURLs.URL_CRMSTAR);
	}
	
	@Test
	public void logoutSuccessfully() throws InterruptedException {
		loginFactory = new LoginPageFactory(driver);
		loginFactory.LoginFunction("admin@gmail.com", "12345678");
		Thread.sleep(1000);
		logoutFactory = new LogoutPageFactory(driver);
		logoutFactory.LogoutFunction();
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
		
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
}
