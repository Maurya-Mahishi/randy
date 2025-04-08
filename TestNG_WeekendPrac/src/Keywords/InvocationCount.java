package Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test(invocationCount = 2)
	public void signup()
		{
			Reporter.log("Hello",true);
			}
	@Test(invocationCount = 1)
	public void login()
	{
		Reporter.log("Hey",true);
	}
	@Test(invocationCount = 0)
	public void Homepage()
	{
		Reporter.log("zing",true);
	}
	@Test
	public void page()
	{
		Reporter.log("zoo",true);
	}

}
