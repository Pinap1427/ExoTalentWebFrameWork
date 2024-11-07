package ExoTalentWebWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class CandidateSignup extends TestBaseClassWeb {

	public CandidateSignup() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//button[.='Join As']")
	private WebElement joinasBtn;

	public void ClickonJoinAsButton() {
		action.clickElement(joinasBtn);

	}

	@FindBy(xpath = "//a[.='Candidate']")
	private WebElement CandiadteBtn;

	public void ClickonCandidateButton() {
		action.clickElement(CandiadteBtn);

	}

	@FindBy(xpath = "//a[.='SignUp']")
	private WebElement SignupBtn;

	public void ClickonSignupButton() {
		action.clickElement(SignupBtn);

	}

	@FindBy(xpath = "//input[@id=\"emailId\"]")
	private WebElement EnterEmail;

	public void EnterCompanyEmailid() {
		action.sendKeysElement(EnterEmail, "cr1@apmosys.com");
	}

	@FindBy(xpath = "//input[@placeholder=\"First Name\"]")
	private WebElement FirstName;

	public void EnterFirstName() {
		action.sendKeysElement(FirstName, "Mayur");
	}

	@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
	private WebElement LastName;

	public void EnterLastName() {
		action.sendKeysElement(LastName, "Pinap");
	}

	@FindBy(xpath = "//input[@name=\"emailId\"]")
	private WebElement Emailid;

	public void EnterEmailid() {
		action.sendKeysElement(Emailid, "mm8@gmail.com");
	}

	@FindBy(xpath = "//input[@name=\"phoneNo\"]")
	private WebElement Mobileno;

	String MobileNoEnter="9190904444";
	public void EnterMobileNo() {
		action.sendKeysElement(Mobileno, MobileNoEnter);
	}

	@FindBy(xpath = "//button[.='Verify']")
	private WebElement verifyBtn;

	public void ClickonVerifyButton() {
		action.clickElement(verifyBtn);
	}

	@FindBy(xpath = "//div[@id='container']//input[1]")
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

	@FindBy(xpath = "(//button[.='Verify'])[2]")
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
		action.clickElement(verifyOTPBtn);

	}

	@FindBy(xpath = "(//div[@class=\" css-y5ynmu\"])[2]")
	private WebElement LocationDrop;

	@FindBy(xpath = "//div[contains(text(), 'Abhayapuri')]")
	private WebElement selectLocation;

	public void ClickonLocationDropdown() throws InterruptedException {
		action.clickElement(LocationDrop);
		Thread.sleep(1000);
		action.clickElement(selectLocation);
	}

	@FindBy(id = "companyName")
	private WebElement CompanyName;

	public void EnterCompanyName() {
		action.sendKeysElement(CompanyName, "Apmosys");
	}

	@FindBy(id = "designantion")
	private WebElement designantionName;

	public void Enterdesignantion() {
		action.sendKeysElement(designantionName, "Test Engineer");
	}

	@FindBy(id = "experienceYears")
	private WebElement YOE;

	public void EnterYOE() {
		action.sendKeysElement(YOE, "3");
	}

	@FindBy(xpath = "(//div[@class=\"h-5 w-5 border-2 rounded-md border-expurple-800 false cursor-pointer flex items-center justify-center\"])[2]")
	private WebElement Checkbox;
	public void ClickonCheckbox()
	{
		action.clickElement(Checkbox);
	}
	
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement finalSignup;
	public void ClickonFinalSignupButton()
	{
		action.clickElement(finalSignup);
	}
	
	@FindBy(xpath = "//h1[.='Edit Profile']")
	private WebElement VerifySignup;
	public boolean VerifySignup()
	{
		return action.isDisplay(VerifySignup);
		
	}
//	@FindBy(xpath = "(//button[.='Logout']")
	@FindBy(xpath = "//button[@type=\"button\"]")
	private WebElement Logout;
	public void ClickonLogout()
	{
		action.clickElement(Logout);
	}
	
	@FindBy(xpath = "//div[@class='h-5 w-5 rounded-full bg-expurple-800 shadow-md']")
	private WebElement ToggleBtn;
	public void ClickonToggleButton()
	{
		action.clickElement(ToggleBtn);
	}
	
	public void EnterMobileNotosignup() {
		action.sendKeysElement(Mobileno, MobileNoEnter);
	}
	
	@FindBy(xpath = "//button[.='Login Via OTP']")
	private WebElement LoginViaOTpBtn;
	public void ClickonLoginViaOtp()
	{
		action.clickElement(LoginViaOTpBtn);
	}
	

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/input[1]")
	private WebElement Enterotp1Login;
	
	@FindBy(xpath = "(//button[.='Verify'])")
	private WebElement VerifyLoginBtn;
	public void EnterLoginOTP() throws InterruptedException {
		action.sendKeysElement(Enterotp1Login, "4");
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
		action.clickElement(VerifyLoginBtn);

	}
	
	
}
