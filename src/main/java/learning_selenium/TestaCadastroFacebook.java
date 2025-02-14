package learning_selenium;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestaCadastroFacebook {
	
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
	public void preencheDadosUsuario() {
		facebook.preencheNome("Jefferson");
		facebook.preencheSobremome("Sousa");
		facebook.preencheEmail("jefferson.melo@eu.com.br");
		facebook.confirmaEmail("jefferson.melo@eu.com.br");
		facebook.preencheSenha("123456");
		facebook.selecionaDiaNascimento("6");
		facebook.selecionaMesNascimento("Mar");
		facebook.selecionaAnoNascimento("1995");
		facebook.selecionaSexoMasculino();
	}
	
	@After
	public void fecharNavegador() {
		driver.quit();
	}
}
