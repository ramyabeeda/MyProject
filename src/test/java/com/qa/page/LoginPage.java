package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	public static WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	public static WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement submitbtn;
	
	public void login(String user,String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		submitbtn.click();
	}
	

}
