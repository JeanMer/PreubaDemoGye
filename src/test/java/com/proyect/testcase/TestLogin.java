package com.proyect.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.proyect.pageobject.LoginPag;



public class TestLogin {
	
	private WebDriver driver;
	LoginPag logintpag;

	@BeforeMethod
	public void setUp() throws Exception {
		logintpag = new LoginPag(driver);
		driver = logintpag.chromeDriverConnection();
		logintpag.visit("https://parabank.parasoft.com/parabank/index.htm");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		logintpag.testLogin();
		Thread.sleep(3000);
		Assert.assertTrue(logintpag.paginadeInicio());
	}

}
