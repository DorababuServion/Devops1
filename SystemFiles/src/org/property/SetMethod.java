package org.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class SetMethod {
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\dorababu.c\\eclipse-workspace\\SystemFiles\\Rescources\\system.properties");

		Properties p = System.getProperties(); 
		p.load(file);
		
		HashMap<String,String> mp = new HashMap<String,String>((Map) p);
		
		Set<Entry<String, String>> entrySet = mp.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}

}
