package com.ntiit.StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ntiit.PageObjectModel.LoginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginSDTest {
	WebDriver driver;
	
	@Given("^user visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.oscommerce.com");
	   
	    
	}

	@Given("^click My Account button$")
	public void click_My_Account_button() throws Throwable {
	    LoginPOM object1 =new LoginPOM(driver);
	    object1.Account().click();
	    
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String email1, String password1) throws Throwable {
	    LoginPOM object2=new LoginPOM(driver);
	    object2.Email().sendKeys(email1);
	    object2.Password().sendKeys(password1);
	}

	@When("^user click on sign in button$")
	public void user_click_on_sign_in_button() throws Throwable {
		LoginPOM object3=new LoginPOM(driver);
		object3.signin().click();
	    
	}

	@Then("^user successfully login to the system$")
	public void user_successfully_login_to_the_system() throws Throwable {
	    
	}

	@Then("^user click on Log off Button for logout$")
	public void user_click_on_Log_off_Button_for_logout() throws Throwable {
	    
	}
}
