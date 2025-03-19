package ExoTalentWebWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class CanidateReferManually extends TestBaseClassWeb {

	public CanidateReferManually() {
		super();
		PageFactory.initElements(driver, this);

	}

	ActionKeywords action = new ActionKeywords();

///////// Already Exist Refer Candidate//

	@FindBy(xpath = "//button[.='Add Candidate']")
	private WebElement AddcandBtn;

	public void ClickonAddCandidate() {
		action.clickElement(AddcandBtn);
	}

	@FindBy(xpath = "//input[@id='emailId']")
	private WebElement EnterCandiEmailID;

	@FindBy(xpath = "(//button[text()=\"Search\"])[2]")
	private WebElement SearchEmail;

	public void EneterCandidateEmailid() throws InterruptedException {
		action.sendKeysElement(EnterCandiEmailID, "testuser444@gmail.com");
		Thread.sleep(1000);
		action.clickElement(SearchEmail);
	}
	
	public void EneterCandidateEmailid1() throws InterruptedException {
		action.sendKeysElement(EnterCandiEmailID, "selmonbhoi111@tcs.com");
		Thread.sleep(1000);
		action.clickElement(SearchEmail);
	}

	@FindBy(xpath = "//button[text()=\"Clear\"]")
	private WebElement ClearBtn;

	public void ScrollTillClearBtn() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(ClearBtn).perform();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//button[text()=\"Refer\"]")
	private WebElement ReferBtn;

	public void ClickonReferButton() {
		action.clickElement(ReferBtn);
	}

	@FindBy(xpath = "(//a[@class=\"flex-1 text-base text-primary-400 font-semibold cursor-pointer text-nowrap\"])[1]")
	private WebElement VerifyCandidateRefer;

	public boolean VerifyCandidateReferorNot() {
		return action.isDisplay(VerifyCandidateRefer);
	}

	
}
