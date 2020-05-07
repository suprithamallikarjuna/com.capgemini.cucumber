package com.myntra.essentialspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
@FindBy(xpath="//span[text()='PHONEPE/GOOGLE PAY/BHIM UPI']")
WebElement pay;
@FindBy(xpath="//span[text()='PhonePe']")
WebElement pp;
@FindBy(xpath="//button[text()='PAY NOW']")
WebElement pn;
public  Payment(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
public void paymentSelection() {
	pay.click();
}
	public void phonepe() {
		pp.click();
		
	}
	public void payNow() {
		pn.click();
		
	}
}