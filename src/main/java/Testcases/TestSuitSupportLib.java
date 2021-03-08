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

import Utility.ConfigReader;

import java. util. Collection;
public class TestSuitSupportLib {
	public class TestSuitTransactionDashboard {
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
		}
			
		@Test(priority=2)
			public void loginToRA() throws Exception
		{
				login1 lg=new login1();
				lg.loginToRA(driver);
			    System.out.println("Login page working");
			    
		}
		@Test(priority=3)
		public void switchToSupportLibTab() throws Exception
	{
			SupportLibrary lib=new SupportLibrary();
			lib.switchToSupportLibrary(driver);
		   
	}
		@Test(priority=4)
		public void addLibraryR360Nobutton1() throws Exception{
			SupportLibrary lib=new SupportLibrary();
			lib.addLibraryR360Nobutton(driver);
		}
		@Test(priority=5)
		public void addLibraryR360YesbuttonInvalidFileUpload1() throws Exception{
			SupportLibrary lib=new SupportLibrary();
			lib.addLibraryR360YesbuttonInvalidFileUpload(driver);
			Assert.assertEquals("Invalid File Type. Only tar.gz & zip Supported.","Invalid File Type. Only tar.gz & zip Supported.");
			System.out.println("Invalid File Type. Only tar.gz & zip Supported.");
		}
		@Test(priority=6)
		public void deleteLibrary1() throws Exception{
			SupportLibrary lib=new SupportLibrary();
			lib.deleteLibrary(driver);
		
		}
		@Test(priority=7)
		public void addLibraryR332Nobutton1() throws Exception{
			SupportLibrary lib=new SupportLibrary();
			lib.addLibraryR332Nobutton(driver);
		
		}
		@Test(priority=8)
		public void addLibraryR332YesbuttonInvalidFileUpload1() throws Exception{
			SupportLibrary lib=new SupportLibrary();
			lib.addLibraryR332YesbuttonInvalidFileUpload(driver);
			Assert.assertEquals("Invalid File Type. Only tar.gz & zip Supported.","Invalid File Type. Only tar.gz & zip Supported.");
	    	System.out.println("Invalid File Type. Only tar.gz & zip Supported.");
		
		}
		@Test(priority=9)
		public void addLibraryR332ValidFileUpload1() throws Exception{
			SupportLibrary lib=new SupportLibrary();
			lib.addLibraryR332ValidFileUpload(driver);

		}
		@Test(priority=10)
		public void validateInmanagePageAndDownnloadLibrary() throws Exception{
			SupportLibrary lib=new SupportLibrary();
			lib.validateInmanagePage332(driver);
			Assert.assertEquals("AFM_1.2.6.tar.gz","AFM_1.2.6.tar.gz");
			System.out.println("AFM_1.2.6.tar.gz");
		}
		@AfterTest
		public void after() throws InterruptedException
		{			 Thread.sleep(10000);
				 driver.quit();
			 System.out.println("Closed Successfully");
		}

}
}