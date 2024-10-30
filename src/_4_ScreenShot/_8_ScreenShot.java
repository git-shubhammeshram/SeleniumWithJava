package _4_ScreenShot;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class _8_ScreenShot extends _1_BaseCode {

	public static void main(String[] args) throws IOException {
		baseCode("https://www.google.com/");

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\IJ-PROJECTS\\Selenium with Java\\src\\_4_Screenshot\\ScreenShot.png");
		FileHandler.copy(source, dest);

		driver.quit();

	}
}
