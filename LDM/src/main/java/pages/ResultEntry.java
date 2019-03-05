package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import wdMethods.SeMethods;

public class ResultEntry extends SeMethods {
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
	@FindBy(how=How.ID, using="dxp-comboBox") WebElement eleSCVPageSize;
	public ResultEntry clickREDelete() {
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
	public ResultEntry SelectPageSize(String data) {
		selectDropDownUsingText(eleSCVPageSize,data);
		return this;
	}
	
}
