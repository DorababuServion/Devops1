package org.examples;

import java.util.Scanner;

public class SwtichCase {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("Aug");
			break;

		default:
			System.out.println("Month is not Found");
			break;
		}
		
		
		
	}

}
