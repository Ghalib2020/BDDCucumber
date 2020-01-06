package com.ntiit.StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ntiit.PageObjectModel.AddtocartPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Addtocart {
	WebDriver driver;
	@Given("^user visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver_win32\\chromedriver.exe");
	     driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.oscommerce.com");
	 Thread.sleep(2000);
		}

	@When ("^click first product$")
	public void click_first_product() throws Throwable {
		AddtocartPOM obj1=new AddtocartPOM(driver);
		obj1.Clickfirstac().click();
	    }

	/*@When ("^enter amount of product$")
	public void enter_amount_of_product() throws Throwable {
		AddtocartPOM obj2=new AddtocartPOM(driver);
		obj2.writeamount().sendKeys(5);
	    }*/

	@When("^click checkout$")
	public void click_checkout() throws Throwable {
		AddtocartPOM obj3=new AddtocartPOM(driver);
		obj3.Clickcheckout().click();
	   }

}
