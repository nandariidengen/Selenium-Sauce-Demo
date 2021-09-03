package com.nandari.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver webDriver;
	
	public LoginPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(id = "user-name")
	WebElement inputUsername;
	
	@FindBy(id = "password")
	WebElement inputPassword;
	
	@FindBy(id = "login-button")
	WebElement buttonLogin;
	
		
	public void setUsername(String username) {
		inputUsername.sendKeys(username);
	}
	
	public void setPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		buttonLogin.click();
	}
	
}
