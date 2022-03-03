package core;

import org.junit.After;
import org.junit.Before;

import pages.LoginPage;

public class BaseTest {
	
	
	private LoginPage page = new LoginPage();
	
	@Before
	public void start() {
		page.login();
	}
	
	@After
	public void finish() {
		if(Property.CLOSE_BROWSER) {
			DriverFactory.killDriver();
		}
	}
}
