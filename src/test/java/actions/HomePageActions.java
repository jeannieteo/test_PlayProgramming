package actions;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
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
		//verify the error message can appear on email or password 
		//check if the element exist first by using findElements
		String actualError;
		if(homepageLocators.errorEmailElement.size() > 0)
		{
			actualError = homepageLocators.errorMessage_Email.getText();
		}else
		{
			actualError = homepageLocators.errorMessage_Password.getText();
		}
		
		actualError = actualError.replaceAll("\n", "").replaceAll("\r", "");
		assertEquals(expectedError, actualError);
	}
}
