package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.BAT_Footer;
import automation.page.BAT_SupportPage;

public class BAT_SupportPageTest extends CommonBase {
	
	BAT_SupportPage supportpage;
	
	@BeforeMethod
	@Parameters("browser")
	public void openDriver(@Optional("chrome") String browser)
	{
		setupDriver(browser);
		driver.get(CT_PageURLs.URL_BATSUPPORTPAGE);
	}
	
	@Test (priority = 1)
	public void verifySupportPage() {
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách vận chuyển']")).isDisplayed());
	}
	
	@Test (priority = 2)
	public void verifyNavigateChinhSachBaoHanhPage() {
		supportpage = new BAT_SupportPage(driver);
		supportpage.ChinhSachBaoHanh();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách bảo hành']")).isDisplayed());
	}
	
	@Test (priority = 3)
	public void verifyNavigateChinhSachDoiTraPage() {
		supportpage = new BAT_SupportPage(driver);
		supportpage.ChinhSachDoiTra();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách đổi trả']")).isDisplayed());
	}
	
	@Test (priority = 4)
	public void verifyNavigateChinhSachBaoMatPage() {
		supportpage = new BAT_SupportPage(driver);
		supportpage.ChinhSachBaoMat();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách bảo mật']")).isDisplayed());
	}
	
	@Test (priority = 5)
	public void verifyNavigateHuongDanDatHangPage() {
		supportpage = new BAT_SupportPage(driver);
		supportpage.HuongDanDatHang();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Hướng dẫn đặt hàng']")).isDisplayed());
	}
	
	@Test (priority = 6)
	public void verifyNavigateChinhSachBaoDuongLapDatPage() {
		supportpage = new BAT_SupportPage(driver);
		supportpage.ChinhSachBaoDuongLapDat();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách bảo trì, bảo dưỡng & lắp đặt']")).isDisplayed());
	}
	
	@Test (priority = 7)
	public void verifyNavigateChinhSachGiaoHangPage() {
		supportpage = new BAT_SupportPage(driver);
		supportpage.ChinhSachGiaoHang();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách giao, nhận hàng và kiểm hàng']")).isDisplayed());
	}
	
	@Test (priority = 8)
	public void verifyNavigateChinhSachThanhToanPage() {
		supportpage = new BAT_SupportPage(driver);
		supportpage.ChinhSachThanhToan();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách Thanh Toán']")).isDisplayed());
	}
	
	@Test (priority = 9)
	public void verifyNavigateNorthBranch1() {
		supportpage = new BAT_SupportPage(driver);
		scrollToElement(By.xpath("//h2[text()='Hệ thống showroom']"));
		pause(10000);
		supportpage.BranchNorth1();
		String mainWindow = driver.getWindowHandle();
		Set<String> listWindows = driver.getWindowHandles();
		for(String windowItem:listWindows) {
			if(!windowItem.equals(mainWindow)) {
				driver.switchTo().window(windowItem);
				pause(3000);
				assertEquals(driver.getTitle(), "21°01'22.3\"N 105°47'59.0\"E - Google Maps");
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		assertEquals(driver.getTitle(), "Bếp An Toàn");
	}
	
	@Test (priority = 10)
	public void verifyNavigateSouthBranch1() {
		supportpage = new BAT_SupportPage(driver);
		scrollToElement(By.xpath("//h2[text()='Hệ thống showroom']"));
		pause(10000);
		supportpage.BranchNSouth1();
		String mainWindow = driver.getWindowHandle();
		Set<String> listWindows = driver.getWindowHandles();
		for(String windowItem:listWindows) {
			if(!windowItem.equals(mainWindow)) {
				driver.switchTo().window(windowItem);
				pause(3000);
				assertEquals(driver.getTitle(), "Bếp An Toàn - Google Maps");
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		assertEquals(driver.getTitle(), "Bếp An Toàn");
	}
	
	@AfterMethod
	public void closeDriver() {
		driver.close();
	}
	

}
