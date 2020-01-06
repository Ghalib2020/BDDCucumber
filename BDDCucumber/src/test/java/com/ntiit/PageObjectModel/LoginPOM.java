package com.ntiit.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	
	WebDriver driver;
	
	//1. Create a constructor
	 public LoginPOM(WebDriver driver) {
		 this.driver=driver ;
		 PageFactory.initElements(driver, this);
	 }
	
	//2.find web element with locators
	
	@FindBy(xpath="//*[@id=\"tdb3\"]/span[2]") WebElement click_Account;
	@FindBy(name="email_address") WebElement type_Email;
	@FindBy(name="password") WebElement type_Password;
	@FindBy(xpath="//*[@id=\"tdb1\"]/span[2]") WebElement click_signin;
	
	
	//create method for each web element
	 public WebElement Account() {
		return click_Account;
		  }
	 
	 public WebElement Email() {
		return type_Email;
		 
	 }
	 
	 public WebElement Password() {
		return type_Password;
		 
	 }
	 public WebElement signin() {
		return click_signin;
		 
	 }
	
	

}
