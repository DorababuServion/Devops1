package com.Utilies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.collections4.map.HashedMap;

public class FileEnv {
	
	public static String propertyRead(String name) throws IOException {
		//  TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("C:\\Users\\dorababu.c\\eclipse-workspace\\RestAutomation\\input\\qa.properties");
		
		Properties p = new Properties();
		p.load(f);
		

		String property = p.getProperty(name);
		System.out.println(property);
		return property;
		
		
	}
	
	
	
}
