package stepdefs;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

class Main {
    public static AndroidDriver driverStart() {
        // Created object of DesiredCapabilities class.
        DesiredCapabilities capabilities = new DesiredCapabilities();
// Set android deviceName desired capability. Set your device name.
        capabilities.setCapability("deviceName", "Nexus");
// Set android VERSION desired capability. Set your mobile device's OS version.
        capabilities.setCapability("Version", "6.0");
        capabilities.setCapability("fullReset","false");
        capabilities.setCapability("noReset","true");
// Set android platformName desired capability. It's Android in our case here.
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("url", "https://0.0.0.0:4723/wd/hub");
        capabilities.setCapability("app", "/Users/teletracking/Desktop/mobiledemoautomation/BTApp.apk");
// It will launch app in android device.
        return new AndroidDriver(capabilities);
    }
   public static AndroidDriver driver = driverStart();
}

