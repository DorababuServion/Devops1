package org.mooc;

import java.util.Scanner;

public class FirstProgramme {

	
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,200,2000};
		Scanner s = new Scanner(System.in);
		 
		int num = s.nextInt();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if (i==num) {
				System.out.println("number  found");
				break;
			}else {
				System.out.println("number not found");
			}
		}
		
		
	}
}
