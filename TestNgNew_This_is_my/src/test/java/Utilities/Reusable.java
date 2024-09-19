package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Reusable {
	static WebDriver driver;
	public Reusable(WebDriver driver) {
		this.driver=driver;
	}

	public void screenShot1(String filename) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshot/"+filename+".png");
		Files.copy(src, target);
		String path=target.getAbsolutePath();
		return;
		
		
		
//	public static void screen() throws IOException {
//		
//	TakesScreenshot tc=(TakesScreenshot)driver;
//	File src=tc.getScreenshotAs(OutputType.FILE);
//	Files.copy(src, new File("/TestNgNew_This_is_my/Screenshot.pm"));
//	
//	 
	
}
}