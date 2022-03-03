package core;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {
	
	

	public void clickButtonXpath(String xpath) {
		getDriver().findElement(By.xpath(xpath)).click();
		
	}
	
	public void fillTextFieldId(String id, String text) {
		getDriver().findElement(By.id(id)).sendKeys(text);
		
	}

}
