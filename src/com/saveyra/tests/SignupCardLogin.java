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
import com.saveyra.pages.home;
import com.saveyra.pages.onboarding;
import com.saveyra.pages.settings;



public class SignupCardLogin extends capabalities{

	    
		 @Test(priority=3)
		 public void SignupCard() throws Exception {
			
			 onboarding on=new onboarding(driver);
			 on.gettingStarted();
			 
			 home home= new home(driver);
			 home.HomeTab();
			 home.signupcard();

			 settings sign =new settings(driver);
			 sign.login();
		     sign.facebookLoginButton();
		     sign.facebookCredentials("silverminesoftware@gmail.com","silvermine1");
		     sign.facebookLogin();
		     sign.facebookContinue();


   }

}