package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DesOptionArray {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	   WebElement ele= driver.findElement(By.id("month"));
	   Select s = new Select(ele);
	   ArrayList<String> a = new ArrayList<String>();
	   List<WebElement> option = s.getOptions();
	   for(WebElement we:option) {
		   a.add(we.getText());
	   }
	   Collections.sort(a,Collections.reverseOrder());
	   for(String a1:a) {
		   System.out.println(a1);
	   }
	   Thread.sleep(2000);
	   driver.quit();
	}

}
