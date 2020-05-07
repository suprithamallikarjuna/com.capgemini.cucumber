package com.myntra.essentialspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.util.TestBase;

public class Bag extends TestBase{
	@FindBy(xpath="//span[text()='Bag']")
	WebElement bag;
	@FindBy(xpath="//div[text()='Place Order']")
	WebElement pl;
	public  Bag(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	public void bag() {
		bag.click();
		
	}
public void placeOrder() {
	pl.click();
	
}
}
