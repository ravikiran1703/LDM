package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Clients {
	@FindBy(how=How.XPATH, using="//table[contains(@id ,'_CustomerName_Edit_ET')]//textarea") WebElement 	eleCustomerNameText;
	@FindBy(how=How.XPATH, using="//table[contains(@id ,'AnnualRevenue_Edit')]//input") WebElement 	eleAnnualRevenueText;
	@FindBy(how=How.XPATH, using="//table[contains(@id ,'NumberOfEmployees_Edit')]//input") WebElement 	eleNumberOfEmployeesText;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'PrimaryContact_Edit_dropdown_DD_DDD_L_LBT')]//td") List<WebElement> 	elePrimaryContactList;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'_OtherPhone_Edit')]//input") WebElement 	eleOtherPhoneText;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'_OfficePhone_Edit')]//input") WebElement 	eleOfficePhoneText;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'_WebSite_Edit')]//input") WebElement 	eleWebSiteText;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'_Fax_Edit')]//input") WebElement 	eleFaxText;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'_Email_Edit')]//input") WebElement 	eleEmailText;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'_Zip_Edit')]//input") WebElement 	eleZipText;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'_DXMainTable')]//tr[contains(@id,'DXDataRow')]//td[2]/a") WebElement eleEditLine;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'_DXMainTable')]//tr[contains(@id,'DXDataRow')]//td[3]/a") WebElement eleEditClient;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'_DXMainTable')]//tr[contains(@id,'DXEditingRow')]//td[2]/a[contains(@id,'DXCBtn0')]") WebElement eleUpdateLine;
	@FindBy(how=How.XPATH, using="//table[contains(@id,'_DXMainTable')]//tr[contains(@id,'DXEditingRow')]//td[2]/a[contains(@id,'DXCBtn0')]") WebElement eleCancelLine;


	


	
	
	
}
