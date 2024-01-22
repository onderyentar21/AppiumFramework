package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static AppiumDriver<MobileElement> appiumDriver;
    private static DesiredCapabilities caps;



  public static AppiumDriver getAppiumDriver() {

        URL appiumDriverURL = null;
        try {
            appiumDriverURL = new URL("http://0.0.0.0:4723/wd/hub");
        } catch (Exception e) {
            e.printStackTrace();
        }


        if (appiumDriver == null) {
            caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigReader.getProperty("automationName"));
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("platformVersion"));
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
            caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, ConfigReader.getProperty("appPackage"));
            caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ConfigReader.getProperty("appActivity"));

            if (ConfigReader.getProperty("platformName").equals("Android")){
                appiumDriver = new AppiumDriver<>(appiumDriverURL, caps);
                appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            }else {
                throw new UnsupportedOperationException("invalid Platform Name "+ ConfigReader.getProperty("platformName"));
            }

        }

        return appiumDriver;

    }

     /*


    public static void getAppiumDriver() {
        URL appiumDriverURL = null;
        try {
            appiumDriverURL = new URL("http:0.0.0.0:4723/wd/hub");
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (appiumDriver == null) {
            caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigReader.getProperty("automationName"));
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("platformVersion"));
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
            caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, ConfigReader.getProperty("appPackage"));
            caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ConfigReader.getProperty("appActivity"));

            if (ConfigReader.getProperty("platformName").equals("Android")) {
                appiumDriver = new AppiumDriver<>(appiumDriverURL, caps);
                appiumDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            } else {
                throw new UnsupportedOperationException("Invalid Platform Name " + ConfigReader.getProperty("platformName"));
            }
        }
    }

     */
    public static void quitAppiumDriver(){
         if(appiumDriver !=null)
            appiumDriver.quit();
            appiumDriver=null;
    }
}

