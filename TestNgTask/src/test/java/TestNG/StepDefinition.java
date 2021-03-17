
package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class StepDefinition {

	public static WebDriver driver;
	public static  WebDriver LunchBrowser() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\Downloads\\chromedriver_win32");
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
	
	
	public static void sendKey(WebElement senkey, String data) {
		// TODO Auto-generated method stub
		senkey.sendKeys(data);
	}
	
	public static void click(WebElement click) {
		// TODO Auto-generated method stub
		click.click();
	}
	
	
	
}
