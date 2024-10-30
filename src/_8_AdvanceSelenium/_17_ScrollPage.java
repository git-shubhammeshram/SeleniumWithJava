package _8_AdvanceSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _17_ScrollPage extends _1_BaseCode {

	public static void main(String[] args) throws InterruptedException {
		baseCode("https://www.amazon.in/");

		WebElement amazonBottomLogo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].scrollIntoView();",amazonBottomLogo);
		/*executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		executor.executeScript("window.scrollBy(0, document.body.scrollHeight)");

        // Scroll down to a specific element

        executor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[text()='Electronics']")));

        // Scroll up to a specific element

        executor.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//span[text()='Electronics']")));
*/
        // Scroll down to the top of the page


       /* executor.executeScript("window.scrollTo(0, 0);");
		Thread.sleep(2000);*/
		driver.quit();




	}
}
