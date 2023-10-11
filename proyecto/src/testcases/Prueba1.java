package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import metodosUtiles.utiles;
import navegadores.Drivers;

public class Prueba1 {
	WebDriver driver;
	
	@BeforeMethod()
	public void precondicion() {
		driver=Drivers.conectar();
		utiles.reportes("Ir a pagina de Assist-365");
		driver.get("https://assist-365.com/ar");
		
	}
	@AfterMethod()
	public void postcondicion() {
		utiles.reportes("Cerrar navegador");
		driver.close();
	}
	
	@Test(description = "Seleccionar europa en el selector de destino en Assist-365")
	public void SeleccionarEuropaDestino() throws Exception{
		
		utiles.reportes("Ir al selecctor de destino");
		WebElement selector = driver.findElement(By.xpath("//div[@class='m-0 px-4 pb-1 pt-2']"));
	
		utiles.reportes("El selector se muestra");
		Assert.assertTrue(selector.isDisplayed());
		
		utiles.reportes("Se seleccionas europa como pais");
		selector.sendKeys("Europa");
	}
	
}
