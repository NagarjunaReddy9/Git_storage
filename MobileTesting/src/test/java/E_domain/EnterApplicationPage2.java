package E_domain;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class EnterApplicationPage2 {
	AndroidDriver driver;

	@Test

	public void app() throws MalformedURLException, InterruptedException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Traffic");
		options.setApp("C:\\Users\\nm22220\\Downloads\\General-Store.apk");

	
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("amulya");
	driver.hideKeyboard();

	driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id=\"com.androidsample.generalstore:id/radioFemale\"]")).click();
	driver.findElement(By.id("android:id/text1")).click();
    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
	driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"India\"]")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	Thread.sleep(3000);
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
	driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productName\" and @text=\"Jordan 6 Rings\"]")).click();
	driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id=\"com.androidsample.generalstore:id/appbar_btn_cart\"]")).click();
	driver.findElement(By.xpath("//android.widget.CheckBox[@text=\"Send me e-mails on discounts related to selected products in future\"]")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		
		
		
	}
	

			

}
//int productCount=driver.findElements(By.id("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productName\" and @text=\"Jordan 6 Rings\"]")).size();

//	for(int i=0;i<productCount;i++) {
	//	String productName=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
	//	if(productName.equalsIgnoreCase("Jordan 6 Rings")) {
			
		//	driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			
	//	}
	//	}

//cart validations
/*
 * WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
 * wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id(
 * "com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
 * 
 * String lastpage=driver.findElement(By.xpath(
 * "//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productName\"]"
 * )).getText(); Assert.assertEquals(lastpage,"Jordan 6 Rings");
 */




