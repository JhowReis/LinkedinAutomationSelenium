package tests;

import org.junit.Test;
import org.junit.Assert;
import pages.LoginPage;

public class LoginTest {
	
	private LoginPage loginPage = new LoginPage();

	

	@Test
	public void wrongPassword() {
		loginPage.initialScreen();
		loginPage.clickSignInA();
		loginPage.setEmail("jonathan.linkedin2019@gmail.com");
		loginPage.setPassword("**********");
		loginPage.clickSignInButton();

		
		Assert.assertEquals("That's not the right password. Try again or\n"
				+ "sign in with a one-time link"
				, loginPage.errorPasswordMessage());
				 
	}
	
	@Test
	public void wrongEmail() {
		loginPage.initialScreen();
		loginPage.clickSignInA();
		loginPage.setEmail("jonathan.linkedin2019");
		loginPage.setPassword("**********");
		loginPage.clickSignInButton();
		
		
		Assert.assertEquals("Please enter a valid username"
				, loginPage.errorUserNameMessage());
		
	}
	
	@Test
	public void rightLogin() {
		loginPage.initialScreen();
		loginPage.clickSignInA();
		loginPage.setEmail("jonathan.linkedin2019@gmail.com");
		loginPage.setPassword("***********");
		loginPage.clickSignInButton();
		
		Assert.assertEquals("Jonathan Reis"
				, loginPage.userNameProfile());
		
		
	}
	
	
	

	



}
