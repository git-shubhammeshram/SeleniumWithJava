package _3_ActionClass;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _6_DragAndDrop extends _1_BaseCode {

	public static void main(String[] args) {
		baseCode("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);

		WebElement photo_1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement trashBox = driver.findElement(By.xpath("//div[@id='trash']"));

		Actions action = new Actions(driver);
		/*Types:- 1.moveToElement  2.dragAndDrop  */
		action.moveToElement(photo_1).clickAndHold().moveToElement(trashBox).release().build().perform();
		action.dragAndDrop(photo_1, trashBox).perform();

		driver.switchTo().defaultContent();
		driver.quit();


	}


}
