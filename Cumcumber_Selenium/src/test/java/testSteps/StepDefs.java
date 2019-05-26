package testSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

import org.junit.Assert;

import pageObjects.PersonalHome;

import testUtil.SetupDriver;;

public class StepDefs {
	protected PersonalHome page;
	protected WebDriver driver;
	
	@Given("user is on Personal banking page")
	public void user_is_on_Personal_banking_page() throws MalformedURLException {
	    // Open personal home page
		driver = SetupDriver.getDriver();
		page = new PersonalHome(driver);
		driver.get(page.home_url);
	}

	@When("user choose a {string} from portal drop down")
	public void user_choose_a_from_portal_drop_down(String portal) {
	    page.selectPortal(portal);
	}

	@Then("the Login URL should switch to {string} of the choice")
	public void the_Login_URL_should_swich_to_of_the_choice(String portal) {
	    Assert.assertTrue(page.checkURL(portal));
	    driver.close();
	}
}
