package com.helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Javascriptexecutor {
	
	public static void scroll(WebDriver driver) throws InterruptedException  {
		
		JavascriptExecutor  j=((JavascriptExecutor)driver);
		Thread.sleep(2000);
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		System.out.println("done");

}
}
