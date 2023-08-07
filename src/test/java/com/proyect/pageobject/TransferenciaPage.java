package com.proyect.pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.project.pom.banco.gye.BaseClass;

public class TransferenciaPage extends BaseClass{
	

	// Link Para creación de una cuenta 
	By createAcountLinkLocator = By.linkText("Open New Account");
	By comboboxAcount = By.id("type");
	
	// Boton para crear cuenta
	By createAcountoBtnLocator = By.cssSelector("input[type='submit'][value ='Open New Account']"); 
	
			
	// Link para Transferencia de cuentas
	By transferAcountLinkLocator = By.linkText("Transfer Funds");
	
	// Campo de ingreso de valor de dinero
	By amounttransferlocator = By.id("amount");
	
	// Combos de seleccion de cuentas
	By comboboxTrfFromAcount = By.id("fromAccountId");
	By comboboxTrfToAcount = By.id("toAccountId");
	
	// Boton para transferir dinero a cuentas
	By transferAcountoBtnLocator = By.cssSelector("input[type='submit'][value ='Transfer']"); 
	
	
	// Mensajes de confirmacion 
	By msjCreateAcountConfirmlocator = By.xpath("//*[@id='rightPanel']/div/div/h1"); 
	By msjTransferAcountConfirmlocator = By.xpath("//*[@id=\'rightPanel\']/div/div/h1");
	
	public TransferenciaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void createAcount () throws InterruptedException {
		
		// Link para ingresar a la pantalla de creacion de cuentas
		click(createAcountLinkLocator);
		Thread.sleep(3000);
		
		// Seleccionar el elemento del combo box
		
		Select selectList = new Select(findElement(comboboxAcount));
		selectList.selectByVisibleText("SAVINGS");
		selectList.selectByIndex(1);
		
		click(createAcountoBtnLocator);
				
	}

	public void transferAcount() throws InterruptedException {
		
		// Link para ingresar a la pantalla de transferencia
		click(transferAcountLinkLocator);
		Thread.sleep(3000);
		
		type("65",amounttransferlocator);
		
		// Seleccionar el elemento del combo box From acount
		Select selectListFrom = new Select(findElement(comboboxTrfFromAcount));
		selectListFrom.selectByVisibleText("19782");
		selectListFrom.selectByIndex(1);
		
		// Seleccionar el elemento del combo box To acount
		Select selectListTo = new Select(findElement(comboboxTrfToAcount));
		selectListTo.selectByVisibleText("20004");
		selectListTo.selectByIndex(1);
		
		// Boton de transferencia
		click(transferAcountoBtnLocator);
		
		
	}
	
	public boolean mensajedeCreaciónCuenta() {
		
		return isDisplayed(msjCreateAcountConfirmlocator);

		}
	
	
	public boolean mensajedeTransferCuenta() {
		
		return isDisplayed(msjTransferAcountConfirmlocator);

		}

}
