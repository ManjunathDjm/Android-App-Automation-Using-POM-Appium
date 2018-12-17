package com.saveyra.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.gargoylesoftware.htmlunit.javascript.host.Touch;
import com.saveyra.base.capabalities;



public class settings{

	public settings(AppiumDriver<WebElement> driver) throws InterruptedException 
	{
        Thread.sleep(10000);  
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
         
    }
		
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Settings\"]/android.widget.ImageView")
    public WebElement settingsTab;
        
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Switch")
    public WebElement locationaccess;
    
    @AndroidFindBy(id = "com.saveyra.test:id/txt_signup")
    public WebElement signup;
    
    @AndroidFindBy(id = "com.saveyra.test:id/txt_already_login")
    public WebElement login;
    
    @AndroidFindBy(id = "com.saveyra.test:id/txt_usefacebook")
    public WebElement facebookLoginButton;
    
    @AndroidFindBy(id = "m_login_email")
    public WebElement facebookEmail;
    
    @AndroidFindBy(id = "m_login_password")
    public WebElement facebookPassword;
    
    @AndroidFindBy(id ="u_0_5")
    public WebElement facebookLogin;
   
    @AndroidFindBy(id = "u_0_3")
    public WebElement facebookContinue;
    
    @AndroidFindBy(xpath = "//*[@text='LOGIN WITH MOBILE']")
    public WebElement loginMobile;
    
    //@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")
    @AndroidFindBy(xpath="com.saveyra.test:id/edt_mobile[@NAF='true']")
    public WebElement mobileNumberElement;
        
    @AndroidFindBy(xpath="//*[@text='SUBMIT']")
    public WebElement submit;
    
    @AndroidFindBy(id="com.saveyra.test:id/edt_mobile")
    public WebElement verificationcodeField;
    
    @AndroidFindBy(xpath="//[@text='VERIFY']")
    public WebElement verifyButton;
    
    @AndroidFindBy(xpath = "android.widget.TextView[@text='Logout']")
    public WebElement logoutButton;
    
    @AndroidFindBy(id="com.saveyra.test:id/linear_resetavatar")
    public WebElement resetAwatar;
    
    @AndroidFindBy(id="android:id/button1")
    public WebElement popupYes;
    
    
    
    public void settingsTab() {
			
    	
    	settingsTab.click();
        
}
 
   public void locationaccess() {
			
           locationaccess.click();
  
 }
  
 
   public void signup() {
		
	       signup.click();
}
	
   public void login() {
	 
	       login.click();
	 
}

   public void facebookLoginButton() {
	 
	       facebookLoginButton.click();

}


   public void facebookCredentials(String Email, String Password) throws InterruptedException  {
	 
	      Thread.sleep(1000);
	      facebookEmail.sendKeys(Email);
	      facebookPassword.sendKeys(Password);

}


   public void facebookLogin() {
	
	      facebookLogin.click();
	
}
  
   public void facebookContinue() throws InterruptedException {
	
	     Thread.sleep(1000);
	     facebookContinue.click();
	
}

   public void loginMobile() throws InterruptedException {
	    
	   loginMobile.click();
	     
}
   
   
   public void mobileField(WebDriver driver,String mobile)  {
	  
	   
       List<WebElement> media= (driver.findElements(By.xpath("com.saveyra.test:id/edt_mobile[@class='android.widget.EditText']")));
	   new TouchAction((PerformsTouchActions) driver).longPress(mobileNumberElement);
	   //mobileNumberElement.clear();
	   //mobileNumberElement.sendKeys(mobile);
 
  
  }

   public void verificationcode(String otp) {
	   
	   verificationcodeField.sendKeys(otp);
   }
   
   
   public void verifyButton() {
	   
	   verifyButton.click();
   }
   
   public void submit() {
	   
	   submit.click();
	   
   }
  
   public void resetAwatar(RemoteWebDriver driver) {
		  
       
	   List<WebElement> resetavatar= (driver.findElements(By.xpath("android.widget.TextView[@text='Reset avatar']")));
	   new TouchAction((PerformsTouchActions) driver).press(216, 563).waitAction(Duration.ofMillis(584)).moveTo(203, 374).release().perform();
       resetAwatar.click();
       
  
}

  public void popupYes() {
	 
	 popupYes.click();

   }

 
}
  


		
 
 