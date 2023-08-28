package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshot {
	WebDriver D;

	@BeforeTest
	public void launch() {
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\003BF8744\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			D = new ChromeDriver();
			D.get("https://www.letskodeit.com/practice");
			D.manage().window().maximize();
		}
	}

	@Test
	public void screenShot() throws IOException {
		TakesScreenshot scrshot = ((TakesScreenshot) D);
		File scrFile = scrshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\003BF8744\\Documents\\scr.png");
		FileUtils.copyDirectory(scrFile, destFile);
	}

}
