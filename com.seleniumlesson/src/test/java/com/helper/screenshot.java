package com.helper;
	


import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	
	
	public static void shot(WebDriver driver) throws IOException {
		TakesScreenshot shot =((TakesScreenshot)driver);
	
File src=shot.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("C:\\seleniumwork\\com.seleniumlesson\\screenshot\\first.png"));
	
	}
}
