package harshitha;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeySwapValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Seleniy.html");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("a1"));
		ele.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(1000);
		/*
		 * ele.sendKeys(Keys.CONTROL+"x"); Thread.sleep(1000);
		 */
		WebElement ele1 = driver.findElement(By.id("a3"));
		ele1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		WebElement ele2 = driver.findElement(By.id("a2"));
		
		ele2.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(1000);
		/*
		 * ele2.sendKeys(Keys.CONTROL+"x"); Thread.sleep(1000);
		 */
		ele.sendKeys(Keys.CONTROL+"v");
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
