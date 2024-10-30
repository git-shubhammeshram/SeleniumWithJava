package _9_ExceptionInSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;

public class _28_WebDriverException extends _1_BaseCode {

	public static void main(String[] args) {
		baseCode("https://www.google.com");

		try {
            driver.findElement(By.id("invalidId"));
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
	}
}
