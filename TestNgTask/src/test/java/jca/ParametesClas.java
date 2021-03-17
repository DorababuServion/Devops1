package jca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametesClas {
	
	public WebDriver driver;
	
	
	@BeforeTest
	private void lunchbrowser() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\eclipse-workspace\\TestNgTask\\Lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
	}
	
	@BeforeClass
	private void maxwin() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
	}
	@Parameters({"email","pass"})
	@Test
	private void tc1(String data1, String data2) {
		// TODO Auto-generated method stub

		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(data1);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(data2);
	}

}
