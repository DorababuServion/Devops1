package org.test1;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\Downloads\\chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys("hp laptpo");
		WebElement findElement1 = driver.findElement(By.id("nav-search-submit-button"));
		findElement1.click();
		
		WebElement cl = driver.findElement(By.id("mail"));
		
		cl.sendKeys(args);
		cl.click();
		///action class
		Actions a = new Actions(driver);
		a.click();
		a.click(findElement1);
		a.contextClick().perform();;
		a.clickAndHold();
		a.doubleClick().perform();;
		a.dragAndDrop(findElement, findElement1);
	//frames
		
	driver.manage().window().maximize();
	//frames
	driver.switchTo().frame(2);
	driver.switchTo().frame("frame");
	driver.switchTo().parentFrame(); //3
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//div[@class='sdjhsd']"));
	
	
	
	///java scriptexecutor
		
	WebElement cros = driver.findElement(By.xpath("//dic[@clas='fff']"));
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("argument[0].setattrubite('value','hello')",cros);
	 js.executeScript("argument[0].click()", cros);
	 
	 js.executeScript("argument[0].scrollintoview(true)", cros);
	 ///
	 /////select
	 Select s = new Select(cros);
	 s.selectByIndex(9);
	 s.selectByValue(null);
	 s.selectByVisibleText(null);
	 List<WebElement> options = s.getOptions();
	 WebElement webElement = options.get(3);
	 String text = webElement.getText();
	 
	 ///static and dynamic wait
	 Thread.sleep(5000);
	//intreputed expection
	 // implicait wait and explictwait
	 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	 
	 
	 ////tagnames--webtables
	 
	 WebElement tage = driver.findElement(By.tagName("tr"));
	 for (WebElement tagnt : tage) {
		 WebElement tagee = tagnt.findElement(By.tagName("td"));
		 for (WebElement webElement2 : options) {
			
		 }
		 
	}
	
	 
	 /////swtichwindows
	 String windowHandle = driver.getWindowHandle();
	 driver.switchTo().window(windowHandle);
	 
	 //dual windows
	 Set<String> windowHandles = driver.getWindowHandles();
	 List li = new ArrayList();
	 li.add(windowHandles);
	 
	 driver.switchTo().window(li.get(4));
	 
	 driver.switchTo().window(windowHandle)
	 
	 //no suchelement expection
//	is due to accessing an element which no availbe on page
//	webelemt no present
//	due to wait probm
//	not swtich into fram
//	not swtich into window
//	not maxinize window
//	 
	 
	 //browser operations
	 driver.manage().deleteAllCookies();
	 
	 Dimension d = new Dimension(500,500);
	 driver.manage().window().setSize(d);
	 
	 Point p = new Point(250,250);
	 driver.manage().window().setPosition(p);
	 
	 
	 
	 ///data packer clender
	 while(true) {
	 String text2 = driver.findElement(By.id("dlk")).getText();
	 
	 if (text2.equals("jan")) {
		break;
	}else {
		driver.findElement(By.id("mlk")).click();
	}
	 }
	 ///getsize
	 
	 //sendkwyoperations
	 WebElement x = driver.findElement(By.id("mlk"));
	 x.sendKeys(Keys.CONTROL,"ac");
	 x.sendKeys(Keys.CONTROL,"v");
	 
	 
	 ////robot keys 
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_1);
	 r.keyRelease(KeyEvent.VK_1);
	 
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	
	 
	 //alert
	 
	 Alert a = driver.switchTo().alert();
	 a.accept();
	 a.dismiss();
	 a.sendKeys("mlkvfk");
	 a.accept();
	 ////
	 
	 cros.sendKeys("nknv",Keys.ENTER);
	 ////
	 
	 //FrameWorks
	 //Data Driven 
	 
	 File f = new File("");
	 
	 FileInputStream fil = new FileInputStream(f);
	 
	 Workbook w= new xssfwork();
	Sheet createSheet = w.createSheet();
	Row createRow = createSheet.createRow(4);
	Cell createCell = createRow.createCell(4);
	 createCell.setCellValue("java");
	 
	 FileOutputStream fi = new FileOutputStream(f);
	 w.write(fi);
	 
	 //update 
	 
	 Sheet sheet = w.getSheet("sheet");
	 Row row = sheet.getRow(3);
	 Cell cell = row.getCell(4);
	 String stringCellValue = cell.getStringCellValue();
	 
	 if (stringCellValue.equals("java")) {
		cell.setCellValue("python");
	}
	 FileOutputStream fil2 = new FileOutputStream(f);
	 w.write(fi2);
	 ////
	 
	///Reading data fro excel sheet
	 
	 File f3 = new File("");
	 FileInputStream fil5 = new FileInputStream(f);
	 Workbook w2 = new xssfworkbook(fil5);
	 Sheet sh = w.getSheet("sheet");
	 Row r = sh.getRow(3);
	 Cell c = r.getCell(4);
	 
	 int celltype = c.getCellType();
	 
	 String value ="";
	 if (celltype==1) {
		 value = c.getStringCellValue();
	}else if (DateUtil.isCellDateFormatted(c)) {
			 Date dateCellValue = c.getDateCellValue();
			 SimpleDateFormat s = new SimpleDateFormat("dd-mm-yy");
			 s.format(dateCellValue);
	}else {
		double d = c.getNumericCellValue();
		
		long l = (long)d;
		value = String.valueOf(l);
	}
	 ///pom frame work
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
		
		
		
	}

}
