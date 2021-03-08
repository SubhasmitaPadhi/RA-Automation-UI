/**
 * 
 */
package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Testcases.RandomString;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/**
 * @author padhisub
 *
 */


	public class ModelPublishingFromScratch 
	{
			public static String releasenotefile = "C:\\Users\\padhisub\\Documents\\RA\\Bug_pic\\modelet_Pooling.png";
			public static String modelfile ="C:\\Users\\padhisub\\Documents\\RA\\Automation_Hubzu_Model\\hubzuwk0sopOCN_12.0.22221.tar.gz";
			public static String menifestfile= "C:\\Users\\padhisub\\Documents\\RA\\Automation_Hubzu_Model\\OCN manifest v12.0.1.csv";
			public static String iofile= "C:\\Users\\padhisub\\Documents\\RA\\Automation_Hubzu_Model\\hubzuweek0 OCN IO v12.0.1.xlsx";
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
		  
		public void addModelFromScratch(WebDriver driver) throws Exception {
			WebDriverWait wait = new WebDriverWait(driver, 20);       
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.modeltab)));       
			driver.findElement(By.xpath(RA_LOCATORS.modeltab)).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.addmodel)));
			driver.findElement(By.xpath(RA_LOCATORS.addmodel)).click();
			RandomString str = new RandomString();
			String Modelname= str.getAlphaNumericString();
			System.out.println("Modelname="+Modelname);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@name='modelName_fv'])[1]")));
		    driver.findElement(By.xpath(RA_LOCATORS.modelname)).sendKeys(Modelname);
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.modeldescription)));
		    driver.findElement(By.xpath(RA_LOCATORS.modeldescription)).sendKeys(Modelname);
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.model_release_notes)));
		    driver.findElement(By.xpath(RA_LOCATORS.model_release_notes)).click();	
			fileUpload(releasenotefile);
			Select dropdown1= new Select(driver.findElement(By.xpath(RA_LOCATORS.programming_language)));
			dropdown1.selectByVisibleText("R");
			Select dropdown2= new Select(driver.findElement(By.xpath(RA_LOCATORS.Version)));
			dropdown2.selectByVisibleText("R-3.6.0");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.AddArtifectButton)));
		    driver.findElement(By.xpath(RA_LOCATORS.AddArtifectButton)).click();
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.R_Model_tar_gz_file)));
		    driver.findElement(By.xpath(RA_LOCATORS.R_Model_tar_gz_file)).click();	
			fileUpload(modelfile);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.ModelIODefinition)));
			driver.findElement(By.xpath(RA_LOCATORS.ManifestFile)).click();	
			fileUpload(menifestfile);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.ModelIODefinition)));
			driver.findElement(By.xpath(RA_LOCATORS.ModelIODefinition)).click();	
			fileUpload(iofile);
			driver.findElement(By.xpath(RA_LOCATORS.checksum)).sendKeys("0a04a55e93e56a741a16c05cc9031dce58830a0e3db8a09b7d8d5b2f4b64b16c");	
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.ValidateAndSaveButton)));
			driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
			//Thread.sleep(10000);
			driver.findElement(By.xpath(RA_LOCATORS.ValidateAndSaveButton)).click();	
			
		}
		public void ManageModelFromScratch(WebDriver driver) throws Exception {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			Thread.sleep(6000);
			driver.findElement(By.xpath(RA_LOCATORS.ManageModelTab)).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.ModelColumn)));
			driver.findElement(By.xpath(RA_LOCATORS.ModelColumn)).click();
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.EmailApprovalButton)));
			driver.findElement(By.xpath(RA_LOCATORS.EmailApprovalButton)).click();
			driver.findElement(By.xpath(RA_LOCATORS.publishmodel)).click();
     }
		
	}
