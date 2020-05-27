package com.seleniumlesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {
	WebDriver driver;
	
	public login(WebDriver driver) {
		this.driver= driver;
	}
	
	
		
		@FindBy(id="txtUsername")  WebElement uname;
		@FindBy(id="txtPassword") WebElement upass;
		@FindBy(name="Submit") WebElement enter;
		
	public void loginorange(String name,String password) {
		
		uname.sendKeys(name);
		upass.sendKeys(password);
		enter.click();
		
	}
	
	
	

}
