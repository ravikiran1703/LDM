package SelPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class BookMyShow {

	public void BookTicket() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\eclipse-workspace\\sel\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://in.bookmyshow.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByLinkText("Chennai").click();

		Thread.sleep(3000);
		driver.findElementById("wzrk-cancel").click();
		driver.findElementByLinkText("Movies").click();
		driver.findElementByXPath("//div/a[@title ='Captain Marvel']").click();
		driver.findElementByClassName("more-showtimes").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("3D").click();
		driver.findElementByLinkText("01:15 PM").click();
		driver.findElementByLinkText("Accept").click();
		driver.findElementById("pop_1").click();
		driver.findElementById("proceed-Qty").click();
		driver.findElementById("A_3_16").click();
		driver.findElementById("btmcntbook").click();
		driver.findElementById("shmticket").click();
		driver.findElementById("prePay").click();
		driver.findElementById("txtEmail").sendKeys("ASdasdf@gmail.com");
		driver.findElementById("txtMobile").sendKeys("132451234");
		driver.findElementById("dContinueContactSec").click();
	}
}
