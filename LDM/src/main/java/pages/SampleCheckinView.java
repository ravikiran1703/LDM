package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class SampleCheckinView  extends SeMethods{

	public SampleCheckinView() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI0_") WebElement eleSCVNew;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI1_") WebElement eleSCVDelete;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI2_") WebElement eleSCVEdit;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI3_") WebElement eleSCVViewAll;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI4_") WebElement eleSCVSymbol;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI5_") WebElement eleSCVQueryData;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI5_") WebElement eleSCVQueryOK;
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCVQueryFrame;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI6_") WebElement eleSCVRefresh;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI8_P") WebElement eleSCVDotsbtn;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI7_") WebElement eleSCVExportTo;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI7_P") WebElement eleSCVExportDrpDwn;
	//@FindBy(how=How.XPATH, using="//div[@id='Vertical_mainMenu_Menu_DXSA7']/ul/li/a/span") WebElement eleSCVExporttoList;  
	@FindBy(how=How.CLASS_NAME, using="dxp-comboBox") WebElement eleSCVPageSize;
	@FindBy(how=How.XPATH, using="//table[@class='dxgvTable_XafTheme dxgvRBB']/tbody/tr[2]/td[1]//span[@class='dxWeb_edtCheckBoxUnchecked_XafTheme dxICheckBox_XafTheme dxichSys dx-not-acc']")WebElement eleSCVSelectAll;
	//QueryData Popup:
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI0_") WebElement eleSCVQueryOk;
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI1_") WebElement eleSCVQueryCancel;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B0') and @title ='Find']") WebElement eleSCVQueryJobIDFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleSCVQueryJobIDClear;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B0') and @title ='Find']") WebElement eleSCVQueryTestFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleSCVQueryTestClear;
	@FindBy(how=How.XPATH, using="") WebElement eleSCVQuerydumFrame;
//JobId Popup:
	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Dialog_PopupWindow')]") WebElement eleSCVJobIdFrame;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleSCVJobIdText;
	@FindBy(how=How.ID, using="FindDialog_SAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleSCVJobIdFindBtn;
	@FindBy(how=How.ID, using="//tr[contains(@id ,'_DXDataRow0')]") WebElement eleSCVJobIdFirstRow;
	@FindBy(how=How.XPATH, using="FindDialog_PopupActions_Menu_DXI0_") WebElement eleSCVJobIdOk;
	@FindBy(how=How.XPATH, using="FindDialog_PopupActions_Menu_DXI1_") WebElement eleSCVJobIdCancel;
	
	//@FindBy(how=How.XPATH, using="//table[contains(@id,'_dviJobID_Edit_find_Edit')]//input") WebElement eleQueryJobIDText;
	//@FindBy(how=How.XPATH, using="//table[contains(@id,'_dviTestName_Edit_find_Edit')]//input[@class ='dxeEditArea_XafTheme dxeEditAreaSys dxh0']") WebElement eleQueryTestText;
	
	
	public SampleCheckinEdit clickSCVNew() {
		click(eleSCVNew);
		return new SampleCheckinEdit();   
	}

	public SampleCheckinView clickSCVEdit() {
		click(eleSCVEdit);
		return this;   
	}

	public SampleCheckinView clickSCVDelete() {
		click(eleSCVDelete);
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
	
	public SampleCheckinView clickSCVOK() {
		click(eleSCVQueryOK);
		
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
		//For the Export type list the Xpath is located and Send to ClickByElements Method
		String ExporttoXpath="//div[@id='Vertical_mainMenu_Menu_DXSA7']/ul/li/a/span";
		//clickbyElements(ExporttoXpath,ExportTo);
		return this;   
	}
	
	public SampleCheckinView SCVSelectPageSize(String data) {
		
		selectDropDownUsingText(eleSCVPageSize,data);
		return this;
	}
	
	//QueryData
		public SampleCheckinView clickSCVQueryOk() {
			click(eleSCVQueryOk);
			 return this;
		} 

		public SampleCheckinView clickSCVQueryCancel() {
			click(eleSCVQueryCancel);
			return this;
		} 

		public SampleCheckinView searchSCVQueryJobID() {
			click(eleSCVQueryJobIDFind);
			switchToFrame(eleSCVJobIdFrame);
			return this;
		} 

		public SampleCheckinView ClearSCVQueryJobID() {
			click(eleSCVQueryJobIDClear);
			return this;
		} 
		
		// ---- Test Query data
//
//		public SampleCheckinView SearchSCVQueryTest() {
//			click(eleSCVQueryTestFind);
//			switchToFrame(eleSCVQuerydumFrame);
//			return this;
//		} 
//
//		public SampleCheckinView ClearSCVQueryTest() {
//			click(eleSCVQueryTestClear);
//			return this;
//		}
		//JobId:
		public SampleCheckinView SearchSCVJObId(String JobId) {
			type(eleSCVJobIdText,JobId);
			click(eleSCVJobIdFindBtn);
			return this;
		}
			
		public SampleCheckinView DoubleClickSCVSltFirstRow() {
			doubleClick(eleSCVJobIdFirstRow);
			return this;
		}
		
		public SampleCheckinView ClickSCVSltFirstRow() {
			click(eleSCVJobIdFirstRow);
			return this;
		}
		
		public SampleCheckinView ClickSCVOkBtn() {
			click(eleSCVJobIdOk);
			return this;
		}
		
		public SampleCheckinView ClickSCVCancelBtn() {
			click(eleSCVJobIdCancel);
			return this;
		}

}
