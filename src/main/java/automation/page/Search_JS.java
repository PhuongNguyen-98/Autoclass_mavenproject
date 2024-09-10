package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class Search_JS {
	
	private WebDriver driver;
	@FindBy(id = "UserName") WebElement textEmail;
	@FindBy(id = "Password") WebElement textPassword;
	@FindBy(xpath = "//button[text()='Đăng nhập']") WebElement buttonLogin;
	@FindBy(xpath = "//a[text()='Đăng ký']") WebElement btnsignin;
	@FindBy(id = "FullName") WebElement txtFullName;
	@FindBy(id = "DOB") WebElement txtDOB;
	@FindBy(id = "Email") WebElement txtEmail;
	@FindBy(id = "Password") WebElement txtPassword;
	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']") WebElement btnCapcha;
	@FindBy(xpath = "//input[@class='btn btn-primary']") WebElement btnCSignin;
	@FindBy(id = "my_account") WebElement btnAvatar;
	@FindBy(xpath = "//a[@title='Đổi mật khẩu']") WebElement btnUpdatePass;
	@FindBy(id = "OldPassword") WebElement txtOldPass;
	@FindBy(id = "NewPassword") WebElement txtNewPass;
	@FindBy(id = "ConfirmNewPassword") WebElement txtConfirmNewPass;
	@FindBy(id = "onesignal-slidedown-cancel-button") WebElement cancelButton;
	@FindBy(xpath = "//input[@class='btn btn-primary']") WebElement updatePassBtn;
	@FindBy(xpath = "//button[@class='button-search btn btn-primary']") WebElement btnSearch;
	@FindBy(xpath = "//input[@class='autosearch-input form-control']") WebElement searchField;
	
	public Search_JS(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	
	public void SigninFunction () throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btnsignin);
		js.executeScript("document.getElementById('FullName').setAttribute('value','Nguyen Van A');");
		//js.executeScript("document.getElementById('DOB').setAttribute('value','04092024');");
		txtDOB.sendKeys("04092024");
		js.executeScript("document.getElementById('Email').setAttribute('value','testerdemo1@gmail.com');");
		js.executeScript("document.getElementById('Password').setAttribute('value','12345678');");
		Thread.sleep(10000);
		js.executeScript("arguments[0].click();", btnCapcha);
		//driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
//		js.executeScript("arguments[0].click();", btnCSignin);
	}
	
	public void SearchFunction () throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementByXPath('//input[@class='autosearch-input form-control']').setAttribute('value','ASP net');");
		js.executeScript("arguments[0].click();", btnSearch);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
//		searchField.sendKeys("ASP net");
//		btnSearch.click();
//		
	}

}
