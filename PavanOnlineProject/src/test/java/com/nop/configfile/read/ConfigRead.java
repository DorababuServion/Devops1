package com.nop.configfile.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {
	
	
	public Properties p = new Properties();
	
	public ConfigRead()  {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\dorababu.c\\eclipse-workspace\\PavanOnlineProject\\Config\\config.properties");
		
		try {
		FileInputStream fin = new FileInputStream(f);
		p.load(fin);
		}
		catch (Exception e) {
			// TODO: handle exception
		System.out.println("get message expection");
		}
	}
	
	public  String getapplicationurl() {
		// TODO Auto-generated method stub
		String baseurl = p.getProperty("baseURL");
		return baseurl;
	}
	
	public String getusermail() {
		// TODO Auto-generated method stub
		String usermail = p.getProperty("useremail");
		return usermail;
	}
	public  String getuserpassword() {
		// TODO Auto-generated method stub
		String password = p.getProperty("password");
		return password;
	}
	
	
}
