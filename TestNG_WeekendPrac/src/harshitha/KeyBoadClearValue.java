package harshitha;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoadClearValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Seleniy.html");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("a2"));
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		ele.sendKeys(Keys.DELETE);
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
