package com.saveyra.tests;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.saveyra.base.capabalities;
import com.saveyra.pages.onboarding;
import com.saveyra.pages.settings;
import com.saveyra.pages.stickers;


public class FacebookLoginShare extends capabalities{

    
	 @Test(priority=1)
	 public void Facebooksignup() throws Exception {
		
		 onboarding on=new onboarding(driver);
		 on.gettingStarted();
		 		 
		 settings sign =new settings(driver);
		 sign.settingsTab();
		 sign.signup();
	     sign.login();
	     sign.facebookLoginButton();
	     sign.facebookCredentials("silverminesoftware@gmail.com","silvermine1");
	     sign.facebookLogin();
	     sign.facebookContinue();
	     	     
	     stickers sticker= new stickers(driver);
	     sticker.stickersTab();
	     sticker.chitchattab();
	     sticker.chatterBoxSticker();
	     sticker.shareButton();
	     sticker.instagram();
	     
	 }
	 
	  
}
