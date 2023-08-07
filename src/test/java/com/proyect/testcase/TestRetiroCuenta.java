package com.proyect.testcase;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.proyect.pageobject.LoginPag;
import com.proyect.pageobject.RetiroPage;


public class TestRetiroCuenta  {
	
	private WebDriver driver;
	RetiroPage retiropage;
	LoginPag logintpag;

	


	@BeforeMethod
	public void setUp() throws Exception {
		retiropage = new RetiroPage(driver);
		driver = retiropage.chromeDriverConnection();
		retiropage.visit("https://parabank.parasoft.com/parabank/index.htm");

	}

	@AfterMethod
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		//Login 
		logintpag = new LoginPag (driver);
		logintpag.testLogin();
		Thread.sleep(3000);
		Assert.assertTrue(logintpag.paginadeInicio());
		
		// Retiro
		
		retiropage.retiroCuenta();
	}

}
