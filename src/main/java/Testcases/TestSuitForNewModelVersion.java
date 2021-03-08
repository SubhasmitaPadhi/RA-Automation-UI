/**
 * 
 */
package Testcases;

/**
 * @author padhisub
 *
 */
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

public class TestSuitForNewModelVersion {
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
	
	public static void Switch_tenant1() throws Exception {
		
	    Switch_Tenant st=new Switch_Tenant();
	    st.switchToOtherTenant(driver);
	}
	//@Test(priority=4)
	
	public static void clickOnAddModel() throws Exception {
		
		NewModelVersionCreation mv=new NewModelVersionCreation();
	    mv.AddModel(driver);
	}
   //@Test(priority=5)
	
	public static void addNewVersionModelVerificationTillArtifact() throws Exception {
		
	   NewModelVersionCreation mv=new NewModelVersionCreation();
	    mv.addNewVersionModelVerificationTillArtifact1(driver);
	}
    //@Test(priority=6)
	
  	public static void afterArtifacts() throws Exception {
  		
  	   NewModelVersionCreation mv=new NewModelVersionCreation();
  	    mv.afterArtifacts1(driver);
  	}
   @Test(priority=7)
	
 	public static void managePageVerification() throws Exception {
 		
 	   NewModelVersionCreation mv=new NewModelVersionCreation();
 	    mv.managePageVerification1(driver);
 	}
 //  @Test(priority=8)
	
	public static void emailApprovalOnModelPublishing() throws Exception {
		
	   NewModelVersionCreation mv=new NewModelVersionCreation();
	    mv.emailApproval1(driver);
	}
  // @Test(priority=9)
	public static void testBed() throws Exception {
		
	   NewModelVersionCreation mv=new NewModelVersionCreation();
	    mv.testBed1(driver);
	}
   @Test(priority=10)
	public static void viewPage1() throws Exception {
	   NewModelVersionCreation mv=new NewModelVersionCreation();
	    mv.viewPage(driver);
	   
   }
}
