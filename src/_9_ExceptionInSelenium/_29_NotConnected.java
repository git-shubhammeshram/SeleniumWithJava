package _9_ExceptionInSelenium;

import _1_CoreSelenium._1_BaseCode;

public class _29_NotConnected extends _1_BaseCode {
	public static void main(String[] args) {
		baseCode("http://www.google.com/");
        driver.navigate().to("http://www.google.com/nonexistentpage");
        // Exception: org.openqa.selenium.net.UrlConnectionOpenException: Unable to connect to the server: Connection refused (configured timeouts: connectTimeout=45000ms, readTimeout=45000ms)
        // This exception occurs when the browser is unable to establish a connection to the specified URL.
	}
}
