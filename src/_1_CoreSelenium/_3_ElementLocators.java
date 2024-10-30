package _1_CoreSelenium;

import org.openqa.selenium.By;

public class _3_ElementLocators extends _1_BaseCode {

	/*Types:-  1.TagName  2.ID  3.Name  4.ClassName  5.LinkText  6.PartialLinkText  6.CSS  7.Xpath*/
	/*X-Path Types:-  1.Xpath By Attribute  2.Xpath By Text  3.Xpath By Contains  4.Xpath By Index  5.Absolute Xpath  6.Relative Xpath */

	public static void main(String[] args) {

		baseCode("https://m.rediff.com/signup/register");
		/*usingXpath();*/
		/*usingTagName();*/

		usingId();
		usingClassName();
		usingName();
	}

	private static void usingName() {
		driver.findElement(By.name("name")).sendKeys("Batman");
		driver.quit();
	}

	private static void usingClassName() {
		driver.findElement(By.className("txtbox1")).sendKeys("Batman");
		driver.quit();
	}

	private static void usingId() {
		driver.findElement(By.id("fullname")).sendKeys("Batman");
		driver.quit();
	}

	private static void usingTagName() {

		driver.findElement(By.tagName("input")).sendKeys("Batman");
		driver.quit();
	}

	private static void usingXpath() {
		baseCode("https://m.rediff.com/signup/register");
		driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("Batman");

		String result = driver.findElement(By.xpath("//div[text()='Your Full name']")).getText();
		System.out.println(result);

		driver.findElement(By.xpath("//input[contains(@name,'emailid')]")).sendKeys("batman@gmail.com");

		driver.findElement(By.xpath("//input[@id='pass'][1]")).sendKeys("Batman99");

		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[5]/div[1]/form[1]/div[11]/input[1]")).sendKeys("Batman99");

		driver.findElement(By.xpath("//input[@id='sex']")).click();

		driver.quit();
	}

}
