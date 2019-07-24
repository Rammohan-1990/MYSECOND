package com.orange.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orange.pageobject.loginpage;


public class Test_case_01 extends BASECLASS  {
	
	
	@Test
	public void logintest() throws Exception {
		
	 driver.get(baseurl);
		logger.info("url is opended...........");
	
	
	loginpage log = new loginpage(driver);
	
	log.setusername(username);
	logger.info("user name is given................");
	
	log.setpassword(password);
	logger.info("password is given...................");
	
	log.clickonlogin();
	logger.info("clicked on login button.................");
	
	log.getlogo();
	logger.info("logo is display....................");
	
	 
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
