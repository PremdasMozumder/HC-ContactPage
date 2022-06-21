package stepDefinitions;

import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.contactPage;

public class contactStep extends setup {

    contactPage cp = new contactPage(driver);

    @Given("I am at health course contact page")
	public void i_am_at_healthcourse_contact_page() {
		cp.verifyHomepageTitle();
	}

    @And("user accepts all cookies")
    public void user_accepts_all_cookies() {
    	cp.acceptCookies();
    	}
    
	@Then("user enters valid Name")
	public void user_enters_valid_name() {
		cp.entername();
	}

	@And("user enters valid company name")
	public void user_enters_valid_company_name() {
		cp.entercompanyname();
	}

	@And("user enters valid email address")
	public void user_enters_valid_email_address() {
		cp.enteremailaddress();
	}

	@And("user enters valid phone number")
	public void user_enters_valid_phone_number() {
		cp.enterphonenumber();
		
	}

	@And("user enters a brief message")
	public void user_enters_a_brief_message() {
		cp.enterbriefmessage();
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		cp.clickonsubmit();
	}

	@Then("user should be able to successfully send their information")
	public void user_should_be_able_to_successfully_send_their_information() {
	}

}