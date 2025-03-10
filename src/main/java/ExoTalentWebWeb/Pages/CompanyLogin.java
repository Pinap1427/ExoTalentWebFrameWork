package ExoTalentWebWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class CompanyLogin extends TestBaseClassWeb {

	public CompanyLogin() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//button[.='Login As']")
	private WebElement joinasBtn;

	public void ClickonJoinAsButton() {
		action.clickElement(joinasBtn);

	}

	@FindBy(xpath = "//a[.='Company']")
	private WebElement CompanyBtn;

	public void ClickonCompanyButton() {
		action.clickElement(CompanyBtn);

	}

	@FindBy(id = "emailId")
	private WebElement EmailidComp;
	@FindBy(xpath = "//button[.='Login Via OTP']")
	private WebElement LoginviaOTpBtn;

	public void EnterCompanyEmailid() throws InterruptedException {
		action.sendKeysElement(EmailidComp, "cr1@apmosys.com");
		Thread.sleep(1000);
		action.clickElement(LoginviaOTpBtn);
	}

	@FindBy(xpath = "//div[@class='w-full space-y-4']//input[1]")
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

	@FindBy(xpath = "(//button[.='Verify'])")
	private WebElement verifyOTPBtn;

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
//		action.clickElement(verifyOTPBtn);

	}

	@FindBy(xpath = "//button[.='Logout']")
	public WebElement verifyCompanyDetails;

	@FindBy(xpath = "//button[.='Logout']")
	private WebElement logoutBtn;

	public boolean VerifyCompanyCreated() {
		return action.isDisplay(verifyCompanyDetails);
	}
	
}
