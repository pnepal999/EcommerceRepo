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

public class ProceedToCheckOutPageTest extends TestBase {

	LoginPage loginpage;
	MyAccountPage myaccountpage;
	HomePage homepage;
	AddtoCartPage addtocartpage;
	ProceedToCheckOutPage proceedtocheckoutPage;

	ProceedToCheckOutPageTest(){
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
		addtocartpage.ClickAddtocart();
		proceedtocheckoutPage = new ProceedToCheckOutPage();

	}
	@Test(priority=1)
	public void validatecolourofTshort() {
		String colourOfTshort= proceedtocheckoutPage.verifyText();
		Assert.assertEquals(colourOfTshort, "Orange, S", "failed-colour not found");
	}
	@Test(priority=2)
	public void VerifyProceedToCheckOutButton() {
		proceedtocheckoutPage.proceedToCheckoutClick();
	}

	@AfterMethod
	public void teardown() { 
		driver.quit(); }

}