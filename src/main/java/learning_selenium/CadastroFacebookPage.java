package learning_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CadastroFacebookPage {

	WebDriver driver;

	public CadastroFacebookPage(WebDriver driver) {
		this.driver = driver;
	}

	public CadastroFacebookPage preencheNome(String nome) {
		driver.findElement(By.name("firstname")).sendKeys(nome);
		return this;
	}

	public CadastroFacebookPage preencheSobremome(String sobrenome) {
		driver.findElement(By.name("lastname")).sendKeys(sobrenome);
		return this;
	}

	public CadastroFacebookPage preencheEmail(String email) {
		driver.findElement(By.id("u_0_r")).sendKeys(email);
		return this;
	}

	public CadastroFacebookPage confirmaEmail(String email) {
		driver.findElement(By.id("u_0_u")).sendKeys(email);
		return this;
	}

	public CadastroFacebookPage preencheSenha(String senha) {
		driver.findElement(By.id("u_0_w")).sendKeys(senha);
		return this;
	}
	
	public CadastroFacebookPage selecionaDiaNascimento(String dia) {
		WebElement diaNascimento = driver.findElement(By.id("day"));
		Select selectDia = new Select(diaNascimento);
		selectDia.selectByVisibleText(dia);
		return this;
	}
	
	public CadastroFacebookPage selecionaMesNascimento(String mes) {
		WebElement mesNascimento = driver.findElement(By.id("month"));
		Select selectMes = new Select(mesNascimento);
		selectMes.selectByVisibleText(mes);
		return this;
	}
	
	public CadastroFacebookPage selecionaAnoNascimento(String ano) {
		WebElement anoNascimento = driver.findElement(By.id("year"));
		Select selectAno = new Select(anoNascimento);
		selectAno.selectByVisibleText(ano);
		return this;
	}
	
	public CadastroFacebookPage selecionaSexoMasculino() {
		driver.findElement(By.id("u_0_a")).click();
		return this;
	}
	
	public CadastroFacebookPage insereLogin(String login) {
		driver.findElement(By.id("email")).sendKeys(login);
		return this;
	}
	
	public CadastroFacebookPage preencheSenhaLogin(String senha) {
		driver.findElement(By.id("pass")).sendKeys(senha);
		return this;
	}
	
	public CadastroFacebookPage clicaEmEntrar() {
		driver.findElement(By.id("u_0_4")).submit();
		return this;
	}
	
}
