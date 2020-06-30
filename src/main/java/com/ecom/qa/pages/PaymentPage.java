package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class PaymentPage extends TestBase{
	
	@FindBy(css= ".bankwire")
	WebElement PayByBank;
	
	public PaymentPage(){
		PageFactory.initElements(driver, this);
	}
	
	public ConfirmedOrderPage VerifyPayByBankLink() {
		PayByBank.click();
		return new ConfirmedOrderPage();
	}

}
