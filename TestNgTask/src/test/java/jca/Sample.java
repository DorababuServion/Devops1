package jca;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {

	
	@BeforeSuite
	private void sut() {
		// TODO Auto-generated method stub
		System.out.println("dorababu");
	}
	@BeforeClass
	private void cals() {
		// TODO Auto-generated method stub
		System.out.println("before class");
	}
	
	@BeforeMethod
	private void tmt() {
		// TODO Auto-generated method stub
		System.out.println("before method");
	}
	@BeforeTest
	private void test() {
		// TODO Auto-generated method stub
		System.out.println("beofore test");
	}
	@Test
	
	private void tc1() {
		// TODO Auto-generated method stub
		System.out.println("test one");
	}
	
	@Test
	private void tc2() {
		// TODO Auto-generated method stub
		System.out.println("test case 2");
	}
	
	
}
