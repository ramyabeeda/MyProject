package com.qa.utils;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	
	public static ExtentReports generateExtentReport() {
		
		ExtentReports extentReport = new ExtentReports();
		
		File extentReportFile = new File(System.getProperty("user.dir")+"\\test-output\\Extent Report\\extentReport.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
		
		
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("My project Test Automation Results");
		sparkReporter.config().setDocumentTitle("MP Automation Report");
		sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		
		extentReport.attachReporter(sparkReporter);
		
		//extentReport.setSystemInfo("Application URL", "driver.get(\"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\")");
		//extentReport.setSystemInfo("BrowserName", "");
		extentReport.setSystemInfo("Email","Admin");
		extentReport.setSystemInfo("password","admin123");
		extentReport.setSystemInfo("operating System",System.getProperty("os.name"));
		extentReport.setSystemInfo("Username",System.getProperty("user.name"));
		
		extentReport.setSystemInfo("Java version",System.getProperty("java.version"));
		
		return extentReport;
	}

}
