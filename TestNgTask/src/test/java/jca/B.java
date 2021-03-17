package jca;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class B {
	
	
	
	
	@Test
	private void tc1() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\eclipse-workspace\\TestNgTask\\Lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		assertEquals(title.equals("Facebook"), title);
	
		driver.quit();
		
	}
	@Test
	private void tc2() {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\eclipse-workspace\\TestNgTask\\Lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		 
		SoftAssert s = new SoftAssert();
		//assertEquals(title.equals("Facebook"), title);
	
		s.assertEquals(title.endsWith("amazon"), title);
		
		driver.quit();
		
	}
	

}
