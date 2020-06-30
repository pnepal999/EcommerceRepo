package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class LoginPage extends TestBase{

	//need to define webelement by Page factory (Object Repository)
	/*
	 * @FindBy(xpath="//a[@class='login']") WebElement Signin;// this is for log in
	 * to get sign in page
	 */	
	@FindBy(id = "email")
	WebElement emailaddress;

	@FindBy(id ="passwd")
	WebElement passwd;

	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement singin;

	@FindBy(name="SubmitCreate")
	WebElement CreateAcc;

	@FindBy(xpath ="//img[contains(@class,'logo img-responsive')]")
	WebElement logo;
// now have to initialize above webelement create constructor
	
	//Initilizing pageFactory 
	
	public LoginPage() {
		PageFactory.initElements(driver, this);// we can write instead of this LogeinPage.class which is pointing to current class object 
	}
	
	/*
	 * public SignIn() { Signin.click(); // this is for click on signin page befor
	 * login }
	 */
	//Actions in login page or basic functionality creating different methods
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validatelogoimage() {
		return logo.isDisplayed();
	}
	public MyAccountPage login(String un,String pwd) {
		emailaddress.sendKeys(un);
		passwd.sendKeys(pwd);
		singin.click();
		return new MyAccountPage();
		
		
	}
}
