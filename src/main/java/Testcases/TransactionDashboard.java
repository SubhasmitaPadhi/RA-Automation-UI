/**

/**
 * @author padhisub
 *
 */
 
package Testcases;
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
public class TransactionDashboard {
	public static WebDriver driver;
	// static WebDriverWait wait = new WebDriverWait(driver, 20);       
	 public static void switchToTransactionDashboard(WebDriver driver)throws Exception
	  {
		 Thread.sleep(3000);
//		 WebDriverWait wait = new WebDriverWait(driver, 20);
//		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.waituntillseeapplybutton)));
	        driver.findElement(By.xpath(RA_LOCATORS.dashboardtab)).click();
	        driver.findElement(By.xpath(RA_LOCATORS.transactiontab)).click();
	  }
	
	  public static void modelnameSearchTransactionDashboard(WebDriver driver)throws Exception
	  {
		  WebDriverWait wait = new WebDriverWait(driver, 20);
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.searchbasedOn)));
	        Select dropdown1= new Select(driver.findElement(By.xpath(RA_LOCATORS.searchbasedOn)));
		    dropdown1.selectByVisibleText("Model Name");
		   
		      wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.transactionstatus)));
			    Select dropdown3= new Select(driver.findElement(By.xpath(RA_LOCATORS.transactionstatus)));
			      dropdown3.selectByVisibleText("Success");
			    //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.waituntillseeapplybutton)));
			      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			      Thread.sleep(10000);
			      driver.findElement(By.xpath(RA_LOCATORS.Rundatefrom)).click();// select calendar from 
				  Robot robot = new Robot();
				  String sTemp = "2019-Jan-23 02:08";
				  StringSelection stringSelection = new StringSelection(sTemp);
				  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
				   //robot.setAutoDelay(3000);
				    robot.keyPress(KeyEvent.VK_CONTROL);
				    robot.keyPress(KeyEvent.VK_A);
				    robot.keyRelease(KeyEvent.VK_CONTROL);
				    robot.keyRelease(KeyEvent.VK_A);
				    //robot.setAutoDelay(3000);
				    robot.keyPress(KeyEvent.VK_CONTROL);
				    robot.keyPress(KeyEvent.VK_V);
				    robot.keyRelease(KeyEvent.VK_CONTROL);
				    robot.keyRelease(KeyEvent.VK_V);
				    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
				    driver.findElement(By.xpath(RA_LOCATORS.Rundateto)).click();// select calendar from 
				    Robot robot1 = new Robot();
					String sTemp1 = "2020-Jun-12 02:08";
					StringSelection stringSelection1 = new StringSelection(sTemp1);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
					    Thread.sleep(2000);
					    //robot1.setAutoDelay(3000);
					    robot1.keyPress(KeyEvent.VK_CONTROL);
					    robot1.keyPress(KeyEvent.VK_A);
					    robot1.keyRelease(KeyEvent.VK_CONTROL);
					    robot1.keyRelease(KeyEvent.VK_A);
					    //robot1.setAutoDelay(3000);
					    robot1.keyPress(KeyEvent.VK_CONTROL);
					    robot1.keyPress(KeyEvent.VK_V);
					    robot1.keyRelease(KeyEvent.VK_CONTROL);
					    robot1.keyRelease(KeyEvent.VK_V);
					    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				    Select dropdown4= new Select(driver.findElement(By.xpath(RA_LOCATORS.Transactiontype)));
				      dropdown4.selectByVisibleText("Prod");
				      
				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
					Select dropdown2= new Select(driver.findElement(By.xpath(RA_LOCATORS.modelnamedropdown)));
				    dropdown2.selectByIndex(5);
				    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				    driver.findElement(By.xpath(RA_LOCATORS.Searchbutton)).click();
				   //Thread.sleep(3000);
				  WaitLoader wl= new WaitLoader();
				  wl.waitForLoading(driver);
	  }
	public void TenantTransactionIDColumn(WebDriver driver) throws InterruptedException {
	 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 WebDriverWait wait = new WebDriverWait(driver, 20);
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center\"]/div/div[2]/div[1]/div/div[1]/div/span/input")));
			 
		// Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@id=\"center\"]/div/div[2]/div[1]/div/div[1]/div/span/input")).click();
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.TenantTransactionIDColumnMenu)));
			  driver.findElement(By.xpath(RA_LOCATORS.TenantTransactionIDColumnMenu)).click();
			  Select dropdown3= new Select(driver.findElement(By.xpath(RA_LOCATORS.TenantTransactionIDDropDown)));
		      dropdown3.selectByVisibleText("Equals");
		      driver.findElement(By.xpath(RA_LOCATORS.TenantTransactionIDColumnMenu)).sendKeys("Publishing-Test");
	
}
	public void transactionTypeSearchTransactionDashboard(WebDriver driver) throws InterruptedException, AWTException 
	{
	//	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.searchbasedOn)));
        Select dropdown1= new Select(driver.findElement(By.xpath(RA_LOCATORS.searchbasedOn)));
	    dropdown1.selectByVisibleText("Transaction Type");
	    //dropdown1.selectByIndex(3);
	      wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.transactionstatus)));
		    Select dropdown3= new Select(driver.findElement(By.xpath(RA_LOCATORS.transactionstatus)));
		      dropdown3.selectByVisibleText("Success");
		      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		      Thread.sleep(10000);
		      driver.findElement(By.xpath(RA_LOCATORS.Rundatefrom)).click();// select calendar from 
			  Robot robot = new Robot();
			  String sTemp = "2019-Jan-23 02:08";
			  StringSelection stringSelection = new StringSelection(sTemp);
			  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			   //robot.setAutoDelay(3000);
			    robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_A);
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    robot.keyRelease(KeyEvent.VK_A);
			    //robot.setAutoDelay(3000);
			    robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_V);
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    robot.keyRelease(KeyEvent.VK_V);
			    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
			    driver.findElement(By.xpath(RA_LOCATORS.Rundateto)).click();// select calendar from 
			    Robot robot1 = new Robot();
				String sTemp1 = "2020-Jun-12 02:08";
				StringSelection stringSelection1 = new StringSelection(sTemp1);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
				    Thread.sleep(2000);
				    //robot1.setAutoDelay(3000);
				    robot1.keyPress(KeyEvent.VK_CONTROL);
				    robot1.keyPress(KeyEvent.VK_A);
				    robot1.keyRelease(KeyEvent.VK_CONTROL);
				    robot1.keyRelease(KeyEvent.VK_A);
				    //robot1.setAutoDelay(3000);
				    robot1.keyPress(KeyEvent.VK_CONTROL);
				    robot1.keyPress(KeyEvent.VK_V);
				    robot1.keyRelease(KeyEvent.VK_CONTROL);
				    robot1.keyRelease(KeyEvent.VK_V);
				    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			    Select dropdown4= new Select(driver.findElement(By.xpath(RA_LOCATORS.Transactiontype)));
			      dropdown4.selectByVisibleText("Prod");
			      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				    driver.findElement(By.xpath(RA_LOCATORS.Searchbutton)).click();
	}
	public void transactionStatusSearchTransactionDashboard(WebDriver driver) throws InterruptedException, AWTException 
	{
	//	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.searchbasedOn)));
        Select dropdown1= new Select(driver.findElement(By.xpath(RA_LOCATORS.searchbasedOn)));
	    dropdown1.selectByVisibleText("Transaction Status");
	    //dropdown1.selectByIndex(3);
	      wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.transactionstatus)));
		    Select dropdown3= new Select(driver.findElement(By.xpath(RA_LOCATORS.transactionstatus)));
		      dropdown3.selectByVisibleText("Success");
		      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		      Thread.sleep(10000);
		      driver.findElement(By.xpath(RA_LOCATORS.Rundatefrom)).click();// select calendar from 
			  Robot robot = new Robot();
			  String sTemp = "2019-Jan-23 02:08";
			  StringSelection stringSelection = new StringSelection(sTemp);
			  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			   //robot.setAutoDelay(3000);
			    robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_A);
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    robot.keyRelease(KeyEvent.VK_A);
			    //robot.setAutoDelay(3000);
			    robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_V);
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    robot.keyRelease(KeyEvent.VK_V);
			    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
			    driver.findElement(By.xpath(RA_LOCATORS.Rundateto)).click();// select calendar from 
			    Robot robot1 = new Robot();
				String sTemp1 = "2020-Jun-12 02:08";
				StringSelection stringSelection1 = new StringSelection(sTemp1);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
				    Thread.sleep(2000);
				    //robot1.setAutoDelay(3000);
				    robot1.keyPress(KeyEvent.VK_CONTROL);
				    robot1.keyPress(KeyEvent.VK_A);
				    robot1.keyRelease(KeyEvent.VK_CONTROL);
				    robot1.keyRelease(KeyEvent.VK_A);
				    //robot1.setAutoDelay(3000);
				    robot1.keyPress(KeyEvent.VK_CONTROL);
				    robot1.keyPress(KeyEvent.VK_V);
				    robot1.keyRelease(KeyEvent.VK_CONTROL);
				    robot1.keyRelease(KeyEvent.VK_V);
				    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			    Select dropdown4= new Select(driver.findElement(By.xpath(RA_LOCATORS.Transactiontype)));
			      dropdown4.selectByVisibleText("Prod");
			      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				  driver.findElement(By.xpath(RA_LOCATORS.Searchbutton)).click();
				  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				  Select dropdown5= new Select(driver.findElement(By.xpath(RA_LOCATORS.failureType)));
			      dropdown5.selectByVisibleText("Validation");
			      driver.findElement(By.xpath(RA_LOCATORS.Searchbutton)).click();
			      Thread.sleep(5000);
				  Select dropdown6= new Select(driver.findElement(By.xpath(RA_LOCATORS.failureType)));
			      dropdown6.selectByVisibleText("System Exception");
			      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				  driver.findElement(By.xpath(RA_LOCATORS.Searchbutton)).click();
				  Thread.sleep(5000);
				  Select dropdown7= new Select(driver.findElement(By.xpath(RA_LOCATORS.failureType)));
			      dropdown7.selectByVisibleText("Model Exception");
			      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				  driver.findElement(By.xpath(RA_LOCATORS.Searchbutton)).click();
				  Thread.sleep(5000);
	}
	public void tenantTransactionIDSearchTransactionDashboard(WebDriver driver) throws InterruptedException, AWTException 
	{
	//	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.searchbasedOn)));
        Select dropdown1= new Select(driver.findElement(By.xpath(RA_LOCATORS.searchbasedOn)));
        dropdown1.selectByVisibleText("Tenant Transaction Id");
		      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		      Thread.sleep(10000);
		      driver.findElement(By.xpath(RA_LOCATORS.Rundatefrom)).click();// select calendar from 
			  Robot robot = new Robot();
			  String sTemp = "2019-Jan-23 02:08";
			  StringSelection stringSelection = new StringSelection(sTemp);
			  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			   //robot.setAutoDelay(3000);
			    robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_A);
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    robot.keyRelease(KeyEvent.VK_A);
			    //robot.setAutoDelay(3000);
			    robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_V);
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    robot.keyRelease(KeyEvent.VK_V);
			    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
			    driver.findElement(By.xpath(RA_LOCATORS.Rundateto)).click();// select calendar from 
			    Robot robot1 = new Robot();
				String sTemp1 = "2020-Jun-12 02:08";
				StringSelection stringSelection1 = new StringSelection(sTemp1);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
				    Thread.sleep(2000);
				    //robot1.setAutoDelay(3000);
				    robot1.keyPress(KeyEvent.VK_CONTROL);
				    robot1.keyPress(KeyEvent.VK_A);
				    robot1.keyRelease(KeyEvent.VK_CONTROL);
				    robot1.keyRelease(KeyEvent.VK_A);
				    //robot1.setAutoDelay(3000);
				    robot1.keyPress(KeyEvent.VK_CONTROL);
				    robot1.keyPress(KeyEvent.VK_V);
				    robot1.keyRelease(KeyEvent.VK_CONTROL);
				    robot1.keyRelease(KeyEvent.VK_V);
				    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				    driver.findElement(By.xpath(RA_LOCATORS.tenanttransactionid)).click();
				    driver.findElement(By.xpath(RA_LOCATORS.tenanttransactionid)).sendKeys("Publishing-Test");
			      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				  driver.findElement(By.xpath(RA_LOCATORS.Searchbutton)).click();
				  
	}
	public void RATransactionIdSearchTransactionDashboard(WebDriver driver) throws InterruptedException, AWTException 
	{
	//	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.searchbasedOn)));
        Select dropdown1= new Select(driver.findElement(By.xpath(RA_LOCATORS.searchbasedOn)));
        dropdown1.selectByVisibleText("RA Transaction Id");
		      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		      Thread.sleep(10000);
		      driver.findElement(By.xpath(RA_LOCATORS.Rundatefrom)).click();// select calendar from 
			  Robot robot = new Robot();
			  String sTemp = "2019-Jul-05 06:36";
			  StringSelection stringSelection = new StringSelection(sTemp);
			  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			   //robot.setAutoDelay(3000);
			    robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_A);
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    robot.keyRelease(KeyEvent.VK_A);
			    //robot.setAutoDelay(3000);
			    robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_V);
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    robot.keyRelease(KeyEvent.VK_V);
			    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
			    driver.findElement(By.xpath(RA_LOCATORS.Rundateto)).click();// select calendar from 
			    Robot robot1 = new Robot();
				String sTemp1 = "2020-Jun-12 02:08";
				StringSelection stringSelection1 = new StringSelection(sTemp1);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
				    Thread.sleep(2000);
				    //robot1.setAutoDelay(3000);
				    robot1.keyPress(KeyEvent.VK_CONTROL);
				    robot1.keyPress(KeyEvent.VK_A);
				    robot1.keyRelease(KeyEvent.VK_CONTROL);
				    robot1.keyRelease(KeyEvent.VK_A);
				    //robot1.setAutoDelay(3000);
				    robot1.keyPress(KeyEvent.VK_CONTROL);
				    robot1.keyPress(KeyEvent.VK_V);
				    robot1.keyRelease(KeyEvent.VK_CONTROL);
				    robot1.keyRelease(KeyEvent.VK_V);
				    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				    driver.findElement(By.xpath(RA_LOCATORS.tenanttransactionid)).click();
				    driver.findElement(By.xpath(RA_LOCATORS.RATransactionId)).sendKeys("Publishing-Test");
				    
			      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				  driver.findElement(By.xpath(RA_LOCATORS.Searchbutton)).click();
				  
	}

	
