import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaScriptExecutor{    //Do not change the class name
	
	//Use the below declarations
	public static WebDriver driver;
	public static Object jsfname,jslname, jsuname, jspwd, jsphone, jsemail, jssubmit, jsreset;
	
	public WebDriver createDriver()
	{
		//Create the driver using the class DriverSetup. Assign it to the variable 'driver' and return it.
		driver = DriverSetup.getWebDriver();
		return driver;
	}
 
 
  public void submitForm(String fname,String lname, String uname, String pwd, String phone, String email) 
  {
	    JavascriptExecutor jse = ((JavascriptExecutor)driver);
	    
	    //Using javascript executor, locate the elements of 'firstname','lastname','username','password'
	    //'phonenumber','email' and send the received values.
	    //Submit the form
        jsfname = jse.executeScript("return document.getElementsByName('firstname')[0]");
        ((WebElement)jsfname).sendKeys(fname);
        jslname = jse.executeScript("return document.getElementsByName('lastname')[0]");
        ((WebElement)jslname).sendKeys(lname);
        jsuname = jse.executeScript("return document.getElementsByName('username')[0]");
        ((WebElement)jsuname).sendKeys(uname);
        jspwd = jse.executeScript("return document.getElementsByName('password')[0]");
        ((WebElement)jspwd).sendKeys(pwd);
        jsphone = jse.executeScript("return document.getElementsByName('phonenumber')[0]");
        ((WebElement)jsphone).sendKeys(phone);
        jsemail = jse.executeScript("return document.getElementsByName('email')[0]");
        ((WebElement)jsemail).sendKeys(email);
        
        jssubmit = jse.executeScript("return document.getElementById('submit')");
        ((WebElement)jssubmit).click();
                
  }
  
  
  public void reset()
  {
	  JavascriptExecutor jse = ((JavascriptExecutor)driver);
	  //Using javascript executor, locate the element reset and click it.
	  jsreset = jse.executeScript("return document.getElementById('reset')");
	  ((WebElement)jsreset).click();
  }
  
  
  public static void main(String[] args) {
	    JavaScriptExecutor at=new JavaScriptExecutor();
		at.createDriver();
		at.reset();
		//Use this values to submit the form
		at.submitForm("Rahul","Dravid","Rahul","rahul@123","6232126711","rahultest@gmail.com");
		
		 
	}
  
}