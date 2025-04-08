package harshitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragDefault {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		Thread.sleep(1000);
		//act.moveToElement(ele).moveByOffset(100, 200).build();
		act.dragAndDropBy(ele, 100, 200).perform();
		//act.moveToElement(ele, 200, 300).build();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
