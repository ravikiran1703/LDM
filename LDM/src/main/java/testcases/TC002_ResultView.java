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
		testNodes = "Sample Checkin";
		authors ="Muthu Ravi Kiran";
		category = "smoke";
		dataSheetName="TC001";
		SheetName =	"Sheet1";
	}
	@Test(dataProvider="fetchData")
	public void ValidUsernameAndPassword(String uname, String pass,String RecievedBy,String Client,String Contact,String BroughtBy,String ProjectID,String NoOfSamp,String TestDescp,String Comment,String ESaveAnd) throws InterruptedException{
		new LoginPage() 
		.enterUsername(uname)
		.enterPassword(pass)  
		.clickLogin()
		.clickSamRegTag()
		.clickSamCheckin()
		.clickSCVNew()
		.clickSCEReceivedByFind()
		.doubleClickSCESelectRecievedBy(RecievedBy)
		.clickSCEClientFind()
		.doubleClickSCESelectClient(Client)
	 	.clickSCEContactNameFind()
		.doubleClickSCESelectContact(Contact)
		.clickSCEBroughtByFind()
		.doubleClickSCESelectBroughtBy(BroughtBy)
		.clickSCEProjectIDFind()
		.doubleClickSCESelectProjectID(ProjectID)
		.TypeNoOfSamples(NoOfSamp)
		.TypeTestDescp(TestDescp)
		.TypeComment(Comment)
		.clickSCESaveAndCloseOptions(ESaveAnd)
	
		;
	}

}
