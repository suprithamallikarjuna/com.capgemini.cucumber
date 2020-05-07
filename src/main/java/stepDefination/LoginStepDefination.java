package stepDefination;


import com.myntra.loginpage.LoginPage;
import com.myntra.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination extends TestBase{
	LoginPage l1;
@Given("^User opened the browser$")
public void user_opened_the_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	TestBase.openBrowser();
}

@When("^user selected un and pwd at excel$")
public void user_selected_un_and_pwd_at_excel() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	l1=new LoginPage(driver);
	String email=getExcelData("E:\\cg-automation-testing\\com.capgemini.cucumber\\ExcelData\\Book1.xlsx", "MyntraLogin",1,0);
	String pwd=getExcelData("E:\\cg-automation-testing\\com.capgemini.cucumber\\ExcelData\\Book1.xlsx", "MyntraLogin",1,1);
	l1.clearEmail();
	l1.email(email);
	l1.password(pwd);

}
@Then("^User clicks on login$")
public void user_clicks_on_login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    l1.loginButton();
}


}
