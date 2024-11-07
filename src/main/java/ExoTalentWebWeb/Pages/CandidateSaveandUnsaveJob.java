package ExoTalentWebWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class CandidateSaveandUnsaveJob extends TestBaseClassWeb {

	public CandidateSaveandUnsaveJob() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "(//h1[@class=\"text-lg text-black font-semibold line-clamp-1\"])[1]")
	private WebElement FirstJob;

	public String GettextofFirstJob() {
		return FirstJob.getText();

	}

	public void ClickonFirstJob() {
		action.clickElement(FirstJob);
	}

	@FindBy(xpath = "//button[@class='bg-expurple-100 self-stretch px-2 rounded-sm active:scale-90']//*[name()='svg']")
	private WebElement SaveJobBtn;

	public void ClickonSaveJobButton() {
		action.clickElement(SaveJobBtn);
	}

	@FindBy(xpath = "//a[.='Profile']")
	private WebElement ProfileBtn;

	public void ClickonProfilebutton() {
		action.clickElement(ProfileBtn);
	}

	@FindBy(xpath = "//button[.='Saved Jobs']")
	private WebElement SavedjobsBtn;

	public void ClickonSavedJobsButton() {
		action.clickElement(SavedjobsBtn);
	}

	@FindBy(xpath = "(//h1[@class=\"text-lg text-black font-semibold line-clamp-1\"])[1]")
	private WebElement expectedSavedJobGet;
	
	@FindBy(xpath = "//button[@class=\"bg-expurple-100 self-stretch px-2 rounded-sm active:scale-90\"]")
	private WebElement UnsaveJob;
	public void ClickonUnsaveJob()
	{
		action.clickElement(UnsaveJob);
	}

	public String ExpectedSavedJobGettext() {
		return expectedSavedJobGet.getText();
	}
	
	public boolean VerifyUnsaveJob()
	{
		return action.isDisplay(SavedjobsBtn);
	}
	
	

	
	

}
