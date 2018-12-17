package com.saveyra.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.saveyra.base.capabalities;
import com.saveyra.pages.home;
import com.saveyra.pages.onboarding;




public class LocationAccessCard extends capabalities{

			    
			@Test(priority=2)
			public void locationAccessCard() throws Exception {
				 
			onboarding on=new onboarding(driver);
			on.gettingStarted();
				 
			home home= new home(driver);
			home.HomeTab();
			home.locationcard(driver);
			home.mediapopup();
				 



				 }
}
