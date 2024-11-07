package ExoTalentWebWeb.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class CandidateApplyJob extends TestBaseClassWeb {

	public CandidateApplyJob() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//a[.='Jobs']")
	private WebElement jobsBTN;

	public void ClickonjobsButton() {
		action.clickElement(jobsBTN);
	}

	@FindBy(xpath = "(//h1[@class=\"text-lg text-black font-semibold line-clamp-1\"])[1]")
	private WebElement FirstJob;

	public void ClickonFirstJob() {
		action.clickElement(FirstJob);
	}

	@FindBy(xpath = "//button[.='Apply']")
	private WebElement ApplyBtn;

	public void ClickonApplyButton() {
		action.clickElement(ApplyBtn);
	}

	@FindBy(xpath = "(//div[@class=\" css-y5ynmu\"])[3]")
	private WebElement salaryDrop;

	@FindBy(xpath = "//div[contains(text(), '6 Lacs')]")
	private WebElement SelectSalary;

	public void ClickonSalaryDropdown() throws InterruptedException {
		action.clickElement(salaryDrop);
		Thread.sleep(1000);
		action.clickElement(SelectSalary);
	}

	@FindBy(xpath = "(//div[@class=\" css-y5ynmu\"])[4]")
	private WebElement IndustryDrop;

	@FindBy(xpath = "//div[contains(text(), 'IT & ITES')]")
	private WebElement SelectIndustry;

	public void ClickonIndustryDropdown() throws InterruptedException {
		action.clickElement(IndustryDrop);
		Thread.sleep(1000);
		action.clickElement(SelectIndustry);
	}

	@FindBy(xpath = "(//div[@class=\" css-y5ynmu\"])[5]")
	private WebElement LocationDrop;

	@FindBy(xpath = "//div[contains(text(), 'Mumbai')]")
	private WebElement selectLocation;

	public void ClickonLocationDropdown() throws InterruptedException {
		action.clickElement(LocationDrop);
		Thread.sleep(1000);
		action.clickElement(selectLocation);
	}

	@FindBy(id = "file")
	private WebElement hiddenFileInput;

	public void uploadResume() throws InterruptedException {
		// Use JavaScript to remove the "hidden" class from the parent div
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].classList.remove('hidden');", hiddenFileInput);

		// Wait briefly to ensure the element is interactable
		Thread.sleep(2000); // optional, replace with WebDriverWait if necessary

		// Use sendKeys() to upload the file
		hiddenFileInput.sendKeys(
				"C:\\Users\\Mayur More\\OneDrive\\Desktop\\Email id or phone no missing cvs\\Rajashekara_Swamy.pdf");
	}

	@FindBy(xpath = "//button[.='Apply']")
	private WebElement applyBtn;

	public void ClickonApplyJobButton() {
		action.clickElement(applyBtn);
	}

	@FindBy(xpath = "//h1[@class=\"text-lg text-black font-semibold line-clamp-1\"]")
	private WebElement VerifyjjobApplied;

	public boolean VerifyJobAppliedSuccesfully() {
		return action.isDisplay(VerifyjjobApplied);
	}

//	(//h1[@class="text-lg text-black font-semibold line-clamp-1"])[1]
	
	////////////Candidate Job Apply from Invivations/////
	
	@FindBy(xpath = "//button[.='Invitations']")
	private WebElement InvitationsTabBtn;
	public void ClickonInvitationsTab()
	{
		action.clickElement(InvitationsTabBtn);
	}
	
	
	@FindBy(xpath = "(//div[@class=\" css-y5ynmu\"])[2]")
	private WebElement salaryDrop1;

	@FindBy(xpath = "//div[contains(text(), '6 Lacs')]")
	private WebElement SelectSalary1;

	public void ClickonSalaryDropdownInvite() throws InterruptedException {
		action.clickElement(salaryDrop1);
		Thread.sleep(1000);
		action.clickElement(SelectSalary1);
	}

	@FindBy(xpath = "(//div[@class=\" css-y5ynmu\"])[3]")
	private WebElement IndustryDrop1;

	@FindBy(xpath = "//div[contains(text(), 'IT & ITES')]")
	private WebElement SelectIndustry1;

	

	public void ClickonIndustryDropdownInvite() throws InterruptedException {
		action.clickElement(IndustryDrop1);
		Thread.sleep(1000);
		action.clickElement(SelectIndustry1);
	}

	@FindBy(xpath = "(//div[@class=\" css-y5ynmu\"])[4]")
	private WebElement LocationDrop1;

	@FindBy(xpath = "//div[contains(text(), 'Mumbai')]")
	private WebElement selectLocation1;

	public void ClickonLocationDropdownInvite() throws InterruptedException {
		action.clickElement(LocationDrop1);
		Thread.sleep(1000);
		action.clickElement(selectLocation1);
	}


}
