package br.ce.web.set;

import org.junit.Before;

public class BaseTest {


	@Before
	public void setup() throws Exception {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me");
		DriverFactory.getDriver().manage().window().maximize();
	}

	

	
}
