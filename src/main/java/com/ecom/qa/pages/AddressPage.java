package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class AddressPage extends TestBase {
	
	@FindBy(xpath ="//h3[contains(text(),'Your delivery address')]")
	WebElement DeliveryAddresstext;
	
	@FindBy(xpath="//button[@name='processAddress']")
	WebElement proceedToCheckoutAddressPage;
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void serarchitems(){
		
	}
	
	public boolean verifyAddressTextPage() {
		 return DeliveryAddresstext.isDisplayed();
		//return DeliveryAddresstext.getText();
	}
	public ShippingPage ClickOnProceedToCheckoutbutton() {
		proceedToCheckoutAddressPage.click();
		return new ShippingPage();
	}
	
}
