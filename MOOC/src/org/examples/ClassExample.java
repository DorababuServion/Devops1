package org.examples;

public class ClassExample {
	
	private void studentid(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);

	}
	
	private void studentName(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);

	}
	
	private void studentPlace(String place) {
		// TODO Auto-generated method stub
		System.out.println(place);

	}
	
	private void studentMOb(Long mob) {
		// TODO Auto-generated method stub
		System.out.println(mob);
	}
	public static void main(String[] args) {
		ClassExample e = new ClassExample();
		e.studentid(200);
		e.studentid(3000);
		e.studentName("Dorababu");
		e.studentPlace("Hyderabad");
		e.studentMOb(9491945424l);
		
		ClassExample e1 = new ClassExample();
		e1.studentid(200);
		e1.studentid(3000);
		e1.studentName("Dorababu");
		e1.studentPlace("Hyderabad");
		e1.studentMOb(9491945424l);
	}
	
	
	
}
