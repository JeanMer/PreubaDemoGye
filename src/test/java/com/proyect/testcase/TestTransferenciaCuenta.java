package com.proyect.testcase;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.proyect.pageobject.LoginPag;
import com.proyect.pageobject.TransferenciaPage;


public class TestTransferenciaCuenta  {
	
	private WebDriver driver;
	TransferenciaPage transferenciapage;
	LoginPag logintpag;

	


	@BeforeMethod
	public void setUp() throws Exception {
		transferenciapage = new TransferenciaPage(driver);
		driver = transferenciapage.chromeDriverConnection();
		transferenciapage.visit("https://parabank.parasoft.com/parabank/index.htm");

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
		
		// Creacion de cuenta para transferencias
		
		transferenciapage.createAcount();
		Assert.assertTrue(transferenciapage.mensajedeCreaciónCuenta());
		
		// Transferencias de cuenta
		
		transferenciapage.transferAcount();
		Assert.assertTrue(transferenciapage.mensajedeTransferCuenta());
	}

}
