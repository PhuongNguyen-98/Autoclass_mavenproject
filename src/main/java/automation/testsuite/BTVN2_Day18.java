package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class BTVN2_Day18 extends CommonBase {
	
	@BeforeMethod
	@Parameters("browser")
	public void openDriver(@Optional("firefox") String browser)
	{
		setupDriver(browser);
		driver.get(CT_PageURLs.URL_BEPANTOAN);
	}
	
	@Test
	public void verifyMessageChatFunction() {
		click(By.xpath("(//span[text()='Chat với chúng tôi'])[1]"));
		String mainWindow = driver.getWindowHandle();
		Set<String> listWindows = driver.getWindowHandles();
		for(String windowItem:listWindows) {
			if(!windowItem.equals(mainWindow)) {
				driver.switchTo().window(windowItem);
				pause(3000);
				//isElementVisibility(By.xpath("//img[@class='_9g9d img']"));
				assertEquals(driver.getTitle(), "Messenger");
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		assertEquals(driver.getTitle(), "BẾP AN TOÀN - CHUYÊN THIẾT BỊ NHÀ BẾP, PHÒNG TẮM");
	}
	
	@AfterMethod
	public void closeDriver() {
		driver.close();
	}

	

}
