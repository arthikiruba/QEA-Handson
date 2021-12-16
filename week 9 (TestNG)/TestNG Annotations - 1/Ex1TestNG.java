
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

//ADD the required TestNG annotations on respective methods

public class Ex1TestNG {         //DO NOT Change the class Name
	
	//Do NOT change these below declarations.
	public static WebDriver driver; 
	String name;
	String password;
	
	
	@BeforeSuite
	public void createDriver() {         //DO NOT change the method signature
		driver=DriverSetup.getWebDriver();//Implement code to create Driver from DriverSetup and assign it to 'static' driver variable
    }
    
	@Test(groups="init")
	public void initializeName() {         //DO NOT change the method signature
		name="Tom";
	}
	@Test(groups="init")
	public void initializePassword() {    //DO NOT change the method signature      
		password="Tom";
	}
	@Test(dependsOnGroups={"init"})
	public void signin() {               //DO NOT change the method signature
		System.out.println("signin");
	}
	@AfterSuite
	public void closeBrowser() {         //DO NOT change the method signature
		driver.close();
	}
	
	public static void main(String[] args){          //DO NOT change the method signature
	    Ex1TestNG page=new Ex1TestNG();
	    //Implement the required code
	}
}
