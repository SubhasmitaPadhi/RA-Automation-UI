package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	 WebDriver driver;
	 By userid = By.xpath("//input[@name='j_username']");
	 By password = By.xpath("//*[@id=\"j_password\"]");
	 By login_button = By.xpath("//*[@id=\"loginForm\"]/p[3]/a/input");
	
	
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void Logintora(String uid, String pwd) {
		// TODO Auto-generated method stub
		 driver.findElement(userid).sendKeys(uid);
		 driver.findElement(password).sendKeys(pwd);
		 driver.findElement(login_button).click();
		
	}
}
