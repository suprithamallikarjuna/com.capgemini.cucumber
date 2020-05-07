package com.myntra.giftcardpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.util.TestBase;

public class Giftcardpage extends TestBase {
	Actions action;
	WebElement pf;
	@FindBy(xpath = "//div[text()='Gift Cards']")
	WebElement gf;
	@FindBy(className = "desktop-userTitle")
	WebElement profile;

	public Giftcardpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void placeCursorOnProfile() throws InterruptedException {
		action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(profile).perform();

	}

	public void giftCardsOpen() {

		gf.click();

	}

}
