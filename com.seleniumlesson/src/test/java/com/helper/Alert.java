package com.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class Alert {
	
		WebDriver driver;
		
	public Alert(WebDriver driver) {
	
		this.driver=driver;
		
		
	}
	public void Actionwindow() {
		
		
	//Actions A=new Actions(driver);
	driver.switchTo().alert();
	String abc=driver.getTitle();
	System.out.println("the title is"+abc);
}
}
