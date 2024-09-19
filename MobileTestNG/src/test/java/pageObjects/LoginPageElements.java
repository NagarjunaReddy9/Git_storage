package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.ReuasbleMethods;

public class LoginPageElements  {
	AndroidDriver driver;
	public LoginPageElements(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

}
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	public WebElement NameTxtField;
	
	
	@AndroidFindBy (xpath="//android.widget.RadioButton[@resource-id=\"com.androidsample.generalstore:id/radioFemale\"]")
	public WebElement Radiobtnfield;
	
	@AndroidFindBy(id="android:id/text1")
	private WebElement CountryDorpDown;
	
	 @AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	 public WebElement LetsGo;
	 
	 
	 public void setNameField(String name)
		{
			NameTxtField.sendKeys(name);
		    driver.hideKeyboard();
		}
	 public void Radiobutton() {
		 Radiobtnfield.click();
		 
	 }
	  public void contry() {

		  CountryDorpDown.click();
		  
	  }
	
	 		 
   public void letsgo() {
		 LetsGo.click(); 
	 }


	 
	 
}
	 
	 
	
