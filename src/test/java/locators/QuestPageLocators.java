package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuestPageLocators {
	
	@FindBy(xpath = "//h2")
	public WebElement header2;

	@FindBy(xpath = "//a[@href='/training/easy/onboarding']")
	public WebElement introductionButton;

	@FindBy(xpath = "//div[text() = 'SOLO']")
	public WebElement SOLO;
	
	@FindBy(xpath = "//a[text() = 'PUZZLES']")
	public WebElement PUZZLES;
	
}
