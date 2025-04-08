package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC02 extends GenericScript01
{
	@Test
	public void pass()
	{
		 WebElement url = driver.findElement(By.id("pass"));
				System.out.println(url);
	}
	@Test
	public void CheckUsn()
	{
		boolean res = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(res);
		
		
	}

}
