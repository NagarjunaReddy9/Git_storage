package Screen;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screensho{
	WebDriver driver;

	@Test
	public void fullscreen() throws IOException {
		 driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/Register.php");
		TakesScreenshot ts=(TakesScreenshot)driver;
	File src=	ts.getScreenshotAs(OutputType.FILE);
	     File target=new File("C:\\Users\\nm22220\\eclipse-workspace\\TestNgNew_This_is_my\\screen1\\raj.png");
	     Files.copy(src, target);
		

	}
}

//TakesScreenshot ts = (TakesScreenshot) driver;
//File src = ts.getScreenshotAs(OutputType.FILE);
//File target = new File("C:\\Users\\nm22220\\eclipse-workspace\\TestNgNew_This_is_my\\screen1\\nag1.png");
//Files.copy(src, target);
//public void fullscreen() throws IOException {
//	  driver = new ChromeDriver();
//	  driver.get("https://adactinhotelapp.com/HotelAppBuild2/Register.php");
//	  TakesScreenshot ts = (TakesScreenshot) driver;
//    File src = ts.getScreenshotAs(OutputType.FILE);
//    File target = new File("C:\\Users\\nm22220\\eclipse-workspace\\TestNgNew_This_is_my\\screen1\\nag.png");
//    Files.copy(src, target);
//    
//   Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//  ImageIO.write(s.getImage(), "PNG", new File("C:\\Users\\nm22220\\eclipse-workspace\\TestNgNew_This_is_my\\screen1\\nag2.png"));


