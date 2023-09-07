package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Google1 {

	WebDriver D;

	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\003BF8744\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		D = new ChromeDriver();
		D.get("https://www.google.com/");
		D.manage().window().maximize();
		WebElement search = D.findElement(By.id("APjFqb"));
		search.sendKeys("google");
		D.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement ele = D.findElement(By.xpath("//ul[@jsname='bw4e9b']/li[3]/div"));
		System.out.println(ele.getText());
		D.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele1=D.findElement(By.xpath("//ul[@jsname='bw4e9b']/li[4]/div"));
		ele1.click();

	}

}
