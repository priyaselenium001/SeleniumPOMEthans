package test;

import org.testng.Assert;
import org.testng.annotations.Test;

//import UI_Components.LoginComponents;

public class LoginTest extends AbstractTest {

	@Test(description ="Verify Login")
	public void verifyLogin()
	{
		Assert.assertTrue(loginComponent.verifyLoginFunc(), "Verify Login");
	}

}
