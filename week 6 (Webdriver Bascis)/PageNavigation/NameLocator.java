import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class NameLocator 
{
	static String page1, page2,page3,page4,page5,baseUrl;
	static WebDriver driver;
	
	public WebDriver setupDriver()
	{
	    driver=DriverSetup.getWebDriver();
	    return driver;
	    /*Replace this comment by the code statement to get the driver*/
	    
	}
	public void navigate1() 
	{
	    baseUrl="https://selenium.dev/";
	    driver.get(baseUrl);
	    /*Replace this comment by the code statement to navigate to baseUrl */
	    
	}
	public void getPageTitle1()
	{
	    page1=driver.getTitle();
	    /*Replace this comment by the code statement to get page title of  "https://selenium.dev/"*/
	    /* Assign the page title to variable 'page1' */
	    
	}
	public void navigate2()
	{
	    baseUrl="https://www.google.co.in";
	    driver.get(baseUrl);
	    /*Replace this comment by the code statement to navigate to https://www.google.co.in/ */
        
	}
	public void getPageTitle2()
	{
	    page2= driver.getTitle();
	    /*Replace this comment by the code statement to get page title of  https://www.google.co.in/ */
	    /* Assign the page title to variable 'page2' */
        
	}
	public void navigateBack()
	{
	    driver.navigate().back();
	    /*Replace this comment by the code statement to navigate back */
       
	}
	public void getPageTitle3()
	{
	    page3= driver.getTitle();
	    /*Replace this comment by the code statement to get page title of backed page */
	    /* Assign the page title to variable 'page3' */
        
	}
	public void navigateForward()
	{
	    driver.navigate().forward();
	    /*Replace this comment by the code statement to navigate forward */
        
	}
	public void getPageTitle4()
	{
	    page4=driver.getTitle();
	    /*Replace this comment by the code statement to get page title of the forwarded page */
	    /* Assign the page title to variable 'page4' */
        
	}
	public void refreshPage()
	{
	    driver.navigate().refresh();
	    /*Replace this comment by the code statement to refresh the page */
       
	}
	public void getPageTitle5()
	{
	    page5=driver.getTitle();
	    /*Replace this comment by the code statement to get page title of refreshed page */
	    /* Assign the page title to variable 'page5' */
        
	}

	
	public static void main(String[] args)
	{
	    NameLocator namLocator=new NameLocator();
	    namLocator.setupDriver();
	    //Implement code here
	}

}

