package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
	public WebDriver driver;
	public String home_url;
	
	// Constructor
    public BasePage () {
        System.setProperty("webdriver.chrome.driver","C:/Users/ap/eclipse-workspace/Cumcumber_Selenium/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        this.driver = new ChromeDriver(options);
    }
    
    public void go_to_home ( ) {
    	this.driver.get(this.home_url);
    }

}
