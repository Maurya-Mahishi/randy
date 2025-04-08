package Maurya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Runner {
	//Declaration
	@FindBy(id="email")
	private WebElement usn;
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy (name ="login")
	private WebElement login;
		//Initialization
	Runner(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public void enterusn() {
		usn.sendKeys("rajakumara");
	}
	public void enterpswd() {
		pass.sendKeys("hunnime");
	}
	public void clickbtn() {
		login.click();
	}
	}

