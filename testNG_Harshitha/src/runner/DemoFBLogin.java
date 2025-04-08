package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.DemoBefore;

public class DemoFBLogin extends DemoBefore {
	
	
	@Test
	public  void login() {
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Harshitha");
		driver.findElement(By.id("pass")).sendKeys("Harshitha");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public  void loginagain() {
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Harshitha");
		driver.findElement(By.id("pass")).sendKeys("Harshitha");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
