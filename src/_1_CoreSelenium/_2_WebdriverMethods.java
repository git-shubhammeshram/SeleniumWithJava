package _1_CoreSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class _2_WebdriverMethods extends _1_BaseCode {

	public static void main(String[] args) throws InterruptedException {

		baseCode("https://www.google.com/");

		System.out.println("Title of the page is: " + driver.getTitle());
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("Title of the page is: " + driver.getTitle());
		driver.navigate().back();
		System.out.println("Title of the page is: " + driver.getTitle());
		driver.navigate().forward();
        System.out.println("Title of the page is: " + driver.getTitle());
		driver.getCurrentUrl();

		Thread.sleep(2000);
		Dimension size = new Dimension(500,500);
		driver.manage().window().setSize(size);
		Thread.sleep(2000);
		Point point = new Point(20, 500);
		driver.manage().window().setPosition(point /*new Point(20, 500)*/);

		driver.quit();

	/*Write down webdriver and its methods*/
	/* 1. Get  2.Maximize  3.Close  4.Quit  5.Navigate 6.GetTitle  7.GetCurrentURL 8.SetSize 9.SetPosition  */


	}

}
