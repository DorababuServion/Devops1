package com.internetBanking.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.internetBanking.Testcases.BaseClass;

public class LoginLocators extends BaseClass {
	
	
	
	public LoginLocators() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return Username;
	}


	public void setUsername(WebElement username) {
		Username = username;
	}


	public WebElement getPassword() {
		return Password;
	}


	public void setPassword(WebElement password) {
		Password = password;
	}


	public WebElement getLoginclick() {
		return loginclick;
	}


	public void setLoginclick(WebElement loginclick) {
		this.loginclick = loginclick;
	}

	@FindBy(name="uid")
	 private WebElement Username;
	
	@FindBy(name="password")
	private	WebElement Password;
	
	
	@FindBy(name="btnLogin")
	private WebElement loginclick;
	
	
}
