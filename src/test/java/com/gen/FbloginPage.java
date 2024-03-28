package com.gen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbloginPage extends Utility  {
	public FbloginPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	private WebElement user;
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy(name="login")
	private WebElement login;
	public WebElement getUser() {
		return user;
	}
	public void setUser(WebElement user) {
		this.user = user;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	
	
	}
