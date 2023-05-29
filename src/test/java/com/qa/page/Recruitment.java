package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Recruitment {
	
	@FindBy(xpath="//span[text()='Recruitment']")
	WebElement recruitmentLink;
	

	
	public Recruitment(WebDriver driver) {
		
     PageFactory.initElements(driver, this);
	}
	


	public void candidateInformation() {

		recruitmentLink.click();
		
		
	}

}
