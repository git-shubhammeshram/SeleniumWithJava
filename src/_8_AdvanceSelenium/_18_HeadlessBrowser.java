package _8_AdvanceSelenium;

import _1_CoreSelenium._1_BaseCode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _18_HeadlessBrowser extends _1_BaseCode {

	/*Uses 1.Achieve Parallel Execution  2.Jenkins file integration */

	public static void main(String[] args) {

			String path = "D:\\IJ-PROJECTS\\Selenium with Java\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",path);

		    ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			WebDriver driver = new ChromeDriver(options);
		    driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
		    System.out.println(driver.getTitle());
			driver.quit();

	}

}
