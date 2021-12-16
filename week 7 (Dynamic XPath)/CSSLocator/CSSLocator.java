import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;//Add required imports
import org.openqa.selenium.WebElement;

public class CSSLocator     //DO NOT change the class name
{
	public WebDriver createDriver()  //DO NOT change the method signature
	{
	   return DriverSetup.getWebDriver(); //Implement code to create Driver from DriverSetup and return it
	}
	
	public WebElement getCSSLocator(WebDriver driver)  //DO NOT change the method signature
	{
	  return driver.findElement(By.cssSelector("#username"));      /*Replace this comment by the code statement to get the Web element of username*/
	   /*Find and return the element */ 
       
	}
	
	public String getName(WebElement element)  //DO NOT change the method signature
	{
	    return element.getAttribute("placeholder");      //Get the attribute value from the element and return it
	}
	
    public static void main(String[] args){
	    CSSLocator pl=new CSSLocator();
	    //Add required code
	    WebDriver driver=pl.createDriver();
	    WebElement element=pl.getCSSLocator(driver);
	    pl.getName(element);
	}
}

