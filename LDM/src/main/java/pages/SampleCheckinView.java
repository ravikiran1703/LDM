package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SampleCheckinView  extends ProjectMethods{

	public SampleCheckinView() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI0_") WebElement eleSCVNew;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI1_") WebElement eleSCVDelete;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI2_") WebElement eleSCVEdit;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI3_") WebElement eleSCVViewAll;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI4_") WebElement eleSCVSymbol;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI5_") WebElement eleSCVQueryPanel;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI6_") WebElement eleSCVRefresh;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI8_P") WebElement eleSCVDotsbtn;
	@FindBy(how=How.ID, using="Vertical_TB_Menu_DXI7_") WebElement eleSCVExportTo;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI7_P") WebElement eleSCVExportDrpDwn;
	//@FindBy(how=How.XPATH, using="//div[@id='Vertical_mainMenu_Menu_DXSA7']/ul/li/a/span") WebElement eleSCVExporttoList;  
	@FindBy(how=How.CLASS_NAME, using="dxp-comboBox") WebElement eleSCVPageSize;
	@FindBy(how=How.XPATH, using="//table[@class='dxgvTable_XafTheme dxgvRBB']/tbody/tr[2]/td[1]//span[@class='dxWeb_edtCheckBoxUnchecked_XafTheme dxICheckBox_XafTheme dxichSys dx-not-acc']")WebElement eleSCVSelectAll;

	public SampleCheckinEdit clickSCVNew() {
		click(eleSCVNew);
		return new SampleCheckinEdit();   
	}

	public SampleCheckinEdit clickSCVEdit() {
		click(eleSCVEdit);
		return new SampleCheckinEdit();   
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
	public SampleCheckinView clickSCVRefresh() {
		click(eleSCVRefresh);
		return this;   
	}
	public SampleCheckinView clickSCVSelectAll() {
		click(eleSCVSelectAll);
		return this;   
	}

	public SampleCheckinView ExportTo(String ExportTo) {
		mousehover(eleSCVDotsbtn);
		click(eleSCVExportTo);
		return this;
	}

	public SampleCheckinView ExportToByFileType(String ExportTo) {
		mousehoverandClick(eleSCVDotsbtn);
		mousehoverandClick(eleSCVExportDrpDwn);
		//For the Export type list the Xpath is located and Send to ClickByElements Method
		String ExporttoXpath="//div[@id='Vertical_mainMenu_Menu_DXSA7']/ul/li/a/span";
		//clickbyElements(ExporttoXpath,ExportTo);
		return this;   
	}
	
	public SampleCheckinView SelectPageSize(String data) {
		
		selectDropDownUsingText(eleSCVPageSize,data);
		return this;
	}


}
