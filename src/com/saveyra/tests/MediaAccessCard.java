package com.saveyra.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.saveyra.base.capabalities;
import com.saveyra.pages.home;
import com.saveyra.pages.onboarding;
import com.saveyra.pages.settings;
import com.saveyra.pages.stickers;



    public class MediaAccessCard extends capabalities{

		    
			 @Test(priority=2)
			 public void MediaAccesCard() throws Exception {
			 
			 onboarding on=new onboarding(driver);
			 on.gettingStarted();
			 
			 home home= new home(driver);
			 home.HomeTab();
			 home.mediaaccess(driver);
			 home.mediapopup();
			 
			 stickers sticker= new stickers(driver);
			 sticker.stickersTab();
		     sticker.disle();
		     sticker.dilsesticker();
		     sticker.shareButton();
		     sticker.stickerdownload();




}

    }