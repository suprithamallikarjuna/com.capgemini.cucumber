package com.myntra.giftcardpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.util.TestBase;

public class PayButtonpage extends TestBase{
	@FindBy(xpath="//div[@class=\"preview-proceedDiv\"]")
	WebElement pay;
	public PayButtonpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

		public void payButton() {
			pay.click();
			
		}
			
		
	


}
