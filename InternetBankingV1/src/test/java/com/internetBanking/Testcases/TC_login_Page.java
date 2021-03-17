package com.internetBanking.Testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.internetBanking.Pageobjects.LoginLocators;
import com.internetBanking.untilites.ReadConfig;

import junit.framework.Assert;

public class TC_login_Page extends BaseClass {

	
	@Test
	private void loginTest() {
		// TODO Auto-generated method stub
		
		driver.get(ReadConfig.getapplicationurl());	
		
	
		
		LoginLocators l = new LoginLocators();
		WebElement username = l.getUsername();
		username.sendKeys(ReadConfig.username());
		
		
		WebElement password = l.getPassword();
		password.sendKeys(ReadConfig.password());
		
		
		l.getLoginclick().click();
	}
	
	
	
	
}
