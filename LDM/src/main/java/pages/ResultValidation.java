package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ResultValidation  extends ProjectMethods{

	public ResultValidation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI0_") WebElement eleRValSave;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1_") WebElement eleRValRollBack;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI2_") WebElement eleRValQueryData;
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleRValQueryFrame;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI3_") WebElement eleRValRefresh;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI4_") WebElement eleRValSymbol;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI5_") WebElement eleRValExportTo;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleRValSearchText;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleRValSearchBtn;
	@FindBy(how=How.XPATH, using="//span[contains(@id,'DXPagerBottom_PSB')]") WebElement eleRValPageSize;
	
	@FindBy(how=How.XPATH, using="//div[contains(@id,'DXPagerBottom_PSP_DXME_')]/ul/li/div/span") List<WebElement> eleRValSelectPageSize;
	
	//Query Data::
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI0_") WebElement eleRValQueryOk;
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI1_") WebElement eleRValQueryCancel;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B0') and @title ='Find']") WebElement eleRValQueryJobIDFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleRValQueryJobIDClear;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B0') and @title ='Find']") WebElement eleRValQueryTestFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleRValQueryTestClear;
	
	//JobId Popup::
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleRValJobIdFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleRValJobIdText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleRValJobIdFindBtn;
	@FindBy(how=How.XPATH, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleRValJobIdFirstRow;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleRValJobIdOk;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleRValJobIdCancel;

	//Test Popup::
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleRValTestFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleRValTestText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleRValTestFindBtn;
	@FindBy(how=How.XPATH, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleRValTestFirstRow;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleRValTestOk;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleRValTestCancel;

	public ResultValidation clickRValSaveBtn() {
		click(eleRValSave);
		return this;
	}

	public ResultValidation clickRValRollBackBtn() {
		click(eleRValRollBack);
		return this;
	}

	public ResultValidation clickRValQueryDataBtn() {
		click(eleRValQueryData);
		switchToFrame(eleRValQueryFrame);
		return this;
	}

	public ResultValidation clickRValRefresh() {
		click(eleRValRefresh);
		return this;
	}

	public ResultValidation clickRValSymbol() {
		click(eleRValSymbol);
		return this;
	}

	public ResultValidation clickRValExportTo() {
		click(eleRValExportTo);
		return this;
	}
	public ResultValidation RValSearch(String data) {
		type(eleRValSearchText,data);
		click(eleRValSearchBtn);
		return this;
	}
	
	public ResultValidation SelectSLVPageSize(String data) {
		click(eleRValPageSize);
		clickfromList(eleRValSelectPageSize,data);
		
		return this;
	}

	//QueryData
	public ResultValidation clickRValJObIdOk() {
		click(eleRValQueryOk);
		return this;
	} 

	public ResultValidation clickRValJObIdCancel() {
		click(eleRValQueryCancel);
		return this;
	} 

	public ResultValidation getRValJobIDBtn() {
		click(eleRValQueryJobIDFind);
		switchToFrame(eleRValJobIdFrame);
		return this;
	} 

	public ResultValidation ClearRValJobIDBtn() {
		click(eleRValQueryJobIDClear);
		return this;
	} 

	public ResultValidation getRValTestBtn() {
		click(eleRValQueryTestFind);
		switchToFrame(eleRValTestFrame);
		return this;
	} 

	public ResultValidation ClearRValTestBtn() {
		click(eleRValQueryTestClear);
		return this;
	}

	//JobId::
	public ResultValidation SearchRValJObId(String JobId) {
		type(eleRValJobIdText,JobId);
		click(eleRValJobIdFindBtn);
		return this;
	}

	public ResultValidation DoubleClickRValJObIdFirstRow() {
		doubleClick(eleRValJobIdFirstRow);
		return this;
	}

	public ResultValidation ClickRValJObIdFirstRow() {
		click(eleRValJobIdFirstRow);
		click(eleRValJobIdOk);
		return this;
	}

	public ResultValidation ClickRValJObIdCancelBtn() {
		click(eleRValJobIdCancel);
		return this;
	}

	//Test::
	public ResultValidation SearchRValTest(String Test) {
		type(eleRValJobIdText,Test);
		click(eleRValJobIdFindBtn);
		return this;
	}

	public ResultValidation DoubleClickRValTestSltFirstRow() {
		doubleClick(eleRValJobIdFirstRow);
		return this;
	}

	public ResultValidation ClickRValTestSltFirstRow() {
		click(eleRValJobIdFirstRow);
		click(eleRValJobIdOk);
		return this;
	}

	public ResultValidation ClickRValTestCancelBtn() {
		click(eleRValJobIdCancel);
		return this;
	}	
}
