package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.LoginPage;

public class LoginTest extends CommonBase {
	
	@BeforeMethod
	
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_ALADA);
	}
	
	@Test
	public void loginSuccessfully()
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("demoemail101@gmail.com","123456");
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
	}
	
	@Test
	public void loginFail_UsernameNotExist()
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("demoemail12345@gmail.com","123456");
		assertTrue(driver.findElement(By.xpath("(//p[text()='Email này chưa được đăng ký.'])")).isDisplayed());
	}
	
	@Test
	public void loginFail_PasswordInvalid()
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("demoemail101@gmail.com","123456789");
		assertTrue(driver.findElement(By.xpath("(//p[text()='Mật khẩu sai.'])")).isDisplayed());
	}
	
	@Test
	public void loginFail_leaveBlank()
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("","");
		assertTrue(driver.findElement(By.id("txtLoginUsername-error")).isDisplayed() && driver.findElement(By.id("txtLoginPassword-error")).isDisplayed());
	}
	

}
