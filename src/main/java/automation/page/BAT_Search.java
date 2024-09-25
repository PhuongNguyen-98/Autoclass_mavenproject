package automation.page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BAT_Search {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='Tìm sản phẩm bạn mong muốn...']") WebElement searchInput;
	@FindBy(xpath = "//div[@class='bg-[#FFA800] w-[42px] h-[42px] rounded-r flex items-center justify-center cursor-pointer']") WebElement searchButton;
	@FindBy(xpath = "//a[text()='Phổ biến']") WebElement popularTag;
	@FindBy(xpath = "//a[text()='Giảm giá nhiều']") WebElement discountTag;
	@FindBy(xpath = "//a[text()='Giá thấp']") WebElement lowPriceTag;
	@FindBy(xpath = "//a[text()='Giá cao']") WebElement hightPriceTag;
	
	
	public BAT_Search(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void searchProducts(String keyword) {
		searchInput.sendKeys(keyword);
		searchButton.click();
	}
	
	public void searchInPopularTag() {
		popularTag.click();
	}
	
	public void searchInLowTag() {
		lowPriceTag.click();
	}
	
	public void searchInHightTag() {
		hightPriceTag.click();
	}
	
	public void searchInDiscountTag() {
		discountTag.click();
	}
	
	public List<WebElement> getProductsFromHTML() {
		List<WebElement> listResultProducts = driver.findElements(By.xpath("//h4[@class='mb-[2px] md:mb-[6px] text-xs font-bold text-center title-card md:text-sm text-grey-800 line-clamp-2 overflow-y-hidden h-[32px] md:h-[42px]']"));
		
		return listResultProducts;
	}
	
	public Boolean resultProducts(String resultText) {
		List<WebElement> listResultProducts = this.getProductsFromHTML();
		for(int i=0; i<listResultProducts.size(); i++)
		{
			String productText = listResultProducts.get(i).getText().toLowerCase();
			if (!productText.contains(resultText.toLowerCase())) {
				return false;
			}
		}
		
		return true;
	}
	

}
