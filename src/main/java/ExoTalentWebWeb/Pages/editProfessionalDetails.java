package ExoTalentWebWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class editProfessionalDetails extends TestBaseClassWeb {

	
	public editProfessionalDetails() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();
	
	@FindBy(xpath = "//h1[text()=\"Personal Information\"]")
	private WebElement HeaderScroll;
	public void ScrollTop() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(HeaderScroll).perform();
		Thread.sleep(1000);
	}
	
	@FindBy(xpath = "//h1[text()='Professional Details']/ancestor::div[contains(@class, 'flex')]/div/div[@class='mt-1.5 mr-3']")
	private WebElement clickEdit;
	
	public void ClickonEditProfessional()
	{
		action.clickElement(clickEdit);;
	}
	

}
