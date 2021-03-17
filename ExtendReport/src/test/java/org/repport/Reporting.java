package org.repport;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports Extent;
	public ExtentTest logger;
	
	
	public void onStart(ITestContext testContext) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.ss").format(new Date());
		String repName="Test-Report-"+timeStamp+".html";
		
		htmlReporter=new ExtentHtmlReporter("C:\\Users\\dorababu.c\\eclipse-workspace\\ExtendReport\\test-output\\repname");
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
		Extent=new ExtentReports();
		
		Extent.attachReporter(htmlReporter);
		Extent.setSystemInfo("HostName","LocalHost");
		Extent.setSystemInfo("Enviroment","QA");
		Extent.setSystemInfo("User","Dorababu");
		
		
		htmlReporter.config().setDocumentTitle("Test Cycle");
		htmlReporter.config().setReportName("Functional Test Automation");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
		
		
		
		
	}
	
	public void onTestSuccess(ITestResult tr) {
		logger=Extent.createTest(tr.getName()); // create new entry in th report
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
		
	}
	
	public void onTestSkipped(ITestResult tr) {
		logger=Extent.createTest(tr.getName()); // create new entry in th report
		logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	}

	public void onFinish(ITestContext testContext) {
		Extent.flush();
	}
}