public static void downloadFilesFromButton(WebDriver driver)throws Exception{
	//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath(RA_LOCATORS.checkbox1)).click();
	WaitLoader wl= new WaitLoader();
	wl.waitForLoading(driver);
	driver.findElement(By.xpath(RA_LOCATORS.downloadioinjson)).click();
	 wl.waitForLoading(driver);
	driver.findElement(By.xpath(RA_LOCATORS.downloadioinexcel)).click();
	wl.waitForLoading(driver);
	driver.findElement(By.xpath(RA_LOCATORS.downloadexcutionreport)).click();
	 driver.findElement(By.xpath("//*[@id=\"selected_exec\"]")).click();//radio button 
	   driver.findElement(By.xpath("(//*[@id=\"ok\"])[2]")).click();//download button
	wl.waitForLoading(driver);
	   driver.findElement(By.xpath(RA_LOCATORS.downloadusagereport)).click();
	   driver.findElement(By.xpath("(//div[@class='modal-body ng-binding']/input[2])[1]")).click();//radio button 
	   driver.findElement(By.xpath("(//div[@class='modal-footer']/button[1])[1]")).click();//download button

}
public static void downloadFilesFromActionColumn(WebDriver driver) throws InterruptedException {
	WaitLoader wl= new WaitLoader();
	driver.findElement(By.xpath(RA_LOCATORS.actionMenu)).click();
	wl.waitForLoading(driver);
	driver.findElement(By.xpath(RA_LOCATORS.downloadtenantio)).click();
	wl.waitForLoading(driver);
	driver.findElement(By.xpath(RA_LOCATORS.actionMenu)).click();
	wl.waitForLoading(driver);
	driver.findElement(By.xpath(RA_LOCATORS.downloadmodeletio)).click();
	wl.waitForLoading(driver);
	driver.findElement(By.xpath(RA_LOCATORS.actionMenu)).click();
	wl.waitForLoading(driver);
	driver.findElement(By.xpath(RA_LOCATORS.reruntransaction)).click();
	wl.waitForLoading(driver);
	driver.findElement(By.xpath(RA_LOCATORS.reruntransactionExecutebutton)).click();
}
}
