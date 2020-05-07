package com.myntra.essentialspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.util.TestBase;

public class Essentials extends TestBase{
	Actions action;
	@FindBy(xpath="//a[contains(text(),'Essentials')]")
	WebElement es;

@FindBy(xpath="//a[contains(text(),'Masks')]")
WebElement msk;

public Essentials(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
public void essentials() throws InterruptedException  {
		action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(es).perform();

		}
public void masks() throws InterruptedException  {
	action = new Actions(driver);
	Thread.sleep(1000);
	action.doubleClick(msk).perform();
	
}
}
