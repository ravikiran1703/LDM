package SelPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class SampleloginClient {
	public void export() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\eclipse-workspace\\sel\\drivers\\Chromedriver\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		//ChromeDriver driver = new ChromeDriver();

		driver.get("http://106.51.2.102/CONS_Testing/Login.aspx");
		

		driver.manage().window().maximize();
		driver.findElementById("Logon_LoginUser_UserName").sendKeys("administrator ");
		driver.findElementById("Logon_LoginUser_Password").sendKeys("password-1");
		driver.findElementById("LoginButton").click();
		Thread.sleep(3000);
		driver.findElementById("Vertical_NC_TL_N1").click();
		Thread.sleep(2000);
		driver.findElementById("Vertical_NC_TL_N1_1").click();
		Thread.sleep(2000);
		driver.findElementById("Vertical_mainMenu_Menu_DXI0_").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//td[contains(@id,'dviJobID_Edit_find_Edit_B0')]").click();
		Thread.sleep(3000);
		
		WebElement eleframe  = driver.findElementByXPath("//iframe[contains(@id,'Vertical_PopupWindow')]");
		driver.switchTo().frame(eleframe);
		
		WebElement eleclient  = driver.findElementByXPath("//tr[contains(@id,'XDataRow0')]");
		
		Actions action = new Actions(driver);
		action.doubleClick(eleclient).perform();
		
		Thread.sleep(2000);
		driver.findElementByXPath("//input[contains(@id,'dviClientSampleID_Edit_I')]").sendKeys("sample1");
		driver.findElementByXPath("//input[contains(@id,'dviSamplingLocation_Edit_I')]").sendKeys("sampleLocation1");
		
        driver.findElementByXPath("//td[contains(@id,'dviVisualMatrix_Edit_dropdown_DD_B-1')]").click();
        
      List<WebElement> vislist = driver.findElementsByXPath("//table[contains(@id,'dviVisualMatrix_Edit_dropdown_DD_DDD_L_LBT')]/tr/td");
        
      
      for (int i = 0; i < vislist.size() ; i++) {
    	 
		
		if (vislist.get(i).getText().contains("Sludge"))
		{
			vislist.get(i).click();
		}
	    }
      
		}
		
		}


