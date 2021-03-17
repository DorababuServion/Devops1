package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\Downloads\\chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/tabs");
		
	}

}
