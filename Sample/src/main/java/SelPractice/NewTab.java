package SelPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class NewTab {
	public void OpenNewTab() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\eclipse-workspace\\sel\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String baseUrl = "https://stqatools.com/selenium-keyboard-events/";
		driver.get(baseUrl);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_T); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyRelease(KeyEvent.VK_T);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String current = driver.getWindowHandle();
		Set<String> winList = driver.getWindowHandles();
		for(String win: winList) {
			if(!(current==win)) {
				driver.switchTo().window(win);
			}
		}
		driver.findElementById("q").sendKeys("hi");

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);			
		//		Actions act = new Actions(driver);
		//		act.keyDown(Keys.CONTROL).sendKeys("t").perform();
		//act.keyUp(Keys.ARROW_UP).perform();

		//	driver.findElement(By.xpath("//li[@id = 'menu-item-3334']")).sendKeys(Keys.chord(Keys.CONTROL, "t"));

	}
}
