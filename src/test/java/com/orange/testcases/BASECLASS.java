package com.orange.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orange.utility.Readconfigproperty;

public class BASECLASS {
	
	
	 Readconfigproperty config=new Readconfigproperty ();

		public String baseurl    = config.getApplicationURL();
	    public String username   = config.getusername();
		public String password   =  config.getpassword();
		public static WebDriver driver;
		
		 
		public static Logger logger;
		
		
	  

	    @Test
		@BeforeClass
		@Parameters("browser")
	    public void setup (String browser) {
				 
	       if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",config.getchromedriver());
		   driver= new ChromeDriver();
			 }
	       else  if(browser.equalsIgnoreCase("firefox")) {
	    		System.setProperty("webdriver.gecko.driver",config.getfirefoxdriver());
	    		   driver= new FirefoxDriver();
	    			 }
	       else  if(browser.equalsIgnoreCase("ie")) {
	   		System.setProperty("webdriver.ie.driver",config.getiedriver());
	   		   driver= new InternetExplorerDriver();
	   			 }
	       logger = logger.getLogger("orange2");
			 PropertyConfigurator.configure("log4j.properties");	 	 
			 
		}
	       	   
		 
		   
		@AfterClass
		public void teardown() {
			driver.quit();
		}
		
		
		public void capturescreen( WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File target =new File(System.getProperty("user.dir") + "/screenshots/" + tname + ".png");
		FileUtils.copyFile(source,target);
		System.out.println("screenshot Taken ");
		}
		
		
		
	}



