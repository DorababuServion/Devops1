package examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DemoSite {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\eclipse-workspace\\TestResource\\Drivers\\chromedriver.exe");
		
	//	ChromeOptions co = new ChromeOptions();
	//	co.setHeadless(true);
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FCustomer%2FList");
		
//		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
//		
//		driver.findElement(By.xpath("//a[@class='btn bg-blue']")).click();
//		
		
//		driver.findElement(By.id("Email")).sendKeys("dorababu5424@gmail.com");
//		
//		driver.findElement(By.xpath("//span[@aria-controls='DateOfBirth_dateview']")).click();
//		
//		String month ="September 2020";
//		String data ="15";
		
		
		while(true) {
			
			String text = driver.findElement(By.xpath("//caption")).getText();
			
			if (text.equals(month)) {
				break;
			}else {
				
				driver.findElement(By.xpath("//ca")).click();
			}
			
			driver.findElement(By.xpath(",,,")).click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
