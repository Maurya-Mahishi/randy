package harshitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAppDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='select3']"));
		Select s = new Select(ele);
		s.selectByVisibleText("India");
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='select5']"));
		Select s1 = new Select(ele1);
		s1.selectByVisibleText("Karnataka");
		Thread.sleep(2000);
		driver.quit();
		/*
		 * WebElement ele1 = driver.findElement(By.xpath("//select[@id='select5']"));
		 * Select s1 = new Select(ele1); s.selectByVisibleText("Karnataka");
		 */
		
	}

}
