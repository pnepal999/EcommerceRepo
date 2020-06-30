package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class CreateAccountPage extends TestBase{
	
	@FindBy(xpath = "//input[@name='email_create']")
	WebElement EmailAddress;
	
	@FindBy(xpath = "//i[@class='icon-user left']")
	WebElement CreateAnAccount;
	
	public CreateAccountPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonloginforSignup() {
		EmailAddress.sendKeys("");
		CreateAnAccount.click();
		
		
	}

}
