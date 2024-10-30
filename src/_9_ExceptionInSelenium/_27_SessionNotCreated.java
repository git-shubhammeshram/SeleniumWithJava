package _9_ExceptionInSelenium;

import _1_CoreSelenium._1_BaseCode;

public class _27_SessionNotCreated extends _1_BaseCode {
	/* WebDriverException: Session not created exception */
	public static void main(String[] args) {
		baseCode("https://www.google.com/"); // Incorrect URL
		driver.manage().window().maximize();
		driver.quit(); // Quitting the browser after trying to create a session with an incorrect URL.

    }
}
