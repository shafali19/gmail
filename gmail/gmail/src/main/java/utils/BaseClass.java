package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	private static WebDriver driver;
	public static final int timeoutValue = 30;
	public static final int pageLoadTime = 30;

	static String browserName = "chrome";
	static String url = "https://mail.google.com/mail/";

	public static void setupBrowser() {
		switch (browserName.toLowerCase()) {
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		driver.manage().timeouts().implicitlyWait(timeoutValue,TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(pageLoadTime,TimeUnit.SECONDS);

		driver.get(url);
		driver.manage().window().maximize();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void cleanUp() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}
}
