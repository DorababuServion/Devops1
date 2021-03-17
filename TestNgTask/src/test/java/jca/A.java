package jca;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A {

	@Test(groups = "smoke")
	private void tc2() {
		// TODO Auto-generated method stub
		System.out.println("test case two");
	}
	
	@Test(groups = "sanity")
	private void tc3() {
		// TODO Auto-generated method stub
		System.out.println("test case three");
	}
	
	@Test(groups = "Regression")
	private void tc4() {
		// TODO Auto-generated method stub
		System.out.println("test case four");
	}
	
	@Test(groups = "smoke")
	private void tc5() {
		// TODO Auto-generated method stub
		System.out.println("test case five");
	}
	
	@Test(groups = "sanity")
	private void tc6() {
		// TODO Auto-generated method stub
		System.out.println("test case six");
	}
	
	@Test(groups = "Regression")
	private void tc7() {
		// TODO Auto-generated method stub
		System.out.println("test case seven");
	}
	@BeforeGroups
	private void grouptes() {
		// TODO Auto-generated method stub
		System.out.println("before group");
	}
	
	@AfterGroups
	private void grouptestaf() {
		// TODO Auto-generated method stub
		System.out.println("after test cases");
	}
	@BeforeMethod
	private void btes() {
		// TODO Auto-generated method stub
		System.out.println("before test");
	}
	
	@AfterMethod
	private void aftest() {
		// TODO Auto-generated method stub
		System.out.println("after test");
	}
}
