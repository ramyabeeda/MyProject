package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class AdminPage extends TestBase {
	
	public AdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(linkText="Admin")
	public static WebElement adminLink;
	
	@FindBy(xpath="//span[text()='User Management ']")
	public static WebElement userManagementLink;
	
	@FindBy(linkText="Users")
	public static WebElement usersLink;
	
	@FindBy(xpath="(//*[@class='oxd-input oxd-input--active'])[2]")
	public static WebElement userName;
	
	@FindBy(xpath="//div[@class='oxd-select-text-input'][normalize-space()='ESS']")
	public static WebElement userRole;
	
	@FindBy(xpath="(//*[@class='oxd-select-text-input'])[2]")
	public static WebElement userStatus;
	 
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	public static WebElement employeeName;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement searchButton;
	
	
	
	
	
	
	public void moveToUserPage() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(adminLink);
		actions.click().build().perform();
		userManagementLink.click();
		usersLink.click();
		
	}
	

	public void userAndEmployeeName(String name, String uname) {
		
		 userName.sendKeys(name);
			employeeName.sendKeys(uname);
			
			searchButton.click();
		
	}
	 
	

}
