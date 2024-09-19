package pageObjects;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class demo {

    AndroidDriver driver;

    @Test
    public void app() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Traffic");
        options.setApp("C:\\Users\\nm22220\\Downloads\\app-debug 13.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        // Additional test steps
    }
}
