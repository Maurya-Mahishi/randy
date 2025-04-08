package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementPresent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	   WebElement ele= driver.findElement(By.id("month"));
	   if(ele.isDisplayed()) {
		   System.out.println("Yes ");
	   }
	   else {
		   System.out.println("No");
	   }
	   if(ele.isEnabled()) {
		   System.out.println("Yes Enabled");
	   }
	   else {
		   System.out.println("No Not Enabled");
	   }
	   if(ele.isSelected()) {
		   System.out.println("Yes Selected");
	   }
	   else {
		   System.out.println("No Not Selected");
	   }
	   Thread.sleep(2000);
	   driver.quit();
	}

}
