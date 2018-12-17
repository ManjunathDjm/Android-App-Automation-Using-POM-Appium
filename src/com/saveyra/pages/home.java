package com.saveyra.pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class home {
	
	public home(AppiumDriver<WebElement> driver) {
           PageFactory.initElements(new AppiumFieldDecorator(driver), this);
           
    }	


    
    @AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Home\"]")
    public WebElement home;  
    
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.ImageView")
    public WebElement signupcard;
    
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView")
    public WebElement createAwatarCard;
    
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView")
    //@AndroidFindBy(xpath=("(//*[@id='recyle_cards']/*/*[@id='img_card'])[2]"))
    public WebElement enableKeyboardCard;
    
    @AndroidFindBy(id="com.saveyra.test:id/button_enable_saveyra")
    public WebElement enablesaveyra;
    
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.widget.Switch")
    public WebElement keyboardswtich;
    
    @AndroidFindBy(id="com.saveyra.test:id/button_choose_keyboard")
    public WebElement enableKeyboard;
    
    @AndroidFindBy(id="com.saveyra.test:id/button_choose_keyboard")
    public WebElement chooseKeyboard;
    
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RadioButton")
    public WebElement englishKeyboard;		
    
    @AndroidFindBy(id="com.saveyra.test:id/button_done")
    public WebElement done;
    
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView")
    public WebElement mediaaccesscard;
    
    @AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
    public WebElement mediapopup;
    
    @AndroidFindBy(xpath="//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[23]/div")
    public WebElement locationcard;
    
    public void HomeTab() throws InterruptedException {
			
	   Thread.sleep(2000);
	   home.click();	
    }
    
    
	
    public void signupcard() {
	   
	    signupcard.click();
	   
   }
	
    
    public void createAwatar() {
    	
    	createAwatarCard.click();
    	
    }

    
    public void keyboardCard(RemoteWebDriver driver) throws InterruptedException  {
    	
      Thread.sleep(2000);
      List<WebElement> keyboard= (driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView")));
      new TouchAction((PerformsTouchActions) driver).press(372, 305).waitAction(Duration.ofMillis(169)).moveTo(112, 290).release().perform();
      enableKeyboardCard.click();
      
    	
    }

    public void enablesaveyra() {
    	
    	enablesaveyra.click();
    }

    
    public void enableKeyboardswitch() {
    	
    	
    	keyboardswtich.click();
    }

    public void enableKeyboard() {
    	
    	enableKeyboard.click();
    }
    
    
    
    public void chooseKeyboard() {
    	
    	chooseKeyboard.click();
    	
    }
    
    public void englishKeyboard() {
    	
    	englishKeyboard.click();
    	
    }

   public void doneButton() {
	   
	   done.click();
   }

   
   public void mediaaccess(WebDriver driver) {
	   
	   List<WebElement> media= (driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView")));
	   new TouchAction((PerformsTouchActions) driver).press(383, 292).waitAction(Duration.ofMillis(292)).moveTo(19, 292).release().perform();
       //new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView"))).click();
       mediaaccesscard.click();
       
   }
   
  public void mediapopup() {
	  
	  mediapopup.click();
	  
  }

  public void locationcard(WebDriver driver) {
  
	  List<WebElement> media= (driver.findElements(By.xpath("//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[23]/div")));
	  new TouchAction((PerformsTouchActions) driver).press(383, 292).waitAction(Duration.ofMillis(292)).moveTo(19, 292).release().perform();
      mediaaccesscard.click();
	  
  
}


}




