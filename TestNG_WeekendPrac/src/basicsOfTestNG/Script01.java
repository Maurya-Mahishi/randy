package basicsOfTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script01 
{
	@Test
	public void test1()
	{
		Reporter.log("Hello",true);
		}

}
