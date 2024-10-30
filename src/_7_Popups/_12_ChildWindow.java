package _7_Popups;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class _12_ChildWindow extends _1_BaseCode {
	/*Methods:- 1.GetWindowHandles  2.Window  */

	public static void main(String[] args) throws InterruptedException {

		getAllChildWindow();
	}

	private static void getAllChildWindow() throws InterruptedException {
		baseCode("https://www.aspsnippets.com/demos/1102/");

		WebElement openPopupButton = driver.findElement(By.xpath("//input[@onclick='OpenPopup()']"));
		openPopupButton.click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> cursor = windows.iterator();

		System.out.println(windows.size() + " windows");
		String win[] = new String[10];

		for(int i=0; i<windows.size(); i++){
			win[i] = cursor.next();
			System.out.println(win[i]);

		}

		driver.switchTo().window(win[0]);
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(win[1]);
		System.out.println(driver.getTitle());
		driver.close();

		driver.quit();

	}

}
