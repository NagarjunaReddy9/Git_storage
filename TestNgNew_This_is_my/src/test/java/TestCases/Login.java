package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.ElementsStrore;
import Utilities.Reusable;

public class Login extends BaseClass{
	@Test
	public void test() throws IOException {
		ElementsStrore lg=new ElementsStrore(driver);
		
		lg.emailName(username);
		lg.emaipwd(password);
		lg.login();
		
		  Reusable re=new Reusable(driver); 
		re.screenShot1("khadar");
		
	}

}
