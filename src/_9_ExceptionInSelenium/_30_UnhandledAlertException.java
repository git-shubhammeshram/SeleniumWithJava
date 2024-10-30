package _9_ExceptionInSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class _30_UnhandledAlertException extends _1_BaseCode {
	/*Handling Alerts */
	public static void main(String[] args) {
		baseCode("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		// This line will throw an unhandled AlertException
		// System.out.println(driver.findElement(By.xpath("//p[text()='Customer deleted successfully.']")).getText());
        driver.quit();

    }
}
