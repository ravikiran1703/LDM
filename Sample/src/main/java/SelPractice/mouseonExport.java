package SelPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class mouseonExport {
	public void export() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\eclipse-workspace\\sel\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://106.51.2.102/CONS_Testing/Login.aspx");
	
		//driver.manage().window().maximize();
		driver.findElementById("Logon_LoginUser_UserName").sendKeys("administrator ");
		driver.findElementById("LoginButton").click();
		driver.findElementById("Vertical_NC_TL_N0_0").click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		WebElement Hover = driver.findElementById("Vertical_mainMenu_Menu_DXI8_P");
		action.moveToElement(Hover).click().build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement Hover1 = driver.findElementById("Vertical_mainMenu_Menu_DXI7_P");
		
		action.moveToElement(Hover1).click().build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> allItems = driver.findElements(By.xpath("//div[@id='Vertical_mainMenu_Menu_DXSA7']/ul/li/a/span"));
		if(allItems.size()>0) {
		for (int i = 0; i < allItems.size(); i++) {
			if (allItems.get(i).getText().contains("XLS File")) {
				allItems.get(i).click();
			} 
		}
		}
	//	driver.close();


	}
}
