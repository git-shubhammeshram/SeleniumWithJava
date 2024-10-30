package _8_AdvanceSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _15_HandleWebTables extends _1_BaseCode {
	/* Handling Web Tables: 1. Locate table  2. Get table rows  3. Get table columns  4. Get table data  5. Get specific cell data  */
	public static void main(String[] args) {
		baseCode("https://money.rediff.com/index.html");

		// Locate table and get data
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='hmnseindicestable']//ul"));
		List<WebElement> columns = driver.findElements(By.xpath("//div[@class='hmnseindicestable']//ul[1]//li"));

		System.out.println("Total rows: " + rows.size());
		System.out.println("Total columns: " + columns.size());

		// Print top border
		printLine(columns.size());

		// Print column headers (assuming the first row contains headers)
		for (WebElement column : columns) {
			System.out.printf("| %-18s", column.getText());  // Adjust width as needed
		}
		System.out.println("|");  // End row with vertical bar

		// Print separator line between header and rows
		printLine(columns.size());

		// Print row data
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> rowColumns = rows.get(i).findElements(By.tagName("li")); // Assuming each row's data is in <li> tags

			for (WebElement cell : rowColumns) {
				System.out.printf("| %-18s", cell.getText());  // Print each cell in a fixed-width format
			}
			System.out.println("|");  // End row with vertical bar

			// Print line after each row
			printLine(columns.size());
		}

		driver.quit(); // Close the driver after execution
	}

	// Method to print a line between rows and headers
	private static void printLine(int columnCount) {
		for (int i = 0; i < columnCount; i++) {
			System.out.print("+--------------------");  // Adjust length based on cell width
		}
		System.out.println("+");
	}

}


