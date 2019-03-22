package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class QueryData extends ProjectMethods{

	public QueryData( ) {
		PageFactory.initElements(driver, this);
			}
		
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI0_") WebElement eleQueryOk;
	@FindBy(how=How.ID, using="Dialog_SAC_Menu_DXI1_") WebElement eleQueryCancel;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B0') and @title ='Find']") WebElement eleQueryJobIDFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviJobID_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleQueryJobIDClear;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B0') and @title ='Find']") WebElement eleQueryTestFind;
	@FindBy(how=How.XPATH, using="//td[contains(@id,'_dviTestName_Edit_find_Edit_B1') and @title ='Clear']") WebElement eleQueryTestClear;
	@FindBy(how=How.XPATH, using="") WebElement eleQuerydumFrame;
	
	//@FindBy(how=How.XPATH, using="//table[contains(@id,'_dviJobID_Edit_find_Edit')]//input") WebElement eleQueryJobIDText;
	//@FindBy(how=How.XPATH, using="//table[contains(@id,'_dviTestName_Edit_find_Edit')]//input[@class ='dxeEditArea_XafTheme dxeEditAreaSys dxh0']") WebElement eleQueryTestText;
	
	public QueryData clickOk() {
		click(eleQueryOk);
		return this;
	} 
	
	public QueryData clickCancel() {
		click(eleQueryCancel);
		return this;
	} 
	
	public QueryData getJobID() {
		click(eleQueryJobIDFind);
		switchToFrame(eleQuerydumFrame);
		return this;
	} 
	
	public QueryData ClearJobID() {
		click(eleQueryJobIDClear);
	return this;
	} 
	
	public QueryData getTest() {
		click(eleQueryTestFind);
		switchToFrame(eleQuerydumFrame);
		return this;
	} 
	
	public QueryData ClearTest() {
		click(eleQueryTestClear);
		return this;
	}
	
}
