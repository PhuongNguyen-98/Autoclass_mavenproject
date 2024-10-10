package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.BAT_Footer;

public class BAT_FooterTest extends CommonBase {
	BAT_Footer footer;
	
	@BeforeMethod
	@Parameters("browser")
	public void openDriver(@Optional("chrome") String browser)
	{
		setupDriver(browser);
		driver.get(CT_PageURLs.URL_BEPANTOAN);
	}
	
	@Test (priority = 1)
	public void verifyNavigateChinhSachVanChuyenPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.ChinhSachVanChuyen();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách vận chuyển']")).isDisplayed());
	}
	
	@Test (priority = 2)
	public void verifyNavigateChinhSachBaoHanhPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.ChinhSachBaoHanh();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách bảo hành']")).isDisplayed());
	}
	
	@Test (priority = 3)
	public void verifyNavigateChinhSachDoiTraPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.ChinhSachDoiTra();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách đổi trả']")).isDisplayed());
	}
	
	@Test (priority = 4)
	public void verifyNavigateChinhSachBaoMatPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.ChinhSachBaoMat();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách bảo mật']")).isDisplayed());
	}
	
	@Test (priority = 5)
	public void verifyNavigateHuongDanDatHangPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.HuongDanDatHang();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Hướng dẫn đặt hàng']")).isDisplayed());
	}
	
	@Test (priority = 6)
	public void verifyNavigateChinhSachBaoDuongLapDatPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.ChinhSachBaoDuongLapDat();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách bảo trì, bảo dưỡng & lắp đặt']")).isDisplayed());
	}
	
	@Test (priority = 7)
	public void verifyNavigateChinhSachGiaoHangPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.ChinhSachGiaoHang();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách giao, nhận hàng và kiểm hàng']")).isDisplayed());
	}
	
	
	@Test (priority = 8)
	public void verifyNavigateChinhSachThanhToanPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.ChinhSachThanhToan();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[text()='Chính sách Thanh Toán']")).isDisplayed());
	}
	
	
	@Test (priority = 9)
	public void verifyNavigateBepTuPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.FooterBepTu();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='TOP 300+ Mẫu Bếp Từ Nhập Khẩu Có Inventer Tiết Kiệm Điện']")).isDisplayed());
	}
	
	
	@Test (priority = 10)
	public void verifyNavigateBepDienTuPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.FooterBepDienTu();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Bếp điện từ nhập khẩu chính hãng từ châu Âu']")).isDisplayed());
	}
	
	@Test (priority = 11)
	public void verifyNavigateBepDienPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.FooterBepDien();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Bếp Điện']")).isDisplayed());
	}
	
	@Test (priority = 12)
	public void verifyNavigateMayHutMuiPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.FooterMayHutMui();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Top Máy hút mùi tốt nhất cho gia đình']")).isDisplayed());
	}
	
	@Test (priority = 13)
	public void verifyNavigateMayRuaChenPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.FooterMayRuaChen();
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='top máy rửa bát rửa sạch sấy khô Diệt khuẩn đáng mua nhất năm 2024']")).isDisplayed());
	}
	
	@Test (priority = 14)
	public void verifyNavigateTinTucPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.TinTuc();
		pause(3000);
		assertEquals(driver.getTitle(), "NHIỀU TIPS NẤU ĂN NGON, KIẾN THỨC CHĂM SÓC NHÀ CỬA");
	}
	
	@Test (priority = 15)
	public void verifyNavigateGioiThieuPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.GioiThieu();
		pause(3000);
		assertEquals(driver.getTitle(), "BẾP AN TOÀN: UY TÍN, CHẤT LƯỢNG, GIÁ TỐT");
	}
	
	@Test (priority = 16)
	public void verifyNavigateLienHePage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.LienHe();
		pause(3000);
		assertEquals(driver.getTitle(), "LIÊN HỆ VỚI BẾP AN TOÀN");
	}
	
	@Test (priority = 17)
	public void verifyNavigateZaloChat() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.Zalo();
		String mainWindow = driver.getWindowHandle();
		Set<String> listWindows = driver.getWindowHandles();
		for(String windowItem:listWindows) {
			if(!windowItem.equals(mainWindow)) {
				driver.switchTo().window(windowItem);
				pause(3000);
				assertEquals(driver.getTitle(), "Zalo - Bepantoanvn");
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		assertEquals(driver.getTitle(), "BẾP AN TOÀN - CHUYÊN THIẾT BỊ NHÀ BẾP, PHÒNG TẮM");
	}
	
	@Test (priority = 18)
	public void verifyNavigateFacebookPage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.Facebook();
		String mainWindow = driver.getWindowHandle();
		Set<String> listWindows = driver.getWindowHandles();
		for(String windowItem:listWindows) {
			if(!windowItem.equals(mainWindow)) {
				driver.switchTo().window(windowItem);
				pause(3000);
				assertEquals(driver.getTitle(), "Bếp An Toàn | Hanoi | Facebook");
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		assertEquals(driver.getTitle(), "BẾP AN TOÀN - CHUYÊN THIẾT BỊ NHÀ BẾP, PHÒNG TẮM");
	}
	
	@Test (priority = 19)
	public void verifyNavigateYoutubePage() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.Youtube();
		String mainWindow = driver.getWindowHandle();
		Set<String> listWindows = driver.getWindowHandles();
		for(String windowItem:listWindows) {
			if(!windowItem.equals(mainWindow)) {
				driver.switchTo().window(windowItem);
				pause(3000);
				assertEquals(driver.getTitle(), "BẾP AN TOÀN - YouTube");
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		assertEquals(driver.getTitle(), "BẾP AN TOÀN - CHUYÊN THIẾT BỊ NHÀ BẾP, PHÒNG TẮM");
	}
	
	@Test (priority = 20)
	public void verifyContactMuahang() {
		footer = new BAT_Footer(driver);
		scrollToElement(By.xpath("//p[text()='© 2021 Công ty TNHH Bếp An Toàn']"));
		footer.ContactMuahang();
		pause(3000);
//		waitAlertPresent();
//		String alertMessage = driver.switchTo().activeElement().getText();
//		
//		System.out.println(alertMessage);
		
		Alert alert = driver.switchTo().alert();
		
		String alertMessage = alert.getText();
		assertEquals(alertMessage, "https://bepantoan.vn wants to open this application.");
	}
	
	
	
//	@AfterMethod
//	public void closeDriver() {
//		driver.close();
//	}

}
