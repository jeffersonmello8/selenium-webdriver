package learning_selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CadastrandoNoFacebook {

	WebDriver driver;

	@Before
	public void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void cadastroNovoUsuarioFacebook() {
		WebElement nome = driver.findElement(By.id("u_0_m"));
		WebElement sobrenome = driver.findElement(By.id("u_0_o"));
		WebElement email = driver.findElement(By.id("u_0_r"));
		WebElement confirmacaoEmail = driver.findElement(By.id("u_0_u"));
		WebElement senha = driver.findElement(By.id("u_0_w"));
		WebElement comboDia = driver.findElement(By.id("day"));
		WebElement comboMes = driver.findElement(By.id("month"));
		WebElement comboAno = driver.findElement(By.id("year"));
		WebElement radioMasculino = driver.findElement(By.id("u_0_7"));
		WebElement botaoCadastrar = driver.findElement(By.name("websubmit"));
		

		nome.sendKeys("Jamile");
		sobrenome.sendKeys("Lima");
		email.sendKeys("jamilelima8@outlook.com");
		confirmacaoEmail.sendKeys("jamilelima8@outlook.com");
		senha.sendKeys("euamogoiaba");

		Select selectDia = new Select(comboDia);
		selectDia.selectByVisibleText("8");
		Select selectMes = new Select(comboMes);
		selectMes.selectByVisibleText("Abr");
		Select selectAno = new Select(comboAno);
		selectAno.selectByVisibleText("1998");
		
		radioMasculino.click();
		botaoCadastrar.submit();
	}
	
	@Test
	public void verificandoTituloDaPagina() {
		String tituloExistente = driver.getTitle();
		String tituloEsperado = "Facebook – entre ou cadastre-se";
		Assert.assertEquals("O título não tá certo.", tituloExistente, tituloEsperado);
	}

	@After
	public void posCondicao() {
		driver.quit();
	}

}
