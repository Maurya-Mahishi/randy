package Maurya;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assertion {

	  @Test
	  public void run()
	  {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String ttl = driver.getTitle();
        System.out.println(ttl);
        assertEquals(ttl, "Facebook – log in or sign up");
        System.out.println("India");
        

	}

}
