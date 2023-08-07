package com.bancopruebas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLogin() {
		
		// campos de usuario y contraseña
		System.out.println("Ingreso a btn registro");
		
		By usernameLoginLocator = By.name("username");
		By passwordLoginLocator = By.name("password");
		
		// Boton Login
		By loginBtnLocator = By.cssSelector("input[type='submit'][value ='Log In']");
		
		// Ingreso de usuario y contraseña
		driver.findElement(usernameLoginLocator).sendKeys("JeanMer4");
		driver.findElement(passwordLoginLocator).sendKeys("JEAN1405");
		
		// Evento click en el boton registrar nuevo usuario 
		
		
		System.out.println("Ingreso a btn registro");
		
		driver.findElement(loginBtnLocator).click();
		
		System.out.println("Salida a btn registro");
	}
}
