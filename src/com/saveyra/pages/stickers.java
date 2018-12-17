package com.saveyra.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class stickers {
	
	public stickers(AppiumDriver<WebElement> driver) {
           PageFactory.initElements(new AppiumFieldDecorator(driver), this);
           
    }	

    @AndroidFindBy(id = "com.saveyra.test:id/action_stickers")
    public WebElement stickersTab;
    
    @AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.Tab[@content-desc=\"Chit Chat\"]/android.widget.TextView")
    public WebElement chitchatcategory;
    
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.ImageView")
    public WebElement chatterbox_Sticker;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='SHARE']")
    public WebElement shareButton;
    
    @AndroidFindBy(id="com.saveyra.test:id/img_instagram")
    public WebElement instagram;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='ALLOW']")
    public WebElement instagram_permission;
    
    @AndroidFindBy(xpath="//*[@text='DIL SE']")
    public WebElement dilsetab;
    
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView")
	public WebElement diseSticker;
    
    @AndroidFindBy(id="com.saveyra.test:id/img_download")
    public WebElement download;
    
      
    
   public void stickersTab() {
	
	   stickersTab.click();
	 
 }


   public void chitchattab() {
	
	   chitchatcategory.click();
	
		
}

   public void chatterBoxSticker() {
	
	  chatterbox_Sticker.click();
}

  public void shareButton() throws InterruptedException {
	
	  Thread.sleep(3000);
	  shareButton.click();
}

  public void instagram() {
	
	 instagram.click();
}

  public void instagram_permission() {
	
	instagram_permission.click();

}

 public void disle() {
	  
	 dilsetab.click();
  }

 public void dilsesticker() {
	 
	 
	 diseSticker.click();
 }

 public void stickerdownload() {
	 
	 download.click();
 
 
 }


}






	



