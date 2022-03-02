package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {
	
	private WebDriver driver;
	
	public DSL (WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void clickButton(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		
	}
	
	public void fillTextFieldId(String id, String text) {
		driver.findElement(By.id(id)).sendKeys(text);
		
	}

}
