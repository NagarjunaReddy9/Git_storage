package TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import UItility.Generic_Methods;


public class Login_test extends BaseClass{
	
	@Test
	public void validLogin() throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.login(username,password);
		screenShotmethod("nag");
		startReport(username, password);	}
}