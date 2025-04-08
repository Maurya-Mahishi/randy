package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomShopperstack {
	//Declaration
	@FindBy(id="email")
	private WebElement usn;
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy (name ="login")
	private WebElement login;
		//Initialization
	PomShopperstack(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void enterusn() {
		usn.sendKeys(" rockyash@gmail.com");
	}
	public void enterpswd() {
		pass.sendKeys("Rockyyash@123");
	}
	public void clickbtn() {
		login.click();
	}
	}
