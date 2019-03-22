package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SampleCheckinEdit  extends ProjectMethods{


	public SampleCheckinEdit() {
		PageFactory.initElements(driver, this);
	}
	//Find and Clear Button::
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviClientName_Edit_find_Edit_B0')]") WebElement eleSCEClientFindBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviClientName_Edit_find_Edit_B1')]") WebElement eleSCEClientClearBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviRecievedBy_Edit_find_Edit_B0')]") WebElement eleSCERecievedByFindBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviRecievedBy_Edit_find_Edit_B1')]") WebElement eleSCERecievedByClearBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviContactName_Edit_find_Edit_B0')]") WebElement eleSCEContactNameFindBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviContactName_Edit_find_Edit_B1')]") WebElement eleSCEContactNameClearBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviBroughtBy_Edit_find_Edit_B0')]") WebElement eleSCEBroughtByFindBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviBroughtBy_Edit_find_Edit_B1')]") WebElement eleSCEBroughtByClearBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviProjectID_Edit_find_Edit_B0')]") WebElement eleSCEProjectIDFindBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviProjectID_Edit_find_Edit_B1')]") WebElement eleSCEProjectIDClearBtn;

	// Text Area:
	@FindBy(how=How.XPATH, using="//textarea[contains(@id,'_dviClientAddress_Edit_I')]") WebElement eleSCEClientAddresTxt;
	@FindBy(how=How.XPATH, using="//textarea[contains(@id,'_dviComment_Edit_I')]") WebElement eleSCECommentTxt;
	@FindBy(how=How.XPATH, using="//textarea[contains(@id,'_dviTestDescription_Edit_I')]") WebElement eleSCETestDescriptionTxt;

	//Frames for Find Button
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCEClientlistFrame;
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCERecievedByFrame;
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCEContactNameFrame;
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCEBroughtByFrame;
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCEProjectIDFrame;

	//TextBox
	@FindBy(how=How.XPATH, using="//input[contains(@id,'_dviProjectName_Edit_I')]") WebElement eleSCEProjectNameTxtB;
	@FindBy(how=How.XPATH, using="//input[contains(@id,'dviJobID_Edit_I')]") WebElement eleSCEJobIDTxtB;

	//Date TextBox::
	@FindBy(how=How.XPATH, using="//input[contains(@id,'_dviRecievedDate_Edit_I')]") WebElement eleSCERecievedDateTxtB;
	@FindBy(how=How.XPATH, using="//input[contains(@id,'_dviDueDate_Edit_I')]") WebElement eleSCEDueDateTxtB;

	// Previous and Next Button Date controls::
	// Year::
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviRecievedDate_Edit_DDD_C_PYC')]") WebElement eleSCERecievedDatePrevYearBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviRecievedDate_Edit_DDD_C_NYC')]") WebElement eleSCERecievedDateNextYearBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviDueDate_Edit_DDD_C_PYC')]") WebElement eleSCEDueDatePrevYearBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviDueDate_Edit_DDD_C_NYC')]") WebElement eleSCEDueDateNextYearBtn;
	//Month::
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviRecievedDate_Edit_DDD_C_PMC')]") WebElement eleSCERecievedDatePrevMonthBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviRecievedDate_Edit_DDD_C_NMC')]") WebElement eleSCERecievedDateNextMonthBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviDueDate_Edit_DDD_C_PMC')]") WebElement eleSCEDueDatePrevMonthBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviDueDate_Edit_DDD_C_NMC')]") WebElement eleSCEDueDateNextMonthBtn;

	// Xpath - List of dates in a given month::
	@FindBy(how=How.XPATH, using="//table[contains(@id,'dviRecievedDate_Edit_DDD_C_mt')]/tbody/tr/td[(not(contains(@class,'dxeCalendarOtherMonth'))) and (contains(@class,'dxeCalendarDay_XafTheme'))]") List<WebElement> eleSCERecievedDateDateList;

	//Year and month header Display::
	@FindBy(how=How.XPATH, using="//span[contains(@id,'dviRecievedDate_Edit_DDD_C_T')]") WebElement eleSCERecievedDateMonthYrDisplay;

	//Years and months List::
	//Years
	@FindBy(how=How.XPATH, using="//table[contains(@id,'dviDueDate_Edit_DDD_C_FNP_y')]/tbody/tr/td[contains(@class,'dxeCalendarFastNavYear_XafTheme')]") WebElement eleSCEDueDateYearList;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'dviRecievedDate_Edit_DDD_C_FNP_y')]/tbody/tr/td[contains(@class,'dxeCalendarFastNavYear_XafTheme')]") WebElement eleSCERecievedDateYearList;

	//Months
	@FindBy(how=How.XPATH, using="//table[contains(@id,'dviRecievedDate_Edit_DDD_C_FNP_m')]/tbody/tr/td") WebElement eleSCERecievedDateMonthsList;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'dviDueDate_Edit_DDD_C_FNP_y')]/tbody/tr/td") WebElement eleSCEDueDateMonthsList;

	// Previous and Next 10 Years ::
	@FindBy(how=How.XPATH, using="//table[contains(@id,'dviRecievedDate_Edit_DDD_C_FNP_y')]/tbody/tr/td[1]") WebElement eleSCERecievedDateYearPrevBtn;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'dviRecievedDate_Edit_DDD_C_FNP_y')]/tbody/tr/td[1]") WebElement eleSCERecievedDateYearNextBtn;

	@FindBy(how=How.XPATH, using="//table[contains(@id,'dviDueDate_Edit_DDD_C_FNP_y')]/tbody/tr/td[1]") WebElement eleSCEDueDateYearPrevBtn;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'dviDueDate_Edit_DDD_C_FNP_y')]/tbody/tr/td[7]") WebElement eleSCEDueDateYearNextBtn;
	
	//Date Controls Buttons
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviRecievedDate_Edit_DDD_C_BT')]") WebElement eleSCERecievedDateTodayBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviRecievedDate_Edit_DDD_C_BC')]") WebElement eleSCERecievedDateClearBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviRecievedDate_Edit_DDD_C_FNP_BO')]") WebElement eleSCERecievedDateOkBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviRecievedDate_Edit_DDD_C_FNP_BC')]") WebElement eleSCERecievedDateCancelBtn;

	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviDueDate_Edit_DDD_C_BT')]") WebElement eleSCEDueDateTodayBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviDueDate_Edit_DDD_C_BC')]") WebElement eleSCEDueDateClearBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviDueDate_Edit_DDD_C_FNP_BO')]") WebElement eleSCEDueDateOkBtn;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'dviDueDate_Edit_DDD_C_FNP_BC')]") WebElement eleSCEDueDateCancelBtn;



	@FindBy(how=How.XPATH, using="//td[@class='dxgv dx-al' and text() = '6 Solutions']") WebElement eleSCESelectClient;



	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1i1_") WebElement eleSCESaveBtn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1_P") WebElement eleSCESaveDrpdwn;


	@FindBy(how=How.ID, using="dxss_830993610") WebElement eleSCEVerifySave;

	@FindBy(how=How.CLASS_NAME, using="XafVCap-Second MainMenuTruncateCaption") WebElement eleSCEJobIDCaption;
	@FindBy(how=How.XPATH, using="//div[@id='Vertical_mainMenu_Menu_DXSA1']/ul/li/a/span[1]") List<WebElement> allItems ;

	// the below xpath is to check the error for the maditory field - just change the td contains text  
	//@FindBy(how=How.XPATH, using="//table[contains(@class,'ErrorMessage')]//tr[2]/td[contains(text(),'Client Name')]") WebElement eleSCEError;


	public SampleCheckinEdit clickSCEClientFind() {
		click(eleSCEClientFindBtn);
		return  this;   
	}

	public SampleCheckinEdit clickSCESelectClient()  {
		switchToFrame(eleSCEClientlistFrame);
		doubleClick(eleSCESelectClient);	       
		return this;   
	}

	public SampleCheckinEdit clickSCESave() {
		click(eleSCESaveBtn);
		acceptAlert();
		return this;   
	}

	public SampleCheckinEdit clickSCESaveOptions(String saveType) {
		mousehoverandClick(eleSCESaveDrpdwn);
		clickbyElements(allItems,saveType);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		acceptAlert();
		return this;   
	}

}
