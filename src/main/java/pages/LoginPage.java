package pages;

import static core.DriverFactory.getDriver;

import core.BasePage;

public class LoginPage extends BasePage {
	

	
	public void initialScreen() {
		getDriver().get("https://www.linkedin.com/home");
	}

	public void clickSignInA() {
		clickButtonXpath("//a[contains(text(),'Sign in')]");
	}
	
	public void setName() {
		fillTextFieldId("username", "jonathan.linkedin2019@gmail.com");

	}
	
	public void setEmail() {
		fillTextFieldId("password", "************");
	}
	
	public void clickSignInButton() {
		clickButtonXpath("//button[contains(text(),'Sign in')]");
	}
	
	public void login() {
		initialScreen();
		clickSignInA();
		setName();
		setEmail();
		clickSignInButton();
	}
}
