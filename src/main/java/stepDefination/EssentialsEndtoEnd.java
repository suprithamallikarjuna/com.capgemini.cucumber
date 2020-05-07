package stepDefination;


import com.myntra.essentialspage.Address;
import com.myntra.essentialspage.Bag;
import com.myntra.essentialspage.Essentials;
import com.myntra.essentialspage.Payment;
import com.myntra.essentialspage.Product;
import com.myntra.util.TestBase;

import cucumber.api.java.en.Then;

public class EssentialsEndtoEnd extends TestBase{
	Essentials e;
	Product p;
	Bag b;
	Address a;
	Payment pm;
	@Then("^user place cursor on Essentials$")
	public void user_place_cursor_on_Essentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    e=new Essentials(driver);
	    e.essentials();
	}
	@Then("^user place cursor on masks$")
	public void user_place_cursor_on_masks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    e.masks();

	}
	@Then("^user place cursor on image$")
	public void user_place_cursor_on_image() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    p=new Product(driver);
	    p.image();
	}
	@Then("^user selects the size$")
	public void user_selects_the_size() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    p.addToBagButton();


	}


	@Then("^user click on add to bag button$")
	public void user_click_on_add_to_bag_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    p.size();

	}

@Then("^user opens bag in the home page$")
public void user_opens_bag_in_the_home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    b=new Bag(driver);
    b.bag();

}

@Then("^user clicks on place order button$")
public void user_clicks_on_place_order_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    b.placeOrder();

}


@Then("^user navigate to address page and click on continue$")
public void user_navigate_to_address_page_and_click_on_continue() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    a=new Address(driver);
    a.continueButton();
}

@Then("^user navigate to payment page and click on phonepe/googlepay/bhmiupi$")
public void user_navigate_to_payment_page_and_click_on_phonepe_googlepay_bhmiupi() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   pm=new Payment(driver);
   pm.paymentSelection();
}

@Then("^user selects phonpe$")
public void user_selects_phonpe() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	   pm.phonepe();

}
@Then("^user selects paynow button$")
public void user_selects_paynow_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	   pm.payNow();
}




}
