package com.ntiit.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPOM {
	WebDriver driver;
	public AddtocartPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	/*public AddtocartPOM(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);*/
	
	@FindBy(xpath="//*[@id=\"bodyContent\"]/div/div[2]/table/tbody/tr[1]/td[1]/a[2]") WebElement click_firstproduct;
	@FindBy(xpath="//*[@id=\"tdb4\"]/span[2]")WebElement click_addtocart;
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/input[1]") WebElement write_amount;
	@FindBy(xpath="//*[@id=\"tdb5\"]/span[1]") WebElement click_checkout;
	
		  
	public WebElement Clickfirstac() {
		return click_firstproduct;
		  }
	public WebElement Clickaddtocart() {
		return click_addtocart;
		  }
	public WebElement writeamount() {
		return write_amount;
		  }
	public WebElement Clickcheckout() {
		return click_checkout;
		  }
	
	
	
		  }
	
	


