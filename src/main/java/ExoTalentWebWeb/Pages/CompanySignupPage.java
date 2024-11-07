package ExoTalentWebWeb.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class CompanySignupPage extends TestBaseClassWeb {

	public CompanySignupPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

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

	@FindBy(xpath = "//a[.='SignUp']")
	private WebElement SignupComBtn;

	public void ClickonSignupButton() {
		action.clickElement(SignupComBtn);

	}

	@FindBy(id = "domainName")
	private WebElement Domain;

	public void EnterDomain() {
		action.sendKeysElement(Domain, "aqm.com");
	}

	@FindBy(id = "emailId")
	private WebElement EmailidComp;

	public void EnterCompanyEmailid() throws InterruptedException {
		action.sendKeysElement(EmailidComp, "hrmayur4@aqm.com");
		Thread.sleep(1000);
		action.clickElement(createAcc);
	}

	@FindBy(xpath = "//button[.='Create Account']")
	private WebElement createAcc;

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

	@FindBy(id = "companyName")
	private WebElement CompanyName;

	public void EnterCompanyName() {
		action.sendKeysElement(CompanyName, "AQM Technologies");
	}

	@FindBy(id = "discription")
	private WebElement Description;
	String CompanyDesc = "AQM Technologies Pvt. Ltd. (AQM), established in the year 2000, embarked on a mission to transform the testing experience into a 'HAPPY TESTING' journey for all stakeholders, particularly our valued employees.\r\n"
			+ "\r\n"
			+ "With a robust team of 1300+ professionals, an impressive 75% are ISTQB/ASTQB certified Quality Engineers, continually enhancing their domain expertise with certifications from III, AMFI, SEBI, and IIBF.\r\n"
			+ "\r\n"
			+ "In the era of Digital Testing, AQM stands out with a workforce of over 40% trained engineers proficient in testing Digital Assets and providing cloud-based testing services. Our commitment to fostering & enduring client relationships is evidenced by a remarkable 95% client retention rate. At AQM, we believe in nurturing in-house talent, with more than 75% of our senior leadership comprising individuals who started their journey with us as Testers.\r\n"
			+ "\r\n"
			+ "AQM delivers comprehensive solutions, specialized in Quality Engineering, User Acceptance Testing, Test Automation, Mobile Application Testing, Load & Performance Testing, Performance Engineering, Security Testing, Data Testing, Cyber Security Audit, Security Architecture Design/Review, SOC Services and Performance Monitoring.\r\n"
			+ "\r\n"
			+ "AQM, as experts in software development, boasts an in-house product BOTm, a codeless automation tool—that is poised to revolutionize the landscape of Mobile App and Web App Testing.\r\n"
			+ "\r\n"
			+ "AQM Technologies has garnered recognition in global advisory reports, such as Gartner’s Market Guide for Mobile Testing Services and a research report by Research & Markets (R&M) for Mobile Testing Services. Our commitment to innovation is further underscored by winning the Award for the Most Innovative Security Operation Center.\r\n"
			+ "\r\n"
			+ "AQM is proud to be certified as a 'Great Place to Work' by the prestigious Great Place To Work® Institute, reinforcing our commitment to creating a positive and enriching work environment.";

	public void EnterCompanyDescription() {
		action.sendKeysElement(Description, CompanyDesc);
	}

	String CompanyTag = "Digital Testing & Information Security";
	@FindBy(id = "tagline")
	private WebElement Tagline;

	public void EnterCompanyTagline() {
		action.sendKeysElement(Tagline, CompanyTag);
	}

	@FindBy(xpath = "(//div[@class=\" css-y5ynmu\"])[1]")
	private WebElement OrgTypeDropdown;

	@FindBy(xpath = "//div[contains(text(), 'Public Company')]")
	private WebElement selectOrgType;

	public void SelectOrgTypeFromDropdown() throws InterruptedException {
		action.clickElement(OrgTypeDropdown);
		Thread.sleep(1000);
		action.clickElement(selectOrgType);
	}

	// industry type

	@FindBy(xpath = "(//div[@class=\" css-y5ynmu\"])[2]")
	private WebElement IndTypeDropdown;

	@FindBy(xpath = "//div[contains(text(), 'IT & ITES')]")
	private WebElement selectIndType;

	public void SelectIndTypeFromDropdown() throws InterruptedException {
		action.clickElement(IndTypeDropdown);
		Thread.sleep(1000);
		action.clickElement(selectIndType);
	}

	@FindBy(xpath = "(//div[@class=\" css-y5ynmu\"])[3]")
	private WebElement SizeTypeDropdown;

	@FindBy(xpath = "//div[contains(text(), '1000-5000')]")
	private WebElement selectTeamSizeType;

	public void SelectTeamSizeTypeFromDropdown() throws InterruptedException {
		action.clickElement(SizeTypeDropdown);
		Thread.sleep(1000);
		action.clickElement(selectTeamSizeType);
	}

	// 10 February 2013
	@FindBy(id = "yearsOfEstablishment")
	private WebElement YoEst;

	public void EnterYearofEstablishment() {
		action.sendKeysElement(YoEst, "10 February 2013");
	}

	@FindBy(id = "companyWebSiteLink")
	private WebElement Companylink;

	public void EnterCompanyWebSite() {
		action.sendKeysElement(Companylink, "http://www.aqmtechnologies.com");
	}

	@FindBy(xpath = "(//div[@class=\" css-y5ynmu\"])[4]")
	private WebElement officeLocation;

	@FindBy(xpath = "//div[contains(text(), 'Mumbai')]")
	private WebElement selectOfficeLocation;

	public void SelectHeadOfficeLocationTypeFromDropdown() throws InterruptedException {
		action.clickElement(officeLocation);
		Thread.sleep(1000);
		action.clickElement(selectOfficeLocation);
	}

	@FindBy(xpath = "//button[.='Save']")
	private WebElement saveBtn;

	public void ClickonSaveButtonCompany() {
		action.clickElement(saveBtn);
	}

	@FindBy(xpath = "//a[.='View Dashboard']")
	private WebElement viewDashboardClk;

	public void ClickonViewDashborad() throws InterruptedException {
		action.clickElement(viewDashboardClk);
		Thread.sleep(1000);
		action.clickElement(CompanyBtn);
	}

	@FindBy(xpath = "//div[@class=\"h-10 w-10 bg-expurple-100 absolute bottom-2 right-2 flex items-center justify-center rounded-lg cursor-pointer\"]/input[@type=\"file\"]")
	private WebElement hiddenFileInput1;

	public void uploadLogoImage() throws InterruptedException {
		// Use JavaScript to remove the "hidden" class from the parent div
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].classList.remove('hidden');", hiddenFileInput1);

		// Wait briefly to ensure the element is interactable
		Thread.sleep(2000); // optional, replace with WebDriverWait if necessary

		// Use sendKeys() to upload the file
		hiddenFileInput1.sendKeys("C:\\Users\\Mayur More\\OneDrive\\Desktop\\aqm_technologies_logo.jpg");
	}

	@FindBy(xpath = "//div[@class=\"cursor-pointer w-fit mx-auto\"]/input[@type=\"file\"]")
	private WebElement hiddenFileInput2;

	public void uploadBannerImage() throws InterruptedException {
		// Use JavaScript to remove the "hidden" class from the parent div
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].classList.remove('hidden');", hiddenFileInput2);

		// Wait briefly to ensure the element is interactable
		Thread.sleep(2000); // optional, replace with WebDriverWait if necessary

		// Use sendKeys() to upload the file
		hiddenFileInput2.sendKeys("C:\\Users\\Mayur More\\OneDrive\\Desktop\\aqm_technologies_banner.jpg");
		Thread.sleep(3000);
		// clickonSave Button//
		action.clickElement(saveBtn);
		action.clickElement(CompanyBtn);
	}

	@FindBy(xpath = "//h1[@class=\"text-xl text-expurple-800 font-semibold\"]")
	private WebElement verifyCompanyDetails;
	
	@FindBy(xpath = "//button[.='Logout']")
	private WebElement logoutBtn;

	public boolean VerifyCompanyCreated() {
		return action.isDisplay(verifyCompanyDetails);
	}
	public void LogoutBtn()
	{
		action.clickElement(logoutBtn);
	}
	

}
