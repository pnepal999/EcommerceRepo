package com.ecom.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;

import com.ecom.qa.pages.LoginPage;
import com.ecom.qa.util.TestUtil;

public class CreateAccountPageTest extends TestBase {

	LoginPage loginpage;
	
	CreateAccountPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
	
        loginpage = new LoginPage();
	}
	
	@DataProvider
	public Object[][] getloginData() {
		Object data [][] = TestUtil.getTestData("login");
		return data;
		
     }
	
	
	@Test(dataProvider ="getloginData")
	public void CreateAnAccountPageTest(String un, String pwd) {
		 loginpage.login(un, pwd);
		
		//createaccountpage.ClickonloginforSignup();
		
		
	}
	
}
