package BasicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScripts
{
	WebDriver driver;
	@BeforeMethod
	public void LaunchApplication() throws InterruptedException
	
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);		
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
		}
	@AfterMethod
	public void CloseApplication() throws InterruptedException
	{
		
		driver.quit();
	}

}
