package com.helper;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class windowhandles {
WebDriver driver;	

	
	
	public windowhandles(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	
	
	
	
	public void win(WebDriver driver){
		
		
		 String parent=driver.getWindowHandle();
		 System.out.println(""+ parent);
		
		Set<String>child=driver.getWindowHandles();
		
		for(String h:child) {
			
		
System.out.println(""+ h);
		
		}	
		
	}
	
	

}
