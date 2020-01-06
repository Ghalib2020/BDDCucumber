package com.ntiit.StepDefs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class DropdownmenuSD {
	

		@Test
		public void clickdropdown() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		   // WebDriver driver =new ChromeDriver();
			WebDriver driver = new ChromeDriver();
			driver.get("http://mrbool.com/");
			/*Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
				driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a"))	.click();*/
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
			driver.findElement(By.xpath("//a[@href=\"http://mrbool.com/course\"]")).click();
		}
	}


