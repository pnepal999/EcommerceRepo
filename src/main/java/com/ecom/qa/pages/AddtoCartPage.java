package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class AddtoCartPage extends TestBase {
	
	@FindBy(xpath = "//a[@name='Orange']")
	WebElement OrgColour;
	
	@FindBy(xpath = "//p[@id='add_to_cart']")
	WebElement addToCard;
	
	@FindBy(xpath = "//a[@title='Return to Home']")
	WebElement returnToHome;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement ProceedToCheckout;
	
	//initilazation of web page
	public AddtoCartPage(){
		PageFactory.initElements(driver, this);
	}
	//methods or actions
	public void SelectColour() {
		OrgColour.click();
		//return new AddToCartPage();
	}
	 public ProceedToCheckOutPage ClickAddtocart() {
		 addToCard.click();
		 return new ProceedToCheckOutPage();
	 }
	

}
