package org.test;

import org.openqa.selenium.By;

public class Sample extends StepDefinition  {
	
	
	public static void main(String[] args) {
		
		PojoClass p = new PojoClass();
		
		LunchBrowser();
		
		maxwin();
		
		enterurl("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("dorababu5424@");
		driver.findElement(By.id("password")).sendKeys("Dora@1997");
		
		driver.findElement(By.id("login")).click();
	
		
		
	}

}
