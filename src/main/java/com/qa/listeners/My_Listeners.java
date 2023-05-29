package com.qa.listeners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.qa.utils.ExtentReport;

public class My_Listeners implements ITestListener{
	
	ExtentReports extentReport;
	ExtentTest extentTest;
	String testName;
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		extentReport = ExtentReport.generateExtentReport();
		
	}


	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 testName = result.getName();
		extentTest = extentReport.createTest(testName);
		extentTest.log(Status.INFO,testName+"started executing");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		extentTest.log(Status.PASS,testName+"got successfully executed");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = null;
		try {
		driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		}catch(IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	
		File srcScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationScreenshotPath = System.getProperty("user.dir")+"\\Screenshot\\"+testName+".png";
		try{
			FileHandler.copy(srcScreenshot,new File(destinationScreenshotPath));
		}catch(IOException e) {
			e.printStackTrace();
		}
		extentTest.addScreenCaptureFromPath(destinationScreenshotPath);
		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.FAIL, testName+"got failed");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.INFO, testName+"got skipped");
		
	}

	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	    extentReport.flush();
	    
	    //*getting test output automatically displayed not opening manually*\\
	    
	    //String pathOfExtentreport = System.getProperty("user.dir"+"\\test-output\\ExtendReport\\extentReport.html");
		//File extentReport = new File(pathOfExtentreport);
	    
		//try{
	     //Desktop.getDesktop().browse(extentReport.toURI());
	    //}catch(IOException e) {
	     //e.printStackTrace();
	     //}
		
	}

	
	

}
