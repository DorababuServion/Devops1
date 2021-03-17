package com.nopcommerce.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.nop.configfile.read.ConfigRead;

public class BaseClass{

	ConfigRead cr = new ConfigRead();
	public String baseURL= cr.getapplicationurl();
	public String username=cr.getusermail();
	public String password=cr.getuserpassword();
	public static WebDriver driver;
	
	public static Logger logger; //Added logger
	
	@BeforeClass
	public void setup()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\eclipse-workspace\\TestResource\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
