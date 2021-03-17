package reporting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.Login;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logintest {
	
	static WebDriver driver;
	@BeforeClass
	private void setup() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\eclipse-workspace\\TestResource\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");

	}
	@Test
	private void logintest() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("username")).sendKeys("dorababu5424");
		driver.findElement(By.id("password")).sendKeys("Dora@1997");
		driver.findElement(By.id("login")).click();
		Assert.assertEquals(true,false);

	}
	@AfterClass
	private void closebowser() {
		// TODO Auto-generated method stub
		driver.quit();

	}
	@AfterMethod
	public void capturescreen(ITestResult result) throws IOException {
		File f = new File("C:\\Users\\dorababu.c\\eclipse-workspace\\TestResource\\ScreenShots\\org.png");
		TakesScreenshot tk = (TakesScreenshot) driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(f, screenshotAs);
		System.out.println("screenshot catured");
	}
	
	
}
