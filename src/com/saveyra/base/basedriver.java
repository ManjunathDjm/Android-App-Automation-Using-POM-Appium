package com.saveyra.base;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class basedriver {

	private static AndroidDriver androidDriver = null;
    public AppiumDriver<WebElement> driver;

    public basedriver(AppiumDriver<WebElement> driver) {
        this.driver = driver;
    }


}
