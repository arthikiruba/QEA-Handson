import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;  //Add required imports

public class RelativeXpathLocator    //DO NOT Change the class Name
{
    String tuName;
    
	public WebDriver createDriver()    //DO NOT change the method signature
	{
	   return DriverSetup.getWebDriver(); //Implement code to create Driver from DriverSetup and return it
	}
	public WebElement getRelativeXpathLocator(WebDriver driver)//DO NOT change the method signature
	{
	   return driver.findElement(By.xpath("//*[@id='ttab']/tbody/tr[2]/td[3]"));      /*Replace this comment by the code statement to get the Web element */
	   /*Find and return the element */
       
	}
	public String getName(WebElement element)//DO NOT change the method signature
	{
	    tuName=(String)element.getText();  //Get the attribute value from the element and return it
           return tuName;
	    
	}

    public static void main(String[] args){
	    RelativeXpathLocator pl=new RelativeXpathLocator();
	    //Add required code
	    WebDriver driver=pl.createDriver();
	    WebElement element=pl.getRelativeXpathLocator(driver);
	    System.out.println("The WebElement is "+ element);
	    
	    System.out.println("The name is "+pl.getName(element));
	    driver.close();
	}
}

