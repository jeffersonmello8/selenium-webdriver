package learning_selenium;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestaLoginFacebook {
	private static CadastroFacebookPage facebook;
	private static WebDriver driver;
	
	@BeforeClass
	public static void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		facebook = new CadastroFacebookPage(driver);
	}
	
	@Test
	public void deveEntrarComLoginCorreto() {
		facebook.deveLogarComo("jromario8@outlook.com", "mudei");
	}
	
	@Test
	public void naoDeveEntrarComLoginIncorreto() {
		facebook.deveLogarComo("jromario@outlook.com", "mudei");
	}
	
	@Test
	public void naoDeveEntrarComSenhaErrada() {
		facebook.deveLogarComo("jromario8@outlook.com", "uhaeiuha");
	}
	
	@Test
	public void naoDeveEntrarSemSenha() {
		facebook.deveLogarComo("jromario8@outlook.com", "");
	}
	
	@After
	public void fecharNavegador() {
		driver.quit();
	}
	
}
