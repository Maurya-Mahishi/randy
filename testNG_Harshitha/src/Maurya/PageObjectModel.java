package Maurya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageObjectModel {
	public WebDriver driver;
    @BeforeClass
    public void launchbrowser()
    {
    	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
        driver = new ChromeDriver();
    	
    }
	@BeforeMethod
	public void launchApp()
	{
		driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void runner()
	{
		Runner p = new Runner(driver);
		p.enterusn();
		p.enterpswd();
		p.clickbtn();
		driver.navigate().back();
		driver.navigate().refresh();
		
}
	
	@AfterMethod
	public void closeApp()
	{
		driver.navigate().to("https://www.facebook.com/");
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
}
}

