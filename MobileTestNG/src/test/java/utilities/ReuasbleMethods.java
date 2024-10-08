package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.Files;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ReuasbleMethods {
	public AndroidDriver driver;

	public ReuasbleMethods(AndroidDriver driver) {
		this.driver = driver;
	}

	public void longPress(WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
	}

	public void scrollIntoElement(String text) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().textContains(\"" + text + "\"))")).click();

	}

	public void dragGesture(WebElement element) {
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "endX", 100, "endY", 100));
	}

	public void SwipeGesture() {
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("left", 100, "top", 100,
				"width", 200, "height", 200, "direction", "left", "percent", 0.75));
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void max() {
		driver.manage().window().maximize();
	}

	public void min() {
		driver.manage().window().minimize();
	}

	public void forward1() {
		driver.navigate().forward();
	}

	public void back1() {
		driver.navigate().back();
	}

	public void refresh1() {
		driver.navigate().refresh();
	}

	public void Screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("./screenshots/index2.png");

		Files.copy(src, dest);

	}

	public void generateReports(String reportName) {
		String path = "./screenshots/" + reportName + ".html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Appium results");
		reporter.config().setDocumentTitle("Appium Project");

	}

	public void reports(String reportName) {
		String path = "./reports/" + reportName + ".html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Appium results");
		reporter.config().setDocumentTitle("Appium Project");

	}
}