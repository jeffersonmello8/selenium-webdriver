package learning_selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimeirosPassosComFirefox {
	WebDriver driver;

	@Before
	public void PreCondicao() {
		System.setProperty("webdriver.gecko.driver", "C:\\tools\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com.br");
		driver.manage().window().maximize();
	}
	
	@Test
	public void teste() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@After
	public void posCondicao() {
		driver.quit();
	}
}
