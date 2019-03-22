package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_SampleCheckin extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName = "TC003_SampleCheckin";
		testDescription ="SampleCheckin";
		testNodes = "CheckIn";
		authors ="Muthu Ravi Kiran";
		category = "smoke";
		dataSheetName="";
		SheetName =	"";
	}
	@Test()
	public void ValidUsernameAndPassword() throws InterruptedException{
		new LoginPage() 
		.enterUsername("administrator")
		.enterPassword("password-1")  
		.clickLogin()
		.clickSamRegTag().clickSamCheckin().clickSCVNew()
;
	}
}
