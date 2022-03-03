package tests;

import org.junit.Test;

import pages.LoginPage;

public class LoginTest {
	
	private LoginPage page = new LoginPage();

	

	@Test
	public void toLogin() {
		page.login();
	}
	

	



}
