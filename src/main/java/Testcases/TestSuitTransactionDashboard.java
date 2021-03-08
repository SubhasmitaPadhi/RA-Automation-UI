/**
 * 
 */
package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.ConfigReader;

/**
 * @author padhisub
 *
 */
public class TestSuitTransactionDashboard {
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
			login1 lg=new login1();
			lg.loginToRA(driver);
		    System.out.println("Login page working");
		    
	}
	@Test(priority=3)
	
	public static void switchTenant1() throws Exception {
		
	    Switch_Tenant st=new Switch_Tenant();
	    st.switchToOtherTenant(driver);
	}

	@Test(priority=4)
	
	public static void modelnameSearchTransactionDashboard() throws Exception {
		TransactionDashboard dashboard=new TransactionDashboard();
		dashboard.switchToTransactionDashboard(driver);
		dashboard.modelnameSearchTransactionDashboard(driver);
	}
@Test(priority=5)
	public static void transactionTypeSearchTransactionDashboard1() throws Exception {
		TransactionDashboard dashboard=new TransactionDashboard();
		dashboard.switchToTransactionDashboard(driver);
		dashboard.transactionTypeSearchTransactionDashboard(driver);
	}
@Test(priority=6)
public static void transactionStatusSearchTransactionDashboard1() throws Exception{
	TransactionDashboard dashboard=new TransactionDashboard();
	dashboard.switchToTransactionDashboard(driver);
	dashboard.transactionStatusSearchTransactionDashboard(driver);}
@Test(priority=7)
public static void tenantTransactionIDSearchTransactionDashboard1() throws Exception{
	TransactionDashboard dashboard=new TransactionDashboard();
	dashboard.switchToTransactionDashboard(driver);
	dashboard.tenantTransactionIDSearchTransactionDashboard(driver);
}
@Test(priority=8)
public static void RATransactionIdSearchTransactionDashboard1() throws Exception{
	
	Thread.sleep(3000);
	TransactionDashboard dashboard=new TransactionDashboard();
	dashboard.switchToTransactionDashboard(driver);
	dashboard.RATransactionIdSearchTransactionDashboard(driver);
}
@Test(priority=9)
public static void downloadFilesFromActionColumn1() throws Exception{
	TransactionDashboard dashboard=new TransactionDashboard();
	dashboard.switchToTransactionDashboard(driver);
	dashboard.modelnameSearchTransactionDashboard(driver);
	dashboard.downloadFilesFromActionColumn(driver);

}                                             

@Test(priority=10)
public static void downloadFilesFromButton1() throws Exception{
	Thread.sleep(10000);
	TransactionDashboard dashboard=new TransactionDashboard();
	dashboard.switchToTransactionDashboard(driver);
	dashboard.modelnameSearchTransactionDashboard(driver);
	dashboard.downloadFilesFromButton(driver);

}
	@AfterTest
	public void after() throws InterruptedException
	{			 Thread.sleep(10000);
			 driver.quit();
		 System.out.println("Closed Successfully");
	}

}