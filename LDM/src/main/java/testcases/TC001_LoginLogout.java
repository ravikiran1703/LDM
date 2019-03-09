package testcases;

import org.testng.annotations.Test;
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
	public void ValidUsernameAndPassword() {
		new LoginPage() 
		.enterUsername("administrator")
		.enterPassword("password-1")  
		.clickLogin()
//		.clickSamCheckin()
//		.clickSCVNew()
//		.clickSCEClientFind()
//		.clickSCESelectClient()
//		.clickSCESaveOptions("Save and Close")
		;
	}
	@Test(dependsOnMethods = {"ValidUsernameAndPassword"})
	public void InValidUsernameAndValidPassword() {
		new LoginPage() 
		.enterUsername("admin")
		.enterPassword("password-1")
		.clickLogin() ;
	}
	@Test(dependsOnMethods = {"InValidUsernameAndValidPassword"})
	public void ValidUsernameAndInValidPassword() {
		new LoginPage() 
		.enterUsername("administrator")
		.enterPassword("password")
		.clickLogin() ;
	}
	@Test(dependsOnMethods = {"ValidUsernameAndPassword"})
	public void EmptyUsernameAndValidPassword() {
		new LoginPage() 
		.enterUsername(" ")
		.enterPassword("password-1")
		.clickLogin() ;
	}
	
	@Test(dependsOnMethods = {"EmptyUsernameAndValidPassword"})
	public void ValidUsernameAndEmptyPassword() {
		new LoginPage() 
		.enterUsername("administrator")
		.enterPassword(" ")
		.clickLogin() ;
	}
}











