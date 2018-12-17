package com.saveyra.tests;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.saveyra.base.capabalities;
import com.saveyra.pages.Awatar;
import com.saveyra.pages.onboarding;
import com.saveyra.pages.settings;


		public class FemaleAvatar extends capabalities{

			    
				 @Test(priority=5)
				 public void FemaleAvatar() throws Exception {
					
					 onboarding on=new onboarding(driver);
					 on.gettingStarted();
					 
					 Awatar awatar=new Awatar(driver);
				     awatar.avatarTab();
					 awatar.femaleAwatar();
				     awatar.awatarselection();
				     awatar.swipeHorizontallyToBody2(90,306, driver);
				     awatar.savebutton();
				     driver.navigate().back();
				     
				     settings sign =new settings(driver);
					 sign.settingsTab();
					 sign.resetAwatar(driver);
					 sign.popupYes();
					 
					 
					 
				     
				 }


	}





