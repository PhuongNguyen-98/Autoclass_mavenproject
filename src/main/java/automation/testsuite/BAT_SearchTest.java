package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.BAT_Search;

public class BAT_SearchTest extends CommonBase {
	BAT_Search search;
	
	@BeforeMethod
	@Parameters("browser")
	public void openDriver(@Optional("chrome") String browser)
	{
		setupDriver(browser);
		driver.get(CT_PageURLs.URL_BEPANTOAN);
	}
	
	@Test
	public void verifySearchWithValidKeyword() {
		search = new BAT_Search(driver);
		String keyword = "Bếp từ";
		search.searchProducts(keyword);
		pause(3000);
		Boolean searchCheckResult = search.resultProducts(keyword);
		assertTrue(searchCheckResult);
	}
	
	@Test
	public void verifySearchWithInValidKeyword() {
		search = new BAT_Search(driver);
		String keyword = "%^^&%&GH";
		search.searchProducts(keyword);
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//span[text()='Rất tiếc, không tìm thấy sản phẩm phù hợp với lựa chọn của bạn']")).isDisplayed());
	}
	
	@Test
	public void verifySearchWithEmptyKeyword() {
		search = new BAT_Search(driver);
		String keyword = "";
		search.searchProducts(keyword);
		pause(3000);
		
		List<WebElement> products = search.getProductsFromHTML();
		assertTrue(products.size() > 0);
	}
	
	@Test
	public void verifySearchWithOnlySpace() {
		search = new BAT_Search(driver);
		String keyword = "     ";
		search.searchProducts(keyword);
		pause(3000);
		
		List<WebElement> products = search.getProductsFromHTML();
		assertTrue(products.size() > 0);
	}

}
