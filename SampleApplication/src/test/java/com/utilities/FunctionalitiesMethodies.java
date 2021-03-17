package com.utilities;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.ui.Select;

public class FunctionalitiesMethodies {
	public static WebDriver driver;
	public static Select s;
	public static WebDriver getdriver() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dorababu.c\\eclipse-workspace\\SampleApplication\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void maxwin() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		
		
	}
	
	public static void quit() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	
	public static void geturl(String data) {
		// TODO Auto-generated method stub
		driver.get(data);
	}	
	
	public static void txtsendkey(WebElement e1 ,String data) {
		// TODO Auto-generated method stub
		e1.sendKeys(data);
	}
	
	public static void click(WebElement e1) {
		// TODO Auto-generated method stub
		e1.click();
	}
	
	public static void selectedbyvisibletext(WebElement e1 , String data) {
		// TODO Auto-generated method stub
		Select s = new Select(e1);
		s.selectByVisibleText(data);
	}
	
	public static void selectbyindex(WebElement e1,int i) {
		// TODO Auto-generated method stub
		Select s = new Select(e1);
		s.selectByIndex(i);
	}
	
	public static void implicitwait() {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void scroldown() throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor j = (JavascriptExecutor) driver;
		for (int i = 0; i < 100; i++) {
			j.executeScript("window.scrollBy(0,50)");
			Thread.sleep(1000);
		}
	}
	public static void takescreenshot() throws IOException {
		// TODO Auto-generated method stub
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File f = new File("C:\\Users\\dorababu.c\\eclipse-workspace\\SampleApplication\\Files");
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, screenshotAs);
	}
	
	public static void GetCurturl() {
		// TODO Auto-generated method stub
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void swtichframe(int id) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(id);
	}
	
	public static void swtichwindow(int i) {
		// TODO Auto-generated method stub
		Set<String> windowHandles = driver.getWindowHandles();
		java.util.List<String> li = new LinkedList<String>();
		li.addAll(li);
		driver.switchTo().window(li.get(i));	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
