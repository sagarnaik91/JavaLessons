package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	WebDriver D;

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\003BF8744\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Concerto");
		driver.findElement(By.id("_fZl")).click();
		// driver.findElement(By.linkText("Welcome to Concerto Software & Systems Pvt
		// Ltd")).click();
		String linkname = null;
		Boolean contains = driver.getPageSource().contains("//*[@id='rso']/div[2]/div/div[3]/div/h3/a");
		System.out.println(contains);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Welcome to concerto Software & Systems Pvt Ltd")).click();
	}

}
