/**
 * 
 */
package Testcases;

/**
 * @author padhisub
 *
 */
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java. util. Collection;
public class ModeletPooling {
	public static WebDriver driver;
	// static WebDriverWait wait = new WebDriverWait(driver, 20);  
	 public static void addPool(WebDriver driver)throws Exception
	  {
		 WaitLoader wl= new WaitLoader();
		  wl.waitForLoading(driver);
            		 
		driver.findElement(By.xpath(RA_LOCATORS.PoolingTab)).click();
		 	Thread.sleep(5000);
		 	driver.findElement(By.xpath(RA_LOCATORS.addnewpool)).click();
		 	driver.findElement(By.xpath(RA_LOCATORS.poolName)).sendKeys("Pool332");
		 	Select dropdown1 = new Select(driver.findElement(By.xpath(RA_LOCATORS.modelingEnvAndversion)));
   		    dropdown1.selectByIndex(3); 
   		    Select dropdown5 = new Select(driver.findElement(By.xpath(RA_LOCATORS.tenant)));
		    dropdown5.selectByIndex(3); 
   		    Select dropdown2 = new Select(driver.findElement(By.xpath(RA_LOCATORS.transactionMode)));
		    dropdown2.selectByIndex(2); 
		    Select dropdown3 = new Select(driver.findElement(By.xpath(RA_LOCATORS.transactiontype)));
   		    dropdown3.selectByIndex(1); 
   		    Select dropdown4 = new Select(driver.findElement(By.xpath(RA_LOCATORS.modelandversion)));
		    dropdown4.selectByIndex(2);
	  }
	 public static void addPool1WithEmptyWaitTime1 (WebDriver driver)throws Exception{
		    addPool(driver);
		    driver.findElement(By.xpath(RA_LOCATORS.waitTime)).click();
            driver.findElement(By.xpath(RA_LOCATORS.savebutton)).click();
            
		 	
	  }
	 public static void poolCreate1(WebDriver driver)throws Exception{
		     
		    driver.findElement(By.xpath(RA_LOCATORS.waitTime)).sendKeys("6000");
            driver.findElement(By.xpath(RA_LOCATORS.savebutton)).click();
         
		 	
	  }
	 public static void addPool1WithSamePoolName (WebDriver driver)throws Exception{
		 driver.findElement(By.xpath(RA_LOCATORS.addnewpool)).click();
		 	driver.findElement(By.xpath(RA_LOCATORS.poolName)).sendKeys("R-3.3.2-Linux-Default");
		 	Select dropdown1 = new Select(driver.findElement(By.xpath(RA_LOCATORS.modelingEnvAndversion)));
		    dropdown1.selectByIndex(3); 
		    Select dropdown5 = new Select(driver.findElement(By.xpath(RA_LOCATORS.tenant)));
		    dropdown5.selectByIndex(3); 
		    Select dropdown2 = new Select(driver.findElement(By.xpath(RA_LOCATORS.transactionMode)));
		    dropdown2.selectByIndex(1); 
		    Select dropdown3 = new Select(driver.findElement(By.xpath(RA_LOCATORS.transactiontype)));
		    dropdown3.selectByIndex(1); 
		    Select dropdown4 = new Select(driver.findElement(By.xpath(RA_LOCATORS.modelandversion)));
		    dropdown4.selectByIndex(2);
		    driver.findElement(By.xpath(RA_LOCATORS.waitTime)).sendKeys("6000");
            driver.findElement(By.xpath(RA_LOCATORS.savebutton)).click();
         }
	 public static void createPoolWithUniqueNameSamePoolCriteria (WebDriver driver)throws Exception{
		 driver.findElement(By.xpath(RA_LOCATORS.addnewpool)).click();
		 	driver.findElement(By.xpath(RA_LOCATORS.poolName)).sendKeys("ModeletPool");
		 	Select dropdown1 = new Select(driver.findElement(By.xpath(RA_LOCATORS.modelingEnvAndversion)));
		    dropdown1.selectByIndex(3); 
		    Select dropdown5 = new Select(driver.findElement(By.xpath(RA_LOCATORS.tenant)));
		    dropdown5.selectByIndex(3); 
		    Select dropdown2 = new Select(driver.findElement(By.xpath(RA_LOCATORS.transactionMode)));
		    dropdown2.selectByIndex(1); 
		    Select dropdown3 = new Select(driver.findElement(By.xpath(RA_LOCATORS.transactiontype)));
		    dropdown3.selectByIndex(1); 
		    Select dropdown4 = new Select(driver.findElement(By.xpath(RA_LOCATORS.modelandversion)));
		    dropdown4.selectByIndex(2);
		    driver.findElement(By.xpath(RA_LOCATORS.waitTime)).sendKeys("6000");
            driver.findElement(By.xpath(RA_LOCATORS.savebutton)).click();
         }
	 
