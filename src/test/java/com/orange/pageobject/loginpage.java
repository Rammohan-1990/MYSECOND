package com.orange.pageobject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class loginpage{
	
	public  WebDriver ldriver;
	 
	public loginpage ( WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver,this);
	}
	
	
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By login = By.id("btnLogin");
	By logo= By.xpath("//img[@alt='OrangeHRM']");

	
	
	
	
	
	public void setusername(String uname) {
		ldriver.findElement(username).sendKeys(uname);
	}
	
	
	public void setpassword(String pwd) {
		ldriver.findElement(password).sendKeys(pwd);
	}

	
	
	public void clickonlogin() {
		ldriver.findElement( login).click();
	}

	public void getlogo() {
   boolean log =ldriver.findElement(logo).isDisplayed();
    
	}
	
}
