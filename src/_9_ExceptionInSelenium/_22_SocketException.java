package _9_ExceptionInSelenium;

import _1_CoreSelenium._1_BaseCode;

public class _22_SocketException extends _1_BaseCode {
	/*Methods:- 1. SocketException  */
	public static void main(String[] args) {

		baseCode("https://www.google.com/");
		// This will throw a SocketException when trying to connect to a non-existent server.
		driver.get("http://nonexistentserver.com");
        System.out.println("This line will not be executed.");
        // Rest of the code will not be executed because of the exception.
		// driver.quit(); // Uncomment this line to quit the driver.
    }
}
