package testSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PersonalHome;
import org.junit.Assert;

public class StepDefs {
	public PersonalHome page;
	
	@Given("user is on Personal banking page")
	public void user_is_on_Personal_banking_page() {
	    // Open personal home page
		page = new PersonalHome();
		page.go_to_home();
	}

	@When("user choose a {string} from portal drop down")
	public void user_choose_a_from_portal_drop_down(String string) {
	    page.selectPortal(string);
	}

	@Then("the Login URL should swich to {string} of the choice")
	public void the_Login_URL_should_swich_to_of_the_choice(String string) {
	    Assert.assertTrue(page.checkURL(string));
	}
}
