package com.bancopruebas;

import java.util.List;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrodeusuarioTest {

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
		//driver.quit();
	}

	@Test
	public void testRegistroUsuario() throws InterruptedException {
		
		
		// Boton que direcciona a la pagina de registro 
		
		By registerLinkLocator = By.linkText("Register");
		
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
		//By registroBtnLocator = By.cssSelector("input[value = 'Register']");
		By registroBtnLocator = By.cssSelector("input[type='submit'][value ='Register']");
		
		driver.findElement(registerLinkLocator).click();
		//Thread.sleep(3000);
		
		// Ingreso de datos a los campos 
		
		driver.findElement(firstnameLocator).sendKeys("Jean");
		driver.findElement(lastnameLocator).sendKeys("Merchan");
		driver.findElement(addressLocator).sendKeys("Callejon Cristobal Colon");
		driver.findElement(cityLocator).sendKeys("Guayaquil");
		driver.findElement(stateLocator).sendKeys("Guayas");
		driver.findElement(zipecodeLocator).sendKeys("090408");
		driver.findElement(phoneLocator).sendKeys("0878452645");
		driver.findElement(SSNLocator).sendKeys("45");
		
		// Ingreso de usuario y contraseña
		
		driver.findElement(usernameLocator).sendKeys("JeanMer4");
		driver.findElement(passwordLocator).sendKeys("JEAN1405");
		driver.findElement(repasswordLocator).sendKeys("JEAN1405");
		
		// Evento click en el boton registrar nuevo usuario 
		
		Thread.sleep(3000);
		
		System.out.println("Ingreso a btn registro");
		
		driver.findElement(registroBtnLocator).click();
		
		System.out.println("Salida a btn registro");
	}

	

	
}
