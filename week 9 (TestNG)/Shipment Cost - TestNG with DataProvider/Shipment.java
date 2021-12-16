import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.collections.Lists;
import junit.framework.Assert;

@Listeners(FeatureTest.class)       //DO NOT remove or alter this line. REQUIRED FOR TESTING
public class Shipment               //DO NOT Change the class Name
{
	public static WebDriver driver;
	
	
@BeforeSuite	//Add before suite annotation
	public void createDriver() {           //DO NOT change the method signature
		driver=DriverSetup.getWebDriver();//Create driver and assign it to 'static' driver variable
    }
	
@DataProvider(name="shipmentData")	//Add data provider annotation with name 'shipmentData'
	public Object[][] shipmentData()           //DO NOT change the method signature
	{
	    //Do not change the values
	    return new Object[][] { { "Mumbai", "New York","18000","10000","20000" }};
	    
	}
@Test(dataProvider="shipmentData")
	//DO NOT change the method signature. Add data provider annotation with name 'shipmentData'
	void testShipment (String orginPort,String destinationPort,String railModeCharge,String roadModeCharge,String airModeCharge) throws InterruptedException
	{
		Select Orgin_port=new Select(driver.findElement(By.name("origin_id")));
		Orgin_port.selectByVisibleText(orginPort);
		Select Destination_port=new Select(driver.findElement(By.name("destination_id")));
		Destination_port.selectByVisibleText(destinationPort);
		driver.findElement(By.name("submit")).click();
		
		Assert.assertEquals(roadModeCharge,driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText(),"The Road mode charge doesnt match");
		Assert.assertEquals(railModeCharge,driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]")).getText(),"The Rail mode charge doesnt match");
		Assert.assertEquals(airModeCharge,driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText(),"The Air mode charge doesnt match");
		//Apply the array values to the respective form element
		// Test the tabled data against the data specified in the array
	}
	
	public  void shipment() {
	    TestNG test=new TestNG();
	    List<String>suite=Lists.newArrayList();
	    suite.add("testng.xml");
	    test.setTestSuites(suite);
	    test.run();//Invoke TestNG only here
	}
	
	public static void main(String[] args) {
		Shipment ship=new Shipment();
		ship.shipment();
	    //Implement any required code. 
	}
}
	
	
	


