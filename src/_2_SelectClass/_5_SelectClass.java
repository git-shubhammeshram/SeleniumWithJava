package _2_SelectClass;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _5_SelectClass extends _1_BaseCode {

	/* Select class methods:- 1.selectByIndex  2.selectByValue  3.selectByVisibleText / 4.deSelectByIndex  5.deSelectByValue  6.deSelectByVisibleText*/
	/* 7.getOptions  8.getText  9.getAllSelectedOptions  */
	public static void main(String[] args) throws InterruptedException {
		baseCode("https://m.rediff.com/signup/register");

		usingSelectByVisibleText();


	}

	private static void usingSelectByVisibleText() throws InterruptedException {
		WebElement day = driver.findElement(By.xpath("//select[@id='date_day']"));
		Select s = new Select(day);
		s.selectByVisibleText("15");


		List<WebElement> days = s.getOptions();
		for(WebElement d:days)
			System.out.println(d.getText());

		System.out.println(s.isMultiple());

		driver.quit();
	}

	public static void usingSelectByIndex(){
		WebElement day = driver.findElement(By.xpath("//select[@id='date_day']"));
        Select s = new Select(day);
        s.selectByIndex(15);

        List<WebElement> days = s.getOptions();
        for(WebElement d:days)
            System.out.println(d.getText());

        System.out.println(s.isMultiple());

        driver.quit();
	}

	public static void usingSelectByValue(){
		WebElement day = driver.findElement(By.xpath("//select[@id='date_day']"));
        Select s = new Select(day);
        s.selectByValue("15");

        List<WebElement> days = s.getOptions();
        for(WebElement d:days)
            System.out.println(d.getText());

        System.out.println(s.isMultiple());

        driver.quit();
	}


}
