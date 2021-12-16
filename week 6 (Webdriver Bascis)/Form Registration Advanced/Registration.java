import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Registration 
{
	static WebDriver driver;
	static String baseUrl; 
	
	public WebDriver setupDriver()
	{
	    //Assign the value for baseUrl
	    /* Get the driver, and launch the app using get() with baseUrl */
	     baseUrl="http://webapps.tekstac.com/Shopify/";
	     driver=DriverSetup.getWebDriver();
	     driver.get(baseUrl);
	     return driver;
	}
	
	public void setElements()
	{
	    /*Using the driver, Find the elements by id and send the values to the elements*/
       driver.findElement(By.id("firstname")).sendKeys("Mithali");
       driver.findElement(By.id("lastname")).sendKeys("Raj");
       driver.findElement(By.id("username")).sendKeys("Mithali Raj");
       Select city=new Select(driver.findElement(By.id("selectcity")));
       city.selectByVisibleText("Chennai");
       driver.findElement(By.xpath("//input[@value='female']")).click();
       driver.findElement(By.id("pass")).sendKeys("MR@123");
       driver.findElement(By.id("reg")).click();
	}
	
	public static void main(String[] args)
	{
	    Registration reg=new Registration();
	    reg.setupDriver();
	    reg.setElements();
	    //Implement Code Here
	}

}

