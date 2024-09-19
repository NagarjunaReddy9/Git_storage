package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageObjects.LoginPageElements;
import utilities.ReuasbleMethods;


public class LoginPageImplements extends BaseClass {

	@Test
	public void fillForm() throws InterruptedException, IOException {
		WebDriverWait web = new WebDriverWait(driver, Duration.ofSeconds(10));
		LoginPageElements se = new LoginPageElements(driver);
		ReuasbleMethods re = new ReuasbleMethods(driver);
		re.implicitWait();
		se.setNameField("ojas123");
		se.Radiobutton();
		Thread.sleep(2000);
		se.contry();
		re.scrollIntoElement("India");
		test.log(LogStatus.PASS, "India selected");
		se.letsgo();
		re.Screenshot();
	
	}

}