package learning_selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConhecendoAnotacoesJUnit {

	@BeforeClass
	public static void antesDaClasse() {
		System.out.println("Esse � o beforeClass");
	}

	@Before
	public void antesDosMetodos() {
		System.out.println("Esse � o before");
	}

	@Test
	public void meuTeste1() {
		System.out.println("Esse � o meuTeste1");
	}

	@Test
	public void meuTeste2() {
		System.out.println("Esse � o meuTeste2");
	}

	@After
	public void depoisDosMetodos() {
		System.out.println("Esse � o after");
	}

	@AfterClass
	public static void depoisDasClasses() {
		System.out.println("Esse � o afterClass");
	}

}
