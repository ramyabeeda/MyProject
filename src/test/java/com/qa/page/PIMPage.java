package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class PIMPage extends TestBase {
	
	public PIMPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='PIM']")
    public static WebElement pimlink;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	public static WebElement employeeName;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'] )[2]")
	public static WebElement employeeId;
	
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[2]")
	public static WebElement supervisorName;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement searchBtn;
	
	
	public void pimlink(String uname,String id,String name) {
		pimlink.click();
		employeeName.sendKeys(uname);
		employeeId.sendKeys(id);
		supervisorName.sendKeys(name);
		searchBtn.click();
	}
	

}
