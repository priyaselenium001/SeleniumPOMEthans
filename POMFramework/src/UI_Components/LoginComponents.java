package UI_Components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds_Queries.ServicesCall;

public class LoginComponents {
	
	@FindBy(name="userName")
	static WebElement usernameEditbox;
	
	@FindBy(name="password")
	static WebElement passwordEditbox;
	
	@FindBy(xpath="//*[@name='login']")
	static WebElement loginButton;
	
	@FindBy(xpath="//*[@src='/images/spacer.gif'][1]//following::font")
	static WebElement loginVerificationText;
	
	public void login()
	{
		usernameEditbox.sendKeys("batman");
		passwordEditbox.sendKeys("batman");
		loginButton.click();

	}
	public boolean verifyLoginFunc()
	{
		login();
		String actualText = loginVerificationText.getText();
		String expectedText = ServicesCall.getLoginVerification();
		if(actualText.equals(expectedText))
			return true;
		else
			return false;
	
		
		
	}

}
