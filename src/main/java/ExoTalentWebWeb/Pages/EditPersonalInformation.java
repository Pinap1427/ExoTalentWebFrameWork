package ExoTalentWebWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class EditPersonalInformation extends TestBaseClassWeb {

	public EditPersonalInformation() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "(//h1[@class=\"text-lg text-primary-400 font-medium text-center line-clamp-1\"])[last()]")
	private WebElement LastEmp;

	public void ClickonLastEmployee() {
		action.clickElement(LastEmp);
	}
	@FindBy(xpath = "//h1[text()=\"Personal Information\"]")
	private WebElement HeaderScroll;
	public void ScrollTop() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(HeaderScroll).perform();
		Thread.sleep(1000);
	}

	
	@FindBy(xpath = "//h1[text()='Personal Information']/ancestor::div[contains(@class, 'flex')]/div/div[@class='mt-1.5 mr-3']")
//	@FindBy(xpath = "//h1[text()=\"Personal Information\"]/following-sibling::div//div[@class='mt-1.5 mr-3']")
	private WebElement EditDetails;

	public void ClickonEditDetails() throws InterruptedException {
		action.clickElement(EditDetails);
	}

	@FindBy(xpath = "//button[.='Submit']")
	private WebElement SubmitBtn;

	public void ClickonSubmitButton() {
		action.clickElement(SubmitBtn);
	}
	
	@FindBy(xpath = "(//label[@for=\"firstName\"])[1]")
	private WebElement verifyinputrequiredFields;
	
	public boolean verifyFields()
	{
		return action.isDisplay(verifyinputrequiredFields);
	}

	////DOB
	
	@FindBy(xpath = "//input[@id='birthDate']")
	private WebElement birthdate;
	
	public void EnterBirthdate() throws InterruptedException, AWTException
	{
		action.clearElement(birthdate);
		Thread.sleep(1000);
		action.sendKeysElement(birthdate, "27/06/1998");

		Robot rb = new Robot();
//		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]")
	private WebElement maritialStatus;
	public void SelectMaritialStatus() throws InterruptedException, AWTException
	{
		action.clickElement(maritialStatus);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]")
	private WebElement Nationality;
	public void SelectNationality() throws AWTException
	{
		action.clickElement(Nationality);
		Robot rb = new Robot();
//		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	@FindBy(xpath = "(//input[@id='firstName'])[2]")
	private WebElement CurrentAdd;
	public void EnterCurrentAddress()
	{
		action.sendKeysElement(CurrentAdd, "Ghansoli, Navi Mumbai");
	}
	
	@FindBy(xpath = "(//input[@id='firstName'])[3]")
	private WebElement PermAdd;
	public void EnterPermenantAddress()
	{
		action.sendKeysElement(PermAdd, "Gaimukh, Thane West");
	}
		
	public void ClickonFinalSubmitBtn()
	{
		action.clickElement(SubmitBtn);
	}
	
	@FindBy(xpath = "//h1[contains(text(),'Marital Status')]/following::h1[1]")
	private WebElement verifyEditedDetails;
	
	public boolean verifyDetailsEdited()
	{
		return action.isDisplay(verifyEditedDetails);
	}
	
}
