package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.Actions;

public class Steps extends Actions{
	
	//for logging in
	@Given("User is on gmail login page")
	public void user_is_on_login_page() {
	    String pageTitle = getPageTitle();
	    Assert.assertTrue(pageTitle.equalsIgnoreCase("Gmail"));
	}

	@When("User enters email address {string} and press Enter")
	public void user_enters_email_address(String strEmail) {
	    enterEmailOrPhone(strEmail);
	}

	@When("User enter password {string} and press Enter")
	public void user_enter_password(String strPassword) {
	   enterPassword(strPassword);
	}

	@Then("User is navigated to Inbox page")
	public void user_is_navigated_to_inbox() {
		waitTillOnHomePage();
		Assert.assertTrue(getPageUrl().equalsIgnoreCase("https://mail.google.com/mail/u/0/#inbox"));
	}
	
	
	//for compose and send
	@Given("Compose button is visible")
	public void compose_button_is_visible() {
	   	Assert.assertTrue(isComposeButtonDisplayed());
		System.out.println("compose button is displayed");
	}

	@When("User clicks on Compose button")
	public void user_clicks_on_compose_button() {
		clickOnComposeButton();
		System.out.println("user clicked on compose");
	}

	@Then("Compose popup is displayed")
	public void compose_popup_is_displayed() {
		Assert.assertTrue(isComposePopupDisplayed());
		System.out.println("compose popup is displayed");
	}
	
	//send steps
	@When("User enter To email ID as {string}")
	public void user_enter_to_email_id_as(String toEmail) {
		enterToEmail(toEmail);
	    System.out.println("Email entered : "+toEmail);
	}

	@When("User enters Subject as {string}")
	public void user_enters_subject_as(String subject) {
	   enterSubject(subject);
	   System.out.println("Entered subject :"+subject);
	}

	@When("User enters email body as {string}")
	public void user_enters_email_body_as(String emailBody) {
	  enterEmailBody(emailBody);
	  System.out.println("entered emailBody : "+emailBody);
	}

	@When("User clicks on Send")
	public void user_clicks_on_send() {
	    clickOnSendButton();
	    System.out.println("clicked on send");
	}

	@Then("Email is Send successfully")
	public void email_is_send_successfully() {
		Assert.assertTrue(verifyEmailIsSent().equalsIgnoreCase("me"));
	    System.out.println("email is sent successfully");   
	}
	
}
