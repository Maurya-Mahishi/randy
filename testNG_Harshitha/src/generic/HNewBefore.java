package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class HNewBefore {
	public  WebDriver driver ;
	@BeforeClass
	public void open() {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://106.51.87.42:9007/");
		
	}
	
	@BeforeMethod 
	public void doclogin() {
		driver.findElement(By.id("email")).sendKeys("gautham@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@AfterMethod
	public void doclogout() {
		driver.findElement(By.xpath("//a[@href='http://106.51.87.42:9007/index.php?login/logout']")).click();
	}
	
	@AfterClass
	public void close() {
		driver.close();
	  
	}
	

}
