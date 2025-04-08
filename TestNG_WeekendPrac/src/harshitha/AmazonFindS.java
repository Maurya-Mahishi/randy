package harshitha;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFindS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(8000);
		List<WebElement> links =driver.findElements(By.xpath("//a"));

		for (WebElement we :links) {
			System.out.println(we.getAttribute("href"));
		}
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	

}
