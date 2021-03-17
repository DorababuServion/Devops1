package com.internetBanking.Testcases;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.internetBanking.untilites.ReadConfig;


public class BaseClass  {
	
	
	
	public static WebDriver driver;
	public static Logger logger;
	public static ReadConfig  ReadConfig;
	
	@BeforeClass
	public void setup() throws IOException {
		ReadConfig = new ReadConfig();
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",ReadConfig.ChromeFilepath());
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		
		
	
	}
	
	@AfterClass
	public void teardown() {
		// TODO Auto-generated method stub
		driver.quit();
	}

}
