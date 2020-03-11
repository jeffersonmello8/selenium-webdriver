package learning_selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class TestaHeadless {
	@Test
	public void testeComPhantomJS() {
		System.setProperty("phantomjs.binary.path", "C:\\tools\\selenium\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();	
		driver.get("https://www.google.com.br/");
		String titulo = driver.getTitle();
		System.out.println(titulo);
		Assert.assertTrue(titulo.equals("Facebook"));	
	}
}
