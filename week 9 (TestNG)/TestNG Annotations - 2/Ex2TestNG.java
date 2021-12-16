import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

@Listeners(FeatureTest.class)         //DO NOT remove or alter this line. REQUIRED FOR TESTING
public class Ex2TestNG {             //DO NOT Change the class Name
	
	
	public static WebDriver driver;
	String name;
	String password;
	
@BeforeSuite
    public void createDriver() {                  //DO NOT change the method signature
		//driver=DriverSetup.getWebDriver();//Create driver and assign it to 'static' driver variable
	}
	
	@BeforeMethod
	public void resetName() {                   //DO NOT change the method signature
		//NO implementation required. ONLY proper annotation is required.
	}	
	
	@Test(dependsOnMethods={"initializeName","initializePassword"})
	public void signin() {                       //DO NOT change the method signature
		System.out.println("signin");
	}
	
	@Test(priority=1)
    public void initializeName() {                //DO NOT change the method signature
		name="Tom";
	}
	
	@Test(priority=0)
	public void initializePassword() {           //DO NOT change the method signature
		password="Tom";
	}
	@AfterSuite
	public void closeBrowser() {                //DO NOT change the method signature
		//close the driver
	}
	
	
	public void invokeTest() {                 //DO NOT change the method signature
		TestNG test=new TestNG();
		List<String>suite=Lists.newArrayList();
		suite.add("testng.xml");
		test.setTestSuites(suite);
		test.run();//Implement code to invoke test using TestNG
	}

	public static void main(String[] args) {
	    Ex2TestNG ex2=new Ex2TestNG();
	    ex2.invokeTest();
	    //Implement any required code.
	}

  

}
