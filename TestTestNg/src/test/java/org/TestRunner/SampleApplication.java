package org.TestRunner;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class SampleApplication {
	

	@BeforeTest
	private void lunchbrowser() {
		// TODO Auto-generated method stub
		System.out.println("System shhould open browser");
	}
	
	@BeforeClass
	private void browsermix() {
		// TODO Auto-generated method stub
		System.out.println("System should shoulf maxbrowser");
	}
	
	@BeforeTest
	private void browserquit() {
		// TODO Auto-generated method stub
		System.out.println("system should quit the browser");
	}
	
	
	@Test
	private void tc1() {
		// TODO Auto-generated method stub
		System.out.println("test case 1");
	}
	@Test
	private void tc2() {
		// TODO Auto-generated method stub
		System.out.println("testcase 2");
	}
}
