package definitions;

import io.cucumber.java.en.*;
import actions.HomePageActions;
import locators.HomePageLocators;
import utils.Helper;

public class HomePageDefinitions {
	
	HomePageActions homepageActions = new HomePageActions();
	HomePageLocators homepageLocators = new HomePageLocators();
	
	@Given("I am on the HomePage {string}")
	public void i_am_on_the_home_page(String homeURL) {
	    Helper.openPage(homeURL);
	}

	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
		homepageActions.click_LogIn_Link();
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		homepageActions.enterUsername(username);
		homepageActions.enterPassword(password);
		homepageActions.click_LogIn();
	}

	@Then("User should be able to login sucessfully")
	public void user_should_be_able_to_login_sucessfully() throws InterruptedException {
		//homepageActions.verify_pageTitle("Play with Programming - CodinGame");
		homepageActions.verify_pageUrl("https://www.codingame.com/home");
	}

	@Then("User should be able to see error message{string}")
	public void user_should_be_able_to_see_error_message(String errormessage) {
		homepageActions.verify_errormessage(errormessage);
	    
	}
}
