package _9_ExceptionInSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;

public class _25_ElementNotFoundException extends _1_BaseCode {
	public static void main(String[] args) {
		baseCode("https://www.google.com/");
		// Trying to find an element with id "non-existent-id" which does not exist.
		try {
            driver.findElement(By.id("non-existent-id"));
        } catch (Exception e) {
            System.out.println("Element not found: " + e.getMessage());
        } finally {
            driver.quit();
        }
        // End of try-catch block
        System.out.println("This line will always be executed");

	}
}
