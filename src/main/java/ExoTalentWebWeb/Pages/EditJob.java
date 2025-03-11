package ExoTalentWebWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class EditJob extends TestBaseClassWeb {

	public EditJob() {
		super();
		PageFactory.initElements(driver, this);

	}

	ActionKeywords action = new ActionKeywords();
////////Edit Job/////

	@FindBy(xpath = "//button[.='Edit Job']")
	private WebElement EditJobbtn;

	public void ClickonEditJob() {
		action.clickElement(EditJobbtn);
	}

	@FindBy(xpath = "//input[@id=\"jobTitle\"]")
	private WebElement JobTitle;

	public void EnterJobTitle() {
		action.sendKeysElement(JobTitle, "Senior React Js Developer");
	}

	@FindBy(xpath = "//input[@id=\"companyName\"]")
	private WebElement companyName;

	public void EnterCompanyName() {
		action.sendKeysElement(JobTitle, "LinkCXO");
	}

// div[contains(text(),'Full Time')]/following::div[1]
	@FindBy(xpath = "//label[contains(text(),'Job Type')]/following::div[1]")
	private WebElement ClickJobType;

	@FindBy(xpath = "//div[.='Part Time']")
	private WebElement SelectJobType;

	public void SelectJobTypeFromDropdown() throws InterruptedException {
		action.clickElement(ClickJobType);
		Thread.sleep(1000);
		action.clickElement(SelectJobType);
	}

	@FindBy(xpath = "//label[contains(text(),'Work Place Type')]/following::div[1]")
	private WebElement ClickWorkPlaceType;

	@FindBy(xpath = "//div[.='On-Site']")
	private WebElement SelectWorkPlaceType;

	public void SelectWorkPlaceTypeFromDropdown() throws InterruptedException {
		action.clickElement(ClickWorkPlaceType);
		Thread.sleep(1000);
		action.clickElement(SelectWorkPlaceType);
	}

	@FindBy(xpath = "//label[contains(text(),'Work Place Type')]/following::div[1]")
	private WebElement ClickLocation;

	@FindBy(xpath = "//div[contains(@class, 'flex items-center justify-between')]//p[contains(text(), 'Aadityana')]")
	private WebElement SelectLocation;

	public void SelectLocationFromDropdown() throws InterruptedException {
		action.clickElement(ClickLocation);
		Thread.sleep(1000);
		action.clickElement(SelectLocation);
	}

	@FindBy(xpath = "//label[contains(text(),'Functions')]/following::div[1]")
	private WebElement ClickFunction;

	@FindBy(xpath = "//div[contains(@class, 'flex items-center justify-between')]//p[contains(text(), 'Quality')]")
	private WebElement SelectFunction;

	@FindBy(xpath = "//button[.='Add']")
	private WebElement Sideclk;

	public void SelectFunctionFromDropdown() throws InterruptedException {
		action.clickElement(ClickFunction);
		Thread.sleep(1000);
		action.clickElement(SelectFunction);
		Thread.sleep(1000);
		action.clickElement(Sideclk);
	}

	@FindBy(xpath = "//label[contains(text(),'Qualification')]/following::div[1]")
	private WebElement ClickQualification;

	@FindBy(xpath = "//div[contains(@class, 'flex items-center justify-between')]//p[contains(text(), 'Chartered Financial Analyst - CFA')]")
	private WebElement SelectQualification;

	public void SelectQualificationFromDropdown() throws InterruptedException {
		action.clickElement(ClickQualification);
		Thread.sleep(1000);
		action.clickElement(SelectQualification);
	}

	@FindBy(xpath = "//input[@id=\"skill\"]")
	private WebElement EnterSkill;

	@FindBy(xpath = "(//div[@class=\"cursor-pointer\"])[last()]")
	private WebElement RemoveSkill;

	public void EnterNewSkill() throws AWTException, InterruptedException {
		action.sendKeysElement(EnterSkill, "NVM");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);
		action.clickElement(RemoveSkill);
	}

	@FindBy(xpath = "//label[contains(text(),'Min Salary')]/following::div[1]")
	private WebElement ClickMinSalary;

	@FindBy(xpath = "//div[.='6 Lacs']")
	private WebElement SelectMinSalary;

	public void SelectMinSalaryFromDropdown() throws InterruptedException {
		action.clickElement(ClickMinSalary);
		Thread.sleep(1000);
		action.clickElement(SelectMinSalary);
	}

	@FindBy(xpath = "//label[contains(text(),'Min Salary')]/following::div[1]")
	private WebElement ClickMAxSalary;

	@FindBy(xpath = "//div[.='12 Lacs']")
	private WebElement SelectMAxSalary;

	public void SelectMAxSalaryFromDropdown() throws InterruptedException {
		action.clickElement(ClickMAxSalary);
		Thread.sleep(1000);
		action.clickElement(SelectMAxSalary);
	}

	String EditedDescription = "•  JobDescription :\r\n" + "\r\n"
			+ "•  Provide financial reports and interpret financial information to managerial staff while recommending further courses of action.\r\n"
			+ "•  Advise on investment activities and provide strategies that the company should take\r\n"
			+ "•  Maintain the financial health of the organization.\r\n"
			+ "•  Analyze costs, pricing, variable contributions, sales results and the company’s actual performance compared to the business plans.\r\n"
			+ "•  Develop trends and projections for the firm’s finances.\r\n"
			+ "•  Conduct reviews and evaluations for cost-reduction opportunities.\r\n"
			+ "•  Oversee operations of the finance department, set goals and objectives, and design a framework for these to be met.\r\n"
			+ "•  Manage the preparation of the company’s budget.\r\n"
			+ "•  Liase with auditors to ensure appropriate monitoring of company finances is maintained.\r\n"
			+ "•  Correspond with various other departments, discussing company plans and agreeing on future paths to be taken.\r\n"
			+ "";
	@FindBy(xpath = "//label[contains(text(),'Job Description')]/following::textarea")
	private WebElement JobDescription;

	public void EditJobDescription() {
		action.sendKeysElement(JobDescription, EditedDescription);
	}

	@FindBy(xpath = "//button[.='Save']")
	private WebElement SaveBtn;

	public void ClickonSaveButton() {
		action.clickElement(SaveBtn);
	}

	@FindBy(xpath = "//h1[@class=\"text-lg text-exgray-800 font-semibold\"]")
	private WebElement verifyEditJob;

	public Boolean VerifyEditedJob() {
		return action.isDisplay(verifyEditJob);
	}
	
	

}
