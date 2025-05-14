package ExoTalentWebWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.Key;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class CreateEmployee extends TestBaseClassWeb {

	public CreateEmployee() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//div[@class=\"rotate-180 transition-transform duration-500\"]")
	private WebElement clickonVButton;

	@FindBy(xpath = "//button[.='HRMS']")
	private WebElement HRMSBtn;

	@FindBy(xpath = "//a[.='Employee Directory']")
	private WebElement EmployeeDirectory;

	@FindBy(xpath = "//button[.=' Create Employee']")
	private WebElement createEmployee;

	public void ClickonCreateEmployee() throws InterruptedException {
		action.clickElement(clickonVButton);
		Thread.sleep(1000);
		action.clickElement(HRMSBtn);
		Thread.sleep(1000);
		action.clickElement(EmployeeDirectory);
		Thread.sleep(1000);
		action.clickElement(createEmployee);
	}

	@FindBy(xpath = "//button[.='Submit']")
	private WebElement SubmitBtn;

	public void ClickonSubmitButton() {
		action.clickElement(SubmitBtn);
	}

	@FindBy(xpath = "//label[.='First Name']")
	private WebElement VerifyFields;

	public boolean VerifyMandatoryFields() {
		return action.isDisplay(VerifyFields);
	}

	@FindBy(xpath = "//input[@id=\"firstName\"]")
	private WebElement firstName;

	public void EnterFirstName(String FirstName) {
		action.sendKeysElement(firstName, FirstName);
	}

	@FindBy(xpath = "//input[@id=\"lastName\"]")
	private WebElement lastName;

	public void EnterlastName(String LastName) {
		action.sendKeysElement(lastName, LastName);
	}

	@FindBy(xpath = "(//div[.='Select'])[1]")
	private WebElement roledropdown;

	public void ClickonRoleDropdown() {
		action.clickElement(roledropdown);
	}

	@FindBy(xpath = "(//*[.='Candidate Management'])[1]")
	private WebElement CandidateManage;

	public void SelectRole() {
		action.clickElement(CandidateManage);
	}

	@FindBy(xpath = "(//div[.='Select'])[2]")
	private WebElement department;

	public void ClickonDepartmentDropdown() throws AWTException {
		action.clickElement(department);

		Robot rb = new Robot();
//		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);

	}

	@FindBy(xpath = "//input[@id=\"emailId\"]")
	private WebElement emailid;

	public void EnterEmaild(String Email) {
		action.sendKeysElement(emailid, Email);
	}

	@FindBy(xpath = "//input[@id=\"mobileNo\"]")
	private WebElement Mobilenumber;

	public void EnterMobilenumber(String MobileNumber) {
		action.sendKeysElement(Mobilenumber, MobileNumber);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]")
	private WebElement Genderdropdown;

	public void SelectGenderDropdown() throws AWTException {
		action.clickElement(Genderdropdown);

		Robot rb = new Robot();
//		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);

	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]")
	private WebElement RMdropdown;

	public void SelectReportingManagerDropdown() throws AWTException {
		action.clickElement(RMdropdown);

		Robot rb = new Robot();
//		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);

	}

	// joining Date 05/14/2025

	@FindBy(xpath = "//input[@id=\"joiningDate\"]")
	private WebElement EnterDate;

	public void EnterJoiningDate() throws AWTException {
		action.sendKeysElement(EnterDate, "05/05/2025");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}

//	id="employeeCode"

	@FindBy(xpath = "//input[@id=\"employeeCode\"]")
	private WebElement EnterEmpCode;

	public void EnterEmployeeCode() throws AWTException {
		action.sendKeysElement(EnterEmpCode, "GMN0002");
		
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]")
	private WebElement SelectBand;

	public void SelectBandFromDropdown() throws AWTException {
		action.clickElement(SelectBand);

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[2]")
	private WebElement Designationdropdown;

	public void SelectDesignationDropdown() throws AWTException {
		action.clickElement(Designationdropdown);

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);

	}
	public void ClickonFinalSubmitButton()
	{
		action.clickElement(SubmitBtn);
	}
	
	@FindBy(xpath = "(//h1[@class=\"text-lg text-primary-400 font-medium text-center line-clamp-1\"])[last()]")
	private WebElement verifyEmpCreated;
	
	public boolean VerifyEmpCreated()
	{
		return action.isDisplay(verifyEmpCreated);
	}
	
}
