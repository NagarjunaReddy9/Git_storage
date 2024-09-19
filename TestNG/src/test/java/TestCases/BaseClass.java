package TestCases;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import UItility.Generic_Methods;
import UItility.ReadData;

public class BaseClass extends Generic_Methods {
	
	ReadData rd = new ReadData();
	public String url=rd.getValue("Link");
	public String username=rd.getValue("username");
	public String password=rd.getValue("password");
	@BeforeSuite
	public void launchApp() {
		startReport("login", "Valid login");
		openBrowser();
		openApplication(url);
		test.log(LogStatus.PASS, "Application launched scucessfully");
		
	}
	
	@AfterSuite
	public void closeApp() {
		driver.close();
		endReport();
	}

}
	

