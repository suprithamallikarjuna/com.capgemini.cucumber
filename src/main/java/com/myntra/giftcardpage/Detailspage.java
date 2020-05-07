package com.myntra.giftcardpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.util.TestBase;

public class Detailspage extends TestBase {
	@FindBy(id="email")
	WebElement gml;
	@FindBy(id="cemail")
	WebElement cmail;
	@FindBy(xpath="//span[text()='1,000']")
	WebElement amt;
@FindBy(id="to")
WebElement to;
@FindBy(xpath="//button[text()='Show Preview']")
WebElement showbutton;
public Detailspage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public void recipientEmail(String gmail) {
		gml.sendKeys(gmail);
	}
	public void confirmRecipientEmail(String cemail) {
		cmail.sendKeys(cemail);
	}
		public void amount() {
			amt.click();
		}
		public void toField(String name) {
			to.sendKeys(name);
		}
		public void showPreviewButton() {
			showbutton.click();
			
		}

		
		


}
