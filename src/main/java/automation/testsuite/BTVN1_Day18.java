package automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class BTVN1_Day18 extends CommonBase {
	
	@BeforeMethod
	@Parameters("browser")
	public void openDriver(@Optional("chrome") String browser)
	{
		setupDriver(browser);
		driver.get(CT_PageURLs.URL_DIENMAYNHAPKHAU);
	}
	
	@Test
	public void verifyZaloChatFunction() {
		click(By.id("zalo-vr"));
		String mainWindow = driver.getWindowHandle();
		Set<String> listWindows = driver.getWindowHandles();
		for(String windowItem:listWindows) {
			if(!windowItem.equals(mainWindow)) {
				driver.switchTo().window(windowItem);
				pause(3000);
				assertEquals(driver.getTitle(), "Zalo - ĐIỆN MÁY HÙNG ANH");
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		assertEquals(driver.getTitle(), "Điện Máy Hùng Anh - Phân Phối Điều Hòa, Điện Lạnh Chính Hãng");
	}
	
	@AfterMethod
	public void closeDriver() {
		driver.close();
	}

}
