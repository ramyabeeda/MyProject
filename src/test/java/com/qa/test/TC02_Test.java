package com.qa.test;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.page.LeavePage;
import com.qa.page.LoginPage;

public class TC02_Test extends TestBase{
	
	@Test(priority=1)
	public void test1()
	{
	
	LoginPage lp = new LoginPage(driver);
	lp.login("Admin","admin123");
	
	}
	
	//@Test(priority=2)
	public void leaveForm() {
		
		LeavePage lp = new LeavePage(driver);
		
		lp.leaveList("01-02-2023","02-02-2023","ramya");
	}
	
	

}
