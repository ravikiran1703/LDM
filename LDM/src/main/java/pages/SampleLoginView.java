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
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI6_") WebElement eleSLVQueryPanel;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI8_") WebElement eleSLVSymbol;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI9_") WebElement eleSLVExportTo;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI9_P") WebElement eleSLVExportToDrpBtn;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleSLVSearchTextBox;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleSLVSearchBtn;
	@FindBy(how=How.XPATH, using="//span[contains(@id,'_DXSelAllBtn32_D')]") WebElement eleSLVSeletectAll;
	@FindBy(how=How.ID, using="dxp-comboBox") WebElement eleSCVPageSize;
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
		click(eleSLVQueryPanel);
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
	
	public SampleLoginView SelectPageSize(String data) {
		selectDropDownUsingText(eleSCVPageSize,data);
		return this;
	}
	
}
