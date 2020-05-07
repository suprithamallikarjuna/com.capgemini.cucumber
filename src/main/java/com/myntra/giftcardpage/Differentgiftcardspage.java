package com.myntra.giftcardpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.myntra.util.TestBase;

public class Differentgiftcardspage extends TestBase {
	@FindBy(xpath="//div[text()='Birthday']")
	 WebElement bdy;
			
	@FindBy(id="message")
	 WebElement msg;
		
	@FindBy(xpath="//button[@class='personalize-next']")
	 WebElement nxt;
	
	
	public Differentgiftcardspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	public void birthdayGiftCard() {
		bdy.click();
		
	}
	
	public void nextButton() {
	
		nxt.click();
	}




}
