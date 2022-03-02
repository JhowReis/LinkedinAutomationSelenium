package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import core.DSL;

public class LinkedinTeste {
	
	private WebDriver driver;
	private DSL dsl;
	
	@Before
	public void start() {
		System.setProperty("webdriver.chrome.driver", "/Users/jonat/Documents/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/home");
		dsl = new DSL(driver);
		
	}
	
	
	@After
	public void finish() {
//		driver.quit();
		
	}
	
	
	
	@Test
	public void login(){
		dsl.clickButton("//a[contains(text(),'Sign in')]");
		dsl.fillTextFieldId("username", "jonathan.linkedin2019@gmail.com");
		dsl.fillTextFieldId("password", "************");
		dsl.clickButton("//button[contains(text(),'Sign in')]");
		
	}
	


}
