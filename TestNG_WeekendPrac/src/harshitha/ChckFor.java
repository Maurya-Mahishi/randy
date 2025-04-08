package harshitha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChckFor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/chckbox.html");
		Thread.sleep(5000);
		List<WebElement> links =driver.findElements(By.xpath("//input"));

		for (WebElement we :links) {
			Thread.sleep(1000);
			we.click();
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
