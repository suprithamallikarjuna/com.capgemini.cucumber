package stepDefination;


import com.myntra.essentialspage.Payment;
import com.myntra.giftcardpage.Detailspage;
import com.myntra.giftcardpage.Differentgiftcardspage;
import com.myntra.giftcardpage.Giftcardpage;
import com.myntra.giftcardpage.PayButtonpage;
import com.myntra.giftcardpage.SendGiftcardpage;
import com.myntra.util.TestBase;

import cucumber.api.java.en.Then;

public class GiftCardEndToEnd extends TestBase{
Giftcardpage gp;
SendGiftcardpage s;
Differentgiftcardspage dp;
PayButtonpage p;
Payment pm;
Detailspage ds;


@Then("^user clicks on profile$")
public void user_clicks_on_profile() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    gp=new Giftcardpage(driver);
    Thread.sleep(2000);
    gp.placeCursorOnProfile();
}

@Then("^user clicks on GiftCard$")
public void user_clicks_on_GiftCard() throws InterruptedException  {
    // Write code here that turns the phrase above into concrete actions
    
    Thread.sleep(2000);

gp.giftCardsOpen();

}

@Then("^user navigate to sendgiftcard page and click on sendgiftcard$")
public void user_navigate_to_sendgiftcard_page_and_click_on_sendgiftcard() throws InterruptedException  {
    // Write code here that turns the phrase above into concrete actions
    s=new SendGiftcardpage(driver);
    Thread.sleep(2000);

    s.sendGiftCard();
}
@Then("^user navigate to different giftcards page and selects gift card$")
public void user_navigate_to_different_giftcards_page_and_selects_gift_card() throws InterruptedException  {
    // Write code here that turns the phrase above into concrete actions
	dp=new Differentgiftcardspage(driver);
	  Thread.sleep(2000);
dp.birthdayGiftCard();
}
	
@Then("^user clicks on next button$")
public void user_clicks_on_next_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	  Thread.sleep(2000);

    dp.nextButton();
}

@Then("^user enters  recipient email as given data in excel$")
public void user_enters_recipient_email_as_given_data_in_excel() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	ds=new Detailspage(driver);
	String gmail=getExcelData("E:\\cg-automation-testing\\com.capgemini.cucumber\\ExcelData\\Book1.xlsx", "GiftCard",1,0);

    Thread.sleep(2000);
    ds.recipientEmail(gmail);
}

@Then("^user enters  confirmrecipient email as given data in excel$")
public void user_enters_confirmrecipient_email_as_given_data_in_excel() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	String emailid=getExcelData("E:\\cg-automation-testing\\com.capgemini.cucumber\\ExcelData\\Book1.xlsx", "GiftCard",1,1);


    ds.confirmRecipientEmail(emailid);
}

@Then("^user will click on Amount$")
public void user_will_click_on_Amount() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
ds.amount();
}

@Then("^user enters name in the to field as given data in excel$")
public void user_enters_name_in_the_to_field_as_given_data_in_excel() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		String name=getExcelData("E:\\cg-automation-testing\\com.capgemini.cucumber\\ExcelData\\Book1.xlsx", "GiftCard",1,2);
	  ds.toField(name);
}

@Then("^user clicks on show preview button$")
public void user_clicks_on_show_preview_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ds.showPreviewButton();
}

@Then("^user clicks on pay button$")
public void user_clicks_on_pay_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    p=new PayButtonpage(driver);
    p.payButton();
}

@Then("^user navigate to payment page and click on the phonepe/googlepay/bhmiupi$")
public void user_navigate_to_payment_page_and_click_on_the_phonepe_googlepay_bhmiupi() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	pm=new Payment(driver);
	   pm.paymentSelection();
}

@Then("^user selects the phonpe$")
public void user_selects_the_phonpe() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	pm=new Payment(driver);
pm.phonepe();
}

@Then("^user selects the paynow button$")
public void user_selects_the_paynow_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	pm=new Payment(driver);
	pm.payNow();

}


}






