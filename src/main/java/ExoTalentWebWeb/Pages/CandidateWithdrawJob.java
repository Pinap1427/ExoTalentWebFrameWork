package ExoTalentWebWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class CandidateWithdrawJob extends TestBaseClassWeb{
	
	public CandidateWithdrawJob() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();
	
	@FindBy(xpath = "(//h1[@class=\"text-lg text-black font-semibold line-clamp-1\"])[1]")
	private WebElement firstJb;
	public void ClickonFirstJob()
	{
		action.clickElement(firstJb);
	}
	@FindBy(xpath = "//button[.='Withdraw']")
	private WebElement WithdrawBtn;
	public void ClickonWithdrawButton()
	{
		action.clickElement(WithdrawBtn);
	}
	@FindBy(xpath = "//button[.='Applied Jobs']")
	private WebElement VerifyjobWithdrawn;
	public boolean VerifyJobisWithdrwan()
	{
		return action.isDisplay(VerifyjobWithdrawn);
	}

}
