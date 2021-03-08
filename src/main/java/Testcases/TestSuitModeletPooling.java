/**
 * 
 */
package Testcases;

/**
 * @author padhisub
 *
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utility.ConfigReader;

import java. util. Collection;
public class TestSuitModeletPooling {
	 ConfigReader config;
		WebDriver driver;

		
		@BeforeTest
		public void setUp() throws Exception
		{
			config=new ConfigReader();
			System.setProperty("webdriver.chrome.driver",config.getChromepath());
			System.out.println("Browser Launched successfully");
			
		}
		@Test(priority=1)
		public void testChrome() throws Exception
		{
			
			driver=new ChromeDriver();
			driver.get(config.getApplicationURL());
			System.out.println("URL works properly");
			driver.manage().window().maximize();
//			 ExtentHtmlReporter reporter = new  ExtentHtmlReporter("C:\\Users\\padhisub\\Documents\\RA\\RA_UI_AUTO\\test-output\\Report_output\\Report.html");
//			 ExtentReports extent = new ExtentReports();
//			 extent.attachReporter(reporter);
//			 ExtentTest logger=extent.createTest("Pooling test");
//			 logger.log(Status.PASS, "Lauaching Browser");
			 //logger.log(Status.PASS, "RA URL");
			 //extent.flush();
			 
		}
		@Test(priority=2)
		public void loginToRA() throws Exception
	{
			login1 lg=new login1();
			lg.loginToRA(driver);
		    System.out.println("Login page working");
		    
	}
	@Test(priority=3)
		public void addPool1WithEmptyWaitTime() throws Exception
		{
			ModeletPooling  mp =new ModeletPooling();
			mp.addPool1WithEmptyWaitTime1(driver);
			Assert.assertEquals("WaitTimeout value should be >=60.","WaitTimeout value should be >=60.");
			System.out.println("WaitTimeout value should be >=60.");
		}
			
		@Test(priority=4)
		public void poolCreate() throws Exception
		{
			ModeletPooling  mp =new ModeletPooling();
			mp.poolCreate1(driver);
			Assert.assertEquals("Pool with name Pool332 successfully created.","Pool with name Pool332 successfully created.");
			System.out.println("Pool with name Pool332 successfully created.");
		}
		@Test(priority=5)
		public void addPool1WithSamePoolName1() throws Exception
		{
			Thread.sleep(5000);
			ModeletPooling  mp =new ModeletPooling();
			mp.addPool1WithSamePoolName(driver);
			Assert.assertEquals("Pool name R-3.3.2-Linux-Default already exists.Please key in a new pool name.","Pool name R-3.3.2-Linux-Default already exists.Please key in a new pool name.");
			System.out.println("Pool name R-3.3.2-Linux-Default already exists.Please key in a new pool name.");
		}
		
		@Test(priority=6)
		public void createPoolWithUniqueNameSamePoolCriteria1() throws Exception
		{
			ModeletPooling  mp =new ModeletPooling();
			mp.createPoolWithUniqueNameSamePoolCriteria(driver);
			Assert.assertEquals("Pool criteria cannot be duplicate (duplicates with pool R-3.3.2-Linux-Default)","Pool criteria cannot be duplicate (duplicates with pool R-3.3.2-Linux-Default)");
			System.out.println("Pool criteria cannot be duplicate (duplicates with pool R-3.3.2-Linux-Default)");
		}
		
		@Test(priority=7)
		public void dragModelets332() throws Exception
		{
			ModeletPooling  mp =new ModeletPooling();
			mp.dragModelet332(driver);
						
		}
		@Test(priority=8)
		public void dragModeleteWithDifferentEnvironment1() throws Exception {
			ModeletPooling  mp =new ModeletPooling();
			mp.dragModeleteWithDifferentEnvironment1(driver);
			Assert.assertEquals("R-3.6.0 Linux Modelets can be allocated to R-3.6.0 Linux pools only.","R-3.6.0 Linux Modelets can be allocated to R-3.6.0 Linux pools only.");
			System.out.println("R-3.6.0 Linux Modelets can be allocated to R-3.6.0 Linux pools only.");
			
		}
		@Test(priority=9)
		public void deletePoolHavingAtLeastaModelet1() throws Exception
		{
			ModeletPooling  mp =new ModeletPooling();
			mp.deletePoolHavingAtLeastaModelet(driver);
			Assert.assertEquals("Pool with modelets (non-empty pools) cannot be deleted","Pool with modelets (non-empty pools) cannot be deleted");
			System.out.println("Pool with modelets (non-empty pools) cannot be deleted");
		}
		@Test(priority=10)
		public void deletePoolHavingNoModelet() throws Exception
		{
			ModeletPooling  mp =new ModeletPooling();
			mp.dragBackModelet(driver);
			mp.deletePoolHavingAtLeastaModelet(driver);
		}
		@Test(priority=11)
		public void restartModeletfromPool() throws Exception
		{
			ModeletPooling  mp =new ModeletPooling();
			mp.restartModeletfromPool1(driver);
		}
			
//		@AfterTest
//		public void after() throws InterruptedException
//		{			 Thread.sleep(10000);
//				 driver.quit();
//			 System.out.println("Closed Successfully");
//		}

		
}
