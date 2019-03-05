package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SampleLoginEdit  extends ProjectMethods{

	public SampleLoginEdit() {
		PageFactory.initElements(driver, this);
	}
	
	//Menu Cell
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI0_") WebElement eleSLENew;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1_") WebElement eleSLESaveBtn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1_P") WebElement eleSLESaveDrpdwn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI2_") WebElement eleSLEDelete;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI3_") WebElement eleSLECopySamples;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI4_") WebElement eleSLERefresh;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI5_") WebElement eleSLESymbols;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI6_") WebElement eleSLEPreviousBtn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI7_") WebElement eleSLENextBtn;
	//Client Details
	@FindBy(how=How.XPATH, using="//table[@class ='dxeButtonEditSys dxeButtonEdit_XafTheme dxeReadOnly_XafTheme dxeNullText_XafTheme dxh0']//td[2]") WebElement eleSLEJobIdFindBtn; 
	@FindBy(how=How.XPATH, using="//iframe[contains (@id,'Vertical_PopupWindow')]") WebElement eleSLEJobIdFrame;
	// Selecting Default JobId in the Client List
	@FindBy(how=How.XPATH, using="//tr[contains(@id,'_DXDataRow0')]") WebElement eleSLEFirstJobId;
	@FindBy(how=How.XPATH, using="//input[contains(@id,'_MainLayoutEdit_xaf_l207_xaf_l222_xaf_dviClientSampleID_Edit_I')]") WebElement eleSLEClntSampId;
	@FindBy(how=How.XPATH, using="//input[contains(@id,'_MainLayoutEdit_xaf_l207_xaf_l226_xaf_dviVisualMatrix_Edit_dropdown_DD_I')]") WebElement eleSLEVisMatrix;
	@FindBy(how=How.XPATH, using="//input[contains(@id,'_dviVisualMatrix_Edit_dropdown_DD_I')]")  WebElement eleVisMatrix;

	
	public SampleLoginEdit clickSLENew() {
		click(eleSLENew);
		return this;
	} 

	public SampleLoginEdit SelectSLEJobId() {
		click(eleSLEJobIdFindBtn);
		switchToFrame(eleSLEJobIdFrame);
		doubleClick(eleSLEFirstJobId);
		return this;
	} 
	
	public SampleLoginEdit typeSLEClientSampleID(String CltSampID) {
		type(eleSLEClntSampId,CltSampID);
		return this;
	} 

	public SampleLoginEdit SelectSLEVisualMatrix(String VisualMatrix) {
		selectDropDownUsingText(eleSLEVisMatrix,VisualMatrix);
		return this;
	}
	public SampleLoginEdit clickSLESave() {
		mousehoverandClick(eleSLESaveDrpdwn);
	    click(eleSLESaveBtn);
	    acceptAlert();
	 //   verifyDisplayed(eleSCEVerifySave);
	    return this;   
	}
	
	public SampleLoginEdit clickSLESaveOptions(String saveType) {

		mousehoverandClick(eleSLESaveDrpdwn);
		String ExporttoXpath="//div[@id='Vertical_mainMenu_Menu_DXSA1']/ul/li/a/span[1]";
		//clickbyElements(ExporttoXpath,saveType);
		acceptAlert();
	    return this;   
	}
	
	public SampleLoginEdit clickSLE(String Matrix) {
		selectDropDownUsingText(eleVisMatrix,Matrix);
		return this;
	}
	
	
}
