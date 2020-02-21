package learning_selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesquisandoNoGoogle {
	
	WebDriver driver;
	
	@Before
	public void preCondicao() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\tools\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com.br");
		driver.manage().window().maximize();
	}
	
	@Test
	public void teste() {
		WebElement caixaPesquisa = driver.findElement(By.name("q"));
		caixaPesquisa.clear();
		caixaPesquisa.sendKeys("search google");
	}
	
	@After
	public void posCondicao() {
		driver.quit();
	}
	

}
