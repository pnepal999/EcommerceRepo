package com.ecom.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.LoginPage;
import com.ecom.qa.pages.MyAccountPage;
import com.ecom.qa.pages.ShippingPage;

public class MyAccountPageTest extends TestBase{
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	ShippingPage orderhistorypage;

	MyAccountPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();

		loginpage = new LoginPage();
		myaccountpage = loginpage.login(prop.getProperty("usernam"), prop.getProperty("passwoard"));
		orderhistorypage = new ShippingPage();

	}
	@Test(priority=1)
	public void verifyOrderpagetitleTest() {
		String ordertitle= myaccountpage.validateOrderHistoryPage();
		Assert.assertEquals(ordertitle, "My account - My Store","Fail reason: Title page not match");
		
	}
	@Test(priority=2)
	public void verifyUserNameTest() {
		String name = myaccountpage.validateAccountUser();
		Assert.assertEquals(name, "Automation Testing","reason of fail: user name is not match");
	}
	@Test(priority=3)
	public void verifyOrderHistoryLinkTest() {
		orderhistorypage = myaccountpage.clickonOrderhistoryLink();
	}
	@Test(priority=4)
	public void verifyHomelinkTest() {
		myaccountpage.ClickOnHomeLink();
	}




	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
