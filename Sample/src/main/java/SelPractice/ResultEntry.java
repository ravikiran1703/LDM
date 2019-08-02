package SelPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class ResultEntry {

	public void export() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\eclipse-workspace\\sel\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://106.51.2.102/CONS_Testing/Login.aspx");


		driver.manage().window().maximize();
		driver.findElementById("Logon_LoginUser_UserName").sendKeys("administrator ");
		driver.findElementById("Logon_LoginUser_Password").sendKeys("password-1");
		driver.findElementById("LoginButton").click();
	//	Thread.sleep(3000);
		driver.findElementById("Vertical_NC_TL_N2").click();
		//Thread.sleep(2000);
		
		driver.findElementById("Vertical_NC_TL_N2_2").click();
		Thread.sleep(2000);
	    WebElement	ele =	driver.findElementById("Vertical_mainMenu_Menu_DXI1_");
		ele.click();
		WebElement	eleQueryFrame =	driver.findElementByXPath("//iframe[contains(@id,'Vertical_PopupWindow')]");
		driver.switchTo().frame(eleQueryFrame);
		driver.findElementByXPath("//td[contains(@id,'_dviJobID_Edit_find_Edit_B0') and @title ='Find']").click();
		driver.switchTo().defaultContent();
	
		WebElement	eleJobIdFrame =	driver.findElementByXPath("//div[contains(@id,'Dialog_PopupWindow')]//iframe");
	//	WebElement	eleJobIdFrame =	driver.findElementByXPath("//iframe[contains(@id,'Dialog_PopupWindow')]");

		driver.switchTo().frame(eleJobIdFrame);
		driver.findElementByXPath("//tr[contains(@id ,'_DXDataRow0')]").click();
		driver.findElementById("FindDialog_PopupActions_Menu_DXI0_").click();
		Thread.sleep(2000);
		driver.switchTo().frame(eleQueryFrame);
		driver.findElementById("Dialog_SAC_Menu_DXI0_").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[contains(@id,'LE_v1_DXSelBtn0_D')]").click();
		List<WebElement> eleRVCheckboxColumn = driver.findElementsByXPath("//table[contains(@id,'_v1_DXMainTable')]/tbody/tr/td[1]/span");
		WebElement eleRVRollBack= 	driver.findElementById("Vertical_mainMenu_Menu_DXI0_");
			
		if (VerifyAtLeastOneSelected(eleRVCheckboxColumn)) {
			eleRVRollBack.click();
		}
		else {
			eleRVRollBack.click();
			WebElement eleRVSelectVerification = driver.findElementById("dxss_1070595900");
			eleRVSelectVerification.isDisplayed();
			String asd = eleRVSelectVerification.getText();
			System.out.print(asd);
			
		}
	
		}
	
	public boolean VerifyAtLeastOneSelected(List<WebElement> allItems) {
 
		for (int i = 0; i < allItems.size(); i++) {
			//if (allItems.get(i).isSelected()) {
			allItems.get(i).click();
				return true;	 
		//	} 

		}
		return false;
	}

	}



