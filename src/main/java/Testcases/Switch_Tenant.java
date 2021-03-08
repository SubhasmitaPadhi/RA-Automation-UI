package Testcases;
import Utility.ConfigReader;

import org.testng.annotations.Test;
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
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Random;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java. util. Collection;
import Testcases.RandomString;
import Utility.ConfigReader;
public class Switch_Tenant 
{	
	
	public void switchToOtherTenant(WebDriver driver) throws Exception {
	Thread.sleep(3000);
	 driver.findElement(By.xpath(RA_LOCATORS.tenanticon)).click();
	 driver.findElement(By.xpath(RA_LOCATORS.hubzutenant)).click();
     Thread.sleep(1000);
	  driver.findElement(By.xpath(RA_LOCATORS.confirmtenant)).click();
	  Thread.sleep(1000);    
}
}