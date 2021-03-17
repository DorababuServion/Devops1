
package org.test;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;

public class StepDefinition {

	public static WebDriver driver;
	
	public static  WebDriver LunchBrowser() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\eclipse-workspace\\TestResource\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 return driver;
	}
	
	public static void maxwin(){
		driver.manage().window().maximize();
	}
	
	public static void enterurl(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
	}
	
	
	public static void sendstring(WebElement senkey, String data) {
		// TODO Auto-generated method stub
		senkey.sendKeys(data);
	}
	
	public static void click(WebElement click) {
		// TODO Auto-generated method stub
		click.click();
	}
	
	public static void doubleclick() {
		// TODO Auto-generated method stub
		Actions a = new Actions(driver);
		a.doubleClick().perform();
	}
	
	public static void contextclick() {
		// TODO Auto-generated method stub
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}
	
	public static void selectbytext(WebElement e1,String data) {
		Select s = new Select(e1);
		s.selectByVisibleText(data);
	}
	
	public static void selectbyindex(WebElement e2, int data) {
		Select s = new Select(e2);
		s.selectByIndex(data);
	}
	
	public static void  selectbyvalue(WebElement e3, String data) {
		Select s = new Select(e3);
		s.selectByValue(data);
	}
	
	public static void DragandDrop(WebElement e1 , WebElement e2) {
		// TODO Auto-generated method stub
		Actions a = new Actions(driver);
		a.dragAndDrop(e1, e2).perform();
	}
	
	public static void excelread(int r , int c) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\dorababu.c\\Documents\\WorkBook.xlsx");
		FileInputStream fil = new FileInputStream(f);
		
		Workbook w = new HSSFWorkbook(fil);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		CellType cellType = cell.getCellType();
	
	}
	public static void takeDisplayshot() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\dorababu.c\\eclipse-workspace\\TestResource\\ScreenShots");
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(f, screenshotAs);
	}
	
	private void scrollup() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("argument.scroll", null);
	}
	public static void windowhandle() {
		// TODO Auto-generated method stub
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(windowHandles);
		driver.switchTo().window(li.get(2));
		}
		
	public static void framebyid(int i) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(i);
	}
	public static void framebyname(String i) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(i);
	}
	
	public static void Staticwait(int i) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(i);
	}	
	
	public static void implicitwait() {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	}
	
	
	public static void alertmethodaccept() {
		// TODO Auto-generated method stub
		Alert a = driver.switchTo().alert();
		a.accept();
		
	}
	

	public static void alertmethodDiss() {
		// TODO Auto-generated method stub
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
