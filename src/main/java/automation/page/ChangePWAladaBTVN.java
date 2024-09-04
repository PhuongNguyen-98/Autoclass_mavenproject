package automation.page;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePWAladaBTVN {
	private WebDriver driver;
	@FindBy(xpath = "//a[text()='Đăng Ký']") WebElement btnSignIn;
	@FindBy(id = "txtFirstname") WebElement txtFirstname;
	@FindBy(id = "txtEmail") WebElement txtEmail;
	@FindBy(id = "txtCEmail") WebElement txtCEmail;
	@FindBy(id = "txtPassword") WebElement txtPassword;
	@FindBy(id = "txtCPassword") WebElement txtCPassword;
	@FindBy(id = "txtPhone") WebElement txtPhone;
	@FindBy(xpath = "//button[@class='btn_pink_sm fs16' and text()='ĐĂNG KÝ']") WebElement btnCSignin;
	@FindBy(xpath = "//a[text()='Đăng Nhập']") WebElement btnLogin;
	@FindBy(id = "txtLoginUsername") WebElement txtLoginUsername;
	@FindBy(id = "txtLoginPassword") WebElement txtLoginPassword;
	@FindBy(xpath = "//button[text()='ĐĂNG NHẬP' and @type='submit']") WebElement btnCLogin;
	@FindBy(xpath = "//div[@class='avatar2']") WebElement btnAvatar;
	@FindBy(xpath = "//a[text()='Chỉnh sửa thông tin']") WebElement btnEditInfor;
	@FindBy(id = "txtpassword") WebElement txtEditPassword;
	@FindBy(id = "txtnewpass") WebElement txtNewPassword;
	@FindBy(id = "txtrenewpass") WebElement txtReNewPass;
	@FindBy(xpath = "//button[text()='Lưu mật khẩu mới']") WebElement btnCFnewPass;
	@FindBy(xpath = "//a[text()='Thoát']") WebElement btnLogout;
	

	public ChangePWAladaBTVN(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
		
	}
	
	public void SigninFunction (String fname, String email, String cemail, String pass, String cpass, String phone ) {
		btnSignIn.click();
		txtFirstname.sendKeys(fname);
		txtEmail.sendKeys(email);
		txtCEmail.sendKeys(cemail);
		txtPassword.sendKeys(pass);
		txtCPassword.sendKeys(cpass);
		txtPhone.sendKeys(phone);
		btnCSignin.click();
	}
	
	public void LoginFunction ( String email, String pass ) {
		btnLogin.click();
		txtLoginUsername.sendKeys(email);
		txtLoginPassword.sendKeys(pass);
		btnCLogin.click();
		
	}
	
	public void ChangePasswordFunction (String oldpass, String newpass, String renewpass) {
		btnAvatar.click();
		btnEditInfor.click();
		txtEditPassword.sendKeys(oldpass);
		txtNewPassword.sendKeys(newpass);
		txtReNewPass.sendKeys(renewpass);
		btnCFnewPass.click();
        
		
	}
	
	public void LogoutFunction () {
		btnAvatar.click();
		btnLogout.click();
	}

	
	
}
