package com.myntra.essentialspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.util.TestBase;
public class Product extends TestBase{
	Actions action;

	@FindBy(xpath="//picture[@class=\"img-responsive\"]")
	WebElement img;
	@FindBy(xpath="//span[text()='Add to bag']")
	WebElement ad;
@FindBy(xpath="//button[@class=\"product-sizeButton\"]")
WebElement size;
	public Product(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
public void image() throws InterruptedException {
	action = new Actions(driver);
	Thread.sleep(1000);
	action.moveToElement(img).perform();
	
}
public void size() {
	size.click();
	
}
public void addToBagButton() {
	ad.click();
	
}

}
