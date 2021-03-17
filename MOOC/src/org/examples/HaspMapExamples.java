package org.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HaspMapExamples {
	public static void main(String[] args) {
		
		HashMap <Integer,String>hm=new HashMap<Integer,String>(); //Declaration

		//adding pairs to HashMap
		hm.put(101,"John");
		hm.put(102,"David");
		hm.put(103,"Smith");
		hm.put(104,"Scott");
		hm.put(105,"Kim");
		
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			
		}
		
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+"     "+m.getValue());
		}
		
		
		
	}

}
