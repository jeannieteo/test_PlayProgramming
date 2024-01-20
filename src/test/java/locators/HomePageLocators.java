package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
	
	//@FindBy(xpath= "//div[@class='error-0-2-64']")
	//public WebElement errorMessage;
	
	@FindBy(xpath= "//div[@data-test='login-email-error']")
	public WebElement errorMessage_Password;
	
	@FindBy(xpath= "//div[@data-test='login-password-error']")
	public WebElement errorMessage_Email;
	
	@FindAll(@FindBy(how = How.XPATH, using = "//div[@data-test='login-password-error']"))
	public List<WebElement> errorEmailElement;
	
	@FindBy(xpath= "//span[text() = 'Welcome!']")
	public WebElement welcomeMessage;
}
