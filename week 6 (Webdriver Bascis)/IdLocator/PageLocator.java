import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; //Add required imports

public class PageLocator    //DO NOT Change the class Name
{
	String lName;
	static WebDriver driver;
	static WebElement element;
	public WebDriver createDriver()  //DO NOT change the method signature
	{
	   driver=DriverSetup.getWebDriver();
	   return driver;      //Invoke getWebDriver method from DriverSetup and return it
	}
	
	public WebElement getPageLocator(WebDriver driver)  //DO NOT change the method signature
	{
	   WebElement lastName=driver.findElement(By.id("lastname"));
	   lName = lastName.getAttribute("placeholder");
	   return lastName;     /*Replace this comment by the code statement to get the WebElement of 'Lastname'*/
	   /*Find the element by id */
    
	}
	public String getName(WebElement element)  //DO NOT change the method signature
	{
	  return lName;  //Get the attribute value from the element and return it
	}
	
	public static void main(String[] args){
	    PageLocator pl=new PageLocator();
	    String name= pl.getName(element);
	    System.out.println("The lastName is"+ name);
	    //Add required code
	}

}

