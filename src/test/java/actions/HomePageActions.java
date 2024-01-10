package actions;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.support.PageFactory;
import locators.HomePageLocators;
import utils.Helper;

public class HomePageActions {

	HomePageLocators homepageLocators = null;
	
	public HomePageActions()
	{
		homepageLocators = new HomePageLocators(); //init and construct homepageLocator
		PageFactory.initElements(Helper.getDriver(), homepageLocators);
	}
	
	public void enterUsername(String username)	{
		homepageLocators.emailText.sendKeys(username);
	}
	
	public void enterPassword(String password)	{
		homepageLocators.passwordText.sendKeys(password);
	}
	
	public void click_LogIn()	{
		homepageLocators.Log_inButton.click();
	}
	
	public void click_LogIn_Link()	{
		homepageLocators.LoginLink.click();
	}
	
	public void verify_pageTitle(String expectedPage)	{
		Helper.waitUntilElementVisibleOf(homepageLocators.welcomeMessage);
		String actualPage = Helper.getDriver().getTitle();
		assertEquals(expectedPage, actualPage);
		
	}
	
	public void verify_pageUrl(String expectedUrl)	{
		Helper.waitUntilElementVisibleOf(homepageLocators.welcomeMessage);
		String actualUrl = Helper.getDriver().getCurrentUrl();
		assertEquals(expectedUrl, actualUrl);
		
	}
	
	public void verify_errormessage(String expectedError)	{
		String actualError = homepageLocators.errorMessage.getText();
		actualError = actualError.replaceAll("\n", "").replaceAll("\r", "");
		assertEquals(expectedError, actualError);
	}
}
