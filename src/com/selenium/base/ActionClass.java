package com.selenium.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ActionClass {
	
	public static  WebDriver driver;
	
	public  static WebDriver InitiationMethod() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/ravikiran/Downloads/selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://bryant.pprd.goalquestprogram.com");
		//driver.wait(2000);
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		return driver;
		}
	
	public static  WebDriver Click( WebElement webElement) throws InterruptedException{
    	Thread.sleep(3000);
		webElement.click();
		return driver;
		}
	
	public static  WebDriver enterText(WebElement webElement, String sText) {
		webElement.click();
    	webElement.clear();
    	webElement.sendKeys(sText);
		return driver;
		}
	
}
