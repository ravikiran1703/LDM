package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class ResultEntry extends ProjectMethods {
	
	public ResultEntry() {
		PageFactory.initElements(driver, this);  
	}
	
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI0_") WebElement eleREDelete;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1_") WebElement eleRESave;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI2_") WebElement eleREQueryPanel;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI3_") WebElement eleRERefresh;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI4_") WebElement eleRESymbol;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI5_") WebElement eleREExportToBtn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI5_P") WebElement eleREExportDrpDwn;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleRESearchBox;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleRESearchBtn;
	@FindBy(how=How.XPATH, using="//span[contains(@id,'_DXSelAllBtn59_D')]") WebElement eleRESelectAll;
	@FindBy(how=How.XPATH, using="//span[contains(@id,'_DXSelBtn0_D')]") WebElement eleRESelectFirstRow;
	@FindBy(how=How.XPATH, using="//span[contains(@id,'DXPagerBottom_PSB')]") WebElement eleREPageSize;
	@FindBy(how=How.XPATH, using="//div[contains(@id,'DXPagerBottom_PSP_DXME_')]/ul/li/div/span") List<WebElement> eleRESelectPageSize;
	
	//Query Data::
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI0_") WebElement eleREQueryOk;
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI1_") WebElement eleREQueryCancel;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B0') and @title ='Find']") WebElement eleREQueryJobIDFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleREQueryJobIDClear;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B0') and @title ='Find']") WebElement eleREQueryTestFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleREQueryTestClear;
	
	//JobId Popup::
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleREJobIdFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleREJobIdText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleREJobIdFindBtn;
	@FindBy(how=How.XPATH, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleREJobIdFirstRow;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleREJobIdOk;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleREJobIdCancel;

	//Test Popup::
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleRETestFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleRETestText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleRETestFindBtn;
	@FindBy(how=How.XPATH, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleRETestFirstRow;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleRETestOk;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleRETestCancel;
	 
	public ResultEntry clickREDelete() {
		verifyEnabled(eleREDelete) ;
		click(eleREDelete);
		return this;
	}
	
	public ResultEntry clickRESave() {
		click(eleRESave);
		return this;   
	}
	
	public ResultEntry clickREQueryPanel() {
		click(eleREQueryPanel);
		return this;   
	}
	public ResultEntry clickRERefresh() {
		click(eleRERefresh);
		return this;   
	}
	public ResultEntry clickRESymbol() {
		click(eleRESymbol);
		return this;   
	}
	public ResultEntry clickREExportToBtn() {
		click(eleREExportToBtn);
		return this;   
	}
	public ResultEntry clickREExportDrpDwn() {
		click(eleREExportDrpDwn);
		return this;   
	}
	public ResultEntry clickRESearchBox() {
		click(eleRESearchBox);
		return this;   
	}
	public ResultEntry clickRESearchBtn() {
		click(eleRESearchBtn);
		return this;   
	}
	public ResultEntry clickRESelectAll() {
		click(eleRESelectAll);
		return this;   
	}
	public ResultEntry clickRESelectFirstRow() {
	
		click(eleRESelectFirstRow);
	return this;   
	}
	
	public ResultEntry SelectSLVPageSize(String data) {
		click(eleREPageSize);
		clickbyElements(eleRESelectPageSize,data);
		
		return this;
	}
	
	
	//QueryData::
	public ResultEntry clickREJObIdOk() {
		click(eleREQueryOk);
		return this;
	} 

	public ResultEntry clickREJObIdCancel() {
		click(eleREQueryCancel);
		return this;
	} 

	public ResultEntry getREJobIDBtn() {
		click(eleREQueryJobIDFind);
		switchToFrame(eleREJobIdFrame);
		return this;
	} 

	public ResultEntry ClearREJobIDBtn() {
		click(eleREQueryJobIDClear);
		return this;
	} 

	public ResultEntry getRETestBtn() {
		click(eleREQueryTestFind);
		switchToFrame(eleRETestFrame);
		return this;
	} 

	public ResultEntry ClearRETestBtn() {
		click(eleREQueryTestClear);
		return this;
	}

	//JobId::
	public ResultEntry SearchREJObId(String JobId) {
		type(eleREJobIdText,JobId);
		click(eleREJobIdFindBtn);
		return this;
	}

	public ResultEntry DoubleClickREJObIdFirstRow() {
		doubleClick(eleREJobIdFirstRow);
		return this;
	}

	public ResultEntry ClickREJObIdFirstRow() {
		click(eleREJobIdFirstRow);
		click(eleREJobIdOk);
		return this;
	}

	public ResultEntry ClickREJObIdCancelBtn() {
		click(eleREJobIdCancel);
		return this;
	}

	//Test::
	public ResultEntry SearchRETest(String Test) {
		type(eleRETestText,Test);
		click(eleRETestFindBtn);
		return this;
	}

	public ResultEntry DoubleClickRETestSltFirstRow() {
		doubleClick(eleRETestFirstRow);
		return this;
	}

	public ResultEntry ClickRETestSltFirstRow() {
		click(eleRETestFirstRow);
		click(eleRETestOk);
		return this;
	}

	public ResultEntry ClickRETestCancelBtn() {
		click(eleRETestCancel);
		return this;
	}
	}
