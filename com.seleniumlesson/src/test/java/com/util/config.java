package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class config {
	
	Properties con;
		
	public config() throws IOException {
	File src=new File("C:\\seleniumwork\\com.seleniumlesson\\config\\config.properties");
	FileInputStream fis=new FileInputStream(src);
    con=new Properties();
	con.load(fis);

	}
	
	public String getbrowser() {
		
		return con.getProperty("Browser");
		}
	public String geturl() {
		return con.getProperty("url");
		
	}
	
}
