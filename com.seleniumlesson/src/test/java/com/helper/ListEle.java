package com.helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListEle {
	
	
	

	
	/*public void element(WebDriver driver) {
		
		
	WebElement onlyElement	=driver.findElement(By.name("name"));
	System.out.println(""+onlyElement.getText());
		
	}*/
	
	public static void elements(WebDriver driver) {
		List<WebElement> Firstlist=driver.findElements(By.xpath("//*[@class='menu']"));
		
		//int len=Firstlist.size();
		//for(int i=0;i<len;i++) {
			
			
		
			//System.out.println(""+Firstlist.get(i).getText());
			
		
		
		
for( WebElement h   :Firstlist) {
			System.out.println(""+h.getText());
				
	}
}
}
