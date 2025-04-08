package harshitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartMobileTab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		 driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Blue, 128 GB)']")).click();
			
		 
			
		
		
		Thread.sleep(5000);
		driver.quit();
	}
	

}
