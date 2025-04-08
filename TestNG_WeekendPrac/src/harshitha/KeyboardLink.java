package harshitha;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Seleniy.html");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("a4"));
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}

}
