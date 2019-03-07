package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SampleLoginView extends ProjectMethods{

	public SampleLoginView() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI0_") WebElement eleSLVNew;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1_") WebElement eleSLVDelete;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI2_") WebElement eleSLVEdit;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI3_") WebElement eleSLVCopySamples;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI4_") WebElement eleSLVBarcodeReport;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI5_") WebElement eleSLVViewAll;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI7_") WebElement eleSLVRefresh;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI10_") WebElement eleSLVDotsBtn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI6_") WebElement eleSLVQueryData;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI8_") WebElement eleSLVSymbol;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI9_") WebElement eleSLVExportTo;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI9_P") WebElement eleSLVExportToDrpBtn;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleSLVSearchTextBox;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleSLVSearchBtn;
	@FindBy(how=How.XPATH, using="//span[contains(@id,'_DXSelAllBtn32_D')]") WebElement eleSLVSeletectAll;
	@FindBy(how=How.ID, using="dxp-comboBox") WebElement eleSLVPageSize;	
	//QueryData Popup:
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI0_") WebElement eleSLVQueryOk;
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI1_") WebElement eleSLVQueryCancel;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B0') and @title ='Find']") WebElement eleSLVQueryJobIDFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleSLVQueryJobIDClear;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B0') and @title ='Find']") WebElement eleSLVQueryTestFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleSLVQueryTestClear;
	@FindBy(how=How.XPATH, using="") WebElement eleSLVQuerydumFrame;
//JobId Popup:
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleSLVJobIdFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleSLVJobIdText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleSLVJobIdFindBtn;
	@FindBy(how=How.ID, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleSLVJobIDFirstRow;
	@FindBy(how=How.XPATH, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleSLVJobIdOk;
	@FindBy(how=How.XPATH, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleSLVJobIdCancel;
	
	

	public SampleLoginEdit clickSLVNew() {
		click(eleSLVNew);
		return new SampleLoginEdit();
	} 

	public SampleLoginView clickSLVDelete() {
		click(eleSLVDelete);
		return this;
	} 

	public SampleLoginView clickSLVEdit() {
		click(eleSLVEdit);
		return this;
	} 

	public SampleLoginView clickSLVCopySamples() {
		click(eleSLVCopySamples);
		return this;
	} 

	public SampleLoginView clickSLVBarcodeReport() {
		click(eleSLVBarcodeReport);
		return this;
	} 

	public SampleLoginView clickSLVViewAll() {
		click(eleSLVViewAll);
		return this;
	} 

	public SampleLoginView clickSLVRefresh() {
		click(eleSLVRefresh);
		return this;
	} 

	public SampleLoginView clickSLVDotsBtn() {
		click(eleSLVDotsBtn);
		return this;
	} 

	public SampleLoginView clickSLVQueryPanel() {
		click(eleSLVQueryData);
		return this;
	} 

	public SampleLoginView clickSLVSymbol() {
		click(eleSLVSymbol);
		return this;
	} 

	public SampleLoginView clickSLVExportTo() {
		click(eleSLVExportTo);
		return this;
	} 

	public SampleLoginView SLVSearchJobId(String data) {
		type(eleSLVSearchTextBox, data);
		click(eleSLVSearchBtn);
		return this;
	} 

	public SampleLoginView clickSLVSeletectAll() {
		click(eleSLVSeletectAll);
		return this;
	} 

	public SampleLoginView SelectSLVPageSize(String data) {
		selectDropDownUsingText(eleSLVPageSize,data);
		return this;
	}
//QueryData
	public SampleLoginView clickSLVQueryOk() {
		click(eleSLVQueryOk);
		return this;
	} 

	public SampleLoginView clickSLVQueryCancel() {
		click(eleSLVQueryCancel);
		return this;
	} 

	public SampleLoginView searchSLVQueryJobID() {
		click(eleSLVQueryJobIDFind);
		switchToFrame(eleSLVQuerydumFrame);
		return this;
	} 

	public SampleLoginView ClearSLVQueryJobID() {
		click(eleSLVQueryJobIDClear);
		return this;
	} 

	public SampleLoginView SearchSLVQueryTest() {
		click(eleSLVQueryTestFind);
		switchToFrame(eleSLVQuerydumFrame);
		return this;
	} 

	public SampleLoginView ClearSLVQueryTest() {
		click(eleSLVQueryTestClear);
		return this;
	}
	//JobId:
	public SampleLoginView SearchSLVJObId(String JobId) {
		type(eleSLVJobIdText,JobId);
		click(eleSLVJobIdFindBtn);
		return this;
	}
		
	public SampleLoginView DoubleClickSLVSltFirstRow() {
		doubleClick(eleSLVJobIDFirstRow);
		return this;
	}
	
	public SampleLoginView ClickSLVSltFirstRow() {
		click(eleSLVJobIDFirstRow);
		return this;
	}
	
	public SampleLoginView ClickSLVOkBtn() {
		click(eleSLVJobIdOk);
		return this;
	}
	
	public SampleLoginView ClickSLVCancelBtn() {
		click(eleSLVJobIdCancel);
		return this;
	}
	
}
