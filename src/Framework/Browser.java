package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Browser {
	private  WebDriver driver;

	public Browser(WebDriver driver){
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openURL(String url){
		driver.get(url);
	}
	
	public  void click(By locator){
		driver.findElement(locator).click();
	}
	
	public void set(By locator,String message){
		//driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(message);
	}
	
	public void closeInstance(){
		driver.quit();
	}

}
