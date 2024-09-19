package E_domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
    ExtentReports extent;
    WebDriver driver;

    @BeforeTest
    public void config() {
        String path = System.getProperty("user.dir") + "\\reports1\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("results");
        reporter.config().setDocumentTitle("testresults");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("tester", "nag");
    }

    @Test
    public void demo() {
        extent.createTest("demo");

        // Initialize WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
        System.out.println(driver.getTitle());

        // Add a delay for demonstration purposes
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extent.flush();
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}