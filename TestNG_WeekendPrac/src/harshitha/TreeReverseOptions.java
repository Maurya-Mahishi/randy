package harshitha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeReverseOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("month"));
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();
		
		TreeSet<String> a = new TreeSet<String>();
		for(WebElement d : opt) {
			a.add(d.getText());
		}
		
		//Collections.sort(a,Collections.reverseOrder());
		//System.out.println(a);
		//for(int i = a.size() ; i>=0 ; i==)
		TreeSet<String>
        rev = (TreeSet<String>) a.descendingSet();
		for(String a1:rev) {
			System.out.println(a1);
		}
		Thread.sleep(2000);
		driver.quit();
	}


}
