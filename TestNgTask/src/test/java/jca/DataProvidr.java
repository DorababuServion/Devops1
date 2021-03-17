package jca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidr  {
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
	
	
	@Test(dataProvider = "sampledata")
	private void tc1(String data1, String data2) {
		// TODO Auto-generated method stub

		
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(data1);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(data2);
	}
	
	@DataProvider(name="sampledata")
	public Object[][] data(){
		 return new Object[][] {
			 {"java","java@123"},
			 {"selenium","selenium@123"},
			 
			 
			 
			 {"dorababu","dora@123"}
			  
		 };
		
	}
	
	@Test
	private void qui() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	
	
	
	

}
