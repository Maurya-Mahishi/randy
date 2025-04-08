package harshitha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/DELL/Desktop/Military%20Dropdown%20.html");
			Thread.sleep(2000);
			WebElement ele =driver.findElement(By.id("maruthi military"));

			Select s = new Select(ele);
			/*
			 * s.selectByIndex(1); s.selectByValue("l"); s.selectByVisibleText("fish fry");
			 * s.deselectAll();
			 */
			if(s.isMultiple()) {
				System.out.println("Yes it is a multi select dropdown");
			}
			else {
				System.out.println("No it is not a multi select dropdwon");
			}
			
			Thread.sleep(2000);
			driver.quit();
		}
		
	}


