package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.ChangePWAladaBTVN;

public class ChangepwAladaTest extends CommonBase {
	
	@BeforeMethod
	
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_ALADA);
	}
	
	@Test (priority = 1)
	public void signinSuccessfully() throws InterruptedException
	{
		ChangePWAladaBTVN signin = new ChangePWAladaBTVN(driver);
		signin.SigninFunction("Nguyễn Văn ABC", "ngyenvanabc2@gmail.com","ngyenvanabc2@gmail.com","123456","123456","0123456654");
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
	}
	
	@Test (priority = 2)
	public void changePasswordSuccessfully() throws InterruptedException {
		ChangePWAladaBTVN login = new ChangePWAladaBTVN(driver);
		login.LoginFunction("ngyenvanabc2@gmail.com", "123456");
		ChangePWAladaBTVN reNewPassword = new ChangePWAladaBTVN(driver);
		reNewPassword.ChangePasswordFunction("123456", "123456", "123456");
		Thread.sleep(5000);
		 Alert alert = driver.switchTo().alert();
	        alert.accept();
	        Thread.sleep(2000);
	    ChangePWAladaBTVN logout = new ChangePWAladaBTVN(driver);
	    logout.LogoutFunction();
	    ChangePWAladaBTVN login2 = new ChangePWAladaBTVN(driver);
		login2.LoginFunction("ngyenvanabc2@gmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
		
	}

	

}
