package _8_AdvanceSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _14_AutoSuggestions extends _1_BaseCode {
	/*AutoSuggestions are a feature where the browser suggests options as you type. They are often used in forms to help users complete their input faster and more efficiently.
    Here are some common types of auto suggestions:
    1. Address Auto-Complete: Provides auto-suggestions for addresses, such as street names, cities, and countries.
    2. Credit Card Auto-Complete: Provides auto-suggestions for credit card numbers, expiration dates, and security codes.
    3. Email Auto-Complete: Provides auto-suggestions for email addresses.

    Note: Auto suggestions are not supported in all browsers, and they may not work as expected in some cases. */

	public static void main(String[] args) throws InterruptedException {

		baseCode("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
		searchBox.sendKeys("Selen");
		// Wait for auto suggestions to appear
		Thread.sleep(3000);
		// Get all auto suggestions
		List<WebElement> suggestionsList = driver.findElements(By.xpath("//ul[@role='listbox']"));
		System.out.println(suggestionsList.size());
		for (WebElement suggestion : suggestionsList) {
            System.out.println(suggestion.getText());
        }

		for (WebElement suggestion : suggestionsList){
			if(suggestion.getText().equalsIgnoreCase("Selenium")) {
				suggestion.click();
				break;
			}
			System.out.println("Current Page Title: " + driver.getTitle());
		}

		driver.close();

	}
}
