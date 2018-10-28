package br.ce.web.set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

private static WebDriver driver;
	
	private DriverFactory() {}
	
	public static WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		if(driver == null) {
			switch (Propriedades.browser) {
				case CHROME: driver = new ChromeDriver(); break;
			}
			
		}
		return driver;
	}

	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
