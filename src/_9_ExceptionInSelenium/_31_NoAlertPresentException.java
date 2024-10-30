package _9_ExceptionInSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.NoAlertPresentException;

import java.util.concurrent.TimeUnit;

public class _31_NoAlertPresentException extends _1_BaseCode {
	/*
     * WebDriverException: No alert is present
     * This error occurs when an attempt is made to interact with an alert but no alert is present in the current context.
     */

	public static void main(String[] args) {
		driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert is present");
        }


	}
}
