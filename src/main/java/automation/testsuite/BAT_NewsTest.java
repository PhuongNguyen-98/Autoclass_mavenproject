package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.BAT_News;

public class BAT_NewsTest extends CommonBase{
	BAT_News openNewsPage;
	BAT_News bat_news;
	
	@BeforeMethod
	@Parameters("browser")
	public void openDriver(@Optional("chrome") String browser)
	{
		setupDriver(browser);
		driver.get(CT_PageURLs.URL_BEPANTOAN);
	}
	
	@Test (priority = 1)
	public void openNewsPageSuccessfully() {
		
		openNewsPage = new BAT_News(driver);
		openNewsPage.navigateToNewsPage();
		pause(2000);
		assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Tin tức']")).isDisplayed());
	}
	
	@Test (priority = 2)
	public void newsDateSortTrue() {
		bat_news = new BAT_News(driver);
		bat_news.navigateToNewsPage();
		pause(2000);
		assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Tin tức']")).isDisplayed());
		
		String[] originDatesString = openNewsPage.getDatesFromNews();
		String[] cloneDatesString = openNewsPage.sortDatesStringArray(originDatesString);
		
		boolean isTrue = true;
		for (int i = 0; i < cloneDatesString.length; i++) {
			if(cloneDatesString[i] != originDatesString[i]) {
				isTrue = false;
				break;
			}
		}
		assertEquals(isTrue, true);
		
	}
	
	@Test
	public void verifyNewsPage2() {
		bat_news = new BAT_News(driver);
		bat_news.navigateToNewsPage();
		pause(5000);
		scrollToElement(By.xpath("//a[text()='Bếp từ Kainer chính hãng, giá rẻ, bảo hành dài lâu mua ở đâu?']"));
		pause(3000);
		bat_news.page2();
		assertTrue(driver.getCurrentUrl().contains("page=2"));
	}
	
	
	@Test
	public void verifyNextPage() {
		bat_news = new BAT_News(driver);
		bat_news.navigateToNewsPage();
		pause(5000);
		scrollToElement(By.xpath("//a[text()='Bếp từ Kainer chính hãng, giá rẻ, bảo hành dài lâu mua ở đâu?']"));
		pause(3000);
		bat_news.nextPage();
		assertTrue(driver.getCurrentUrl().contains("page=2"));
	}
	
	@Test
	public void verifyPreviousPage() {
		bat_news = new BAT_News(driver);
		bat_news.navigateToNewsPage();
		pause(5000);
		scrollToElement(By.xpath("//a[text()='Bếp từ Kainer chính hãng, giá rẻ, bảo hành dài lâu mua ở đâu?']"));
		pause(3000);
		bat_news.page2();
		scrollToElement(By.xpath("//a[text()='Bếp từ Kainer chính hãng, giá rẻ, bảo hành dài lâu mua ở đâu?']"));
		pause(3000);
		bat_news.priviousPage();
		assertTrue(driver.getCurrentUrl().contains("page=1"));
	}
	
	
	
	
	
//	@AfterMethod
//	public void closeDriver() {
//		driver.close();
//	}

}
