package automation.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.Search_JS;

public class SearchJsTest extends CommonBase {
	
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_TEDU);
	}
	
//	@Test
//	public void signinSuccessfully() throws InterruptedException {
//		Search_JS signin = new Search_JS(driver);
//		signin.SigninFunction();
//		
//	}
	@Test
	public void searchkeyword() {
		Search_JS search = new Search_JS(driver);
		search.SearchFunction();
	}
	
}
