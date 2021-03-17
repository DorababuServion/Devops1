package org.examples;

public class CalExam {
	
	int a;
	int b;
	void add(int a , int b) {
		// TODO Auto-generated method stub
	this.a=a;
		this.b=b;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		
		CalExam c = new CalExam();
		c.add(100, 200);
		c.display();
	}
	

}
