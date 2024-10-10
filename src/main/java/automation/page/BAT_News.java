package automation.page;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.common.CommonBase;

public class BAT_News extends CommonBase {

	private WebDriver driver;
	@FindBy(xpath = "(//a[normalize-space()='Tin tức'])[1]") WebElement btnNews;
	@FindBy(xpath = "//a[normalize-space()='2']") WebElement page2;
	@FindBy(xpath = "//a[@aria-label='Next']") WebElement btn_next;
	@FindBy(xpath = "//a[@aria-label='Previous']") WebElement btn_privious;

	public BAT_News(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}

	public void navigateToNewsPage() {
		//		String xpath = "(//a[normalize-space()='title'])[1]".replace("title", title);
		//		WebElement btnElement = driver.findElement(By.xpath(xpath));
		btnNews.click();
	}

	public String[] getDatesFromNews() {
		String xpath = "//div[@class='absolute bottom-[4px] right-[8px] text-[16px] text-gray-800 py-[4px] px-[4px] md:px-[12px] bg-gray-100 rounded-sm w-max h-style card__datetime']";
		List<WebElement> allNewsElement = driver.findElements(By.xpath(xpath));
		String[] datesNews = new String [allNewsElement.size()];
		for (int i = 0; i < datesNews.length; i++) {
			datesNews[i] = allNewsElement.get(i).getText();
		} 

		return datesNews;
	}

	public int compareTwoDateString(String d1, String d2) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {

			//			Date date1 = sdf.parse(d1);
			//			Date date2 = sdf.parse(d1);
			//			
			//			return date1.compareTo(date2);

			return sdf.parse(d1).compareTo(sdf.parse(d2));
		} catch (ParseException e) {
			throw new IllegalArgumentException(e);
		}
	}

	public String[] sortDatesStringArray(String[] dates) {
		String[] cloneArray = Arrays.copyOf(dates, dates.length);
		String temp = "";
		for(int i=0; i<cloneArray.length; i++) {
			for(int j=0 ;j<cloneArray.length - i - 1;j++) {
				if (this.compareTwoDateString(cloneArray[j], cloneArray[j+1]) < 0) {
					temp = cloneArray[j+1];
					cloneArray[j+1]=cloneArray[j];
					cloneArray[j] = temp;
				}

			}
		}

		return cloneArray;
	}

	public void listNews()  {
		String xpath = "//div[@class='absolute bottom-[4px] right-[8px] text-[16px] text-gray-800 py-[4px] px-[4px] md:px-[12px] bg-gray-100 rounded-sm w-max h-style card__datetime']";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<WebElement> allNews = driver.findElements(By.xpath(xpath));
		String[] originNews = new String [allNews.size()];
		for (int i = 0; i < originNews.length; i++) {
			originNews[i] = allNews.get(i).getText();
		} 
		String[] cloneNews = Arrays.copyOf(originNews, originNews.length);
		String temp = "";
		try {
			for(int i=0; i<cloneNews.length; i++) {
				for(int j=0 ;j<cloneNews.length - i - 1;j++) {
					if (this.compareTwoDateString(cloneNews[j], cloneNews[j+1]) < 0) {
						temp = cloneNews[j+1];
						cloneNews[j+1]=cloneNews[j];
						cloneNews[j] = temp;
					}

				}
			}
		} catch (Exception e) {
			// TODO: handle exception

		}
		String a = "";
	}

	public void page2() {
		page2.click();
	}

	public void nextPage() {
		btn_next.click();
	}

	public void priviousPage() {
		btn_privious.click();
	}

}
