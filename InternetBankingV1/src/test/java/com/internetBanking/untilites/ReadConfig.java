package com.internetBanking.untilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	static Properties p;
	
	
	
	public ReadConfig() throws IOException {
		File f = new File("C:\\Users\\dorababu.c\\eclipse-workspace\\InternetBankingV1\\src\\test\\java\\com\\internetBanking\\untilites\\Config.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	
	}
	
	public static String getapplicationurl() {
		// TODO Auto-generated method stub
		String property = p.getProperty("baseUrl");
		return property;	
	}
	
	public  String ChromeFilepath() {
		// TODO Auto-generated method stub
		String property = p.getProperty("chromepath");
		return property;
	}
	public static String username() {
		String property = p.getProperty("username");
		return property;	
	}
	public static String password() {
		String property = p.getProperty("password");
		return property;	
	}
	
	
}
