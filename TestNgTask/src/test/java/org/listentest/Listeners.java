package org.listentest;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {
	
	public void onTestStart(ITestResult tr) {
	
		System.out.println("Test Method is Started");
	}
	
	public void onTestSuccess(ITestResult tr) {
		
		System.out.println("Test Method is Test success");
	}
	
	
	public void onTestFailure(ITestResult tr) {
		
		System.out.println("Test Method is test failure");
	}
	
	public void onTestSkipped() {
		
		System.out.println("Test Method is test skipped");
	}
}
