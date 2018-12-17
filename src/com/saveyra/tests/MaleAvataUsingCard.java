package com.saveyra.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.saveyra.base.capabalities;
import com.saveyra.pages.Awatar;
import com.saveyra.pages.home;
import com.saveyra.pages.onboarding;
import com.saveyra.pages.settings;


	public class MaleAvataUsingCard extends capabalities{

		    
			 @Test(priority=4)
			 public void CardMaleAwatar() throws Exception {
				
				 onboarding on=new onboarding(driver);
				 on.gettingStarted();
				 
				 home home= new home(driver);
				 home.HomeTab();
				 home.createAwatar();

			     Awatar awatar=new Awatar(driver);
			     awatar.maleAwatar();
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
