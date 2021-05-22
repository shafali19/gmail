package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Locators {
	@FindBy(how = How.XPATH, using = "//input[@type='email'][@class='whsOnd zHQkBf']")
	public WebElement email;

	@FindBy(how = How.XPATH, using = "//input[@type='password'][@class='whsOnd zHQkBf']")
	public WebElement password;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Wrong password. Try again or click Forgot password to reset it.')]")
	public WebElement error;

	@FindBy(how = How.XPATH, using = "//div[@class='T-I T-I-KE L3']")
	public WebElement compose;

	@FindBy(how = How.XPATH, using = "//div[@id=':pg']")
	public WebElement composePopup;

	@FindBy(how = How.XPATH, using = "//textarea[@aria-label=\"To\"]")
	public WebElement toEmail;

	@FindBy(how = How.XPATH, using = "//input[@aria-label=\"Subject\"]")
	public WebElement subject;

	@FindBy(how = How.XPATH, using = "//div[@aria-label=\"Message Body\"]")
	public WebElement emailBody;

	@FindBy(how = How.XPATH, using = "//div[@aria-label=\"Send ‪(Ctrl-Enter)‬\"]")
	public WebElement sendButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"yW\"]//span[@class=\"zF\"]")
	public WebElement receivedMail;
}
