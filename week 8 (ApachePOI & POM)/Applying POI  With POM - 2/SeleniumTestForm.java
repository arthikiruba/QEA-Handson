import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTestForm {          //DO NOT change the class name

    //Use this declarations to store respective values
    public static WebDriver driver;
    public static String result=new String();
    public static String msg1,msg2;
    
    
    public void createDriver() {
        //Implement code to create driver and assign it to 'static' driver variable
        driver=DriverSetup.getWebDriver();
        
    }

    public void testSeleniumTestForm(String weight,String transportMode) throws Exception{
    	//'weight' and 'transportMode' parameter are used to send the values to the form
        //find the elements in the form and set values as per description. Submit the form.
        //Find the element of the message displayed after submit. Store it in 'result' variable.
        //compare it with the message as given in the problem statement.
        driver.findElement(By.id("weight")).sendKeys(weight);
        if(transportMode.equals("air"))
           driver.findElement(By.id("air")).click();
         driver.findElement(By.id("calculate")).click();
         
         msg2=driver.findElement(By.id("result")).getText();
         msg1="Dear Customer, your total shipping cost is $200";
         if(msg1.equals(msg2))
         {
            result="pass";
              
         }else{
             result="fail";
         }
         CargoShipping c=new CargoShipping();
         c.writeExcelData("cargo.xlsx",result);
    }
    public void closeBrowser(){
        //close the browser
        driver.close();
    }

    public static void main(String[] args) throws Exception 
	{ 				
			
		SeleniumTestForm st=new SeleniumTestForm();
		st.createDriver();
		st.testSeleniumTestForm("200","air");
		st.closeBrowser();
		//Add code here
		
	}
}