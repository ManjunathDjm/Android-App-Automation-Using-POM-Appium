package com.saveyra.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class onboarding {

	public onboarding(AppiumDriver<WebElement> driver) throws InterruptedException {
        
		Thread.sleep(10000);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
                      
           
    }	
	
	
    @AndroidFindBy(id = "com.saveyra.test:id/btn_get_started")
    public WebElement gettingStarted;
    
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]")
    public WebElement viewlegal;

	 
     
    public void gettingStarted() {
		
    	gettingStarted.click();
    	 
	
 }

   public void viewLegalLink () {
	   
	   
	 
     viewlegal.click();
   
   
   }

   
}



   

