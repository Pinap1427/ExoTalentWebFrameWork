package ExoTalentWebWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class CreateEmployee extends TestBaseClassWeb{
	
	public CreateEmployee() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();
	
	@FindBy(xpath = "//button[.=' Create Employee']")
	private WebElement createEmployee;
	
	public void ClickonCreateEmployee()
	{
		action.clickElement(createEmployee);
	}
	
	
	
}
