package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img")
	WebElement Tshort;
	
	@FindBy(xpath = "//a[@title='Return to Home']")
	WebElement returnToHome;
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
	WebElement Blouse;
	
	@FindBy(css= "#group_1")
	WebElement Dropdown;
	
	//Select select1 = new Select(day);
	//select1.selectByVisibleText("23")
	

	@FindBy(css= "//a[@title='Proceed to checkout']")
	WebElement proceedToCheckout;
	
	//initilization by page object 
	public HomePage() {
		PageFactory.initElements(driver, this);
		}
	//methods or actions  in home page
	
	public String validateHomeTitle() {
		return driver.getTitle();
	}
	public AddtoCartPage Tshortclick() {
		Tshort.click();
	 return new AddtoCartPage();
	}
	
	
			
}
