package org.mob;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {

	@BeforeSuite
	private void start() {
		// TODO Auto-generated method stub
		System.out.println("automation starts");
	}
	
	@BeforeClass
	
	private void lunchbrowser() {
		// TODO Auto-generated method stub
		System.out.println("lunch browser");
	}
	
	@BeforeTest
	private void sysou() {
		// TODO Auto-generated method stub
		System.out.println("max browser");
	}
	
	@Test
	
	private void tc1() {
		// TODO Auto-generated method stub
		System.out.println("test case 1");
	}
}
