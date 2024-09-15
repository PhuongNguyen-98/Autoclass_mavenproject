package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class BTVN_Day17 extends CommonBase {
	
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_MEDIAMART);
	}
	
	@Test(priority = 1)
	public void verifyChatMessageFunction() {
		isElementVisibility(By.xpath("//button[text()='Tiếp tục chat']"));
		click(By.xpath("//button[text()='Tiếp tục chat']"));
		WebElement btnStartChat = getElementPresentDOM(By.xpath("//button[text()='Bắt đầu hội thoại']"));
		isElementVisibility(By.xpath("//button[text()='Bắt đầu hội thoại']"));
		assertEquals(btnStartChat.getText(), "Bắt đầu hội thoại");
	}
	
	@Test(priority = 2)
	public void verifyIframeZalo() {
		isElementVisibility(By.xpath("(//span[@class='widget-header--button-close-icon'])[1]"));
		click(By.xpath("(//span[@class='widget-header--button-close-icon'])[1]"));
		int sizeIFrame = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);
		click(By.xpath("//div[@class='za-chat__head-box']"));
		WebElement btnChatWithZalo = getElementPresentDOM(By.xpath("//div[text()='Chat bằng Zalo']"));
		assertEquals(btnChatWithZalo.getText(), "Chat bằng Zalo");
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
	

}
