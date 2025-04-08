package harshitha;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		Set<String> allWh = driver.getWindowHandles();
		System.out.println(allWh.size());
		for(String wh:allWh )
		{
			System.out.println(wh);
		}
		Thread.sleep(2000);
		driver.quit();

}
}
