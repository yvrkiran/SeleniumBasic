package com.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer {
	WebDriver driver;

	//Constructor
	public Footer(WebDriver driver){
		 this.driver = driver;
	} 
	
	@FindBy(linkText="FAQs")
	public WebElement Faqs;
	
	@FindBy(partialLinkText="Privacy Policy")
	public WebElement PrivacyPolicy;
	
	@FindBy(partialLinkText="Contact Us")
	public WebElement ContactUs;
	
	@FindBy(css=".copyright")
	public WebElement Copyright;
}
