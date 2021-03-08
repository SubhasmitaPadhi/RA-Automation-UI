/**
 * 
 */
package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Testcases.RA_LOCATORS;
/**
 * @author padhisub
 *
 */
public class login1
{	static  WebDriver driver;
	
	public static void loginToRA(WebDriver driver) {
		
		driver.findElement(By.xpath(RA_LOCATORS.userid)).sendKeys("SATISH");
	    driver.findElement(By.xpath(RA_LOCATORS.password)).sendKeys("Welcome1");
	    driver.findElement(By.xpath(RA_LOCATORS.login_button)).click();
	   
	}
}