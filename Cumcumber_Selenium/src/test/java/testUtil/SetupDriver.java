package testUtil;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SetupDriver {
	static Capabilities chromeCapabilities = DesiredCapabilities.chrome();
	public static WebDriver getDriver() throws MalformedURLException {
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeCapabilities);
        return driver;
	}
}
