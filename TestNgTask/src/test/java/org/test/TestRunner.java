package org.test;

import org.apache.commons.math3.analysis.function.Max;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestRunner extends StepDefinition {
	
	
	
	
	@BeforeSuite
	private void lunch() {
		// TODO Auto-generated method stub
		LunchBrowser();
	}
	
	@BeforeClass
	private void maxwins() {
		// TODO Auto-generated method stub
		maxwin();
	}
	
	@BeforeTest
	private void geturl() {
		// TODO Auto-generated method stub
		enterurl("https://adactinhotelapp.com/");
	}
	
	
	
		
	
	@Parameters({"email","pass"})
	@Test(groups = "smoke")
	private void tc3() {
		// TODO Auto-generated method stub
		Login l = new Login();
		sendstring(l.getUsername(),"email");
		sendstring(l.getPassword(),"pass");
		click(l.getLogin());
		
	}
	
//	@Test
//	private void tc2() {
//		// TODO Auto-generated method stub
//		SearchHotel sh = new SearchHotel();
//		selectbytext(sh.getLocatio(),"Sydney");
//		selectbytext(sh.getHotel(),"Hotel Creek");
//		selectbytext(sh.getRoomtype(),"Standard");
//		click(sh.getSubmit());
//	
//	}
	
	@Test
	private void tc4() {
		// TODO Auto-generated method stub
		
		
	}
	
	@DataProvider(name ="sampledata")
	public Object[][] data() {
		return new Object[][] {
			{"java",}
		};
	}
	
	
	
	
	
	
	
	
}
	