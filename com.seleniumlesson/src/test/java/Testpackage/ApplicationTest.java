package Testpackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.helper.Javascriptexecutor;
import com.helper.ListEle;
import com.helper.screenshot;
import com.seleniumlesson1.login;
import com.util.excelclass;

public class ApplicationTest extends base {
	
	
	
	@Test
	public void calltest() throws IOException, InterruptedException {
		
		//returns the object of the same class in this case login object of login class
	login login	=PageFactory.initElements(driver, login.class);
	
    login.loginorange(excel.getrowdata("sheet1", 1, 0),excel.getrowdata("sheet1", 1, 1));
    ListEle.elements(driver);
    wind.win(driver);
    screenshot.shot(driver);
    Javascriptexecutor.scroll(driver);
	}
   
	
	
}


