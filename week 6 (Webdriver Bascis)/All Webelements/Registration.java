import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Registration    //DO NOT Change the class Name
{
	static WebDriver driver;
	static String baseUrl="https://webapps.tekstac.com/InvoiceUpdates/"; //Assign the value for baseUrl
	
	static WebElement result;
	static String Category;
	static String message;
	public WebDriver createDriver()       //DO NOT change the method signature
	{
	    driver=DriverSetup.getWebDriver();
	    return driver;
	   //Implement code to create Driver from DriverSetup and return it
	   //use getWebDriver method
	}
	
	public void navigate(WebDriver driver)   //DO NOT change the method signature
	{
	    // set the url to baseUrl and navigate ("http://webapps.tekstac.com/InvoiceUpdates/") 
	    driver.get(baseUrl);
	}
	
	public Select getCategoryElement(WebDriver driver)  //DO NOT change the method signature
	{
	   /*Replace this comment by the code statement to get the driver*/
	   
	   /* Select Value "Utility Invoice" from 'Category' (drop-down) and return the select element  
             * Declare the drop-down element as an instance of the Select class. 
             * Return select object    */
       Select Category = new Select(driver.findElement(By.tagName("select")));
       Category.selectByVisibleText("Utility Invoice");
       return Category;
	}
	public void setFormValues(WebDriver driver)  //DO NOT change the method signature
	{
	    /*Using the driver, Find the elements by id and send the values to the elements */
      
      /*  Send 'Rakesh' for 'name'  
               '123' for 'number'
                'new user' for user type 
                'Utility Invoice' for select 
                '1000' for 'amount'
                '9876543210' for phone 
                'New User Invoice' for 'comments'
      */ 
      navigate(driver);
      driver.findElement(By.id("name")).sendKeys("Rakesh");
      driver.findElement(By.id("number")).sendKeys("123");
      driver.findElement(By.id("newUser")).click();
      Select Category=getCategoryElement(driver);
      Category.selectByVisibleText("Utility Invoice");
      driver.findElement(By.name("amount")).sendKeys("1000");
      driver.findElement(By.name("num")).sendKeys("9876543210");
      driver.findElement(By.name("comments")).sendKeys("New User Invoice");
      driver.findElement(By.id("submit")).click();
      result=driver.findElement(By.id("result"));
      message=getSuccessMessage(result);
      System.out.println(message);
	}
	
	public WebElement getSuccessMessageElement(WebDriver driver) //DO NOT change the method signature
	{
	    result=driver.findElement(By.id("result"));
	    return result;
	    //Get the message element and return it
	    //After registration a success message is displayed. Identify and return the WebElement of the same. 
	}

	public String getSuccessMessage(WebElement element)  //DO NOT change the method signature
	{
	    message=result.getAttribute("value");
	    return message;
	    //Get the attribute value from the WebElement of success message displayed and return it. 
	}

    public static void main(String[] args){
	    Registration reg=new Registration();
	    //Add required code
	    reg.navigate(driver);
	    reg.setFormValues(driver);
	    reg.getCategoryElement(driver);
	    reg.getSuccessMessageElement(driver);
	    String Message=reg.getSuccessMessage(result);
	    
	}
}

