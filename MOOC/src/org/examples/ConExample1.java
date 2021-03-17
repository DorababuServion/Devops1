package org.examples;

public class ConExample1 extends ConExample2 {
	
	public ConExample1() {
		this(94949449l);
		// TODO Auto-generated constructor stub
		System.out.println("This is frist constructor");
		
	}
	
	
	
	public ConExample1(int i) {
		// TODO Auto-generated constructor stub
		super();
		System.out.println(i);
		
	}
	
	public ConExample1(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("Dorababu");
	}
	
	public ConExample1(double sal) {
		// TODO Auto-generated constructor stub
		System.out.println(sal);
	}
	
	public ConExample1(long mob) {
		// TODO Auto-generated constructor stub
		this(9094);
		System.out.println(mob);
	}
	public static void main(String[] args) {
		ConExample1 c = new ConExample1();
		
		
		
	}

}
