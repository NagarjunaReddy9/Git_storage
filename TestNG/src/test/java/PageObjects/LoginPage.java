package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import UItility.Generic_Methods;


public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='username']")
	public WebElement usernameField;
	@FindBy(css = "input[id='password']")
	public WebElement passwordField;
	@FindBy(css = "input[class='login_button']")
	public WebElement loginbutton;
	@FindBy(xpath = "//a[text()='Logout']")
	public WebElement Logout;

	public void login(String username, String password) throws Exception {
		Generic_Methods gen = new Generic_Methods();

		gen.textField(usernameField, username);
		Generic_Methods.test.log(LogStatus.PASS, "username entered scucessfully");
		gen.textField(passwordField, password);
		Generic_Methods.test.log(LogStatus.PASS, "password entered scucessfully");
		gen.button(loginbutton);
		Logout.isDisplayed();
		String path=gen.screenShotmethod("validlogin");
		Generic_Methods.test.log(LogStatus.PASS,Generic_Methods.test.addScreenCapture(path) +"Login scucessfully");
	}
}