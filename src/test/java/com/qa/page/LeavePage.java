package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
	
	@FindBy(xpath="//span[text()='Leave']")
	WebElement leaveLink;
	
	@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[1]")
	WebElement fromDate;
	
	@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd']([2]")
	WebElement toDate;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement employeeName;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement submitbtn;
	
	public LeavePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	

	public void leaveList(String date,String tdate,String name) {
		leaveLink.click();
		fromDate.sendKeys(date);
		toDate.sendKeys(tdate);
		employeeName.sendKeys(name);
		submitbtn.click();
	
	}

}
