package practice;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DesOptionsDD {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	   WebElement ele= driver.findElement(By.id("month"));
	   Select s = new Select(ele);
	   List<WebElement> opt = s.getOptions();
	   TreeSet<String> t = new TreeSet<String>(Collections.reverseOrder());
	   for(WebElement we : opt) {
		   t.add(we.getText());
	   }
	   for(String t1:t) {
		   System.out.println(t1);
	   }
	   Thread.sleep(3000);
	   driver.quit();
	}

}
