package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CountLinks {
	WebDriver D;

	@BeforeClass
	public void launch() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\003BF8744\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		D = new EdgeDriver();
		D.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_7qhce485bd_e&adgrpid=1322714095756137&hvadid=82669889959644&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=1660&hvtargid=kwd-82670512756912:loc-90&hydadcr=14453_2154450");
		D.manage().window().maximize();
	}

	@Test
	public void countLinks() {
		List<WebElement> ele = D.findElements(By.tagName("a"));
		System.out.println("Total number of links " + ele.size());
		for (WebElement e : ele) {
			System.out.println(e.getText());
		}
	}

}
