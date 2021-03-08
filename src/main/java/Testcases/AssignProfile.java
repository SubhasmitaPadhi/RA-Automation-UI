/**
 * 
 */
package Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 * @author padhisub
 *
 */
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
public class AssignProfile {
	public void assignProfile1(WebDriver driver) {
		driver.findElement(By.xpath(RA_LOCATORS.assignprofiletab)).click();
	}
	public void editPositive(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(RA_LOCATORS.editbutton)).click();
		WebElement element3 = driver.findElement(By.xpath(RA_LOCATORS.ModeletProfiler_assign_edit));
		Select dropdown3= new Select(element3);
		dropdown3.selectByVisibleText("R-3.3.2");
		driver.findElement(By.xpath(RA_LOCATORS.assignbutton)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(RA_LOCATORS.closebutton)).click();
		
	}
	public void editNegative(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath(RA_LOCATORS.editbutton)).click();
		WebElement element3 = driver.findElement(By.xpath(RA_LOCATORS.ModeletProfiler_assign_edit));
		Select dropdown3= new Select(element3);
		dropdown3.selectByVisibleText("R-3.6.0");
		driver.findElement(By.xpath(RA_LOCATORS.assignbutton)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(RA_LOCATORS.closebutton)).click();}
	
	public void restartYesButtonClick(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath(RA_LOCATORS.checkbutton)).click();
		driver.findElement(By.xpath(RA_LOCATORS.RestartAssignButton)).click();
		driver.findElement(By.xpath(RA_LOCATORS.yesbutton)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(RA_LOCATORS.restartclosebutton)).click();
		Thread.sleep(3000);
		}
	public void restartNoButtonClick(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath(RA_LOCATORS.checkbutton)).click();
		driver.findElement(By.xpath(RA_LOCATORS.RestartAssignButton)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(RA_LOCATORS.nobutton)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(RA_LOCATORS.restartclosebutton)).click();
		Thread.sleep(3000);
		}
	public void searchingProfile(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath(RA_LOCATORS.searchbutton)).sendKeys("testing-profile");
		
	}
	public void downloadLogFile(WebDriver driver) throws InterruptedException, AWTException{
		  driver.findElement(By.xpath("//*[@id=\"sp_gridbody\"]/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[7]/div/button[1]/i")).click();	
          Robot robot = new Robot();  // Robot class throws AWT Exception	
          Thread.sleep(2000); // Thread.sleep throws InterruptedException	
          robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
          
          Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
          robot.keyPress(KeyEvent.VK_TAB);	
          Thread.sleep(2000);	
          robot.keyPress(KeyEvent.VK_TAB);	
          Thread.sleep(2000);	
          robot.keyPress(KeyEvent.VK_TAB);	
          Thread.sleep(2000);	
          robot.keyPress(KeyEvent.VK_ENTER);	
	}
}