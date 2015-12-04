package devices

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities

class Android {

    def browserName = "Chrome"
    def platformName = "Android"
    def deviceId = ""
    def appiumUrl = ""

    def driver

    void create(){
        def cap = new DesiredCapabilities()
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, browserName)
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName)
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceId)
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome")
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome")


        driver = new AndroidDriver(new URL (appiumUrl), cap)
    }

}
