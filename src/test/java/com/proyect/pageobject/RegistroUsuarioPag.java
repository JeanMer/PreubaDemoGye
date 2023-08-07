package com.proyect.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.pom.banco.gye.BaseClass;

public class RegistroUsuarioPag extends BaseClass {
	
	// Boton que direcciona a la pagina de registro 
	
	By registerLinkLocator = By.linkText("Register");
	By Pageregisterlocator = By.xpath("//*[@id=\'rightPanel\']/h1");
	
	// Campos de ingreso de registro
	
	By firstnameLocator = By.id("customer.firstName");
	By lastnameLocator = By.id("customer.lastName");
	By addressLocator = By.id("customer.address.street");
	By cityLocator = By.id("customer.address.city");
	By stateLocator = By.id("customer.address.state");
	By zipecodeLocator = By.id("customer.address.zipCode");
	By phoneLocator = By.id("customer.phoneNumber");
	By SSNLocator = By.id("customer.ssn");
	
	// campos de usuario y contraseña
	
	By usernameLocator = By.id("customer.username");
	By passwordLocator = By.id("customer.password");
	By repasswordLocator = By.id("repeatedPassword");
	
	// Boton de registro

	By registroBtnLocator = By.cssSelector("input[type='submit'][value ='Register']");
	
	// Mensaje de Registro Existoso
	
	public By mensajeRegistroExistolocator = By.xpath("//*[@id='rightPanel']/p");

	public RegistroUsuarioPag(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registroUsuario() throws InterruptedException {
		click(registerLinkLocator);
		Thread.sleep(3000);
		
		if (isDisplayed(firstnameLocator)) {
			
			type("Jean",firstnameLocator);
			type("Merchan",lastnameLocator);
			type("Callejon Cristobal Colon",addressLocator);
			type("Guayaquil",cityLocator);
			type("Guayas",stateLocator);
			type("090408",zipecodeLocator);
			type("0878452645",phoneLocator);
			type("45",SSNLocator);
			
			type("JeanMer8",usernameLocator);
			type("JEAN1405",passwordLocator);
			type("JEAN1405",repasswordLocator);
			
			click(registroBtnLocator);
		}else {
			System.out.println("Pagina No Encontrada");
		}
		
	}
	
	public boolean mensajedeRegistro() {
		
		return isDisplayed(mensajeRegistroExistolocator);

		}
	}
	


