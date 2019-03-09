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
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCVQueryFrame;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI8_") WebElement eleSLVSymbol;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI9_") WebElement eleSLVExportTo;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI9_P") WebElement eleSLVExportToDrpBtn;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleSLVSearchTextBox;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleSLVSearchBtn;
	@FindBy(how=How.XPATH, using="//span[contains(@id,'_DXSelAllBtn32_D')]") WebElement eleSLVSeletectAll;
	@FindBy(how=How.ID, using="dxp-comboBox") WebElement eleSLVPageSize;	
	
	//Query Data::
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI0_") WebElement eleSLVQueryOk;
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI1_") WebElement eleSLVQueryCancel;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B0') and @title ='Find']") WebElement eleSLVQueryJobIDFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleSLVQueryJobIDClear;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B0') and @title ='Find']") WebElement eleSLVQueryTestFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleSLVQueryTestClear;
	
	//JobId Popup::
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleSLVJobIdFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleSLVJobIdText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleSLVJobIdFindBtn;
	@FindBy(how=How.XPATH, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleSLVJobIdFirstRow;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleSLVJobIdOk;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleSLVJobIdCancel;

	//Test Popup::
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleSLVTestFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleSLVTestText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleSLVTestFindBtn;
	@FindBy(how=How.XPATH, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleSLVTestFirstRow;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleSLVTestOk;
	@FindBy(how=How.ID, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleSLVTestCancel;
	 

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
	//QueryData::
		public SampleLoginView clickREJObIdOk() {
			click(eleSLVQueryOk);
			return this;
		} 

		public SampleLoginView clickREJObIdCancel() {
			click(eleSLVQueryCancel);
			return this;
		} 

		public SampleLoginView getREJobIDBtn() {
			click(eleSLVQueryJobIDFind);
			switchToFrame(eleSLVJobIdFrame);
			return this;
		} 

		public SampleLoginView ClearREJobIDBtn() {
			click(eleSLVQueryJobIDClear);
			return this;
		} 

		public SampleLoginView getRETestBtn() {
			click(eleSLVQueryTestFind);
			switchToFrame(eleSLVTestFrame);
			return this;
		} 

		public SampleLoginView ClearRETestBtn() {
			click(eleSLVQueryTestClear);
			return this;
		}

		//JobId::
		public SampleLoginView SearchREJObId(String JobId) {
			type(eleSLVJobIdText,JobId);
			click(eleSLVJobIdFindBtn);
			return this;
		}

		public SampleLoginView DoubleClickREJObIdFirstRow() {
			doubleClick(eleSLVJobIdFirstRow);
			return this;
		}

		public SampleLoginView ClickREJObIdFirstRow() {
			click(eleSLVJobIdFirstRow);
			click(eleSLVJobIdOk);
			return this;
		}

		public SampleLoginView ClickREJObIdCancelBtn() {
			click(eleSLVJobIdCancel);
			return this;
		}

		//Test::
		public SampleLoginView SearchRETest(String Test) {
			type(eleSLVTestText,Test);
			click(eleSLVTestFindBtn);
			return this;
		}

		public SampleLoginView DoubleClickRETestSltFirstRow() {
			doubleClick(eleSLVTestFirstRow);
			return this;
		}

		public SampleLoginView ClickRETestSltFirstRow() {
			click(eleSLVTestFirstRow);
			click(eleSLVTestOk);
			return this;
		}

		public SampleLoginView ClickRETestCancelBtn() {
			click(eleSLVTestCancel);
			return this;
		}
	
}
