package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdown {
	WebDriver D;

	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\003BF8744\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		D = new ChromeDriver();
		D.get("https://www.letskodeit.com/practice");
		D.manage().window().maximize();
		D.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@Test
	public void dropdwn() {
		WebElement drpdn = D.findElement(By.id("carselect"));
		D.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Select sel = new Select(drpdn);
		String a = sel.getFirstSelectedOption().getText();
		List<WebElement> all = sel.getOptions();
		for (WebElement e : all) {
			System.out.println(e.getText());
		}
	}
}
