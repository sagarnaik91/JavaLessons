package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHover {
	RemoteWebDriver D;

	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\003BF8744\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		D=new ChromeDriver();
		D.get("https://www.letskodeit.com/practice");
		D.manage().window().maximize();
	}

	@Test
	public void mouseHover() {
		WebElement mouseHover = D.findElement(By.id("mousehover"));
		D.executeScript("arguments[0].scrollIntoView()", mouseHover);
		Actions act = new Actions(D);
		act.moveToElement(mouseHover).perform();
	}

}
