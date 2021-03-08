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
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java. util. Collection;
public class SupportLibrary {
	public static WebDriver driver;
	// static WebDriverWait wait = new WebDriverWait(driver, 20);  
	public static String supportLibraryupload = "C:\\Users\\padhisub\\Documents\\RA\\Bug_pic\\modelet_Pooling.png";
	public static String validLibraryupload = "";
	public static String existingLibraryupload= "C:\\Users\\padhisub\\Documents\\RA\\Library\\ahaz_1.14.tar.gz";
	 public static void fileUpload(String fileUpload) throws Exception
	  {
			Robot robot = new Robot();
		    StringSelection stringSelection = new StringSelection(fileUpload);
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		    robot.setAutoDelay(3000);
		    robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.setAutoDelay(3000);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		}
	 public static void switchToSupportLibrary(WebDriver driver)throws Exception
	  {
		 Thread.sleep(3000);
//		 WebDriverWait wait = new WebDriverWait(driver, 20);
//		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.waituntillseeapplybutton)));
	        driver.findElement(By.xpath(RA_LOCATORS.supportLibararytab)).click();
	        driver.findElement(By.xpath(RA_LOCATORS.addLibararytab)).click();
	       
	        
	  }
	 public static void addLibraryR360Nobutton(WebDriver driver)throws Exception{
		 WaitLoader wl= new WaitLoader();
		  wl.waitForLoading(driver);
		 Select dropdown1= new Select(driver.findElement(By.xpath(RA_LOCATORS.RVersion)));
			dropdown1.selectByIndex(1);
			wl.waitForLoading(driver);
			driver.findElement(By.xpath(RA_LOCATORS.addLibararybutton)).click();
			driver.findElement(By.xpath(RA_LOCATORS.NobuttonR360)).click();
		}
	 public static void addLibraryR360YesbuttonInvalidFileUpload(WebDriver driver)throws Exception{
		 WaitLoader wl= new WaitLoader();
		  wl.waitForLoading(driver);
		 Select dropdown1= new Select(driver.findElement(By.xpath(RA_LOCATORS.RVersion)));
			dropdown1.selectByIndex(1);
			wl.waitForLoading(driver);
			driver.findElement(By.xpath(RA_LOCATORS.addLibararybutton)).click();
			driver.findElement(By.xpath(RA_LOCATORS.YesbuttonR360)).click();
			//driver.findElement(By.xpath(RA_LOCATORS.YesbuttonR360)).click();	
			fileUpload(supportLibraryupload);
			
			
		}
	 public static void deleteLibrary(WebDriver driver)throws Exception{
		 WaitLoader wl= new WaitLoader();
		  wl.waitForLoading(driver);
		  driver.findElement(By.xpath(RA_LOCATORS.remove)).click();
	 }
	 public static void addLibraryR332Nobutton(WebDriver driver)throws Exception{
		 WaitLoader wl= new WaitLoader();
		  wl.waitForLoading(driver);
		 Select dropdown1= new Select(driver.findElement(By.xpath(RA_LOCATORS.RVersion)));
			dropdown1.selectByIndex(0);
			wl.waitForLoading(driver);
			driver.findElement(By.xpath(RA_LOCATORS.addLibararybutton)).click();
			driver.findElement(By.xpath(RA_LOCATORS.NobuttonR360)).click();
			}
	 
	 public static void addLibraryR332YesbuttonInvalidFileUpload(WebDriver driver)throws Exception{
		 WaitLoader wl= new WaitLoader();
		  wl.waitForLoading(driver);
		 Select dropdown1= new Select(driver.findElement(By.xpath(RA_LOCATORS.RVersion)));
			dropdown1.selectByIndex(0);
			driver.findElement(By.xpath(RA_LOCATORS.addLibararybutton)).click();
			driver.findElement(By.xpath(RA_LOCATORS.YesbuttonR360)).click();
			//driver.findElement(By.xpath(RA_LOCATORS.YesbuttonR360)).click();	
			fileUpload(supportLibraryupload);
			}
	 public static void addLibraryR332ValidFileUpload(WebDriver driver)throws Exception{
		 WaitLoader wl= new WaitLoader();
		  wl.waitForLoading(driver);
		 Select dropdown1= new Select(driver.findElement(By.xpath(RA_LOCATORS.RVersion)));
			dropdown1.selectByIndex(0);
			wl.waitForLoading(driver);
			driver.findElement(By.xpath(RA_LOCATORS.addLibararybutton)).click();
			driver.findElement(By.xpath(RA_LOCATORS.YesbuttonR360)).click();
			//driver.findElement(By.xpath(RA_LOCATORS.YesbuttonR360)).click();	
			fileUpload(existingLibraryupload);
			wl.waitForLoading(driver);
			driver.findElement(By.xpath(RA_LOCATORS.Upload)).click();
	 }
	 public static void validateInmanagePage332(WebDriver driver)throws Exception{
		 Thread.sleep(7000);
		 driver.findElement(By.xpath(RA_LOCATORS.managetab)).click();
//		 Select dropdown1= new Select(driver.findElement(By.xpath(RA_LOCATORS.RVersion)));
//		 dropdown1.selectByIndex(3); 
		Thread.sleep(7000);
		 driver.findElement(By.xpath(RA_LOCATORS.managetabsearch)).sendKeys("AFM_1.2.6.tar.gz");
		 driver.findElement(By.xpath(RA_LOCATORS.serachbutton)).click();
		 Thread.sleep(7000);
		 driver.findElement(By.xpath(RA_LOCATORS.checkbox)).click();
		 driver.findElement(By.xpath(RA_LOCATORS.Download)).click();
		 
	 }
	
}
