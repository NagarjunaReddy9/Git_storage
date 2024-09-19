package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utilities.Readconfig;

public class BaseClass {
	public WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	Readconfig rc = new Readconfig();
	public String urlhome = rc.getUrl();
	public String username = rc.getUsername();
	public String password = rc.getPassword();

	@BeforeSuite
	public void launch() throws InterruptedException {
		extent=new ExtentReports("./reports/adactin.html");
		test=extent.startTest("login");
		driver = new ChromeDriver();
		driver.get(urlhome);
		Thread.sleep(2000);
		driver.manage().window().maximize();

	}

	@AfterSuite
	public void closeApp() {
		driver.close();
	extent.endTest(test);
	extent.flush();
		

	}

}