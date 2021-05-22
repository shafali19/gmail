package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass extends BaseClass {
	WebDriverWait wait = new WebDriverWait(getDriver(), timeoutValue);

	public boolean isElementPresent(WebElement webElement) {
		try {
			boolean isPresent = webElement.isDisplayed();
			return isPresent;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void waitTillElementIsDisplayed(WebElement webelement) {
		wait.until(ExpectedConditions.visibilityOf(webelement));
	}

	public void waitTillElementClickable(WebElement webElement) {
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		System.out.println("element is now interactable");
	}

	public String getPageTitle() {
		return getDriver().getTitle();
	}

	public String getPageUrl() {
		return getDriver().getCurrentUrl();
	}

	public static void waitforpageload() {
		String pageLoadStatus = null;
		do {
			pageLoadStatus = (String) ((JavascriptExecutor) getDriver()).executeScript("return document.readyState");
		} while (!pageLoadStatus.equalsIgnoreCase("complete"));

		System.out.println("Page loaded");
	}
}
