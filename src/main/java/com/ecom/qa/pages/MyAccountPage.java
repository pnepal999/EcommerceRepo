package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class MyAccountPage extends TestBase {
	
	@FindBy(xpath="//a[@class='account']")
	WebElement customerName;
	
	@FindBy(xpath= "//i[@class='icon-list-ol']")
	WebElement orderhistoryDetails;
	
	
	@FindBy(xpath="//i[@class='icon-chevron-left']")
	WebElement home;
	
	//now initilize page class by page factory
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	//now methods 
	
	public String validateAccountUser() {
		return customerName.getText();
	}
	
	public ShippingPage clickonOrderhistoryLink() {
		orderhistoryDetails.click();
		return new ShippingPage();
	}
	public String validateOrderHistoryPage() {
		return driver.getTitle();
	}
  
   public HomePage ClickOnHomeLink() {
	   home.click();
	   return new HomePage();
   }
  
}
