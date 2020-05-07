package com.myntra.giftcardpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.util.TestBase;

public class SendGiftcardpage extends TestBase {
	@FindBy(xpath = "//button[text()='SEND GIFT CARD']")
	WebElement sgc;
	
	public SendGiftcardpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	
	
	public void sendGiftCard() {
		sgc.click();
	}


}
