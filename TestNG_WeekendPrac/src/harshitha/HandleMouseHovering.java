package harshitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseHovering {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
