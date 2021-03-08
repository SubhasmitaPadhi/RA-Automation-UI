/**
 * 
 */
package Testcases;

/**
 * @author padhisub
 *
 */
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Testcases.RandomString;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class NewModelVersionCreation {
	static WaitLoader wl= new WaitLoader();
	
	public static String releasenotefile = "C:\\Users\\padhisub\\Documents\\RA\\Bug_pic\\modelet_Pooling.png";
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
	public static void AddModel(WebDriver driver) throws Exception
	  {
		
			WebDriverWait wait = new WebDriverWait(driver, 40);       
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.modeltab)));       
			driver.findElement(By.xpath(RA_LOCATORS.modeltab)).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.addmodel)));
			driver.findElement(By.xpath(RA_LOCATORS.addmodel)).click();
			
	  }
	public static void addNewVersionModelVerificationTillArtifact1(WebDriver driver) throws Exception
	 {
		
		  wl.waitForLoading(driver);
			WebDriverWait wait = new WebDriverWait(driver, 40);       
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.createnewVersionButton)));       
			driver.findElement(By.xpath(RA_LOCATORS.createnewVersionButton)).click();
			 wl.waitForLoading(driver);
			Select dropdown1 = new Select(driver.findElement(By.xpath(RA_LOCATORS.newmodelname)));
		    dropdown1.selectByVisibleText("hubzuweekn");
		    driver.findElement(By.xpath(RA_LOCATORS.newMinorModelVersion)).click();
		    Select dropdown2 = new Select(driver.findElement(By.xpath(RA_LOCATORS.newMinorModelDropDown)));
		    dropdown2.selectByVisibleText("2");
			  wl.waitForLoading(driver);
		    driver.findElement(By.xpath(RA_LOCATORS.newModelReleaseNotes)).click();	
			fileUpload(releasenotefile);
			  wl.waitForLoading(driver);
			Select dropdown3= new Select(driver.findElement(By.xpath(RA_LOCATORS.newmodelVersion)));
			dropdown3.selectByVisibleText("R-3.6.0");
		    Thread.sleep(4000);
		    driver.findElement(By.xpath(RA_LOCATORS.newartifactButton)).click();	
			
	 }
	public static void afterArtifacts1(WebDriver driver) throws Exception
	 {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		  wl.waitForLoading(driver);
		  driver.findElement(By.xpath(RA_LOCATORS.selectexitingTargzfile)).click();
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.selectTargz)));
		  driver.findElement(By.xpath(RA_LOCATORS.selectTargz)).click();
		  driver.findElement(By.xpath(RA_LOCATORS.okbutton1)).click();
		  driver.findElement(By.xpath(RA_LOCATORS.selectexitingmodelio)).click();
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.selectmodelio)));
		  driver.findElement(By.xpath(RA_LOCATORS.selectmodelio)).click();
		  driver.findElement(By.xpath(RA_LOCATORS.okbutton2)).click();
		 // wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.validateAndSaveButton1)));
		  //driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		//  Thread.sleep(10000);
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(RA_LOCATORS.validateAndSaveButton1)));
		  driver.findElement(By.xpath(RA_LOCATORS.validateAndSaveButton1)).click();
	 }
	public static void managePageVerification1(WebDriver driver) throws Exception
	 {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wl.waitForLoading(driver);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.modeltab)));       
		driver.findElement(By.xpath(RA_LOCATORS.modeltab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.managetabnew)));        
		driver.findElement(By.xpath(RA_LOCATORS.managetabnew)).click();	
		wl.waitForLoading(driver);
	 }
	public static void emailApproval1(WebDriver driver) {
		wl.waitForLoading(driver);
		driver.findElement(By.xpath(RA_LOCATORS.clickonfirstmodeleofmangepage)).click();
		driver.findElement(By.xpath(RA_LOCATORS.emailApproval)).click();
		wl.waitForLoading(driver);
		driver.findElement(By.xpath(RA_LOCATORS.yesEmailApproval)).click();
		
	}
	public static void testBed1(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);    
		wl.waitForLoading(driver);
		driver.findElement(By.xpath(RA_LOCATORS.clickonfirstmodeleofmangepage)).click();
		driver.findElement(By.xpath(RA_LOCATORS.testModel)).click();
		wl.waitForLoading(driver);
		driver.findElement(By.xpath(RA_LOCATORS.testBedExecute)).click();
		wl.waitForLoading(driver);
		driver.findElement(By.xpath(RA_LOCATORS.managetabnew)).click();	
		
	}
	public static void viewPage(WebDriver driver) {
		wl.waitForLoading(driver);
	  driver.findElement(By.xpath(RA_LOCATORS.viewTab)).click();
		wl.waitForLoading(driver);
		String Environmentlanguage = driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[1]/section[2]/div[1]/div[1]/div/div[1]/table/tbody/tr[4]/td[2]")).getText();
		assertEquals(Environmentlanguage,"R-3.6.0");
		if(Environmentlanguage.equals("R-3.6.0")) {
		    System.out.println("Environmentlanguage is "+Environmentlanguage);
		} else {
		    System.out.println("Environmentlanguage is not ");
		}
		
		
		String ExecutionEnvironment = driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[1]/section[2]/div[1]/div[1]/div/div[1]/table/tbody/tr[5]/td[2]")).getText();
		assertEquals(ExecutionEnvironment,"Linux");
		if(ExecutionEnvironment.equals("Linux")) {
		    System.out.println("Execution Environment is "+ExecutionEnvironment);
		} else {
		    System.out.println("Execution Environment is not "+ExecutionEnvironment);
		}
		
		
	}
}

