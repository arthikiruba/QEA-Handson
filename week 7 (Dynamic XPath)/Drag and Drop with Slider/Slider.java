import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;

public class Slider{  //DO NOT Change the class Name
	
	static String baseUrl="http://webapps.tekstac.com/OnlineShopping/fashion.html"; 
	public static WebDriver driver;
	public static String productInfo;
    public static String quantityInfo;
    public static String priceInfo;
    
	
	public WebDriver createDriver(){       //DO NOT change the method signature
	   // Implement code to create Driver from DriverSetup and return it
	   // Get the Web Driver and assign it to the driver variable
	   // navigate to the baseUrl
       // return driver
       driver=DriverSetup.getWebDriver();
       driver.get(baseUrl);
       return driver;
	}
	
	public void implDragnDrop(){   //DO NOT change the method signature
	
        // Locate the source web element that needs to be dragged.

        // Locate the target web element that needs to be dropped.      

        // Creating object of Actions class to build composite actions

        // Performing the drag and drop action
		
        WebElement source1 = driver.findElement(By.id("Shirts"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions builder = new Actions(driver);
        builder.clickAndHold(source1).moveToElement(target).release(source1).build().perform();
	}
	
	public void implMoveSlider(){   //DO NOT change the method signature
	    // Creating object of Actions class to build composite actions

        // Locate the slider web element

        // Move the slider to '5'

        // For Example

            // You can use the below methods to move the slider

            // * moveToElement(WebElement target)

            // * dragAndDropBy(WebElement source, int xOffset, int yOffset)

            // xOffset value is chosen as given below
                
                // a. If the 'kg' value is 5 the xOffset is "-10"
                // b. If the 'kg' value is 4 the xOffset is "-20"

                // c. If the 'kg' value is 3 the xOffset is "-40"

                // d. If the 'kg' value is 6 the xOffset is "10"

                // e. If the 'kg' value is 7 the xOffset is "20"

            // yOffset value is default ‘0’
                int slidvalue = 5; 
                Actions builder1 = new Actions(driver);
                WebElement slider = driver.findElement(By.id("myRange"));
                builder1.click(slider).build().perform();
                builder1.moveToElement(slider).click().dragAndDropBy(slider,(slidvalue * -2),0).build().perform();
                }
	
	public String getProductDetail(){ //DO NOT change the method signature
    
        // Locate the text displaying the product name.
        WebElement element1 = driver.findElement(By.id("product"));
        productInfo = element1.getText();
        System.out.println("***** product info *****");
        System.out.println(productInfo);
        return productInfo;
        
        // Assign the displaying text to the static variable 'productInfo'

        // Return the text using getText() method.


    }
    
    
    public String getQuantityDetail(){ //DO NOT change the method signature

        // Locate the text displaying the product quantity(No). 
        WebElement element2 = driver.findElement(By.xpath("//html/body/div[4]/div/div/p[3]"));
        // Assign the displaying text to the static variable 'quantityInfo'
        quantityInfo=element2.getText();
        System.out.println("***** Quantity info *****");
        System.out.println(quantityInfo);
        // Return the text using getText() method.
        return quantityInfo;
    }
   
   
    public String getPriceDetail(){  //DO NOT change the method signature
        // Locate the text displaying the product price. 
           WebElement element2 = driver.findElement(By.id("price"));
        // Assign the displaying text to the static variable 'priceInfo'
           priceInfo = element2.getText();
           System.out.println("***** price info *****");
           System.out.println(priceInfo);
        // Return the text using getText() method.
        return priceInfo;
    }

	public static void main(String[] args){          //DO NOT change the method signature
	    Slider ex =new Slider();
	    ex.createDriver();
	    ex.implDragnDrop();
	    ex.implMoveSlider();
	    ex.getPriceDetail();
	    ex.getQuantityDetail();
	    ex.getPriceDetail();
	    driver.close();
	    //Implement the required code
	    //Close the driver
	}
}

