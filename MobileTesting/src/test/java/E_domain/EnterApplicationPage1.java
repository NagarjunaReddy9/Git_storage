package E_domain;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class EnterApplicationPage1 {

	AndroidDriver driver;

	@Test

	public void app() throws MalformedURLException, InterruptedException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("naga");
		options.setApp("C:\\Users\\nm22220\\Downloads\\General-Store.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("amulya");
		driver.hideKeyboard();
//
//		driver.findElement(By
//				.xpath("//android.widget.RadioButton[@resource-id=\"com.androidsample.generalstore:id/radioFemale\"]"))
//				.click();
//		driver.findElement(By.id("android:id/text1")).click();
//		driver.findElement(
//				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
//		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"India\"]"))
//				.click();
//		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		Thread.sleep(3000);

	//}

//		driver.findElement(By
//				.xpath("//android.widget.RadioButton[@resource-id=\"com.androidsample.generalstore:id/radioFemale\"]"))
//				.click();
//		driver.findElement(By.id("android:id/text1")).click();
//		driver.findElement(
//				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
//		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"India\"]"))
//				.click();
//		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		Thread.sleep(3000);
	

	}
	@Test
	public void app1() throws MalformedURLException, InterruptedException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("naga");
		options.setApp("C:\\Users\\nm22220\\Downloads\\General-Store.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("amulya");
		driver.hideKeyboard();
}
}
