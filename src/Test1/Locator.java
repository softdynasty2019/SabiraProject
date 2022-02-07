package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Java JDK 8\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// driver.findElement(By.linkText("Gmail")).click();
		// input or a id="input" type="search"
		// <input class="gLFyf gsfi" jsaction="paste:puy29d;" maxlength="2048" name="q"
		// type="text" aria-autocomplete="both" aria-haspopup="false"
		// autocapitalize="off" autocomplete="off" autocorrect="off" autofocus=""
		// role="combobox" spellcheck="false" title="Search" value=""
		// aria-label="Search" data-ved="0ahUKEwjD1trxjtrzAhVZyDgGHRNfDIkQ39UDCAY">

		// tagname[@Attribute='value']- Xpath

		// tagname[Attribute='value']-css

		// driver.findElement(By.id("ybar-sbq")).sendKeys("Rose");

		// driver.findElement(By.xpath("//*[@id='ybar-sbq']")).sendKeys("NYC");

		// driver.findElement(By.cssSelector("*[id='ybar-sbq'")).sendKeys("Buffalo");

		// driver.findElement(By.cssSelector("#ybar-sbq")).sendKeys("Buffalo");//For ID
		// driver.findElement(By.cssSelector("input._yb_1t3s0")).sendKeys("Buffalo");
		// //For Class Name

		// driver.findElement(By.cssSelector("*[Type='text'")).sendKeys("Queens");
		// driver.findElement(By.xpath("//*[@Type='text']")).sendKeys("Queens");

		// driver.findElement(By.xpath("//input[contains(@class,'_yb_1t')]")).sendKeys("Astoria");

	}

}
