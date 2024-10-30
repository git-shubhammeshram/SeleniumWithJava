package _9_ExceptionInSelenium;

import _1_CoreSelenium._1_BaseCode;

public class _26_NoSuchWindowFound extends _1_BaseCode {
	public static void main(String[] args) {
		baseCode("https://www.google.com/");
        driver.switchTo().window("Non-existing window"); // This will throw NoSuchWindowException
        driver.quit();

	}

}
