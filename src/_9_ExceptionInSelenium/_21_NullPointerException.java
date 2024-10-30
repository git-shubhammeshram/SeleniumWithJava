package _9_ExceptionInSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;

public class _21_NullPointerException extends _1_BaseCode {
	public static void main(String[] args) {
		baseCode("https://www.google.com/");

        try {
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("//input[@name='example']")).click();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
		driver.close();
	}
}
