package _9_ExceptionInSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;

public class _23_StaleElement extends _1_BaseCode {
	/* StaleElementReferenceException: Element is no longer attached to the DOM */

	public static void main(String[] args) {
		baseCode("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).clear();
		// Wait for some time before trying to find the element again
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		driver.close();
	}

}