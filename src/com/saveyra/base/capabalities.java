package com.saveyra.base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class capabalities {

    public AppiumDriver<WebElement> driver;
    	
	@BeforeMethod
	@BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities ( );
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
        capabilities.setCapability ( "deviceName", "S408CG461803027513" );
        capabilities.setCapability ( CapabilityType.VERSION, "7.0.1" );
        capabilities.setCapability ( "platformName", "Android" );
        capabilities.setCapability(MobileCapabilityType.APP, "E:\\SaveyraAndroidAutomation\\app\\SaveyraKeyboard.apk");
        capabilities.setCapability ( "appPackage", "com.saveyra.test" );
        capabilities.setCapability ( "appActivity", "com.saveyra.splash.SplashScreenActivity" );
        driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
	}
	
	@AfterMethod
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
         
	} 
    
		

  
	

	 
  








