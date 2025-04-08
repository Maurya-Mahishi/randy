package harshitha;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureSSBestSeller {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(8000);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		
		//TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dst =new File("C:\\Users\\DELL\\Pictures\\TestScreenShot\\elementBestSeller.jpeg");
		FileHandler.copy(src, dst);
		Thread.sleep(2000);
		driver.quit();
	}
	
	


}
