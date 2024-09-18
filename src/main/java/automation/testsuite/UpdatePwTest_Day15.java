package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.UpdatePassword_PageFactory;

public class UpdatePwTest_Day15 extends CommonBase {
	
	@BeforeMethod
	@Parameters("browser")
	public void openChrome(@Optional("chrome") String browser)
	{
		setupDriver(browser);
		driver.get(CT_PageURLs.URL_TEDU);
	}
	
	@Test
	public void updatePasswordSuccessfully() {
		UpdatePassword_PageFactory updatePass = new UpdatePassword_PageFactory(driver);
		updatePass.LoginFunction("testerdemo@gmail.com", "123456");
		isElementVisibility(By.id("onesignal-slidedown-cancel-button"));
		click(By.id("onesignal-slidedown-cancel-button"));
		pause(2000);
		updatePass.UpdatePassword("123456", "123456");
		assertTrue(driver.findElement(By.xpath("//div[text()='Đổi mật khẩu thành công. Mời bạn đăng nhập lại.']")).isDisplayed());
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}

}
