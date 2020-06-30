package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;

public class ConfirmedOrderPage extends TestBase{
	
	
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	WebElement ConfirmedMyOrder;
	
	public ConfirmedOrderPage() {
		PageFactory.initElements(driver, this);
	}
	public OrderConfirmationPage VerifyConfirmedMyOrderLink() {
		ConfirmedMyOrder.click();
		return new OrderConfirmationPage();
		
	}
	
	
}
