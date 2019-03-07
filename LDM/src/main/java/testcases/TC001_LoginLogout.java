package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginLogout extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName = "TC001_Login";
		testDescription ="Login to LDM";
		testNodes = "Leads";
		authors ="Muthu Ravi Kiran";
		category = "smoke";
		//dataSheetName=" ";
	}
	@Test()
	public void loginLogoutAndSaveClient() {
		new LoginPage() 
		.enterUsername("administrator")
		.enterPassword("password-1")  
		.clickLogin()
		.clickSamCheckin().clickSCVQueryPanel()

		.clickSCVNew()
		.clickSCEClientFind()
		.clickSCESelectClient()
		.clickSCESaveOptions("Save and Close")
		;
	}
//	@Test(dependsOnMethods = {"loginLogoutAndSaveClient"})
//	public void SaveJobID() {
//		new LoginPage() 
//		.enterUsername("administrator")
//		.enterPassword("password-1").clickLogin() .clickSamLogin().clickSLVNew().clickSLENew().SelectSLEJobId().typeSLEClientSampleID("Sample-1")
//		.clickSLESave();
//	}

}











