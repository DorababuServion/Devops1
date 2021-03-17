package com.log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;


public class Log4jdemo {

static Logger logger;
	
	@Test(priority = 1)
	public void setup() throws FileNotFoundException, IOException
	{
//	logger=Logger.getLogger("Log4jdemo");  // Provide test ase name/class name as a parameter
	logger = Logger.getLogger(Log4jdemo.class);
	Properties props = new Properties();
	props.load(new FileInputStream("log4j.properties"));
	PropertyConfigurator.configure(props);
	
	logger.info("Setup method is tarted");
	logger.info("Setup method is progress");
	
	//Add configuration steps
	System.out.println("This is setup method");
	}

	@Test(priority = 2)
	public void login()
	{
		logger.info("login is started");
		//Write webdriver code
		System.out.println(" This is login test");
		logger.info("login is progress");
		logger.info("login is completed");
		logger.info("login is passed");
		
	}
	
	@Test(priority = 3)
	public void logout()
	{
		//Write webdriver code
		System.out.println(" This is logout test");
		logger.info("logout is completed");
	}
	
}

