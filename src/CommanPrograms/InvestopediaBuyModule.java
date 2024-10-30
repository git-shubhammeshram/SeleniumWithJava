package CommanPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class InvestopediaBuyModule {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("https://www.investopedia.com/simulator/");
		driver.manage().window().maximize();


		/*Login Page*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Log in to your account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shubhammeshram_99");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Shubham@55");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(5000);

		/*Dashboard Page*/
		driver.findElement(By.xpath("(//*[normalize-space(text())='trade']) [1]")).click();
		Thread.sleep(3000);

		/*Trade Page*/
		Actions act = new Actions(driver);
		WebElement symbolField = driver.findElement(By.xpath("//div[@class='symbol-search-field']"));
		act.moveToElement(symbolField).click().sendKeys("TCS").build().perform();
		Thread.sleep(2000);

		WebElement tcsStock = driver.findElement(By.xpath("//*[normalize-space(text())='TCS']"));
		act.moveToElement(tcsStock).click().build().perform();
		Thread.sleep(4000);


		WebElement buyStock = driver.findElement(By.xpath("(//div[text()='Buy'])[1]"));
		act.moveToElement(buyStock).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);


		WebElement quantityStock = driver.findElement(By.xpath("//input[@data-cy='quantity-input']"));
		act.moveToElement(quantityStock).click().sendKeys("10").build().perform();
		Thread.sleep(2000);

		WebElement orderType = driver.findElement(By.xpath("(//div[text()='Market'])[1]"));
		act.moveToElement(orderType).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);

		WebElement durationStock = driver.findElement(By.xpath("(//div[@class='v-input__slot'])[4]"));
		act.moveToElement(durationStock).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@data-cy='preview-button']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@data-cy='submit-order-button']")).click();
		Thread.sleep(4000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.quit();

	}
}
