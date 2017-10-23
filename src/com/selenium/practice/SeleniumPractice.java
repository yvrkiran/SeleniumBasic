package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.selenium.base.ActionClass;
import com.selenium.pageobjects.Footer;
import com.selenium.pageobjects.Header;
import com.selenium.pageobjects.LoginPage;

public class SeleniumPractice extends ActionClass{
	static LoginPage loginPage;
	static Header header;
	static Footer footer;
	
	public static void main(String[] args) throws Exception{
		try{
		WebDriver driver = InitiationMethod();
		 loginPage=  PageFactory.initElements(driver, LoginPage.class);
		 header = PageFactory.initElements(driver, Header.class);
		 footer = PageFactory.initElements(driver, Footer.class);
		
		System.out.println(footer.Copyright.getText());
		
		enterText(loginPage.UserName, "cp-011");
		enterText(loginPage.Password, "Testing123!");
		Click(loginPage.ClickButton);
		
		Thread.sleep(3000);
		Click(header.ProgramListDropDown);
		Thread.sleep(2000);
		Click(header.ProgramName);
		
		//File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			}
		catch(Exception e){
			e.printStackTrace();
			}
	}
}
