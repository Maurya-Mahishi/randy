package harshitha;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBOptionCount {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele =driver.findElement(By.xpath("//select[@id='year']"));
		WebElement ele1 =driver.findElement(By.xpath("//select[@id='month']"));
		WebElement ele2 =driver.findElement(By.xpath("//select[@id='day']"));
        
		Select s = new Select(ele);
		Select s1 = new Select(ele1);
		Select s2 = new Select(ele2);

		
		
		/*
		 * List<WebElement> op=s.getOptions(); System.out.println(op.size());
		 * for(WebElement c:op) { System.out.println(c.getText()); }
		 */
		
		 List<WebElement> op1=s1.getOptions();
		 System.out.println(op1.size());
						 
	     TreeSet<String> opt=  new TreeSet<String>();

		  for(WebElement d:op1) { 
		 opt.add(d.getText());
		 
		 }
		  for(String z: opt) {
		  System.out.println(z);
		  }
	     
	    
		// Collections.sort( (List<WebE>) op1);
			/*
			 * for(WebElement d:op1) { 
			 * System.out.println(d.getText());
			 * 
			 * }
			 */
		 List<WebElement> op2=s2.getOptions();
		 System.out.println(op2.size());
		 
		Thread.sleep(2000);
		driver.quit();
	}

}
