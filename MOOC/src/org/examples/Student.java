package org.examples;

public class Student {
	int id ;
	String name;
	private void insertRecord(int i ,String M) {
		// TODO Auto-generated method stub
		id =i;
		name =M;
	}
	
	private void displayInfromation() {
		// TODO Auto-generated method stub
		System.out.println(id + "   "+ name);	
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		Student s1 = new Student();	
		s.insertRecord(200,"Dorababu");
		s.displayInfromation();
		s1.insertRecord(4000,"Chodavarapu");
		s1.displayInfromation();
	}

}
