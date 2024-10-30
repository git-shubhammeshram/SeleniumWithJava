package _8_AdvanceSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _13_GetAllLinks extends _1_BaseCode {
	public static void main(String[] args) {
		baseCode("https://www.google.com/");
		System.out.println("All Links on the page are: ");
		// Find all anchor tags (links) on the page and print them out.
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for (String linkText : driver.findElements(By.xpath("/a")).stream()
				.map(WebElement::getText)
				.toList()) {
			System.out.println(linkText);
		}
		// Select Gmail from list

		for (WebElement link : links) {
			if (link.getText().equalsIgnoreCase("Gmail")) {
				link.click();
				break;
			} else {
				System.out.println("Gmail link not found.");
			}
			System.out.println("Title: " + driver.getTitle());
		}
		driver.quit();
	}
}
