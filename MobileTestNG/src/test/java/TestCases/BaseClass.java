package TestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {
    AndroidDriver driver;
    public ExtentReports report;
    public ExtentTest test;

    @BeforeClass
    public void setUp() {
        try {
            // Verify if the file path exists
            String reportPath = "C:\\Users\\nm22220\\eclipse-workspace\\MobileTestNG\\reports\\Appium.html";
            if (!Paths.get(reportPath).toFile().getParentFile().exists()) {
                throw new RuntimeException("Report directory does not exist: " + reportPath);
            }

            report = new ExtentReports(reportPath);
            test = report.startTest("Traffic");

            String appPath = "C:\\Users\\nm22220\\Downloads\\General-Store.apk";
            if (!Paths.get(appPath).toFile().exists()) {
                throw new RuntimeException("App file does not exist: " + appPath);
            }

            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("ojas");
            options.setApp(appPath);

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException("MalformedURLException encountered while initializing AndroidDriver: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Exception encountered in setUp: " + e.getMessage());
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        if (report != null) {
            report.endTest(test);
            report.flush();
        }
    }
}
