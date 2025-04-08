package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Script1 
{
	WebDriver driver;
	@BeforeClass
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		
	}
	@BeforeMethod
public void LaunchApplication()
	
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
		}
	@AfterMethod
	public void CloseApplication() throws InterruptedException
	{
		
		driver.quit();
	}
	@AfterClass
	public void CloseBrowser()
	{
		System.out.println("logout");

}
}

