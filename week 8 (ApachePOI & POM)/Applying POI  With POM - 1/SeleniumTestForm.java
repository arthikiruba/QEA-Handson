import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;

public class SeleniumTestForm {      //Do not change the class name

    public static WebDriver driver;
    
    public void createDriver() {                //Do not change the method signature
        //Implement code to create driver and assign it to 'static' driver variable	
        driver=DriverSetup.getWebDriver();
        
    }

    public void testSeleniumTestForm() {    //Do not change the method signature
    	//Read the data from excel sheet. Sheet name is 'customervalid'
       //find the elements in the form and set values parsed from excel sheet. Submit the form for registration
       String feedData[]=null;
       try{
           feedData=CusRegExcel.readExcelData("CustReg.xlsx");
       }catch(Exception e){
           System.out.println("Error");
       }
       driver.findElement(By.name("cname")).sendKeys(feedData[0]);
       driver.findElement(By.name("age")).sendKeys(feedData[1]);
       driver.findElement(By.name("address")).sendKeys(feedData[2]);
       driver.findElement(By.name("phonenumber")).sendKeys(feedData[3]);
       driver.findElement(By.name("email")).sendKeys(feedData[4]);
       driver.findElement(By.id("submit")).click();
    }
    public void closeBrowser(){
        //close the browser
        driver.quit();
    }

    public static void main(String[] args) throws Exception 
	{ 
	    SeleniumTestForm customer=new SeleniumTestForm();
	    customer.createDriver();
	    customer.testSeleniumTestForm();
	    customer.closeBrowser();
	   // CusRegExcel customer = new CusRegExcel();
	    //Add required code
	}
}