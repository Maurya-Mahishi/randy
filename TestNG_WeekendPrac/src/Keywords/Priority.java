package Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority 
{
	@Test(priority = 0)
	public void signup()
		{
			Reporter.log("Hello",true);
			}
	@Test(priority = 2)
	public void login()
	{
		Reporter.log("Hey",true);
	}
	@Test(priority = 1)
	public void Homepage()
	{
		Reporter.log("zing",true);
	}

}
