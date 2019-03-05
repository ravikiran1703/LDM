package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{

	public LoginPage() {
		PageFactory.initElements(driver, this);  
	}
	
	@FindBy(how=How.ID, using="Logon_LoginUser_UserName") WebElement eleUname;
	@FindBy(how=How.ID, using="Logon_LoginUser_Password") WebElement elePass;
	@FindBy(how=How.NAME, using="Logon$LoginUser$LoginButton") WebElement eleLogin;
	
	public LoginPage enterUsername(String data) {
		//WebElement eleUname = locateElement("id", "username");
		type(eleUname, data);
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		type(elePass, data);
		return this;
	}
	
	public HomePage clickLogin() {
		click(eleLogin);
		//HomePage hp = new HomePage();
		//return hp;
		return new HomePage();
	}
	
}







