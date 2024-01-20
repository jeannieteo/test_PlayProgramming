package actions;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import locators.QuestPageLocators;
import utils.Helper;


public class QuestPageActions {
	QuestPageLocators questPageLocators = null;
	
	public QuestPageActions()	{
		questPageLocators = new QuestPageLocators();
		PageFactory.initElements(Helper.getDriver(), questPageLocators);
	}
	
	public void click_Introduction_button()	{
		questPageLocators.introductionButton.click();
	}
	
	//public void hover_menu(String menuName)	{
		
	//	Actions action = new Actions(Helper.getDriver());
	//	if (menuName.equalsIgnoreCase("SOLO"))
	//		action.moveToElement(questPageLocators.SOLO).perform();
	//}
	
	public void hover_and_choose_menu(String menuName, String menuName2)	{
		
		Actions action = new Actions(Helper.getDriver());
		if (menuName.equalsIgnoreCase("SOLO"))
			action.moveToElement(questPageLocators.SOLO);
		
		if (menuName2.equalsIgnoreCase("PUZZLES")) {	
			action.moveToElement(questPageLocators.PUZZLES).click()
				.build().perform();
		}
	}
}
