package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class ShippingPage extends TestBase{
	
	@FindBy(css = "#uniform-cgv")
	WebElement CheckBox;
	@FindBy(name ="processCarrier")
	WebElement ProceedToCheckOutShippingPage;
	
	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}
    public void CheckTermsOfService() {
    	CheckBox.click();
    }
    public PaymentPage ProceedtoCheckOutLink() {
    	ProceedToCheckOutShippingPage.click();
    	return new PaymentPage();
    }
	

}
