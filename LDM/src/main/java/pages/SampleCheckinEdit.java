package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SampleCheckinEdit  extends ProjectMethods{


	public SampleCheckinEdit() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviClientName_Edit_find_Edit_B0')]") WebElement eleSCEClientFind;

	@FindBy(how=How.XPATH, using="//iframe[contains(@id,'Vertical_PopupWindow')]") WebElement eleSCEClientlistframe;
	@FindBy(how=How.XPATH, using="//td[@class='dxgv dx-al' and text() = '6 Solutions']") WebElement eleSCESelectClient;
	
	//@FindBy(how=How.CLASS_NAME, using="dxm-item dropDownSave dxm-dropDownMode dxm-noImage") WebElement eleSCESaveBtn;
	
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1i1_") WebElement eleSCESaveBtn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1_P") WebElement eleSCESaveDrpdwn;
	@FindBy(how=How.ID, using="dxss_830993610") WebElement eleSCEVerifySave;
	@FindBy(how=How.CLASS_NAME, using="XafVCap-Second MainMenuTruncateCaption") WebElement eleSCEJobIDCaption;
	
	// the below xpath is to check the error for the maditory field - just change the td contains text  
   //@FindBy(how=How.XPATH, using="//table[contains(@class,'ErrorMessage')]//tr[2]/td[contains(text(),'Client Name')]") WebElement eleSCEError;

	@FindBy(how=How.XPATH, using="//div[@id='Vertical_mainMenu_Menu_DXSA1']/ul/li/a/span[1]") List<WebElement> allItems ;
	
	
	public SampleCheckinEdit clickSCEClientFind() {
	    click(eleSCEClientFind);
	    return  this;   
	}
	
	public SampleCheckinEdit clickSCESelectClient()  {
		switchToFrame(eleSCEClientlistframe);
		doubleClick(eleSCESelectClient);	       
	    return this;   
	}
	
	public SampleCheckinEdit clickSCESave() {
		mousehoverandClick(eleSCESaveDrpdwn);
	    click(eleSCESaveBtn);
	    acceptAlert();
	 //   verifyDisplayed(eleSCEVerifySave);
	    return this;   
	}
	
	public SampleCheckinEdit clickSCESaveOptions(String saveType) {
		mousehoverandClick(eleSCESaveDrpdwn);
		//String ExporttoXpath="//div[@id='Vertical_mainMenu_Menu_DXSA1']/ul/li/a/span[1]";
		clickbyElements(allItems,saveType);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		   acceptAlert();
		   return this;   
		   }
		
}
