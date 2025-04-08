package Facebook;

import org.testng.annotations.Test;

public class TC01 extends GenericScript01
{
	@Test
	public void FetchTitle()
	{
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
	}

}
