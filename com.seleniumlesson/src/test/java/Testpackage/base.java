package Testpackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.helper.Javascriptexecutor;
import com.helper.screenshot;
import com.helper.windowhandles;
import com.util.BrowserDrivenData;
import com.util.config;
import com.util.excelclass;

public class base {
	
	public WebDriver driver;
	public excelclass excel;
	public  config conf;
	windowhandles wind;
	
	@BeforeSuite
	public void beforesetup() throws IOException {
		
		excel=new excelclass();
	 		conf=new config();
       wind = new windowhandles(driver);  
	}
	
@BeforeClass
	public void setup() {
	System.out.println("starting test");
		driver=BrowserDrivenData.Browser(driver,conf.getbrowser(),conf.geturl());
	}

@AfterClass	

public void teardown() {
	System.out.println("ending test");
	BrowserDrivenData.quit(driver);
	
}
@AfterMethod
public void teard(ITestResult result) {
	if(result.getStatus()== ITestResult.FAILURE) {
		try {
			screenshot.shot(driver);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	
}
}

}