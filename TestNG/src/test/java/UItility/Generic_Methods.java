package UItility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Generic_Methods {

	public static WebDriver driver;
	public static ExtentTest test;
	public static ExtentReports report;
	
	public void startReport(String filename, String testname) {
		report =new ExtentReports("./Reports/"+filename+".html");
		test= report.startTest(testname);
	}
	
	public void endReport() {
		report.endTest(test);
		report.flush();
	}

	public void openBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		test.log(LogStatus.PASS, "Browser opened scucessfully");
	}

	public void openApplication(String url) {
		driver.get(url);
	}

	public void textField(WebElement element, String Text) {
		element.sendKeys(Text);
	}

	public void button(WebElement element) {
		element.click();
	}
	
	public String screenShotmethod(String filename) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshots/"+filename+".png");
		Files.copy(src, target);
		String path=target.getAbsolutePath();
		return path;
		
	}
}

