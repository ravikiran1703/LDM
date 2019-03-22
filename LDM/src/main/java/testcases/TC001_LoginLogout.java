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
		dataSheetName="TC001";
		SheetName =	"sheet1";
	}
	@Test(dataProvider="fetchData")
	public void ValidUsernameAndPassword(String uname, String pass) {
		new LoginPage() 
		.enterUsername(uname)
		.enterPassword(pass)  
		.clickLogin()
		.clickSamRegTag()
		.clickSamCheckin()
		.clickSCVNew()
		.clickSCEClientFind()
		.clickSCESelectClient()
		.clickSCESaveOptions("Save and Close")
		;
	}

}











