import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Registration 
{
	String[] fName={"Rahul","Dravid","Rahul Dravid","Srinivas6"};
	static WebDriver driver;
	static String baseUrl; 
	DriverSetup setup=new DriverSetup();
	public WebDriver setupDriver()
	{
	    
	    /* Invoke the getWebDriver method 
	       Set value of BaseUrl
	       Launch the app using get() with baseUrl */
	    driver=setup.getWebDriver();
	    baseUrl="http://webapps.tekstac.com/Shopify/";
	    driver.get(baseUrl);
	     return driver;
	}
	
	public void setElements()
	{
	    /*Using the driver, Find the elements by id 
	      Set the values to the elements
	      Register the form*/
       driver.findElement(By.id("firstname")).sendKeys(fName[0]);
       driver.findElement(By.id("lastname")).sendKeys(fName[1]);
       driver.findElement(By.id("username")).sendKeys(fName[2]);
       driver.findElement(By.id("pass")).sendKeys(fName[3]);
       driver.findElement(By.id("reg")).click();
	}
	
	public static void main(String[] args)
	{
	    Registration reg=new Registration();
	    /* Implement the code here */
	   reg.setupDriver();
	   reg.setElements();
	   
	}

}

