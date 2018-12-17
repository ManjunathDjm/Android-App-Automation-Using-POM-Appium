package com.saveyra.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.saveyra.base.capabalities;
import com.saveyra.pages.onboarding;
import com.saveyra.pages.stickers;


	public class GuestUserShare extends capabalities{

	    
		 @Test(priority=2)
		 public void Guest() throws Exception {
			
			 onboarding on=new onboarding(driver);
			 on.gettingStarted();
			 
			 stickers sticker= new stickers(driver);
			 sticker.stickersTab();
		     sticker.disle();
		     sticker.dilsesticker();
		     sticker.shareButton();
		     sticker.instagram();

     }

}