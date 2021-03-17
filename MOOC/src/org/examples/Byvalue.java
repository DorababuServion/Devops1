package org.examples;

public class Byvalue {
	
	
	int x;
	 void addition(int a) {
		// TODO Auto-generated method stub
		 x=a+5;
	//	 System.out.println(x);
	}
	 
	 
		
	 public static void main(String[] args) {
		
		 Byvalue b = new Byvalue();
		 b.addition(10);
		 System.out.println(b.x);
		 
	}
	  
	 
	 

}
