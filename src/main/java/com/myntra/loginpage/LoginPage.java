package com.myntra.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.util.TestBase;



public class LoginPage extends TestBase{
WebDriver driver;
	 @FindBy(xpath="//input[@id='mobileNumberPass']")
     WebElement eml;
	 @FindBy(xpath="//input[@class='form-control has-feedback']")
     WebElement password;

     @FindBy(xpath = "//button[contains(@class,'lg block submitButton')]")
     WebElement loginbtn;
 
	
	
     public LoginPage(WebDriver driver) {
 		PageFactory.initElements(driver, this);
 		}

     public void clearEmail() {
 		eml.clear();
 		
 	}
	public void email(String email) {
		eml.sendKeys(email);
	}
	
		public void password(String pwd) {
		
			password.sendKeys(pwd);
		}

		public void loginButton() {
			loginbtn.click();

		}
		
	}

