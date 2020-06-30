package com.ecom.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.AddressPage;
import com.ecom.qa.pages.AddtoCartPage;
import com.ecom.qa.pages.HomePage;
import com.ecom.qa.pages.LoginPage;
import com.ecom.qa.pages.MyAccountPage;
import com.ecom.qa.pages.PaymentPage;
import com.ecom.qa.pages.ProceedToCheckOutPage;
import com.ecom.qa.pages.ShippingPage;
import com.ecom.qa.pages.SummeryPage;

public class PaymentPageTest extends TestBase{

	LoginPage loginpage;
	MyAccountPage myaccountpage;
	HomePage homepage;
	AddtoCartPage addtocartpage;
	ProceedToCheckOutPage proceedtocheckoutPage;
	SummeryPage summerypage;
	AddressPage addresspage;
	ShippingPage shippingpage;
	PaymentPage paymentpage;

	PaymentPageTest(){
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
		proceedtocheckoutPage.proceedToCheckoutClick();
		summerypage = new SummeryPage();
		summerypage.ClickOnCheckOutLinkpage();
		addresspage = new AddressPage();
		addresspage.ClickOnProceedToCheckoutbutton();
		shippingpage = new ShippingPage();
		shippingpage.CheckTermsOfService();
		shippingpage.ProceedtoCheckOutLink();
		paymentpage= new PaymentPage();
	}
@Test
public void VerifyClickOnConfirmedMyOrderPageTest() {
	paymentpage.VerifyPayByBankLink();

}
@AfterMethod
public void teardown() { 
	driver.quit(); }

	
}
