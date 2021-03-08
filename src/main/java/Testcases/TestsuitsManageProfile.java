package Testcases;

import org.testng.annotations.Test;
import Testcases.*;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.*;
import Utility.ConfigReader;


import com.paulhammant.ngwebdriver.NgWebDriver;

public class TestsuitsManageProfile 
{
	static ConfigReader config;
	static WebDriver driver;

	
	@BeforeTest
	public static void setUp() throws Exception
	{
		config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver",config.getChromepath());
		System.out.println("Browser Launched successfully");
		
	}
	@Test(priority=1)
	public static void testChrome() throws Exception
	{
		
		driver=new ChromeDriver();
		driver.get(config.getApplicationURL());
		System.out.println("URL works properly");
		driver.manage().window().maximize();
	}
		
	@Test(priority=2)
		public static void loginToRA() throws Exception
	{
//		 //Login lg=new Login(driver);
//		//lg.Logintora("SATISH","Welcome1");
			login1 lg=new login1();
			lg.loginToRA(driver);
		    System.out.println("Login page working");
		    
		    
	}
	@Test(priority=3)
	public static void modeletProfileWithSave() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ModeletProfiling mp=new ModeletProfiling();
		mp.modeletProfile1(driver);
		Thread.sleep(3000);
		mp.manageProfile(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		mp.addProfile(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		mp.saveProfile(driver);
		Assert.assertEquals("Modelet profiler created Successfully.","Modelet profiler created Successfully.");
    	System.out.println("Modelet Profiler created Successfully after clicking on save button");
	  
		System.out.println("ModeletPtrogfiling page working");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
  @Test(priority=4)
	public static void deleteProfileCancle() throws InterruptedException {
		Thread.sleep(5000);
		ModeletProfiling mp=new ModeletProfiling();
		mp.deleteProfileCancelButton(driver);
	}
	@Test(priority=5)
	public static void deleteProfileYes() throws InterruptedException {
		Thread.sleep(3000);
		ModeletProfiling mp=new ModeletProfiling();
		mp.deleteProfileYesButton(driver);
		Assert.assertEquals("Modelet profiler deleted Successfully.","Modelet profiler deleted Successfully.");
    	System.out.println("Modelet profiler deleted Successfully.");
	}
	@Test(priority=6)
	public static void editProfile() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(8000);
		ModeletProfiling mp=new ModeletProfiling();
		mp.editProfile(driver);
	}

	@Test(priority=7)
	public static void searchModeletProfile() throws InterruptedException {
		Thread.sleep(3000);
		ModeletProfiling mp=new ModeletProfiling();
		mp.searchProfile(driver);
	}
	@AfterTest
	 public void after() throws InterruptedException
	{
			 Thread.sleep(10000);
			 driver.quit();
			 System.out.println("Closed Successfully");
	}


}
