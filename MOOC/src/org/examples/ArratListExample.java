package org.examples;

import java.util.ArrayList;

public class ArratListExample {

	public static void main(String[] args) {
		
	ArrayList list = new ArrayList<>();
		
	list.add("welcome");		
	list.add(10);
	list.add(10.5);
	list.add(true);
	list.add('A');
	
	//Find size of array list
	
	
	for (Object object : list) {
		System.out.println(object);
		
	}
	}
}
