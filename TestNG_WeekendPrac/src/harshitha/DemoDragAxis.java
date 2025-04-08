package harshitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragAxis {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/axisRestricted?sublist=1");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Only Y']"));
		//act.moveToElement(ele).moveByOffset(100, 200).perform();
		act.dragAndDropBy(ele, 200, 100).perform();
		WebElement ele1 = driver.findElement(By.xpath("//div[text()='Only X']"));
		act.dragAndDropBy(ele1, 100, 100).perform();
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
