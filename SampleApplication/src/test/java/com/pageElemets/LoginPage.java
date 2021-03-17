package com.pageElemets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.FunctionalitiesMethodies;

public class LoginPage extends FunctionalitiesMethodies {

	
	public LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="username")
	private WebElement userid;

	
	public WebElement getUserid() {
		return userid;
	}

	public void setUserid(WebElement userid) {
		this.userid = userid;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	@FindBy(id ="password")
	private WebElement password;
	
	@FindBy(id="Login")
	private WebElement login;
}
