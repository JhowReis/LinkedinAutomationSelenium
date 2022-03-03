package core;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {
	
	
	/*************** BUTTON *************/
	public void clickButtonXpath(String xpath) {
		getDriver().findElement(By.xpath(xpath)).click();
		
	}
	

	
	
	/*************** TEXT *************/
	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public void fillTextFieldId(String id, String text) {
		getDriver().findElement(By.id(id)).sendKeys(text);
		
	}

}