	 public static void dragModelet332(WebDriver driver)throws Exception{
		 Thread.sleep(5000);
		  Actions act=new Actions(driver);
		    WebElement source=driver.findElement(By.xpath("//div[@class='btn btn-sm btn-default ng-scope ng-binding'][contains(text(),'10.197.4.30:7905')]"));
		    WebElement target=driver.findElement(By.xpath("//div[@id='pool_8']/div[2]/div"));
		     JavascriptExecutor js=(JavascriptExecutor)driver; 
		      js.executeScript("arguments[0].style.border='3px solid yellow'", source);
		      Thread.sleep(3000);
		      
		    act.dragAndDrop(source, target).perform();
		    System.out.print("success");
		    
		    
		    org.openqa.selenium.interactions.Action dragAndDrop = act.clickAndHold(source).moveToElement(target).release(target).build();
  //Performing the drag and drop action
		            dragAndDrop.perform();
		            Thread.sleep(4000);
		            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(RA_LOCATORS.commit)));
		            driver.findElement(By.xpath(RA_LOCATORS.commit)).click();
 	            Thread.sleep(4000);
		            driver.findElement(By.xpath(RA_LOCATORS.confirmYes)).click();

	 }
	 public static void dragModeleteWithDifferentEnvironment1(WebDriver driver)throws Exception{
		 WaitLoader wl= new WaitLoader();
		  wl.waitForLoading(driver);
          		
		  Actions act=new Actions(driver);
		    WebElement source=driver.findElement(By.xpath("//div[@class='btn btn-sm btn-default ng-scope ng-binding'][contains(text(),'10.197.4.30:7905')]"));
		    WebElement target=driver.findElement(By.xpath("(//div[@class='col-md-12'])[1]"));
		     JavascriptExecutor js=(JavascriptExecutor)driver; 
		      js.executeScript("arguments[0].style.border='3px solid green'", source);
		      System.out.println("dragged modelet");
		      wl.waitForLoading(driver);
		       act.dragAndDrop(source, target).perform();
		    org.openqa.selenium.interactions.Action dragAndDrop = act.clickAndHold(source).moveToElement(target).release(target).build();
  //Performing the drag and drop action
		            dragAndDrop.perform();
	 }
	 
	 public static void deletePoolHavingAtLeastaModelet(WebDriver driver)throws Exception{
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(RA_LOCATORS.deletePool)));
		 driver.findElement(By.xpath(RA_LOCATORS.deletePool)).click();
//		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 Thread.sleep(5000);
//         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center\"]/div/div[2]/div[1]/div/div[1]/div/span/input")));
         driver.findElement(By.xpath(RA_LOCATORS.DeleteYes)).click();
         Thread.sleep(5000);
	 }
	public static void dragBackModelet(WebDriver driver)throws Exception {

		 WaitLoader wl= new WaitLoader();
		  wl.waitForLoading(driver);
           		
			  Actions act=new Actions(driver);
			    WebElement source=driver.findElement(By.xpath("//div[@class='btn btn-sm btn-default ng-scope ng-binding'][contains(text(),'10.197.4.30:7905')]"));
			    WebElement target=driver.findElement(By.xpath("//div[@id='pool_4']/div[2]/div"));
			     JavascriptExecutor js=(JavascriptExecutor)driver; 
			      js.executeScript("arguments[0].style.border='3px solid red'", source);
			      wl.waitForLoading(driver);
			    act.dragAndDrop(source, target).perform();
			    System.out.print("success");
			    
			    
			    org.openqa.selenium.interactions.Action dragAndDrop = act.clickAndHold(source).moveToElement(target).release(target).build();
	  //Performing the drag and drop action
			            dragAndDrop.perform();
			            wl.waitForLoading(driver); 
	//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(RA_LOCATORS.commit)));
			            driver.findElement(By.xpath(RA_LOCATORS.commit)).click();
	 	            Thread.sleep(4000);
			            driver.findElement(By.xpath(RA_LOCATORS.confirmYes)).click();

		 }
	
	 
	 
	 public static void restartModeletfromPool1(WebDriver driver)throws Exception{
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(RA_LOCATORS.RestartModelet)));
		 driver.findElement(By.xpath(RA_LOCATORS.RestartModelet)).click();
		 
//		 WebDriverWait wait = new WebDriverWait(driver, 20);
//         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center\"]/div/div[2]/div[1]/div/div[1]/div/span/input")));
        driver.findElement(By.xpath(RA_LOCATORS.DeleteYes)).click();
	 }
	 }
