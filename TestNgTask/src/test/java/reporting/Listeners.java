package reporting;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners extends TestListenerAdapter {

	
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void onStart(ITestResult tr) {
		
		htmlreporter = new ExtentHtmlReporter("C:\\Users\\dorababu.c\\eclipse-workspace\\TestResource\\test-output\\MyReport.html");
		htmlreporter.loadXMLConfig("C:\\Users\\dorababu.c\\eclipse-workspace\\TestResource\\Report\\Extent-config.xml");
		
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		extent.setSystemInfo("Host name ", "local host");
		extent.setSystemInfo("enviroment", "QA");
		extent.setSystemInfo("user","pavan");
		extent.setSystemInfo("browser", "chrome");
		extent.setSystemInfo("os","windows");
		
		
		htmlreporter.config().setDocumentTitle("Automation Reoprt");
		htmlreporter.config().setReportName("Functional test report");
		htmlreporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlreporter.config().setTheme(Theme.STANDARD);
		
		
	}
	
	public void onTestSuccess(ITestResult tr) {
		
		
	}
	
	
	public void onTestFailure(ITestResult tr) {
		
		
		
		
	}
	
	public void onTestSkipped() {
		
	}
}
