package harshitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMouseHovering1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/tab?sublist=3");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//li[@class='kids p-4 relative']"));
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
