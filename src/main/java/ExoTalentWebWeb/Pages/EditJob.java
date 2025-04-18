package ExoTalentWebWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

	@FindBy(xpath = "//div[@class='w-fit self-start flex items-center justify-end gap-4']//button//*[name()='svg']")
	private WebElement ThreeDotClk;

	public void ClickonThreeDot() {
		action.clickElement(ThreeDotClk);
	}

	@FindBy(xpath = "//button[.='Edit Job']")
	private WebElement EditJobbtn;

	public void ClickonEditJob() {
		action.clickElement(EditJobbtn);
	}

	@FindBy(xpath = "//input[@id=\"jobTitle\"]")
	private WebElement JobTitle;

	public void EnterJobTitle() throws InterruptedException {
		action.clickElement(JobTitle);
		action.clearElement(JobTitle);
		Thread.sleep(1000);
		action.sendKeysElement(JobTitle, "New Senior React Js Developer 2025");
	}

	@FindBy(xpath = "//input[@id=\"companyName\"]")
	private WebElement companyName;

	public void EnterCompanyName() throws InterruptedException {
		action.clearElement(companyName);
		Thread.sleep(1000);
		action.sendKeysElement(companyName, "LinkCXO");
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

	@FindBy(xpath = "//label[.='Location *']")
	private WebElement sideclkLocation;

	@FindBy(xpath = "//div[.='On-Site']")
	private WebElement SelectWorkPlaceType;

	public void SelectWorkPlaceTypeFromDropdown() throws InterruptedException {
		action.clickElement(ClickWorkPlaceType);
		Thread.sleep(1000);
		action.clickElement(SelectWorkPlaceType);
		Thread.sleep(1000);
		action.clickElement(sideclkLocation);
	}

	@FindBy(xpath = "//label[contains(text(),'Location')]/following::div[1]")
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

	@FindBy(xpath = "//h1[contains(text(),'Minimum Salary')]/following::div[1]/div/div")
	private WebElement ClickMinSalary;

	@FindBy(xpath = "//div[.='6']")
	private WebElement SelectMinSalary;

	public void SelectMinSalaryFromDropdown() throws InterruptedException {
		action.clickElement(ClickMinSalary);
		Thread.sleep(1000);
		action.clickElement(SelectMinSalary);
	}

	@FindBy(xpath = "//h1[contains(text(),'Maximum Salary')]/following::div[1]/div/div")
	private WebElement ClickMAxSalary;

	@FindBy(xpath = "//div[.='12']")
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

	public void EditJobDescription() throws InterruptedException {
		action.clearElement(JobDescription);
		Thread.sleep(1000);
		action.sendKeysElement(JobDescription, EditedDescription);
	}

	@FindBy(xpath = "//button[.='Save']")
	private WebElement SaveBtn;

	public void ClickonSaveButton() {
		action.clickElement(SaveBtn);
	}

	@FindBy(xpath = "//h1[@class=\"text-lg text-exgray-800 font-semibold cursor-pointer\"]")
	private WebElement verifyEditJob;

	public Boolean VerifyEditedJob() {
		return action.isDisplay(verifyEditJob);
	}

}
