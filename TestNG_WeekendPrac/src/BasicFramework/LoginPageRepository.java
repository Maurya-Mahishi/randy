package BasicFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageRepository 
{
	//Declaration
	@FindBy(id="Email")
	private WebElement usntf;
	@FindBy(id="Pass");
	private WebElement pswtf;
	@FindBy(name="login");
	private WebElement loginbtn;
	

}
