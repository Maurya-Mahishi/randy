package harshitha;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTitle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		//String a = driver.getTitle();
		Set<String> allWh = driver.getWindowHandles();
		String pa = driver.getWindowHandle();
		//Object b = driver.get("http://qavalidation.com/about-me/");
		
		System.out.println(allWh.size());
		for(String wh:allWh )
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			
			if(wh.equals(pa)) {
				
			}
			else
			{
				driver.close();
			}
			//driver.switchTo().window(pa).close();
			//driver.close();
			
			//driver.switchTo().window(wh);
			
			
		}
		//Thread.sleep(2000);
		//driver.quit();

}

}
