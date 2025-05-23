package ExoTalentWeb.Utils;

import java.util.Set;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import com.ishine.base.TestBase;
import org.openqa.selenium.support.ui.Select;


//import com.selenium.init.Browser;

import org.apache.log4j.Logger;
public class ActionKeywords{
	
	public WebDriver driver;
	protected String parentHandle;
	
	static Logger log = Logger.getLogger(ActionKeywords.class);
	
	

	public static boolean isDisplay(WebElement ele) {	
		 return ele.isDisplayed();
//		 try {
//		        return ele.isDisplayed();
//		    } catch (NoSuchElementException e) {
//		    	 e.printStackTrace();
//		        // Log the exception (optional)
//		        System.err.println("Element not found in the DOM: " + e.getMessage());
//		        // Return false to indicate that the element is not displayed
//		        Assert.fail("Element not found: " + e.getMessage());
//		        return false;
//		    }
		
	}

	public static boolean isClickable(WebElement element){
		return element.isEnabled();
	}
	
	public static void clickElement(WebElement ele) {
		ele.click();
	}
	
	public static void sendKeysElement(WebElement ele, String element) {
		ele.sendKeys(element);
	}

	public static void clearElement(WebElement ele) {
		ele.clear();
	}
	 public static void scrollIntoView(WebDriver driver, WebElement element) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    }

	 ///switch methods add by mayur 
		public void switchToChildWindow() {
			Set<String> newwindow = driver.getWindowHandles();
			for (String handle : newwindow) {
				log.info("Windo" + handle);
				if (!handle.equals(parentHandle)) {
					log.info("Window::" + handle);
					driver.switchTo().window(handle);
					log.info("Swtich Done");
					break;
				}
			}
		}

		public void switchToParentWindow() {
			driver.switchTo().window(parentHandle);
			log.info("Switch To Parent Window");
		}

		public void closeChildWindow() {
			driver.close();
			driver.switchTo().window(parentHandle);
		}
		

		
		public void switchToSecondChildWindow() {
			Set<String> newwindow = driver.getWindowHandles();
			for (String handle : newwindow)
			{
				log.info("Windo" + handle);
				if (!handle.equals(parentHandle)) 
				{
					log.info("Window::" + handle);
					Set<String> newwindow2 = driver.getWindowHandles();
					for (String SecondChild : newwindow2)
					{
						log.info("Second window" + SecondChild);
						if(!SecondChild.equals(handle))
						{
							driver.switchTo().window(SecondChild);
							log.info("Swtich Done");
						}
					}
					break;
				}
			}
		}
//<------------------------------------- END --------------------------------------------------------->
	public static void selectByValue(WebElement ele, String countryName){
		Select select = new Select(ele);
		select.selectByVisibleText(countryName);
	}






//public void clickElement1(WebElement element) throws InterruptedException {
//    try {
//        element.click();  // normal click
//    } catch (ElementClickInterceptedException e) {
//        System.out.println("Click intercepted. Trying JavaScript click instead.");
//
//        // Scroll to element and offset for sticky headers
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        Thread.sleep(300); // let scroll settle
//        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -100);"); // header offset
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element); // JS click
//    } catch (Exception e) {
//        System.out.println("Click failed: " + e.getMessage());
//        throw e;
//    }
//}

}
















