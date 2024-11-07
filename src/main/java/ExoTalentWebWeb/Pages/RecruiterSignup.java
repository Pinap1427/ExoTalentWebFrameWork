package ExoTalentWebWeb.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class RecruiterSignup extends TestBaseClassWeb {

	public RecruiterSignup() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//button[.='Join As']")
	private WebElement joinasBtn;

	public void ClickonJoinAsButton() {
		action.clickElement(joinasBtn);

	}

	@FindBy(xpath = "//a[.='Recuiter']")
	private WebElement RecruiterBtn;

	public void ClickonRecruiterButton() {
		action.clickElement(RecruiterBtn);

	}

	@FindBy(xpath = "//input[@id=\"emailId\"]")
	private WebElement RecrEmail;

	String RecruiterEmailid = "abcd21@apmosys.com";

	public void EnterRecruiterEmail() {
		action.sendKeysElement(RecrEmail, RecruiterEmailid);
	}

	@FindBy(xpath = "//button[.='Login Via OTP']")
	private WebElement otpBtn;

	public void ClickonLoginViaOtpButton() {
		action.clickElement(otpBtn);
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
		action.clickElement(verifyOTPBtn);

	}

	@FindBy(xpath = "//input[@placeholder=\"First Name\"]")
	private WebElement FirstName;

	public void EnterFirstName() {
		action.sendKeysElement(FirstName, "Mayurr");
	}

	@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
	private WebElement LastName;

	public void EnterLastName() {
		action.sendKeysElement(LastName, "PPPPP");
	}

	@FindBy(xpath = "//input[@name=\"phoneNo\"]")
	private WebElement Mobileno;

	String MobileNoEnter = "91919144001";

	public void EnterMobileNo() {
		action.sendKeysElement(Mobileno, MobileNoEnter);
	}

	@FindBy(id = "companyName")
	private WebElement EnterCompanyName;

	public void enterCompanyName() {
		action.sendKeysElement(EnterCompanyName, "Apmosys");
	}

	@FindBy(id = "panNo")
	private WebElement panNo;
	String PanNumber = "CHJKS0909K";

	public void enterPAN() {
		action.sendKeysElement(panNo, PanNumber);
	}

	@FindBy(id = "aadharNo")
	private WebElement aadharNo;
	String AadharNumber = "2110 9355 9501";

	public void enterAadhar() {
		action.sendKeysElement(aadharNo, AadharNumber);
	}

	@FindBy(id = "file")
	private WebElement hiddenFileInput;

	public void uploadPAnImage() throws InterruptedException {
		// Use JavaScript to remove the "hidden" class from the parent div
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].classList.remove('hidden');", hiddenFileInput);

		// Wait briefly to ensure the element is interactable
		Thread.sleep(2000); // optional, replace with WebDriverWait if necessary

		// Use sendKeys() to upload the file
		hiddenFileInput.sendKeys("C:\\Users\\Mayur More\\OneDrive\\Desktop\\Testing images\\1723910544171.jpg");
	}

	@FindBy(xpath = "//button[.=\"SignUp\"]")
	private WebElement signupRecrBtn;

	public void ClickonSignupButton() {
		action.clickElement(signupRecrBtn);
	}

	@FindBy(xpath = "//h1[@class=\"text-xl text-expurple-600 font-semibold\"]")
	private WebElement verifyRecru;

	public boolean VerifyRecruiterSignup() {
		return action.isDisplay(verifyRecru);
	}

	
}
