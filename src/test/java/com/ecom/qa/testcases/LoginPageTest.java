package com.ecom.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.LoginPage;
import com.ecom.qa.pages.MyAccountPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	
	//below constructor and  super() will call base class constructor for initilization propties 
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();

		loginpage = new LoginPage();
		}
	
	
	
	@Test(priority=1)
	public void LoginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login - My Store");
	}
	@Test(priority =2)
	public void logoImageTest() {
		boolean flag = loginpage.validatelogoimage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority =3)
	public void loginTest() {
		
		myaccountpage =	loginpage.login(prop.getProperty("usernam"), prop.getProperty("passwoard"));
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
