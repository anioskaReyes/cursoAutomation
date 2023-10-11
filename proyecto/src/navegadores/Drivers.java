package navegadores;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import metodosUtiles.utiles;

public class Drivers {
		public static WebDriver conectar() {
			utiles.reportes("Se abre Navegador"); //Llama a la clase utiles
			System.setProperty("webdriver.chrome.driver", "C:/Drivers/chrome/chromedriver.exe");
			//System llama al drive de chrome para que puedas acceder al navegador
			WebDriver driver = new ChromeDriver();//Este abre la pagina
			return driver; // Devuelve el resultado de lo que pedi en la linea 13,11, y 10
		}
	
}
