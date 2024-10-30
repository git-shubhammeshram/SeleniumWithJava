package _9_ExceptionInSelenium;

import _1_CoreSelenium._1_BaseCode;

public class _33_UnreachableBrowserException extends _1_BaseCode {

	public static void main(String[] args) {
		baseCode("https://www.google.com/");
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search?q=Unreachable+URL"); // This will throw UnreachableBrowserException
        driver.quit();
	}
}
