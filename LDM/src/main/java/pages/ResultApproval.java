package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ResultApproval extends ProjectMethods {

	public ResultApproval() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI0_") WebElement eleRASave;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1_") WebElement eleRARollBack;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI2_") WebElement eleRAQueryData;
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleRAQueryFrame;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI3_") WebElement eleRARefresh;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI4_") WebElement eleRASymbol;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI5_") WebElement eleRAExportTo;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleRASearchText;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleRASearchBtn;
	@FindBy(how=How.XPATH, using="//span[contains(@id,'DXPagerBottom_PSB')]") WebElement eleRAPageSize;
	@FindBy(how=How.XPATH, using="//div[contains(@id,'DXPagerBottom_PSP_DXME_')]/ul/li/div/span") List<WebElement> eleRASelectPageSize;

	//Query Data::
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI0_") WebElement eleRAQueryOk;
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI1_") WebElement eleRAQueryCancel;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B0') and @title ='Find']") WebElement eleRAQueryJobIDFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleRAQueryJobIDClear;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B0') and @title ='Find']") WebElement eleRAQueryTestFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleRAQueryTestClear;

	//JobId Popup::
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleRAJobIdFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleRAJobIdText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleRAJobIdFindBtn;
	@FindBy(how=How.XPATH, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleRAJobIdFirstRow;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleRAJobIdOk;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleRAJobIdCancel;

	//Test Popup::
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleRATestFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleRATestText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleRATestFindBtn;
	@FindBy(how=How.XPATH, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleRATestFirstRow;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleRATestOk;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleRATestCancel;

	public ResultApproval clickRVSaveBtn() {
		click(eleRASave);
		return this;
	}

	public ResultApproval clickRVRollBackBtn() {
		click(eleRARollBack);
		return this;
	}

	public ResultApproval clickRVQueryDataBtn() {
		click(eleRAQueryData);
		switchToFrame(eleRAQueryFrame);
		return this;
	}

	public ResultApproval clickRVRefresh() {
		click(eleRARefresh);
		return this;
	}

	public ResultApproval clickRVSymbol() {
		click(eleRASymbol);
		return this;
	}

	public ResultApproval clickRVExportTo() {
		click(eleRAExportTo);
		return this;
	}
	public ResultApproval RVSearch(String data) {
		type(eleRASearchText,data);
		click(eleRASearchBtn);
		return this;
	}

	public ResultApproval SelectSLVPageSize(String data) {
		click(eleRAPageSize);
		clickbyElements(eleRASelectPageSize,data);

		return this;
	}

	//QueryData
	public ResultApproval clickRVJObIdOk() {
		click(eleRAQueryOk);
		return this;
	} 

	public ResultApproval clickRVJObIdCancel() {
		click(eleRAQueryCancel);
		return this;
	} 

	public ResultApproval getRVJobIDBtn() {
		click(eleRAQueryJobIDFind);
		switchToFrame(eleRAJobIdFrame);
		return this;
	} 

	public ResultApproval ClearRVJobIDBtn() {
		click(eleRAQueryJobIDClear);
		return this;
	} 

	public ResultApproval getRVTestBtn() {
		click(eleRAQueryTestFind);
		switchToFrame(eleRATestFrame);
		return this;
	} 

	public ResultApproval ClearRVTestBtn() {
		click(eleRAQueryTestClear);
		return this;
	}

	//JobId::
	public ResultApproval SearchRVJObId(String JobId) {
		type(eleRAJobIdText,JobId);
		click(eleRAJobIdFindBtn);
		return this;
	}

	public ResultApproval DoubleClickRVJObIdFirstRow() {
		doubleClick(eleRAJobIdFirstRow);
		return this;
	}

	public ResultApproval ClickRVJObIdFirstRow() {
		click(eleRAJobIdFirstRow);
		click(eleRAJobIdOk);
		return this;
	}

	public ResultApproval ClickRVJObIdCancelBtn() {
		click(eleRAJobIdCancel);
		return this;
	}

	//Test::
	public ResultApproval SearchRVTest(String Test) {
		type(eleRAJobIdText,Test);
		click(eleRAJobIdFindBtn);
		return this;
	}

	public ResultApproval DoubleClickRVTestSltFirstRow() {
		doubleClick(eleRAJobIdFirstRow);
		return this;
	}

	public ResultApproval ClickRVTestSltFirstRow() {
		click(eleRAJobIdFirstRow);
		click(eleRAJobIdOk);
		return this;
	}

	public ResultApproval ClickRVTestCancelBtn() {
		click(eleRAJobIdCancel);
		return this;
	}
}
