package ExoTalentWebWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class CompanyAssignJob extends TestBaseClassWeb{
	
	public CompanyAssignJob() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();
	
	
	@FindBy(xpath = "(//h1[@class=\"text-lg text-black font-semibold line-clamp-2 self-start flex-1\"])[1]")
	private WebElement firstJobClk;

	public void ClickonFirstJob() {
		action.clickElement(firstJobClk);

	}

	@FindBy(xpath = "//div[@class='w-fit self-start flex items-center justify-end gap-4']//button//*[name()='svg']")
	private WebElement ThreeDotClk;

	public void ClickonThreeDot() {
		action.clickElement(ThreeDotClk);
	}

	@FindBy(xpath = "//button[.='Assign Job']")
	private WebElement AssignJobCLk;

	public void ClickonAssignJob() {
		action.clickElement(AssignJobCLk);
	}

	@FindBy(xpath = "(//div[@class=\"css-1up7coo\"])[2]")
	private WebElement EmailidClk;

	@FindBy(xpath = "//div[@id=\"react-select-13-option-1\"]")
	private WebElement selectRecr;

	public void SelectRecruiterID() throws InterruptedException {
		action.clickElement(EmailidClk);
		Thread.sleep(1000);
		action.clickElement(selectRecr);

	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement AssignBtn;

	public void ClickonAssignButton() {
		action.clickElement(AssignBtn);
	}

	@FindBy(xpath = "(//p[@class=\"self-start text-exgray-200 text-base\"])[last()]")
	public WebElement VerifyJobAssgn;
	
	public boolean VerifyJobAssign()
	{
		return action.isDisplay(VerifyJobAssgn);
	}

}
