package com.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.selenium.base.ActionClass;

public class LoginPage extends ActionClass{
	WebDriver driver;

	//Constructor
	public LoginPage(WebDriver driver){
		 this.driver = driver;
	} 
	 
	@FindBy(xpath=".//*[@id='formUserId']")
	public WebElement UserName;
	
	@FindBy(xpath=".//*[@id='formPassword']")
	public  WebElement Password;
	
	@FindBy(xpath=".//*[@id='app-root']/div/div[1]/div/form/a")
	public  WebElement ClickButton;
}
