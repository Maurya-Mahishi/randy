package harshitha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgFinds {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		List<WebElement> links =driver.findElements(By.xpath("//img"));

		for (WebElement we :links) {
			System.out.println(we.getAttribute("src"));
		}
		Thread.sleep(2000);
		driver.quit();
	}
	

}
