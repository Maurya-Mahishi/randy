package harshitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement hold = driver.findElement(By.id("circle"));
		
		act.clickAndHold(hold).perform();
		Thread.sleep(2000);
		driver.quit();
	}


}
