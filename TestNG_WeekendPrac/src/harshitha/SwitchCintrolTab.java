package harshitha;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchCintrolTab {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.selenium.dev/");
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.xpath("//a[.='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//a[.='Documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//a[.='Projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//a[.='Support']"));
		WebElement ele5 = driver.findElement(By.xpath("//a[.='Blog']"));
		ArrayList<WebElement> a1 = new ArrayList<WebElement>();
		a1.add(ele1);
		a1.add(ele2);
		a1.add(ele3);
		a1.add(ele4);
		a1.add(ele5);
		
		
		Actions act = new Actions (driver);
		
		Robot r = new Robot();
		
		for (WebElement a3:a1)
		{
			act.contextClick(a3).perform();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}
		Set<String> a2 = driver.getWindowHandles();
		ArrayList<String> a4 = new ArrayList<String>(a2);
		String w = a4.get(2);
		driver.switchTo().window(w);
		Thread.sleep(8000);
		driver.quit();
		
	}
}


