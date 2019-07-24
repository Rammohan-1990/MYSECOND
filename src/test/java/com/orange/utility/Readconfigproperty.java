package com.orange.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfigproperty {
	
	
	
Properties pro;
	
	public  Readconfigproperty() {
		
		File src = new File("./configuration/config.properties");
	
				try {
					FileInputStream fis = new FileInputStream(src);
					pro=new Properties();
					pro.load(fis);	
				}
				catch(Exception e) {
					System.out.println("Exception is "  +e.getMessage());
					
				}
			}
	
	public String getApplicationURL() {
	String url=	pro.getProperty("baseurl");
	return url;
	}
	public String getusername() {
		String name=pro.getProperty("username");
		return name;
		}
	public String getpassword() {
		String pass=pro.getProperty("password");
		return pass;
		}
	public String getchromedriver() {
		String chrome=	pro.getProperty("chrome");
		return chrome;
		}
	public String getfirefoxdriver() {
		String firefox=	pro.getProperty("firefox");
		return firefox;
		}
	public String getiedriver() {
		String ie=	pro.getProperty("ie");
		return ie;
		}
	
	
	
	

}
