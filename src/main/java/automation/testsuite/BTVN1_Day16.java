package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class BTVN1_Day16 extends CommonBase {
	
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_ALADALOGIN);
	}
	
	@Test
	public void changePasswordSuccessfully() {
		type(By.id("txtLoginUsername"), "demoemail101@gmail.com");
		type(By.id("txtLoginPassword"), "123456");
		click(By.xpath("//button[@class='btn btn-lg btn_pink fs18 fleft w100per pass btn_submit']"));
		click(By.xpath("//div[@class='avatar2']"));
		click(By.xpath("//a[text()='Chỉnh sửa thông tin']"));	
		scrollToElement(By.xpath("//div[text()='Thông tin đăng nhập']"));
		type(By.id("txtpassword"), "123456");
		type(By.id("txtnewpass"), "123456");
		type(By.id("txtrenewpass"), "123456");
		click(By.xpath("//button[text()='Lưu mật khẩu mới']"));
		waitAlertPresent();
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Cập nhật mật khẩu mới thành công!");
		driver.switchTo().alert().accept();
		//assertEquals(driver.findElement(By.id("txtpassword")).getText(), "");
		assertEquals(driver.getTitle(), "");
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
	}

}
