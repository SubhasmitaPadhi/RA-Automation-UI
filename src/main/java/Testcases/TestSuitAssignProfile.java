package Testcases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.ConfigReader;

public class TestSuitAssignProfile {
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
		public static void loginToRA() throws InterruptedException
	{
//		 //Login lg=new Login(driver);
//		//lg.Logintora("SATISH","Welcome1");
			login1 lg=new login1();
			lg.loginToRA(driver);
		    System.out.println("Login page working");
	}
	@Test(priority=3)
	public static void clickOnModeletandAssignProfileTab() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ModeletProfiling mp=new ModeletProfiling();
		mp.modeletProfile1(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);;
		AssignProfile ap=new AssignProfile();
		ap.assignProfile1(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);}

	@Test(priority=4)
	public static void editAssignProfilePossitiveScenario() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AssignProfile ap=new AssignProfile();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);;
		ap.editPositive(driver);
		Assert.assertEquals("System modelet linked successfully with profiler.","System modelet linked successfully with profiler.");
		System.out.println("System modelet linked successfully with profiler.");
	}
	@Test(priority=5)
	public static void editAssignProfileNegativeScenario() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AssignProfile ap=new AssignProfile();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ap.editNegative(driver);
		Assert.assertEquals("Profile cannot be updated as profile is already assigned to one or more modelets of different Execution Environment.","Profile cannot be updated as profile is already assigned to one or more modelets of different Execution Environment.");
		System.out.println("Profile cannot be updated as profile is already assigned to one or more modelets of different Execution Environment.");
		}
	@Test(priority=6)
	public static void restartModeletWithYesButton() throws InterruptedException{
		AssignProfile ap=new AssignProfile();
		ap.restartYesButtonClick(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=7)
	public static void downloadFile() throws InterruptedException, AWTException {
		AssignProfile ap=new AssignProfile();
    	ap.downloadLogFile(driver);
    	
	}
	@Test(priority=8)
	public static void profileSerching() throws InterruptedException{
		AssignProfile ap=new AssignProfile();
		ap.searchingProfile(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	 public void after() throws InterruptedException
	{			 Thread.sleep(5000);
			 driver.quit();
		 System.out.println("Closed Successfully");
	}

	}
	
	