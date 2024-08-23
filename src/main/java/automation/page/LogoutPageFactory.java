package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPageFactory {
	
	private WebDriver driver;
	@FindBy(id = "dropdownMenuLink") WebElement btnAdmin;
	@FindBy(xpath  = "//button[@class='dropdown-item']") WebElement btnLogout;
	@FindBy(xpath  = "(//button[@class='btn btn-success'])[3]") WebElement btnCfLogout;
	@FindBy(xpath = "//div[@class='toast-title']") WebElement toastMessage;

	public LogoutPageFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void LogoutFunction() throws InterruptedException {
		try {
			if (toastMessage.isDisplayed()) {
				toastMessage.click();
			}
			Thread.sleep(1000);
			btnAdmin.click();
			btnLogout.click();
			btnCfLogout.click();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

}
