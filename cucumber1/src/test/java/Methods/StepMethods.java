package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepMethods {
	WebDriver driver;

	
	@Given("user is login page")
    public void user_is_login_page() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");

	}

    @When("user enter username and password")
    public void user_enter_username_and_password() {
    	WebElement username = driver.findElement(By.xpath("//*[@name=\"username\"]"));
		username.sendKeys("chandra12345");
		WebElement password = driver.findElement(By.xpath("//*[@name=\"password\"]"));
		password.sendKeys("Chandu");

       
    }

    @When("click on login page")
   
    	public void click_on_login() {
    		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
    }

    @Then("user navigated to the homepage")
    public void user_navigated_to_the_homepage() {
    	
    		System.out.println("login success full");
    }

}
