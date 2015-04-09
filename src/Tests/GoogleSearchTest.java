package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Framework.Browser;
import Framework.DriverFactory;
import Pages.SearchPage;

public class GoogleSearchTest {
	private Browser browser;
	
	@BeforeMethod
	public void setUp(){
		DriverFactory df = new DriverFactory();
		browser = df.getBrowserInstance();
	}
	
	@AfterMethod
	public void tearDown(){
		browser.closeInstance();
	}
	
	@Test
	public void SearchTest(){
		
		browser.openURL("http://www.flipkart.com/");
		SearchPage s = new SearchPage(browser);
		s.searchfor("moto 3 ");
	}

}
