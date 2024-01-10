package utils;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

//Create a Helper class where we are initializing the web driver, initializing the web driver wait, defining the timeouts, and creating a private constructor of the class, 
//within it will declare the web driver, so whenever we create an object of this class, a new web browser is invoked. 

public class Helper {

	 
	  private static Helper helper;  
	  private static WebDriver driver;
	  private static WebDriverWait waitdriver;
	  public final static int TIMEOUT = 10;
	           
	  private Helper() {
	                
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	        driver.manage().window().maximize();       
	        
	  }      
	                   
	  public static void openPage(String url) {
		  	driver.get(url);
	  }
	               
	  public static WebDriver getDriver() {
	        return driver;              
	        }
	           
	  public static void setUpDriver() {      
	         if (helper==null) {
	         helper = new Helper();
	         }
	  }
	           
	  public static void tearDown() {   
	            if(driver!=null) {
	                 driver.close();
	                 driver.quit();
	            }     
	           helper = null;
	 }
	  
	 public static void waitUntilElementClickable(WebElement element)	{
		 waitdriver = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		 waitdriver.until(ExpectedConditions.elementToBeClickable(element));
	 }
	 
	 public static void waitUntilElementVisibleOf(WebElement element)	{
		 waitdriver = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		 waitdriver.until(ExpectedConditions.visibilityOf(element));
	 }
	           
}
