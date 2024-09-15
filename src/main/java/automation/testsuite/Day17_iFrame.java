package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day17_iFrame extends CommonBase {
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_CODESTAR);
	}
	
	
	@Test
	public void handleIframeDangKyTuVan() {
		scrollToElement(By.xpath("(//iframe[@title ='Khách hàng'])[1]"));
		WebElement btnGuiNgay = getElementPresentDOM(By.xpath("(//iframe[@title ='Khách hàng'])[1]"));
		driver.switchTo().frame(btnGuiNgay);
		System.out.println("Swich toi iframe Dang ky tu van lo trinh thanh cong");
		type(By.id("name"), "Test demo");
		type(By.id("phone_number"), "0123466789");
		click(By.xpath("//button[normalize-space() ='Gửi ngay']"));
		assertTrue(isElementVisibility(By.xpath("//button[normalize-space() ='Gửi ngay']")));
	}
}
