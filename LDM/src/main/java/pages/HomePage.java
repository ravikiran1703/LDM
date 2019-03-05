package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(how=How.ID, using="Vertical_NC_TL_N0") WebElement eleSamRegTag;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N0_0") WebElement eleSamCheckin;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N0_1") WebElement eleSamLogin;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N1") WebElement eleAnalysisTag;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N1_0") WebElement eleResultEntry;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N1_1") WebElement eleSDMSResultEntry;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N1_2") WebElement eleResultView;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N2") WebElement eleDataReviewTag;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N2_0") WebElement eleResultVali;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N2_1") WebElement eleResultAppl;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N3") WebElement eleReportingTag;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N3_0") WebElement eleCustReporting;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N3_1") WebElement eleRptVali;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N3_2") WebElement eleRptAppl;
	@FindBy(how=How.ID, using="Vertical_NC_TL_N3_3") WebElement eleRptView;
	
//	@FindBy(how=How.LINK_TEXT, using="Log Off") WebElement eleLogout;

	public HomePage clickSamRegTag() {
	    click(eleSamRegTag);
	    return this;   
	}
	
	public SampleCheckinView clickSamCheckin() {
	    click(eleSamCheckin);
	    return new SampleCheckinView();   
	}

	public SampleLoginView clickSamLogin() {
	    click(eleSamLogin);
	    return new SampleLoginView();   
	}
	
	public HomePage clickAnalysisTag() {
	    click(eleAnalysisTag);
	    return this;      
	}

	public LoginPage ResultEntry() {
	    click(eleResultEntry);
	    return new LoginPage();   
	}

	public LoginPage clickSDMSResultEntry() {
	    click(eleSDMSResultEntry);
	    return new LoginPage();   
	}

	public LoginPage clickResultView() {
	    click(eleResultView);
	    return new LoginPage();   
	}

	public HomePage clickDataReviewTag() {
	    click(eleDataReviewTag);
	    return this;   
	}

	public LoginPage clickResultVali() {
	    click(eleResultVali);
	    return new LoginPage();   
	}

	public LoginPage clickResultAppl() {
	    click(eleResultAppl);
    return new LoginPage();   
	}
	
	public HomePage clickReporting() {
	    click(eleReportingTag);
	    return this;      
	}

	public LoginPage clickCustReporting() {
	    click(eleCustReporting);
	    return new LoginPage();   
	}

	public LoginPage clickRptVali() {
	    click(eleRptVali);
	    return new LoginPage();   
	}

	public LoginPage clickRptView() {
	    click(eleRptView);
	    return new LoginPage();   
	}

//	public LoginPage clickLogout() {
//	    click(eleLogout);
//	    return new LoginPage();   
//	}
	
	}







