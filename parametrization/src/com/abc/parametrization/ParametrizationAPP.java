package com.abc.parametrization;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ParametrizationAPP 
{
	WebDriver driver;
	@BeforeMethod
	public void openChromeBrowser()
	{
		driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 
	 
	}
	 
	
	 @Test(parameters= {"email","password"})
	 public void magentoTest(String email,String password)
	 {
		 System.out.println("The email is:"+email);
	     System.out.println("The password :"+password);
	 
	 
	 }
	 @AfterMethod
	 public void closeBrowser()
	 {
		 driver.quit();
	 }
	 
		 
		 
		 
	}
	
	 