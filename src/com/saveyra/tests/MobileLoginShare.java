package com.saveyra.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.saveyra.base.capabalities;
import com.saveyra.pages.onboarding;
import com.saveyra.pages.settings;


public class MobileLoginShare extends capabalities{


    
	@Test
	public void Mobile() throws Exception {
			
	  
	  onboarding on=new onboarding(driver);
	  on.gettingStarted();
			 
	  settings sign =new settings(driver);
	  sign.settingsTab();
	  sign.signup();
	  sign.login();
	  sign.loginMobile();
	  sign.mobileField(driver, "9036890379");
	  sign.submit();
	  sign.verificationcode("236463");
	  sign.verifyButton();
	  
 }

}
