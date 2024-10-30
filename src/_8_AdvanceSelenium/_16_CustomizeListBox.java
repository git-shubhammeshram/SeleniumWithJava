package _8_AdvanceSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _16_CustomizeListBox extends _1_BaseCode {
	/*Action class methods: - 1. doubleClick 2. rightClick 3. contextClick 4. moveToElement 5. sendKeys 6. clickAndHold 7. release 8.perform 9.build*/
	/*What is token in Java? is the smallest elements of program which identify by compiler: - 1.Identifiers 2.Keyword 3.Literals 4.Operators 5.Separator*/

	public static void main(String[] args) throws InterruptedException {
		baseCode("https://www.railyatri.in/train-ticket/create-new-irctc-user");

		driver.findElement(By.xpath("//input[@id='user-number']")).sendKeys("6666888899");
		driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("batman@gmail.com");
		driver.findElement(By.xpath("//button[@id='irtct-acc-detail']")).click();

		WebElement securityQuestionDropDown = driver.findElement(By.xpath("(//*[normalize-space(text())='What is your pet name?'])[1]"));

		Actions act = new Actions(driver);

		act.moveToElement(securityQuestionDropDown).click().build().perform();

		for(int i = 0; i < 3; i++){
			Thread.sleep(2000);
			act.sendKeys(Keys.DOWN).build().perform();
		}
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.close();


	}
}
