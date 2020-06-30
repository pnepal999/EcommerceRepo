package com.ecom.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.ecom.qa.util.TestUtil;
import com.ecom.qa.util.WebEventListner;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListner eventlistner;
	

	public TestBase() {
		try {   
			prop = new Properties();
		FileInputStream fi = new FileInputStream("C:\\Users\\Rupa Acharya\\eclipse-workspace\\AutomationPractice\\src\\main\\java\\com\\ecom\\qa\\config\\Config.properties");

		prop.load(fi);
		}
		catch(Exception e) {
			e.printStackTrace();}
	}
	
	public static void initialization() {
		String broswername = prop.getProperty("broswer");
		
		if(broswername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupa Acharya\\eclipse-workspace\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		else if(broswername.equals("ff")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Rupa Acharya\\eclipse-workspace\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
}
		
		//create object of eventfiringwebdriver
		e_driver = new EventFiringWebDriver(driver);
		eventlistner = new WebEventListner();
		e_driver.register(eventlistner);
		driver= e_driver;
		
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));

	}
}
