package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasePage 
{
	public WebDriver driver;
	@Test
	@Parameters("BrowserName")
	public void BrowserSetup(String BrowserName) 
	{
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if(BrowserName.equals("fire"))
		{
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			driver = new FirefoxDriver();
			}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
		driver.get("https://www.facebook.com");
	}

}


}
