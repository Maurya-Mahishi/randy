package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.jmx.ManagedAttribute;
import org.testng.annotations.Test;

public class Script2 extends Script1
{
	@Test
	public void Fetch()
	{
		WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement ele2 = driver.findElement(By.name("login"));
		ele.sendKeys("maurya.tth@gmail.com");
		ele1.sendKeys("maurya123");
		ele2.click();
		driver.navigate().refresh();
		
		
		
		
	}

}
