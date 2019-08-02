package SelPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class MouseHover {
	public static RemoteWebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\eclipse-workspace\\sel\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
	//driver.get("https://www.w3schools.com/howto/howto_css_dropdown.asp");
	driver.navigate().to("https://www.w3schools.com/howto/howto_css_dropdown.asp");
	
	driver.manage().window().maximize();
	Actions action = new Actions(driver);
		
	WebElement Hover = driver.findElementByClassName("dropbtn");
	WebElement Hover1 = driver.findElementByXPath("//a[text()='Link 3']");
	
	action.moveToElement(Hover).build().perform();
	action.moveToElement(Hover1).build().perform();
	Thread.sleep(5000);
	driver.close();
	
	}
}
