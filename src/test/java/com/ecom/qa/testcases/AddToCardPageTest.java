package com.ecom.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.AddtoCartPage;
import com.ecom.qa.pages.HomePage;
import com.ecom.qa.pages.LoginPage;
import com.ecom.qa.pages.MyAccountPage;
import com.ecom.qa.pages.ProceedToCheckOutPage;

public class AddToCardPageTest extends TestBase{
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	HomePage homepage;
	AddtoCartPage addtocartpage;

	AddToCardPageTest(){
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		myaccountpage = loginpage.login(prop.getProperty("usernam"), prop.getProperty("passwoard"));
		homepage = new HomePage();
		myaccountpage.ClickOnHomeLink();
		homepage.Tshortclick();
		addtocartpage = new AddtoCartPage();
	}
	@Test(priority=1)
	public void verifyAddToCartpageTitle() {
		String cardtitle = driver.getTitle();
		Assert.assertEquals(cardtitle,"Faded Short Sleeve T-shirts - My Store", "failed reason: title not match");
    }
	@Test(priority=2)
	public void verifyaddToCartpageButton() {
		addtocartpage.ClickAddtocart();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
