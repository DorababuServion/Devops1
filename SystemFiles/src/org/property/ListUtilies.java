package org.property;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListUtilies {
	public static void main(String[] args) {
		
		List li = new LinkedList<>();
		li.add(45);
		li.add("Dorababu");
		li.add("Hyerabad");
		li.add(1993.5);
		li.add(true);
		System.out.println(li.size());
		System.out.println(li.get(4));
		
		List li1 = new ArrayList<>();
		li1.add(45);
		li1.add("Dorababu");
		li1.add("Hyerabad");
		li1.add(1993.5);
		li1.add(true);
		System.out.println(li1);
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		for (Object object : li1) {
			System.out.println(object);
		}
		
		li.remove(3);
		System.out.println(li);
		li.add(3,1993.5);
		System.out.println(li);
		
		li1.set(2, "Software employee");
		System.out.println(li1);
		
		boolean e = li.get(2).equals(li1.get(2));
		
		li.add(e);
		
		System.out.println(li);
		
		
		int i = li.indexOf(li.add(e));
		System.out.println(i);
		
		
		li.addAll(li1);
		System.out.println(li);
		
		System.out.println(li);
		System.out.println();
		li.retainAll(li1);
		System.out.println(li);
		
		
		
		
		
	}
}
