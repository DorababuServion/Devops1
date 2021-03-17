package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleDemo {

	public static void main(String[] args) {
		 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\eclipse-workspace\\TestResource\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://auth-api-sso.dev.pg.alphastreet.io/login?redirect_uri=https%3A%2F%2Fapps.dev.pg.alphastreet.io&response_type=code&client_id=730fa3ilqiq7do8qtb1h391j8u&state=O8qyxsw1hNoDw3ncrr99KErqFulacIRX&scope=");
		
		WebElement e11 = driver.findElement(By.id("signInFormUsername"));
		String text = e11.getText();
		System.out.println(text);
		
		JavascriptExecutor ja = (JavascriptExecutor) driver;
		
		ja.executeScript("arguments[0].value='Avinash Mishra';", e11);
		
	}
}
