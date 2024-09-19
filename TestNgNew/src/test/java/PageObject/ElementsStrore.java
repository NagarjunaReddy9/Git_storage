package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsStrore {
 WebDriver driver;
 public ElementsStrore(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
	 
 }
 @FindBy(xpath = "//*[@placeholder=\"Email Address\"]")
 WebElement user;
 
 @FindBy(xpath = "//*[@placeholder=\"Enter Password\"]")
 WebElement pass;
  @FindBy(xpath = "//*[@class=\"sign-in-button\"]")
  WebElement log;
 
 public void emailName(String name) {
	 user.sendKeys(name);
 }

 public void emaipwd(String pwd) {
	pass.sendKeys(pwd);
 }
 
 public void login() {
	log.click();
 }
}
