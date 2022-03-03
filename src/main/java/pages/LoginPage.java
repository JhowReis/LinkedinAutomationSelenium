package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import core.BasePage;

public class LoginPage extends BasePage {
	

	
	public void initialScreen() {
		getDriver().get("https://www.linkedin.com/home");
	}

	public void clickSignInA() {
		clickButtonXpath("//a[contains(text(),'Sign in')]");
	}
	
	public void setEmail(String email) {
		fillTextFieldId("username", email);

	}
	
	public void setPassword(String senha) {
		fillTextFieldId("password", senha);
	}
	
	public void clickSignInButton() {
		clickButtonXpath("//button[contains(text(),'Sign in')]");
	}
	
	public String errorPasswordMessage() {
		return getText(By.id("error-for-password"));
	}
	
	public String errorUserNameMessage() {
		return getText(By.id("error-for-username"));
	}
	
	public String userNameProfile() {
		return getText(By.xpath("//div[@class='t-16 t-black t-bold']"));
	}
	
	
	
	public void login() {
		initialScreen();
		clickSignInA();
		setEmail("");
		setPassword("");
		clickSignInButton();
	}
}
