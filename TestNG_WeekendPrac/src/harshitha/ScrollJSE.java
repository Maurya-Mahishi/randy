package harshitha;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollJSE {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(8000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<3;i++) {
			
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		}
		for(int i=0;i<3;i++) {
			
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);
			}
		Thread.sleep(2000);
		driver.quit();
	}

}
