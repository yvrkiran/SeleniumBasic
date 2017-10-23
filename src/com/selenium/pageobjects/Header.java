package com.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.selenium.base.ActionClass;

public class Header extends ActionClass{
	WebDriver driver;

	//Constructor
	public Header(WebDriver driver){
		 this.driver = driver;
	} 
	 
	@FindBy(xpath="//div[@id='app-root']/div/div/div/div[3]/div[2]/div/span/a/strong")
	public WebElement UserNameLink;
	
	@FindBy(css=".Select-arrow-zone")
	public WebElement ProgramListDropDown;
	
	@FindBy(xpath="//*[@id='react-select-2--option-3']/div")
	public WebElement ProgramName;
	
	@FindBy(css=".logout-link")
	public WebElement Logout;
}
