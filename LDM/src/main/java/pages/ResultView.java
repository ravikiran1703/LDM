package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import wdMethods.SeMethods;

public class ResultView extends SeMethods {
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI0_") WebElement eleRVRollBack;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1_") WebElement eleRVQueryPanel;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI2_") WebElement eleRVRefresh;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI3_") WebElement eleRVSymbol;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI4_") WebElement eleRVExportToBtn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI4_P") WebElement eleRVExportToDrpDwn;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleRVSearchTxt;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleRVSearchBtn;
	@FindBy(how=How.ID, using="dxp-comboBox") WebElement eleSCVPageSize;
	
	//Query Data::
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI0_") WebElement eleRVQueryOk;
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI1_") WebElement eleRVQueryCancel;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B0') and @title ='Find']") WebElement eleRVQueryJobIDFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleRVQueryJobIDClear;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B0') and @title ='Find']") WebElement eleRVQueryTestFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleRVQueryTestClear;
	
	//JobId Popup::
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleRVJobIdFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleRVJobIdText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleRVJobIdFindBtn;
	@FindBy(how=How.XPATH, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleRVJobIdFirstRow;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleRVJobIdOk;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleRVJobIdCancel;

	//Test Popup::
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleRVTestFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleRVTestText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleRVTestFindBtn;
	@FindBy(how=How.XPATH, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleRVTestFirstRow;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleRVTestOk;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleRVTestCancel;
	 
	public ResultView clickRVRollBack() {
		click(eleRVRollBack);
		return this;
	}
	public ResultView clickRVQueryPanel() {
		click(eleRVQueryPanel);
		return this;
	}
	public ResultView clickRVRefresh() {
		click(eleRVRefresh);
		return this;
	}
	public ResultView clickRVSymbol() {
		click(eleRVSymbol);
		return this;
	}
	public ResultView clickRVExportToBtn() {
		click(eleRVExportToBtn);
		return this;
	}
	public ResultView clickRVExportToDrpDwn() {
		click(eleRVExportToDrpDwn);
		return this;
	}
	public ResultView clickRVSearchTxt() {
		click(eleRVSearchTxt);
		return this;
	}
	public ResultView clickRVSearchBtn() {
		click(eleRVSearchBtn);
		return this;
	}
	

	//QueryData::
	public ResultView clickRVJObIdOk() {
		click(eleRVQueryOk);
		return this;
	} 

	public ResultView clickRVJObIdCancel() {
		click(eleRVQueryCancel);
		return this;
	} 

	public ResultView getRVJobIDBtn() {
		click(eleRVQueryJobIDFind);
		switchToFrame(eleRVJobIdFrame);
		return this;
	} 

	public ResultView ClearRVJobIDBtn() {
		click(eleRVQueryJobIDClear);
		return this;
	} 

	public ResultView getRVTestBtn() {
		click(eleRVQueryTestFind);
		switchToFrame(eleRVTestFrame);
		return this;
	} 

	public ResultView ClearRVTestBtn() {
		click(eleRVQueryTestClear);
		return this;
	}

	//JobId::
	public ResultView SearchRVJObId(String JobId) {
		type(eleRVJobIdText,JobId);
		click(eleRVJobIdFindBtn);
		return this;
	}

	public ResultView DoubleClickRVJObIdFirstRow() {
		doubleClick(eleRVJobIdFirstRow);
		return this;
	}

	public ResultView ClickRVJObIdFirstRow() {
		click(eleRVJobIdFirstRow);
		click(eleRVJobIdOk);
		return this;
	}

	public ResultView ClickRVJObIdCancelBtn() {
		click(eleRVJobIdCancel);
		return this;
	}

	//Test::
	public ResultView SearchRVTest(String Test) {
		type(eleRVTestText,Test);
		click(eleRVTestFindBtn);
		return this;
	}

	public ResultView DoubleClickRVTestSltFirstRow() {
		doubleClick(eleRVTestFirstRow);
		return this;
	}

	public ResultView ClickRVTestSltFirstRow() {
		click(eleRVTestFirstRow);
		click(eleRVTestOk);
		return this;
	}

	public ResultView ClickRVTestCancelBtn() {
		click(eleRVTestCancel);
		return this;
	}
}
