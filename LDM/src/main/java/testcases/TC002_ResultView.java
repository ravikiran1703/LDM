package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_ResultView extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName = "TC002_ResultView";
		testDescription ="ResultView";
		testNodes = "Result";
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
		//.clickSamRegTag().clickSamCheckin().clickSCVQueryPanel()

		.clickAnalysisTag().clickResultView()
				
		.clickRVQueryDataBtn()
		.getRVJobIDBtn()
		.switchRVJobIDFrame()
		.DoubleClickRVJObIdFirstRow()
		.clickRVJObIdOk()
		.clickRVRollBack()
		;
	}

}
