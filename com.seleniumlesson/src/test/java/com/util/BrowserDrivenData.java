package com.util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDrivenData {
	

	public static WebDriver Browser(WebDriver driver,String browser,String url) {
		
	
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		   // System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		       driver=new ChromeDriver();
		       driver.get(url);
                System.out.println("welcome");
				System.out.println("stage1");
				
						
				
		}
				else if(browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "");
			 driver=new FirefoxDriver();
		}
		
			else if(browser.equalsIgnoreCase("internet explorer")) {	
			System.getProperty("webdriver.internet explorer.driver", "");
		}
		
			else {
		System.out.println("can't open the browser");
	}
return driver;
	}
public static void quit(WebDriver driver) {
	driver.quit();
}
}
