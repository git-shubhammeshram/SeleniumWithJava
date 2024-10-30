package _8_AdvanceSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _20_FileUpload extends _1_BaseCode {

	public static void main(String[] args) {
		baseCode("https://cgi-lib.berkeley.edu/ex/fup.html");
		// Upload file from local machine.
		WebElement uploadButton = driver.findElement(By.xpath("//input[@name='upfile']"));
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Press']"));

		uploadButton.sendKeys("D:\\IJ-PROJECTS\\Selenium with Java\\src\\_4_ScreenShot\\ScreenShot.png");
		submitButton.click();
		driver.getTitle();
		driver.quit();



	}
}
