package harshitha;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyOpenLinkTab {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		/*
		 * Actions act = new Actions(driver); WebElement rClick =
		 * driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		 * 
		 * act.contextClick(rClick).perform(); Thread.sleep(2000);
		 */
		Robot r = new Robot();
		/*
		 * r.keyPress(KeyEvent.VK_T); r.keyRelease(KeyEvent.VK_T);
		 */
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_M);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_UP);
		
		
		/* rClick.sendKeys(Keys.chord("t")); */
		
		Thread.sleep(5000);
		driver.quit();
	}

}
