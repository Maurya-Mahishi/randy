package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class GenericScript01
{
	WebDriver driver;
	@BeforeMethod
	public void LaunchApplication() throws InterruptedException
	
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);		
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
	}


}