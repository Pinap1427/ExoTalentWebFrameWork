package ExoTalentWebWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class AddMember extends TestBaseClassWeb {
	
	public AddMember() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	
	@FindBy(xpath = "//button[.='Members']")
	private WebElement Membersclk;
	public void ClickonMember()
	{
		action.clickElement(Membersclk);
	}
	
	
}
