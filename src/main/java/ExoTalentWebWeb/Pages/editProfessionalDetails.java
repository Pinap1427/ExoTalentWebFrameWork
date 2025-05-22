package ExoTalentWebWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
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
	
	@FindBy(xpath = "//button[.='Submit']")
	private WebElement SubmitBtnProf;
	
	public void ClickonSubmitButton()
	{
		action.clickElement(SubmitBtnProf);
	}
	
	@FindBy(xpath = "//label[.='Department *']")
	private WebElement verifyDetailsRequ;
	public boolean VerifyRequiredFields()
	{
		return action.isDisplay(verifyDetailsRequ);
	}
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]")
	private WebElement workmode;
	public void SelectWorkmode() throws AWTException
	{
		action.clickElement(workmode);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]")
	private WebElement emptype;
	public void SelectEmployementType() throws AWTException
	{
		action.clickElement(emptype);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/form[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")
	private WebElement Worklocation;
	public void SelectWorkLocation() throws AWTException
	{
		action.clickElement(Worklocation);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	@FindBy(xpath = "//input[@id=\"leaveCarryForward\"]")
	private WebElement enterLeave;
	public void EnterLeaveBalance() throws InterruptedException
	{
		action.clearElement(enterLeave);
		Thread.sleep(1000);
		action.sendKeysElement(enterLeave, "10");
	}
	
	public void ClickonFinalSubmit()
	{
		action.clickElement(SubmitBtnProf);
	}
	
	@FindBy(xpath = "//h1[.='Professional Details']")
	private WebElement VerifyProfDet;
	
	public boolean VerifyEditedProfessionalDetails()
	{
		return action.isDisplay(VerifyProfDet);
	}
	
	

}
