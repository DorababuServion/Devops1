package org.examples;

public class ConExample2 {

	
	public ConExample2(int i) {
		// TODO Auto-generated constructor stub
		System.out.println(i);
	}
	
	public ConExample2(String name) {
		// TODO Auto-generated constructor stub
		System.out.println(name);
	}
	
	public ConExample2(double sal) {
		// TODO Auto-generated constructor stub
		System.out.println(sal);
	}
	
	public ConExample2() {
		this(3939);
		// TODO Auto-generated constructor stub
		System.out.println("this constructor 2");
		
	}
	public static void main(String[] args) {
		
		ConExample2 c1 = new ConExample2();
		
		
	}
	
	
}
