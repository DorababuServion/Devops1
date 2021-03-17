package org.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
	
	public static void main(String[] args) throws IOException {
	
		
		Properties p = new Properties();
		p.put("username", "Dorababu");
		p.put("Password","Dora@1997");
		p.put("mob","9491945424");
		p.put("Loc", "Hyderabad");
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\dorababu.c\\eclipse-workspace\\SystemFiles\\Rescources\\systemWritexml.properties");
		
		p.storeToXML(f, "this is simple properties");
		
		
	}

}
