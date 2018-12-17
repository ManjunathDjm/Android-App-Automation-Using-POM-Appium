package com.saveyra.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;





public class Awatar{

	public Awatar(AppiumDriver<WebElement> driver) throws InterruptedException 
	{
	        Thread.sleep(10000);  
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	        
	}
			
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Avatar\"]")
	public WebElement AwatarTab;
	
	@AndroidFindBy(id = "com.saveyra.test:id/iv_men")
    public WebElement maleAwatar;
	
	@AndroidFindBy(id="com.saveyra.test:id/iv_women")
	public WebElement femaleAwatar;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout[1]/android.widget.ImageView")
    public WebElement face;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView")
	public WebElement eyes;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.view.View")
	public WebElement eyecolour;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.ImageView")
	public WebElement eyebrow;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.view.View")
	public WebElement eyebrowcolour;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.ImageView")
	public WebElement hair;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.View")
	public WebElement haircolour;
	
	@AndroidFindBy(xpath="//android.support.v7.app.ActionBar.Tab[@content-desc=\"BODY\"]/android.widget.TextView")
	public WebElement body;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout[2]/android.widget.ImageView")
	public WebElement body2;
	
	@AndroidFindBy(xpath="//*[@text='SAVE']")
	public WebElement save;
	
	@AndroidFindBy(xpath="com.saveyra.test:id/img_download")
	public WebElement download;
	
	
	public void avatarTab() {
		
		
		AwatarTab.click();
		
	}
	
	
	public void maleAwatar() {
		
		
		maleAwatar.click();
		
		
	}
	  
    public void femaleAwatar() {
    	
    	
    	femaleAwatar.click();
    	
    	
    }

   
    public void awatarselection() throws InterruptedException {
    	
    	Thread.sleep(10000);
    	face.click();
    	eyes.click();
    	eyecolour.click();
    	eyebrow.click();
    	eyebrowcolour.click();
    	hair.click();
    	haircolour.click();
    	body.click();
    	
    }
    	
  public void swipeHorizontallyToBody2(int i, int j, RemoteWebDriver driver) {
		  
	    WebElement body = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout[2]/android.widget.ImageView"));
	    Point body2 = body.getLocation();
	    Dimension screenSize = driver.manage().window().getSize();
	    int startX = Math.toIntExact(Math.round(screenSize.getWidth() * 0.8));
	    int endX = 0;

	    TouchAction action = new TouchAction((PerformsTouchActions) driver);
	    action.press(412, 315);
	    action.moveTo(90,306);
	    action.release().perform();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout[2]/android.widget.ImageView")).click();
	    
  }   	  
	  
	  
  public void savebutton() {
	  
	  save.click();
  
  }
 
  	  
	  
  }
  

 


