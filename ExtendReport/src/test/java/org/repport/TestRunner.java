package org.repport;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRunner {
	
	
	@BeforeSuite
	private void TestStarts() {
		// TODO Auto-generated method stub
		System.out.println("Test Starts");
	}	
	
	@BeforeTest
	private void OpenBrowser() {
		// TODO Auto-generated method stub
		System.out.println("User should open the browser");
	}
	
	@BeforeClass
	private void OpenUrl() {
		// TODO Auto-generated method stub
		System.out.println("user should open the url");
	}
	@BeforeMethod
	private void modulename() {
		// TODO Auto-generated method stub
		System.out.println("functional testing");
	}
	@Test
	private void tc1() {
		// TODO Auto-generated method stub
		System.out.println("test case 1");
	}
	@Test
	private void tc2() {
		// TODO Auto-generated method stub
		System.out.println("test case 2");
	}
	
	@AfterSuite
	private void TestEnds() {
		// TODO Auto-generated method stub
		System.out.println("Test Ends");
	}	
	
	@AfterTest
	private void CloseBrowser() {
		// TODO Auto-generated method stub
		System.out.println("User should close the browser");
	}
	
	@AfterClass
	private void close() {
		// TODO Auto-generated method stub
		System.out.println("user should open the url");
	}
	@AfterMethod
	private void modulename1() {
		// TODO Auto-generated method stub
		System.out.println("end functional testing");
	}
	

}
