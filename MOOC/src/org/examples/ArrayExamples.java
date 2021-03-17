package org.examples;

public class ArrayExamples {
	
	public static void main(String[] args) {
		 int [] [] a = new int [2][3];
		 
		 a[0][0] =100;
		 a[0][1]=200;
		 
		 
		 a[1][0] =100;
		 a[1][1]=200; 
		 a[2][0] =100;
		 a[2][1]=200;
		 
		 int l = a.length;
		System.out.println(l);
		System.out.println(a[0].length);
		
	}

}
