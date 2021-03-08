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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Testcases.RandomString;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import Testcases.RA_LOCATORS;

public class ModeletProfiling {
	
	public static WebDriver driver;
public void modeletProfile1(WebDriver driver) {
	driver.findElement(By.linkText(RA_LOCATORS.modelet_profiling_tab)).click();
}
public static void manageProfile(WebDriver driver) {
	driver.findElement(By.xpath(RA_LOCATORS.manage_profile_tab)).click();
}
public void addProfile(WebDriver driver) 
{
	
		RandomString str = new RandomString();
		String profilename1= str.getAlphaNumericString();
		System.out.println("profilename="+profilename1);
		driver.findElement(By.xpath(RA_LOCATORS.addprofilebutton)).click();
	    driver.findElement(By.xpath(RA_LOCATORS.profilename)).sendKeys(profilename1);
	    driver.findElement(By.xpath(RA_LOCATORS.Description)).sendKeys(profilename1);
	    driver.findElement(By.xpath(RA_LOCATORS.LD_LIBRARY_PATH)).sendKeys("/usr/lib64/R/library/rJava/jri:/usr/lib64/R/lib:"
	    		+ "												/usr/lib/jvm/jre-1.8.0-openjdk-1.8.0.141-3.b16.el6_9.x86_64/jre/lib/amd64/server");
	    driver.findElement(By.xpath(RA_LOCATORS.JAVA_HOME)).sendKeys("/usr/bin/java");
	    driver.findElement(By.xpath(RA_LOCATORS.Workspace)).sendKeys("/opt/umg/matlab_workspace");
	    driver.findElement(By.xpath(RA_LOCATORS.Hazelcast_Config)).sendKeys("/opt/raconf/hazelcast-config.xml");
	    driver.findElement(By.xpath(RA_LOCATORS.R_Home)).sendKeys("/usr/lib64/R");
	    driver.findElement(By.xpath(RA_LOCATORS.Http_Connection_Pool_Properties)).sendKeys("file:/opt/ra-modelet/raconf/httpConnectionPooling.properties");
	   
	 
	    WebElement element1 = driver.findElement(By.xpath(RA_LOCATORS.loglevel));
	    Select dropdown1= new Select(element1);
		dropdown1.selectByVisibleText("info");
		
		 WebElement element2 = driver.findElement(By.xpath(RA_LOCATORS.Execution_Platform));
		 Select dropdown2= new Select(element2);
		 dropdown2.selectByVisibleText("Linux");
		 
		 WebElement element3 = driver.findElement(By.xpath(RA_LOCATORS.Execution_Environment));
		Select dropdown3= new Select(element3);
		dropdown3.selectByVisibleText("R--3.3.2");
}
public void saveProfile(WebDriver driver) throws InterruptedException {
	Thread.sleep(4000);
	WebElement ele = driver.findElement(By.xpath("//*[@id=\"update_mp2\"]"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	
	WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"newModal\"]/div/div/div/button/span"));
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);
}
public void cancelProfile(WebDriver driver) {
	WebElement ele = driver.findElement(By.xpath(RA_LOCATORS.cancel_profile));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
}
public void editProfile(WebDriver driver) throws InterruptedException {
	//driver.findElement(By.xpath(RA_LOCATORS.edit_icon)).click();
	WebDriverWait wait = new WebDriverWait(driver, 20);       
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.edit_icon)));    
	WebElement ele = driver.findElement(By.xpath(RA_LOCATORS.edit_icon));
	
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RA_LOCATORS.R_Home_edit_page)));    
	driver.findElement(By.xpath(RA_LOCATORS.R_Home_edit_page)).clear();
	driver.findElement(By.xpath(RA_LOCATORS.R_Home_edit_page)).sendKeys("/usr/lib64/R1");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement element3 = driver.findElement(By.xpath(RA_LOCATORS.Execution_Environment_edit_page));
	Select dropdown3= new Select(element3);
	dropdown3.selectByVisibleText("R--3.6.0");
	Thread.sleep(6000);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath(RA_LOCATORS.update)).click();
	Thread.sleep(6000);
//	Assert.assertEquals("Modelet profiler updated Successfully.","Modelet profiler updated Successfully.");
//	System.out.println("Modelet profiler updated Successfully. after clicking on update button");
	driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div/button/span")).click();
}
public void deleteProfileCancelButton(WebDriver driver) {
	driver.findElement(By.xpath(RA_LOCATORS.deleteProfile)).click();
	driver.findElement(By.xpath(RA_LOCATORS.CancelDeleteProfile)).click();
}
public void deleteProfileYesButton(WebDriver driver) throws InterruptedException {
	driver.findElement(By.xpath(RA_LOCATORS.deleteProfile)).click();
	driver.findElement(By.xpath(RA_LOCATORS.YesDeleteProfile)).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(RA_LOCATORS.CloseDeletePopUp)).click();
}
public void searchProfile(WebDriver driver) {
	driver.findElement(By.xpath(RA_LOCATORS.searchModeletProfile1)).sendKeys("3.6.0");
	
}
}
