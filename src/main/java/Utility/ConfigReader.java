package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class ConfigReader
{  Properties pro;
public  WebDriver driver ;
	public ConfigReader() throws Exception 
	{
		
		try {
			File src=new File("./Configuration/Config.property");//copied property
			FileInputStream fis = new FileInputStream(src);
		    pro = new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("Exception is =="+e.getMessage());
		} 
		
	}
 public String getChromepath() 
 {
	 String path=pro.getProperty("ChromeDriver");
	 return path;
 }
 public String getApplicationURL() 
 {
	return pro.getProperty("URL");

 }
 public String getTenant()
 {
	 return pro.getProperty("switch_tenant");
	 
 }


}
