package com.myntra.essentialspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	@FindBy(xpath="//div[text()='continue']")
	WebElement cn;
	
	public  Address(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	
	
	
	public void continueButton() {
		cn.click();
		
	}

}
