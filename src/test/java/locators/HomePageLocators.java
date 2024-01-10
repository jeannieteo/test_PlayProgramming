package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	
	@FindBy(linkText = "Login")
    public WebElement LoginLink;
	
	@FindBy(linkText = "Start playing")
	public WebElement StartPlayingLink;
	
	@FindBy(name = "email")
	public WebElement emailText;
	
	@FindBy(name = "password")
	public WebElement passwordText;
	
	@FindBy(xpath = "//button/span[text() = 'Log in']")
	public WebElement Log_inButton;
	
	@FindBy(xpath= "//div[@class='error-0-2-64']")
	public WebElement errorMessage;
	
	@FindBy(xpath= "//span[text() = 'Welcome!']")
	public WebElement welcomeMessage;
}
