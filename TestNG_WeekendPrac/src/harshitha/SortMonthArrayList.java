package harshitha;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortMonthArrayList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("month"));
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();
		ArrayList<String> a = new ArrayList<String>();
		for(WebElement d : opt) {
			a.add(d.getText());
		}
		Collections.sort(a);
		//System.out.println(a);
		for(String a1:a) {
			System.out.println(a1);
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
