package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.UpdatePassword_PageFactory;

public class UpdatePwTest_Day15 extends CommonBase {
	
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_TEDU);
	}
	
	@Test
	public void updatePasswordSuccessfully() {
		UpdatePassword_PageFactory updatePass = new UpdatePassword_PageFactory(driver);
		updatePass.LoginFunction("testerdemo@gmail.com", "654321");
		updatePass.UpdatePassword("654321", "123456");
		assertTrue(driver.findElement(By.xpath("//div[text()='Đổi mật khẩu thành công. Mời bạn đăng nhập lại.']")).isDisplayed());
	}

}
