package _9_ExceptionInSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;

public class _24_ElementIntercept extends _1_BaseCode {
	// TODO: 24. Element Intercept Exception
	// Implement a custom WebDriverException that captures and logs the intercepted element's location and HTML source code.
	// Use this exception to handle and log errors when interacting with elements that are not visible or disabled.
	// Add a method to your WebDriver implementation that throws this custom exception when interacting with an element.
	// Example usage:
	public static void main(String[] args) {
		baseCode("https://www.google.com/");
        // Your code here
		// Interact with an element that is not visible or disabled
        Example: driver.findElement(By.id("nonexistentElement")).click();
		// Handle the custom exception
		// Log the intercepted element's location and HTML source code
        // Example: logger.error("Intercepted element at {} with HTML source:\n{}", element.getLocation(), element.getHtmlSource());
		// Continue with the rest of your code
		driver.close();

	}
}
