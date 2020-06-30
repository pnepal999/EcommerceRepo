package com.ecom.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.HomePage;
import com.ecom.qa.pages.LoginPage;
import com.ecom.qa.pages.MyAccountPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	HomePage homepage;


	HomePageTest(){
		super();
		}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		myaccountpage = loginpage.login(prop.getProperty("usernam"), prop.getProperty("passwoard"));
		homepage = new HomePage();
		myaccountpage.ClickOnHomeLink();
		}
	@Test(priority=1)
	public void validatehomepagetitleTest() {
		String hometitle = homepage.validateHomeTitle();
		Assert.assertEquals(hometitle, "My Store","Failed reason :page title not match");
	}
	@Test(priority=2)
	public void clickonTshortImage() {
		homepage.Tshortclick();
		}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
