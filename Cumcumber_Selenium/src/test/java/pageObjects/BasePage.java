package pageObjects;

import org.openqa.selenium.WebDriver;

abstract class BasePage {
	public WebDriver driver;
	public String home_url;
	
	// Constructor
    public BasePage (WebDriver driver) {
    	this.driver = driver;
    }
}
