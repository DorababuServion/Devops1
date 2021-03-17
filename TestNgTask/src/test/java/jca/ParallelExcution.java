package jca;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelExcution {
	
	
	public static WebDriver driver;
	
	@BeforeTest
	private void lunch() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\eclipse-workspace\\TestNgTask\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	
	@Test
	private void amazonwe() {
		// TODO Auto-generated method stub
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	
	

}
