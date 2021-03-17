package org.examples;

public class ByRefereance {

	int x;
	public void addition(ByRefereance a) {
		// TODO Auto-generated method stub
		x = a.x+5;
		System.out.println(x);
	}
	public static void main(String[] args) {
		ByRefereance  r= new ByRefereance();
		r.x=10;
		r.addition(r);
		r.x=1000;
		r.addition(r);
		System.out.println(r.x);
	}
	
}
