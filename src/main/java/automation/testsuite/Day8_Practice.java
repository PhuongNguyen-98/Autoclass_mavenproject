package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Day8_Practice extends CommonBase {
	@BeforeMethod
	public void openBrowser(){
		driver = initChromeDriver("https://alada.vn/tai-khoan/dang-ky.html");
	}
	
	@Test
	public void getElementByID() {
		WebElement txtHovaTen = driver.findElement(By.id("txtFirstname"));
		System.out.println(txtHovaTen);
		
		WebElement txtEmail = driver.findElement(By.name("txtEmail"));
		System.out.println(txtEmail);
		
		WebElement linkChinhSach = driver.findElement(By.linkText("chính sách"));
		System.out.println(linkChinhSach);
		
		WebElement linkThoaThuanSuDung = driver.findElement(By.partialLinkText("thỏa thuận"));
		System.out.println(linkThoaThuanSuDung);
		
		WebElement checkboxDongY = driver.findElement(By.className("marleft0"));
		System.out.println(checkboxDongY);
		
		WebElement buttonDangKy = driver.findElement(By.tagName("button"));
		System.out.println(buttonDangKy);
		
		WebElement txtHoVaTen2 = driver.findElement(By.xpath("//input[@placeholder='Nhập họ và tên']"));
	}
}
