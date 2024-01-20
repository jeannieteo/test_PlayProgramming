package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import actions.*;

public class QuestPageDefinitions {
	
	QuestPageActions questPageActions = new QuestPageActions();
	HomePageActions homePageActions = new HomePageActions();
	
	@When("User clicks on Introduction button")
	public void user_clicks_on_Introduction_button() {
		questPageActions.click_Introduction_button();
	}
	
	@Then("User should be lead to the {string} gamepage")
	public void user_should_be_lead_to_the_gamepage(String pagename)	{
		homePageActions.verify_pageUrl("https://www.codingame.com/" + pagename);
	}
	
	@When("User hovers on {string} and choose {string} menu")
	public void user_hovers_on_and_choose_menu(String menuname, String menuname2) {
		questPageActions.hover_and_choose_menu(menuname, menuname2);
	}
	
	//@And("User choose {string} menu")
	//public void user_choose_menu(String menuname)	{
	//	questPageActions.click_menu(menuname);
	//}
}
