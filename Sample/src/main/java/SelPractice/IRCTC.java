package SelPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {
	public void railresv() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\eclipse-workspace\\sel\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/howto/howto_css_dropdown.asp");

		driver.manage().window().maximize();
		
	}
}