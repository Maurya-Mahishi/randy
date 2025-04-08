package Groups;

import org.testng.annotations.Test;

public class Exclusion 
{
	@Test(groups= {"smokeTC","FunctionalTC"})
	public void SmokeHomePage()
	{
		System.out.println("smokeTCHomePage");
	}
	@Test(groups="FunctionalTC")
	public void FunctionalTcHomePage()
	{
		System.out.println("FunctionalTCHomePage");
	}
	@Test
	public void IntegrationTcHomePage()
	{
		System.out.println("IntegrationTcHomePage");
	}
	@Test(groups= {"E2ETC","FunctionalTC"})
	public void E2ETcHomePage()
	{
		System.out.println("E2ETcHomePage");
	}
}
