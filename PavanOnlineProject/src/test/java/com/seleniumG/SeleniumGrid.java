package com.seleniumG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	
	WebDriver driver;
	
	@Test
	private void setup() throws MalformedURLException {
		// TODO Auto-generated method stub
		String URL ="http://facebook.com";
		String node = "http://192.168.13.1:4444/wd/hub";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\eclipse-workspace\\TestResource\\Drivers\\chromedriver.exe");
		DesiredCapabilities dc = new DesiredCapabilities().chrome();
		dc.setBrowserName("firfox");
		dc.setPlatform(Platform.LINUX);
		driver = new RemoteWebDriver(new URL(node),dc);
		driver.get(URL);
		
		
	}

}
