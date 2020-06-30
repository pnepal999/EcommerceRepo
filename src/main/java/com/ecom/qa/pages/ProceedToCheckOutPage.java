package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class ProceedToCheckOutPage extends TestBase{
	
	@FindBy(xpath= "//span[contains(text(),'Orange, S')]")
	WebElement textorange;
	@FindBy(xpath= "//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckout;
	////span[contains(text(),'Proceed to checkout')]
	
	public ProceedToCheckOutPage(){
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public String verifyText() {
		return textorange.getText();
		}
	
	public SummeryPage proceedToCheckoutClick() {
		proceedToCheckout.click();
		return new SummeryPage();
	}

}
