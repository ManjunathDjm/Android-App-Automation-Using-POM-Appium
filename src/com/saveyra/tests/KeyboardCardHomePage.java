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



	public class KeyboardCardHomePage extends capabalities{

	    
		 @Test
		 public void keyboardCard() throws Exception {
			
			 onboarding on=new onboarding(driver);
			 on.gettingStarted();
			 		 
			 home home= new home(driver);
			 home.HomeTab();
			 home.keyboardCard(driver);
             home.enablesaveyra();
             home.enableKeyboardswitch();
                          
             settings sign =new settings(driver);
             sign.popupYes();
                                       
             home.chooseKeyboard();
             home.englishKeyboard();
             home.doneButton();



}
	}
