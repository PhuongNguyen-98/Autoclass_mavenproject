package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.Search_JS;

public class SearchJsTest extends CommonBase {
	
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_TEDU);
	}
	
//	@Test
//	public void signinSuccessfully() throws InterruptedException {
//		Search_JS signin = new Search_JS(driver);
//		signin.SigninFunction();
//		
//	}
	@Test
	public void searchkeyword() throws InterruptedException {
		Search_JS search = new Search_JS(driver);
		search.SearchFunction();
		assertTrue(driver.findElement(By.xpath("//a[text()='Bài 52: Gửi phản hồi và gửi mail trong ASP NET sử dụng SMTP']")).isDisplayed());
	}
	
}
