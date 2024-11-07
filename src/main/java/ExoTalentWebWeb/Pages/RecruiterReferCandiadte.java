package ExoTalentWebWeb.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class RecruiterReferCandiadte extends TestBaseClassWeb {

	public RecruiterReferCandiadte() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//a[.='Jobs']")
	private WebElement jobsBtn;

	public void ClickonJobsButton() {
		action.clickElement(jobsBtn);
	}

	@FindBy(xpath = "(//h1[@class=\"text-lg text-black font-semibold line-clamp-1\"])[1]")
	private WebElement FirstjobClick;

	public void ClickonFirstJobinTheLIst() {
		action.clickElement(FirstjobClick);
	}

	@FindBy(xpath = "//button[.='Refer']")
	private WebElement referBtn;

	public void ClickonReferButton() {
		action.clickElement(referBtn);
	}

	@FindBy(id = "phoneNo")
	private WebElement referbyMobile;
	String MobileNumerRefer = "9029022784";
	@FindBy(xpath = "(//button[.='Search'])[1]")
	private WebElement mobilesearch;

	Actions act = new Actions(driver);

	public void EnterMobileNumbertoRefer() throws InterruptedException {
		action.sendKeysElement(referbyMobile, MobileNumerRefer);
		Thread.sleep(2000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		// Send Enter key
		act.sendKeys(Keys.ENTER).perform();

	}

	@FindBy(xpath = "//button[.=\"Clear\"]/following-sibling::button[.=\"Refer\"]")
	private WebElement ReferBtn;

	public void ClickonReferCandidateButton() {
		action.clickElement(ReferBtn);
	}

	@FindBy(xpath = "//a[.='Profile']")
	private WebElement outsideclk;

	@FindBy(xpath = "//a[.='Profile']")
	private WebElement profileClk;

	public void ClickonProfile() throws InterruptedException {
		action.clickElement(outsideclk);
		Thread.sleep(4000);
		action.clickElement(profileClk);
	}

	@FindBy(xpath = "(//div[@class='self-stretch ml-3 flex-1 space-y-1'])[last()]")
	private WebElement latestAddedJob;

	public void latestAddedJobClick() {
		action.clickElement(latestAddedJob);
	}

	@FindBy(xpath = "//button[.='Referral List ']")
	private WebElement referalList;

	public void ClickonReferalList() {
		action.clickElement(referalList);
	}

	@FindBy(xpath = "//a[@class=\"text-lg text-exgray-800 font-semibold leading-none cursor-pointer\"]")
	private WebElement verifyReferaluser;

	public boolean VerifyReferalUserinList() {
		return action.isDisplay(verifyReferaluser);
	}

}
