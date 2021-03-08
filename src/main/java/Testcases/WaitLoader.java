/**
 * 
 */
package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author padhisub
 *
 */
public class WaitLoader {
	public void waitForLoading(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		if(driver.findElements(By.xpath("//div[@id='loaderDiv']")).size()>0)
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loaderDiv']")));
	}

}
