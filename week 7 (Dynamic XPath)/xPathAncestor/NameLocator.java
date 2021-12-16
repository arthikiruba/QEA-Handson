import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class NameLocator      //DO NOT Change the class name
{
    //Use the declared variables for stroing required values
	static String fName;
	static WebDriver driver;
	
	public WebDriver setupDriver()           //DO NOT Change the method Signature
	{
	    driver = DriverSetup.getWebDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    /* Replace this comment by the code statement to create and return the driver */
	    /* Naviaget to the url 'http://webapps.tekstac.com/AddressBook/'  */
	    driver.get("http://webapps.tekstac.com/AddressBook/");
	    return driver;
	}
	public String getNameLocator()              //DO NOT Change the method Signature
	{
	    WebElement parent = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/div/table/tbody/tr[4]/td[1]/ancestor::div"));
	   /*Using the driver, Find the element ancestor and its text and assign the text to 'fName' */
       /*Close the driver*/
      fName = parent.getText();
      return fName;
	}
	
	public static void main(String[] args)
	{
	    NameLocator namLocator=new NameLocator();
	    //Add required code here
	    namLocator.setupDriver();
	    String name=namLocator.getNameLocator();
	    System.out.println("The name is "+name);
	}
}

