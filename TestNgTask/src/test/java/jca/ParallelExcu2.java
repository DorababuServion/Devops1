package jca;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelExcu2 {
	
	
public static WebDriver driver;
	
	@Test
	private void tc1() {
		// TODO Auto-generated method stub
		System.out.println("test 1");
	}
	
	@Test
	private void tc2() {
		// TODO Auto-generated method stub
		System.out.println("test 2");
	}
	
	@Test(retryAnalyzer =Failed.class)	
	private void tc3() {
		// TODO Auto-generated method stub
		assertEquals(false, true);
		System.out.println("test 3");
	}
	

}
