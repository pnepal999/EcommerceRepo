package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecom.qa.base.TestBase;

public class OrderConfirmationPage extends TestBase {
	
	@FindBy(xpath="//span[@class='navigation_page']")
	WebElement OrderConfirmationText;
	
	public OrderConfirmationPage(){
		super();
	}
	
	public String ValidateTitlePageOfOrderConfirmationPage() {
		 return driver.getTitle();
		
	}
   public String ValidateOrderConformationText() {
	   OrderConfirmationText.getText();
	   return new String();
   }
   
   
}
