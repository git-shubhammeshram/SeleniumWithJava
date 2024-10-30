package _7_Popups;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _11_AlertClass extends _1_BaseCode {

	/*What is popup:- Popup is a small or separate windows which will appears while testing or doing automation into the website */
	/* Types of popup:- 1.HiddenDivision  2.AlertDivision  3.ChildBrowser  4.Authentication  5.FileUpload  6.FileDownload*/
	public static void main(String[] args) {

		/* handling alert popup */
		/*handleAlertPopup();*/
		/*handleAlertWithOk();*/
		/*handleAlertWithOkAndCancel();*/
		handeAlertWithText();


	}

	private static void handeAlertWithText() {
		baseCode("https://demo.automationtesting.in/Alerts.html");
        WebElement textBox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		textBox.click();

		WebElement alertButton = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		alertButton.click();


		Alert alert = driver.switchTo().alert();
		alertButton.sendKeys("Batman");
        System.out.println(alert.getText());
        alert.accept();
        driver.quit();
	}

	private static void handleAlertWithOkAndCancel() {
		baseCode("https://demo.automationtesting.in/Alerts.html");
        WebElement alertButton = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		alertButton.click();
		WebElement altButton = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		altButton.click();
		Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();


		alertButton.click();
		altButton.click();
        alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        driver.quit();

	}

	private static void handleAlertWithOk() {

		baseCode("https://demo.automationtesting.in/Alerts.html");
		WebElement confirmButton = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		confirmButton.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.quit();
	}

	private static void handleAlertPopup() {
		baseCode("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		loginButton.click();

		Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        driver.quit();
	}
}
