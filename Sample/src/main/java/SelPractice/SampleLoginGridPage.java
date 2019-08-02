package SelPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class SampleLoginGridPage {
	public void export() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\eclipse-workspace\\sel\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://106.51.2.102/CONS_Testing/Login.aspx");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("Logon_LoginUser_UserName").sendKeys("administrator ");
		driver.findElementById("Logon_LoginUser_Password").sendKeys("password-1");
		driver.findElementById("LoginButton").click();
		driver.findElementById("Vertical_NC_TL_N1").click();
		driver.findElementById("Vertical_NC_TL_N1_0").click();

		Thread.sleep(3000);

		String JobIdCap = "";
		driver.findElementById("Vertical_mainMenu_Menu_DXI3_").click();

		String JobId = "190304002";

		List<WebElement> pageList = driver.findElements(By.xpath("//div[contains(@id,'DXPagerBottom')]"));
		List<WebElement> JobIDList = driver.findElements(By.xpath("//table[contains(@id,'DXMainTable')]//tr[contains(@id,'DXDataRow')]/td[3]"));
		
				
		PageLoop:			
			for (int i = 0; i <= pageList.size() ; i++) {
				for (int j = 0; j < JobIDList.size()-1 ; j++) {
					if(JobIDList.get(j).getText().equals(JobId)) {
						JobIDList.get(j).click();
						break PageLoop;
					}	
				}

				pageList = driver.findElements(By.xpath("//div[contains(@id,'DXPagerBottom')]/a[not(contains(@id,'DXPagerBottom'))]"));
				JobIdCap = pageList.get(i).getText();
				System.out.println(JobIdCap);
				System.out.println(i);
				pageList.get(i).click();

				Thread.sleep(4000);
				JobIDList = driver.findElements(By.xpath("//table[contains(@id,'DXMainTable')]//tr[contains(@id,'DXDataRow')]/td[3]"));
			}

		//driver.close();

	}
}
