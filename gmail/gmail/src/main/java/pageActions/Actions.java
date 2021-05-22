package pageActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import pageLocators.Locators;
import utils.HelperClass;

public class Actions extends HelperClass {
	Locators locators;

	public Actions() {
		locators = new Locators();
		PageFactory.initElements(getDriver(), locators);
	}

	public void enterEmailOrPhone(String strEmail) {
		locators.email.sendKeys(strEmail + Keys.ENTER);
	}

	public void enterPassword(String strPassword) {
		locators.password.sendKeys(strPassword + Keys.ENTER);
	}
	
	public void waitTillOnHomePage() {
		waitTillElementIsDisplayed(locators.compose);
	}
	
	public boolean isComposeButtonDisplayed() {
		return isElementPresent(locators.compose);
	}

	public void clickOnComposeButton() {
		locators.compose.click();
	}

	public boolean isComposePopupDisplayed() {
		return isElementPresent(locators.compose);
	}

	public void enterToEmail(String strToEmail) {
		locators.toEmail.sendKeys(strToEmail);
	}

	public void enterSubject(String strSubject) {
		locators.subject.sendKeys(strSubject);
	}

	public void enterEmailBody(String strEmailBody) {
		locators.emailBody.sendKeys(strEmailBody);
	}

	public void clickOnSendButton() {
		locators.sendButton.click();
	}
	
	public String verifyEmailIsSent() {
		return locators.receivedMail.getText();
	}
}
