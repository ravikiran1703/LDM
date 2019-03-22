package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class SampleCheckinView  extends ProjectMethods{

	public SampleCheckinView() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI0_") WebElement eleSCVNew;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1_") WebElement eleSCVDelete;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI2_") WebElement eleSCVEdit;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI3_") WebElement eleSCVViewAll;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI4_") WebElement eleSCVQueryData ;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI5_") WebElement eleSCVRefresh;
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCVQueryFrame;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI6_") WebElement eleSCVSymbol;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI8_") WebElement eleSCVDotsbtn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI7_") WebElement eleSCVExportTo;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI7_P") WebElement eleSCVExportDrpDwn;
	@FindBy(how=How.XPATH, using="//div[@id='Vertical_mainMenu_Menu_DXSA7']/ul/li/a/span") List<WebElement> eleSCVExporttoList;  
	
	@FindBy(how=How.XPATH, using="//table[@class='dxgvTable_XafTheme dxgvRBB']/tbody/tr[2]/td[1]//span[@class='dxWeb_edtCheckBoxUnchecked_XafTheme dxICheckBox_XafTheme dxichSys dx-not-acc']")WebElement eleSCVSelectAll;
	@FindBy(how=How.XPATH, using="//span[contains(@id,'DXPagerBottom_PSB')]") WebElement eleSCVPageSize;
	@FindBy(how=How.XPATH, using="//div[contains(@id,'DXPagerBottom_PSP_DXME_')]/ul/li/div/span") List<WebElement> eleSCVSelectPageSize;
	
	//QueryData Popup:
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI0_") WebElement eleSCVQueryOk;
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI1_") WebElement eleSCVQueryCancel;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B0') and @title ='Find']") WebElement eleSCVQueryJobIDFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleSCVQueryJobIDClear;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B0') and @title ='Find']") WebElement eleSCVQueryTestFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleSCVQueryTestClear;

	//JobId Popup:
	
	@FindBy(how=How.XPATH, using="/html[1]/body[1]/form[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/iframe[1]") WebElement eleSCVJobIdFrame;
	//@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleSCVJobIdFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleSCVJobIdText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleSCVJobIdFindBtn;
	@FindBy(how=How.ID, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleSCVJobIdFirstRow;
	@FindBy(how=How.XPATH, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleSCVJobIdOk;
	@FindBy(how=How.XPATH, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleSCVJobIdCancel;

	//@FindBy(how=How.XPATH, using="//table[contains(@id,'_dviJobID_Edit_find_Edit')]//input") WebElement eleQueryJobIDText;
	//@FindBy(how=How.XPATH, using="//table[contains(@id,'_dviTestName_Edit_find_Edit')]//input[@class ='dxeEditArea_XafTheme dxeEditAreaSys dxh0']") WebElement eleQueryTestText;

	//Test Popup::
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleSCVTestFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleSCVTestText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleSCVTestFindBtn;
	@FindBy(how=How.XPATH, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleSCVTestFirstRow;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleSCVTestOk;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleSCVTestCancel;


	public SampleCheckinEdit clickSCVNew() {
		click(eleSCVNew);
		return new SampleCheckinEdit();   
	}

	public SampleCheckinEdit clickSCVEdit() {
		verifyEnabled(eleSCVEdit);
		if(eleSCVEdit.isEnabled()) { 
		click(eleSCVEdit);
		}
		
		return new SampleCheckinEdit();   
	}

	public SampleCheckinView clickSCVDelete() {
		verifyEnabled(eleSCVDelete);
		if(eleSCVDelete.isEnabled()) { 
		click(eleSCVDelete);
		}
		return this;   
	}

	public SampleCheckinView clickSCVViewAll() {
		click(eleSCVViewAll);
		return this;   
	}

	public SampleCheckinView clickSCVSymbol() {
		click(eleSCVSymbol);
		return this;   
	}

	public SampleCheckinView clickSCVQueryPanel() {
		click(eleSCVQueryData);
		switchToFrame(eleSCVQueryFrame);
		return this;    
	}


	public SampleCheckinView clickSCVRefresh() {
		click(eleSCVRefresh);
		return this;   
	}

	public SampleCheckinView clickSCVSelectAll() {
		click(eleSCVSelectAll);
		return this;   
	}

	public SampleCheckinView SCVExportTo(String ExportTo) {
		mousehover(eleSCVDotsbtn);
		click(eleSCVExportTo);
		return this;
	}

	public SampleCheckinView SCVExportToByFileType(String ExportTo) {
		mousehoverandClick(eleSCVDotsbtn);
		mousehoverandClick(eleSCVExportDrpDwn);
		clickbyElements(eleSCVExporttoList,ExportTo);
		return this;   
	}

	public SampleCheckinView SelectSCVPageSize(String data) {
		click(eleSCVPageSize);
		clickbyElements(eleSCVSelectPageSize,data);
		return this;
	}
	
	
	//QueryData::
	public SampleCheckinView clickSCVJObIdOk() {
		click(eleSCVQueryOk);
		return this;
	} 

	public SampleCheckinView clickSCVJObIdCancel() {
		click(eleSCVQueryCancel);
		return this;
	} 

	public SampleCheckinView getSCVJobIDBtn() {
		click(eleSCVQueryJobIDFind);
		switchToFrame(eleSCVJobIdFrame);
		return this;
	} 

	public SampleCheckinView ClearSCVJobIDBtn() {
		click(eleSCVQueryJobIDClear);
		return this;
	} 

	public SampleCheckinView getSCVTestBtn() {
		click(eleSCVQueryTestFind);
		switchToFrame(eleSCVTestFrame);
		return this;
	} 

	public SampleCheckinView ClearSCVTestBtn() {
		click(eleSCVQueryTestClear);
		return this;
	}
	


	//JobId::
	public SampleCheckinView SearchSCVJObId(String JobId) {
		type(eleSCVJobIdText,JobId);
		click(eleSCVJobIdFindBtn);
		return this;
	}

	public SampleCheckinView DoubleClickSCVJObIdFirstRow() {
		doubleClick(eleSCVJobIdFirstRow);
		return this;
	}

	public SampleCheckinView ClickSCVJObIdFirstRow() {
		click(eleSCVJobIdFirstRow);
		click(eleSCVJobIdOk);
		return this;
	}

	public SampleCheckinView ClickSCVJObIdCancelBtn() {
		click(eleSCVJobIdCancel);
		return this;
	}

	//Test::
	public SampleCheckinView SearchSCVTest(String Test) {
		type(eleSCVTestText,Test);
		click(eleSCVTestFindBtn);
		return this;
	}

	public SampleCheckinView DoubleClickSCVTestSltFirstRow() {
		doubleClick(eleSCVTestFirstRow);
		return this;
	}

	public SampleCheckinView ClickSCVTestSltFirstRow() {
		click(eleSCVTestFirstRow);
		click(eleSCVTestOk);
		return this;
	}

	public SampleCheckinView ClickSCVTestCancelBtn() {
		click(eleSCVTestCancel);
		return this;
	}
}
