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

	//TextBox
	@FindBy(how=How.XPATH, using="//input[contains(@id,'_dviProjectName_Edit_I')]") WebElement eleSCEProjectNameTxtB;
	@FindBy(how=How.XPATH, using="//input[contains(@id,'dviJobID_Edit_I')]") WebElement eleSCEJobIDTxtB;

	//Frames for Find Button
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCEPopupFrame;
	//	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCEClientlistFrame;
	//	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCERecievedByFrame;
	//	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCEContactNameFrame;
	//	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCEBroughtByFrame;
	//	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCEProjectIDFrame;

	//RecievedBy PopupControls::
	@FindBy(how=How.XPATH, using="//table[starts-with(@id,'FindDialog') and contains(@id,'DXMainTable')]/tbody/tr/td[2]") List<WebElement> eleSCERecievedByList;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleSCERecievedByCancelBtn;

	//Contacts PopupControls::
	@FindBy(how=How.XPATH, using="//table[starts-with(@id,'FindDialog') and contains(@id,'DXMainTable')]/tbody/tr/td[2]") List<WebElement> eleSCEContactsList;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleSCEContactCancelBtn;

	//projectID PopupControls::
	@FindBy(how=How.XPATH, using="//table[starts-with(@id,'FindDialog') and contains(@id,'DXMainTable')]/tbody/tr/td[2]") List<WebElement> eleSCEProjectIDList;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleSCEprojectIDCancelBtn;

	//Clients PopupControls::
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleSCEClientsSearchBarTxt;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleSCEClientsSearchBtn;
	@FindBy(how=How.XPATH, using="//table[starts-with(@id,'FindDialog') and contains(@id,'DXMainTable')]/tbody/tr/td[2]") List<WebElement> eleSCEClientList;
	@FindBy(how=How.ID, using="FindDialog_OC_Menu_DXI0_") WebElement eleSCENewClientBtn;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleSCEClientCancelBtn;

	//BroughtBy PopupControls::
	@FindBy(how=How.XPATH, using="//table[starts-with(@id,'FindDialog') and contains(@id,'DXMainTable')]/tbody/tr/td[2]") List<WebElement> eleSCEBroughtByList;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleSCEBroughtBySearchBarTxt;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleSCEBroughtBySearchBtn;
	@FindBy(how=How.ID, using="FindDialog_OC_Menu_DXI0_") WebElement eleSCENewBroughtByBtn;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleSCEBroughtByCancelBtn;



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
	@FindBy(how=How.XPATH, using="//table[contains(@id,'dviDueDate_Edit_DDD_C_FNP_y')]/tbody/tr/td[contains(@class,'dxeCalendarFastNavYear_XafTheme')]") List<WebElement> eleSCEDueDateYearList;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'dviRecievedDate_Edit_DDD_C_FNP_y')]/tbody/tr/td[contains(@class,'dxeCalendarFastNavYear_XafTheme')]") List<WebElement> eleSCERecievedDateYearList;

	//Months
	@FindBy(how=How.XPATH, using="//table[contains(@id,'dviRecievedDate_Edit_DDD_C_FNP_m')]/tbody/tr/td") List<WebElement> eleSCERecievedDateMonthsList;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'dviDueDate_Edit_DDD_C_FNP_y')]/tbody/tr/td") List<WebElement> eleSCEDueDateMonthsList;

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


	// JobId Caption after only the 'save' button is clicked:: 
	@FindBy(how=How.CLASS_NAME, using="XafVCap-Second MainMenuTruncateCaption") WebElement eleSCESavedJobIdCaption;

	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1i1_") WebElement eleSCESaveBtn;

	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1_P") WebElement eleSCESaveDrpdwnBtn;
	@FindBy(how=How.XPATH, using="//div[@id='Vertical_mainMenu_Menu_DXSA1']//a") List<WebElement> eleSCESaveTypeslist;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI2_") WebElement eleSCEDeleteBtn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI3_") WebElement eleSCERefreshBtn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI4_") WebElement eleSCESymbolBtn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI5_") WebElement eleSCEPrevJobIdBtn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI6_") WebElement eleSCENextJobIdBtn;

	@FindBy(how=How.CLASS_NAME, using="XafVCap-Second MainMenuTruncateCaption") WebElement eleSCEJobIDCaption;

	@FindBy(how=How.XPATH, using="//li[contains(@id,'dviSampleCategoryName_ObjectsCreation_Menu_DXI0')]") WebElement eleSCESamCatLinkBtn;
	@FindBy(how=How.XPATH, using="//li[contains(@id,'dviSampleCategoryName_ObjectsCreation_Menu_DXI1')][2]") WebElement eleSCESamCatUnLinkBtn;

	@FindBy(how=How.XPATH, using="//li[contains(@id,'dviSampleCategoryName_ToolBar_Menu_DXI0')]") WebElement eleSCESamCatEditBtn;
	@FindBy(how=How.XPATH, using="//li[contains(@id,'dviSampleCategoryName_ToolBar_Menu_DXI1')][2]") WebElement eleSCESamCatSymbolBtn;
	@FindBy(how=How.XPATH, using="//li[contains(@id,'dviSampleCategoryName_ToolBar_Menu_DXI3')][2]") WebElement eleSCESamCatDotBtn;

	@FindBy(how=How.XPATH, using="//li[contains(@id,'dviSampleCategoryName_ToolBar_Menu_DXI2_')][2]") WebElement eleSCESamCatExportToBtn;
	@FindBy(how=How.XPATH, using="//div[contains(@id,'dviSampleCategoryName_ToolBar_Menu_DXI2_P')]") WebElement eleSCESamCatExportToDrpBtn;
	@FindBy(how=How.XPATH, using="//div[contains(@id,'dviSampleCategoryName_ToolBar_Menu_DXSA2')]/ul/li/a") List<WebElement> eleSCESamCatExportToList;

	@FindBy(how=How.XPATH, using="//li[contains(@id,'dviImageUpload_ObjectsCreation_Menu_DXI0')]") WebElement eleSCEImgUpLink;
	@FindBy(how=How.XPATH, using="//li[contains(@id,'dviImageUpload_ObjectsCreation_Menu_DXI1')][2]") WebElement eleSCEImgUpUnLink;

	@FindBy(how=How.XPATH, using="//li[contains(@id,'dviImageUpload_ToolBar_Menu_DXI0')]") WebElement eleSCEImgUpEditBtn;
	@FindBy(how=How.XPATH, using="//li[contains(@id,'dviImageUpload_ToolBar_Menu_DXI1')][2]") WebElement eleSCEImgUpSymbolBtn;
	@FindBy(how=How.XPATH, using="//li[contains(@id,'dviImageUpload_ToolBar_Menu_DXI3')][2]") WebElement eleSCEImgUpDotBtn;

	@FindBy(how=How.XPATH, using="//li[contains(@id,'dviImageUpload_ToolBar_Menu_DXI2_')][2]") WebElement eleSCEImgUpExportToBtn;
	@FindBy(how=How.XPATH, using="//div[contains(@id,'dviImageUpload_ToolBar_Menu_DXI2_P')]") WebElement eleSCEImgUpExportToDrpBtn;
	@FindBy(how=How.XPATH, using="//div[contains(@id,'dviImageUpload_ToolBar_Menu_DXSA2')]/ul/li/a") List<WebElement> eleSCEImgUpExportToList;

	// the Flash Message popups after saving JobId, Id cannot be used because the number may vary if the changes happens::
	@FindBy(how=How.XPATH, using="//div[@id ='ScriptContainer']/script[contains(@id,'dxss') and contains(text(),'Saved Success')]") WebElement eleSCEVerifySave;
	//@FindBy(how=How.ID, using="dxss_830993610") WebElement eleSCEVerifySave;

	public SampleCheckinEdit clickSCEClientFind() {
		click(eleSCEClientFindBtn);
		return  this;   
	}

	public SampleCheckinEdit clickSCEContactNameFind() {
		click(eleSCEContactNameFindBtn);
		return  this;   
	}

	public SampleCheckinEdit clickSCEBroughtByFind() {
		click(eleSCEBroughtByFindBtn);
		return  this;   
	}
	public SampleCheckinEdit clickSCEProjectIDFind() {
		click(eleSCEProjectIDFindBtn);
		return  this;   
	}

	public SampleCheckinEdit clickSCEReceivedByFind() {
		click(eleSCERecievedByFindBtn);
		return  this;   
	}

	public SampleCheckinEdit clickSCEClientClear() {
		click(eleSCEClientClearBtn);
		return  this;   
	}

	public SampleCheckinEdit clickSCEBroughtByClear() {
		click(eleSCEBroughtByClearBtn);
		return  this;   
	}

	public SampleCheckinEdit clickSCERecievedByClear() {
		click(eleSCERecievedByClearBtn);
		return  this;   
	}

	public SampleCheckinEdit clickSCEProjectIDClear() {
		click(eleSCEProjectIDClearBtn);
		return  this;   
	}

	public SampleCheckinEdit clickSCEContactClear() {
		click(eleSCEContactNameClearBtn);
		return  this;   
	}


	public SampleCheckinEdit TypeNoOfSamples(String NOofSamp) {

		return  this;   
	}

	public SampleCheckinEdit TypeTestDescp(String TestDescp) {

		return  this;   
	}

	public SampleCheckinEdit TypeComment(String Comment) {

		return  this;   
	}

	public SampleCheckinEdit doubleClickSCESelectClient(String ClientName)  {
		switchToFrame(eleSCEPopupFrame);
		doubleClickElements(eleSCEClientList,ClientName);	      
		return this;   
	}

	public SampleCheckinEdit doubleClickSCESelectBroughtBy(String BroughtBy)  {
		switchToFrame(eleSCEPopupFrame);
		doubleClickElements(eleSCEBroughtByList,BroughtBy);	      
		return this;   
	}

	public SampleCheckinEdit doubleClickSCESelectContact(String Contact)  {
		switchToFrame(eleSCEPopupFrame);
		doubleClickElements(eleSCEContactsList,Contact);	      
		return this;   
	}

	public SampleCheckinEdit doubleClickSCESelectRecievedBy(String RecievedBy)  {
		switchToFrame(eleSCEPopupFrame);
		doubleClickElements(eleSCERecievedByList,RecievedBy);	      
		return this;   
	}

	public SampleCheckinEdit doubleClickSCESelectProjectID(String ProjectID)  {
		switchToFrame(eleSCEPopupFrame);
		doubleClickElements(eleSCEProjectIDList,ProjectID);	      
		return this;   
	}




	public SampleCheckinEdit clickSCESave() {
		click(eleSCESaveBtn);
		acceptAlert();
		return this;   
	}


	public SampleCheckinEdit clickSCESaveOptions(String saveType) {
		mousehoverandClick(eleSCESaveDrpdwnBtn);
		clickfromList(eleSCESaveTypeslist,saveType);
		acceptAlert();
		verifyDisplayed(eleSCEVerifySave);
		return this;  

	}

	public HomePage clickSCESaveAndCloseOptions(String saveType) {
		mousehoverandClick(eleSCESaveDrpdwnBtn);
		clickfromList(eleSCESaveTypeslist,saveType);
		acceptAlert();
	//	verifyDisplayed(eleSCEVerifySave);
		return new HomePage();  
	}
}
