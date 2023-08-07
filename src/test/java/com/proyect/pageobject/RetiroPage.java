package com.proyect.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.project.pom.banco.gye.BaseClass;

public class RetiroPage extends BaseClass{
	
	// Ingreso al link pagina de retiro
	
	By billpayLinkLocator = By.linkText("Bill Pay");
	
	// Campos de ingreso para retiro de cuenta 
	
	By payeenameLocator = By.name("payee.name");
	By payeeaddressstreetLocator = By.name("payee.address.street");
	By payeeaddresscityLocator = By.name("payee.address.city");
	By payeeaddressstateLocator = By.name("payee.address.state");
	By payeeaddresszipCodeLocator = By.name("payee.address.zipCode");
	By payeephoneNumberLocator = By.name("payee.phoneNumber");
	By payeeacountNumberLocator = By.name("payee.accountNumber");
	By verifyAcountLocator = By.name("verifyAccount");
	By amountLocator = By.name("amount");
	By comboSelectAcountLocator = By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[13]/td[2]/select");
	
	// Boton de retiro de cuenta
	
	By SendPaymentBtnLocator = By.cssSelector("input[type='submit'][value='Send Payment']");
	//By registroBtnLocator = By.cssSelector("input[type='submit'][value ='Register']");
	

	// Mensaje de confirmacion
	
	By mensajeConfirmacionRetirolocator = By.xpath("//*[@id= 'rightPanel']/div/div[2]/h1");
	
	public RetiroPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void retiroCuenta() throws InterruptedException  {
		
		// Link para ingresar a la pantalla de pago de facturas
		click(billpayLinkLocator);
		Thread.sleep(3000);
		
		if (isDisplayed(payeenameLocator)) {
			
			type("Juan Mera",payeenameLocator);
			type("Batallon",payeeaddressstreetLocator);
			type("Guayaquil",payeeaddresscityLocator);
			type("Guayas",payeeaddressstateLocator);
			type("784511",payeeaddresszipCodeLocator);
			type("0987454512",payeephoneNumberLocator);
			type("14526",payeeacountNumberLocator);
			type("14526",verifyAcountLocator);
			type("45",amountLocator);
			type("13455",comboSelectAcountLocator);
			
			// Boton para realizar el pago o el retiro de dinero
			click(SendPaymentBtnLocator);
			
			
		}		

	}
	
	public boolean confirmacionRetiro() {
		return isDisplayed(mensajeConfirmacionRetirolocator);
	}

}
