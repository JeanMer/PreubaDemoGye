package com.proyect.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.proyect.pageobject.RegistroUsuarioPag;



public class TestRegistroUsuario {
	
	private WebDriver driver;
	RegistroUsuarioPag registrousuariopag;

	@BeforeMethod
	public void setUp() throws Exception {
		registrousuariopag = new RegistroUsuarioPag(driver);
		driver = registrousuariopag.chromeDriverConnection();
		registrousuariopag.visit("https://parabank.parasoft.com/parabank/index.htm");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		registrousuariopag.registroUsuario();
		Assert.assertEquals("Your account was created successfully. You are now logged in", registrousuariopag.mensajeRegistroExistolocator);
	}

}
