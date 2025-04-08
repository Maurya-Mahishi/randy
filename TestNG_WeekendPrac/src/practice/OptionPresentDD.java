package practice;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionPresentDD {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	   WebElement ele= driver.findElement(By.id("month"));
	   Select s = new Select(ele);
	   List<WebElement> opt = s.getOptions();
	   ArrayList<String> a = new ArrayList<String>();
	   for(WebElement we: opt) {
		   a.add(we.getText());
	   }
	   if(a.contains("Jan")) {
		   System.out.println("Yes");
	   }
	   else {
		   System.out.println("No");
	   }
	   for(String a1:a) {
		   System.out.println(a1);
	   }
	}
	

}
