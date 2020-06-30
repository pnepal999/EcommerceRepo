package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class SummeryPage extends TestBase{
	
	@FindBy(xpath="//h3[contains(text(),'Delivery address')]")
	WebElement DeleveryAddText;
	@FindBy (linkText= "Proceed to checkout")
	WebElement CheckOut;
	
	public SummeryPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String  ValidatetitleofSummeryPage() {
		return driver.getTitle();
	}
	public String verifyDeleveryAddressText() {
		return DeleveryAddText.getText();
		}
	public AddressPage ClickOnCheckOutLinkpage() {
		CheckOut.click();
		return new AddressPage();
	}
}
