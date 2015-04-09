package Pages;

import org.openqa.selenium.By;

import Framework.Browser;

public class SearchPage {
	private Browser brwoser;
	
	public SearchPage(Browser brwoser){
		this.brwoser = brwoser;
	}
	
	public void searchfor(String query){
		brwoser.set(By.name("q"),query);
		brwoser.click(By.xpath("//*[@value='Search'"));
	}
	
	

}
