package harshitha;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynEW {
	
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		    driver.get("https://www.facebook.com/");
		   // String title = driver.getTitle();
		  
		   // System.out.println(title);
		  
		    WebElement ele = driver.findElement(By.id("email" ));
		   
		    WebDriverWait wait=new WebDriverWait(driver,10) ;
		    
		    //wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		    //wait.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
		    wait.until(ExpectedConditions.visibilityOf(ele));
		    
		    ele. sendKeys ("qwerty");
		    
		    driver.quit();
			
			
			
		}

	

}
