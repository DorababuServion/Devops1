package org.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SystemProperties {

	
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("C:\\\\Users\\\\dorababu.c\\\\eclipse-workspace\\\\SystemFiles\\\\Rescources\\\\system.properties");
		
		Properties p = new Properties();
		p.load(f);
		String property = p.getProperty("Username");
		String property2 = p.getProperty("Password");
		System.out.println(property);
		System.out.println(property2);
		
		
	}
}
