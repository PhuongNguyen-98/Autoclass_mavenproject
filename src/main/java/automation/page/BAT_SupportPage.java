package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BAT_SupportPage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "(//a[normalize-space()='Chính sách vận chuyển'])[1]") WebElement btn_ChinhSachVanChuyen;
	@FindBy(xpath = "(//a[normalize-space()='Chính sách bảo hành'])[1]") WebElement btn_ChinhSachBaoHanh;
	@FindBy(xpath = "(//a[normalize-space()='Chính sách đổi trả'])[1]") WebElement btn_ChinhSachDoiTra;
	@FindBy(xpath = "(//a[normalize-space()='Chính sách bảo mật'])[1]") WebElement btn_ChinhSachBaoMat;
	@FindBy(xpath = "(//a[normalize-space()='Hướng dẫn đặt hàng'])[1]") WebElement btn_HuongDanDatHang;
	@FindBy(xpath = "(//a[normalize-space()='Chính sách bảo trì, bảo dưỡng & lắp đặt'])[1]") WebElement btn_ChinhSachBaoDuongLapDat;
	@FindBy(xpath = "(//a[normalize-space()='Chính sách giao, nhận hàng và kiểm hàng'])[1]") WebElement btn_ChinhSachGiaoHang;
	@FindBy(xpath = "(//a[normalize-space()='Chính sách Thanh Toán'])[1]") WebElement btn_ChinhSachThanhToan;
	@FindBy(xpath = "//div[normalize-space()='Miền Bắc']") WebElement locationNorth;
	@FindBy(xpath = "//div[normalize-space()='Miền nam']") WebElement locationSouth;
	@FindBy(xpath = "(//span[text()='Dẫn đường'])[1]") WebElement branchNorth1;
	@FindBy(xpath = "//span[text()='Dẫn đường']") WebElement branchSouth1;
	
	public BAT_SupportPage(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void  ChinhSachVanChuyen() {
		btn_ChinhSachVanChuyen.click();
	}
	
	public void ChinhSachBaoHanh() {
		btn_ChinhSachBaoHanh.click();
	}
	
	public void ChinhSachDoiTra() {
		btn_ChinhSachDoiTra.click();
	}
	
	public void ChinhSachBaoMat() {
		btn_ChinhSachBaoMat.click();
	}
	
	public void HuongDanDatHang() {
		btn_HuongDanDatHang.click();
	}
	
	public void ChinhSachBaoDuongLapDat() {
		btn_ChinhSachBaoDuongLapDat.click();
	}
	
	public void ChinhSachGiaoHang() {
		btn_ChinhSachGiaoHang.click();
	}
	
	public void ChinhSachThanhToan() {
		btn_ChinhSachThanhToan.click();
	}
	
	public void BranchNorth1() {
		branchNorth1.click();
	}
	
	public void BranchNSouth1() {
		locationSouth.click();
		branchSouth1.click();
	}

}
