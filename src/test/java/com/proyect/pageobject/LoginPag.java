package com.proyect.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.pom.banco.gye.BaseClass;

public class LoginPag extends BaseClass{
	
			// campos de usuario y contraseña
			
			By usernameLoginLocator = By.name("username");
			By passwordLoginLocator = By.name("password");
			
			// Boton Login
			By loginBtnLocator = By.cssSelector("input[type='submit'][value ='Log In']");
			
			// Mensaje de confirmacion
			
			By mensajeConfirmacionlocator = By.xpath("//*[@id=\'leftPanel\']/h2");

	public LoginPag(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void testLogin() {
		
			if (isDisplayed(usernameLoginLocator)) {
				type("JeanMer8",usernameLoginLocator);
				type("JEAN1405",passwordLoginLocator);
				
			// Boton para loggear en la pantalla
			
				click(loginBtnLocator);
			}else {
				System.out.println("No se pudo loggear");
			}
	}
	
	public boolean paginadeInicio() {
		return isDisplayed(mensajeConfirmacionlocator);
	}
	

}
