package automation.page;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BAT_Footer {
	
	private WebDriver driver;
	@FindBy(xpath = "(//a[text()='Chính sách vận chuyển'])[2]") WebElement btn_ChinhSachVanChuyen;
	@FindBy(xpath = "(//a[text()='Chính sách bảo hành'])[2]") WebElement btn_ChinhSachBaoHanh;
	@FindBy(xpath = "(//a[text()='Chính sách đổi trả'])[2]") WebElement btn_ChinhSachDoiTra;
	@FindBy(xpath = "(//a[text()='Chính sách bảo mật'])[2]") WebElement btn_ChinhSachBaoMat;
	@FindBy(xpath = "(//a[text()='Hướng dẫn đặt hàng'])[2]") WebElement btn_HuongDanDatHang;
	@FindBy(xpath = "(//a[text()='Chính sách bảo trì, bảo dưỡng & lắp đặt'])[2]") WebElement btn_ChinhSachBaoDuongLapDat;
	@FindBy(xpath = "(//a[text()='Chính sách giao, nhận hàng và kiểm hàng'])[2]") WebElement btn_ChinhSachGiaoHang;
	@FindBy(xpath = "(//a[text()='Chính sách Thanh Toán'])[2]") WebElement btn_ChinhSachThanhToan;
	@FindBy(xpath = "(//a[text()='Bếp Từ'])[6]") WebElement btn_FooterBepTu;
	@FindBy(xpath = "(//a[text()='Bếp Điện'])[6]") WebElement btn_FooterBepDien;
	@FindBy(xpath = "(//a[text()='Bếp Điện Từ'])[6]") WebElement btn_FooterBepDienTu;
	@FindBy(xpath = "(//a[text()='Máy Hút Mùi'])[4]") WebElement btn_FooterMayHutMui;
	@FindBy(xpath = "(//a[text()='Máy Rửa Chén Bát'])[4]") WebElement btn_FooterMayRuaChen;
	@FindBy(xpath = "(//a[text()='Giới thiệu'])[2]") WebElement btn_GioiThieu;
	@FindBy(xpath = "(//a[text()='Tin tức'])[2]") WebElement btn_TinTuc;
	@FindBy(xpath = "(//a[text()='Liên hệ'])[2]") WebElement btn_LienHe;
	@FindBy(xpath = "(//a[@class='mr-4 transition-all duration-200 ease-in-out hover:opacity-70'])[1]") WebElement btn_Zalo;
	@FindBy(xpath = "(//a[@class='mr-4 transition-all duration-200 ease-in-out hover:opacity-70'])[2]") WebElement btn_Facebook;
	@FindBy(xpath = "(//a[@class='mr-4 transition-all duration-200 ease-in-out hover:opacity-70'])[3]") WebElement btn_Youtube;
	@FindBy(xpath = "//a[text()='0912331335']") WebElement sdt_MuaHang;
	@FindBy(xpath = "(//a[text()='0976665669'])[1]") WebElement sdt_BaoHanh;
	@FindBy(xpath = "(//a[text()='0976665669'])[2]") WebElement sdt_DaiLy;

	public BAT_Footer(WebDriver _driver) {
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
	
	public void FooterBepTu() {
		btn_FooterBepTu.click();
	}
	
	public void FooterBepDien() {
		btn_FooterBepDien.click();
	}
	
	public void FooterBepDienTu() {
		btn_FooterBepDienTu.click();
	}
	
	public void FooterMayHutMui() {
		btn_FooterMayHutMui.click();
	}
	
	public void FooterMayRuaChen() {
		btn_FooterMayRuaChen.click();
	}
	
	public void GioiThieu() {
		btn_GioiThieu.click();
	}
	
	public void TinTuc() {
		btn_TinTuc.click();
	}
	
	public void LienHe() {
		btn_LienHe.click();
	}
	
	public void Zalo() {
		btn_Zalo.click();
	}
	
	public void Facebook() {
		btn_Facebook.click();
	}
	
	public void Youtube() {
		btn_Youtube.click();
	}
	
	public void ContactMuahang() {
		sdt_MuaHang.click();
	}
	
	public void ContactBaoHanh() {
		sdt_BaoHanh.click();
	}
	
	public void ContactDaiLy() {
		sdt_DaiLy.click();
	}
	
	
	
	
	

}
