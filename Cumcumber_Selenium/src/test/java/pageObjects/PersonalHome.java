package pageObjects;

import org.openqa.selenium.By;

public class PersonalHome extends BasePage {
	String basehome_url = "https://www.anz.com.au/personal/";
	
	// Locators
	By portalDropDown = By.className("logon-trigger");
	By loginButton = By.xpath("//div[contains(@class,'listitem') and @style='display: block;']/a");
	
	// Constructor
    public PersonalHome() {
    	super.home_url = basehome_url;
    }
 
    /**
     * Select the portal from drop-down menu by given menu option text 
     *
     * @param portal	Drop-down choice text 
     */
    public void selectPortal(String portal) {
    	By option = By.xpath(String.format("//li[text()='%s']", portal));
    	driver.findElement(this.portalDropDown).click();
    	driver.findElement(option).click();
    }
    
    /**
     * Verify the URL of the current visible Log in button is correct  
     *
     * @param portal	The portal drop-down that is current set
     * @return 			True if URL is expect; otherwise false 
     */
    public boolean checkURL(String portal) {
    	String loginURL = driver.findElement(loginButton).getAttribute("href");
    	System.out.println(loginURL);
    	if (portal.equals("Internet Banking")) {
    		return loginURL.contains("https://www.anz.com/INETBANK");
    	} else if (portal.equals("ANZ Share Investing")) {
    		return loginURL.contains("https://webauthecc.anz.com/oamfed/idp/initiatesso");
    	}
    	else {
    		throw new UnsupportedOperationException(String.format("Unknown portal: %s", portal));
    	}
    }

}

