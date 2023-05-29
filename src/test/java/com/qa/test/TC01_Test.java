package com.qa.test;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.page.AdminPage;
import com.qa.page.LeavePage;
import com.qa.page.LoginPage;
import com.qa.page.PIMPage;
import com.qa.page.Recruitment;


public class TC01_Test extends TestBase{
	

	
	@Test(priority=1)
	public void test1()
	{
	
	LoginPage lp = new LoginPage(driver);
	lp.login("Admin","admin123");
	
	}
	
	    @Test(priority=2)
	    public void checkUserRole() {
		AdminPage ap = new AdminPage(driver);
		
		ap.moveToUserPage();
	    ap.userAndEmployeeName("Admin", "Ho Toan");
	}
	    
	    @Test(priority=3)
	    public void selectingPIMPage() {
	    	PIMPage pim = new PIMPage(driver);
	    	pim.pimlink("AaliyahHaq", "0038", "Odis Adalwin");
	    }
	    
	    @Test(priority=4)
	    public void recruitmentOfEmployee() {
	    	
	    	Recruitment recruitment = new Recruitment(driver);
	    	recruitment.candidateInformation();
	    	
	    	
	    }
	    
	   	

}
