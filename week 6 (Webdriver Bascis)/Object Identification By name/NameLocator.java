import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class NameLocator 
{
	String fName;  
	static WebDriver driver;  
	
	public WebDriver setupDriver()
	{
	    
	   driver=DriverSetup.getWebDriver(); /*Invoke the getWebDriver method from the DriverSetup File*/
	    
	    return driver;
	}
	public String getNameLocator()
	{
       driver.findElement(By.name("fname"));
       fName = driver.findElement(By.name("fname")).getAttribute("placeholder");   /*Identify the Firstname
	     Get the placeholder value
         Store the placeholder value in the static variable fName.*/
       return fName;
	}
	
	public static void main(String[] args)
	{
	    NameLocator namLocator=new NameLocator();
	    String name=namLocator.getNameLocator();
	    System.out.println("The name is "+name);
	}

}

