package testUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetupDriver {
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:/Users/ap/eclipse-workspace/Cumcumber_Selenium/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        WebDriver driver = new ChromeDriver(options);
        return driver;
	}
}
