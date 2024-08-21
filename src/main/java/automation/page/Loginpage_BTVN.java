package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage_BTVN {
	private WebDriver driver;

	public Loginpage_BTVN(WebDriver _driver) {
		this.driver = _driver;
	}
	
	public void LoginFunction(String email, String password) {
		
		WebElement idEmail = driver.findElement(By.id("email"));
		if(idEmail.isDisplayed()) {
			idEmail.sendKeys(email);
		}
		
		WebElement idPassword = driver.findElement(By.id("password"));
		if(idPassword.isDisplayed()) {
			idPassword.sendKeys(password);
		}
		
		WebElement btnDangNhap = driver.findElement(By.xpath("//button[text()='Đăng nhập']"));
		if(btnDangNhap.isDisplayed()) {
			btnDangNhap.click();
		}
		
	}
	

}
