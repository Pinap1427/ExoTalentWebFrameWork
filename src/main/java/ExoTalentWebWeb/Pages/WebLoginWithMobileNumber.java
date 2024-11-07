package ExoTalentWebWeb.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

//import LinkCxOWeb.utils.ActionKeywords;
import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class WebLoginWithMobileNumber extends TestBaseClassWeb {

	public WebLoginWithMobileNumber() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//input[@id=\"outlined-basic\"]")
	private WebElement EnterMobileNo;

	public void enterMobileNumbmer() {
//		waitForElementToLoad(EnterMobileNo);
		action.sendKeysElement(EnterMobileNo, "9162849798");
	}

	@FindBy(xpath = "//button[@aria-label='next']")
	private WebElement arrowBtn;

	public void ClickOnArrowButton() {
		action.clickElement(arrowBtn);
	}
	

	@FindBy(xpath = "//button[.='Join As']")
	private WebElement joinasBtn;

	public void ClickonJoinAsButton() {
		action.clickElement(joinasBtn);

	}

	@FindBy(xpath = "//a[.='Company']")
	private WebElement CompanyBtn;

	public void ClickonCompanyButton() {
		action.clickElement(CompanyBtn);

	}

	@FindBy(xpath = "//input[@id=\"emailId\"]")
	private WebElement EnterEmail;

	public void EnterEmailid() {
		action.sendKeysElement(EnterEmail, "cr1@apmosys.com");
	}

	@FindBy(xpath = "//button[.='Login Via OTP']")
	private WebElement LoginViaOTp;

	public void ClickonLoginViaOtp() {
		action.clickElement(LoginViaOTp);
	}

	@FindBy(xpath = "(//input[@type=\"number\"])[1]")
	private WebElement Enterotp1;

	@FindBy(xpath = "//input[2]")
	private WebElement Enterotp2;

	@FindBy(xpath = "//input[3]")
	private WebElement Enterotp3;

	@FindBy(xpath = "//input[4]")
	private WebElement Enterotp4;

	@FindBy(xpath = "//input[5]")
	private WebElement Enterotp5;

	@FindBy(xpath = "//input[6]")
	private WebElement Enterotp6;
	
	@FindBy(xpath = "//button[.='Verify']")
	private WebElement verifyBtn;

	public void EnterOTP() throws InterruptedException {
		action.sendKeysElement(Enterotp1, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp2, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp3, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp4, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp5, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp6, "4");
		Thread.sleep(500);
		action.clickElement(verifyBtn);
		
	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Verifybtn;

	public void ClickonVerifyButton() {
		action.clickElement(Verifybtn);
	}

	@FindBy(xpath = "(//button[.='Logout']")
	private WebElement verifylogin;

	public boolean verifyUserIsAbletoLogin() {
		return action.isDisplay(verifylogin);
	}

	

	
	

}
