package ExoTalentWebWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class Adviserflow extends TestBaseClassWeb {
	
	public Adviserflow() {
		super();
		PageFactory.initElements(driver, this);

	}

	ActionKeywords action = new ActionKeywords();


	////////// Assign To Adviser/////////

	@FindBy(xpath = "(//div[@class=\"h-5 w-5 border-2 rounded-sm border-exgray-200 false cursor-pointer flex items-center justify-center\"])[1]")
	private WebElement checkboxClick;

	public void ClickonCheckBox() {
		action.clickElement(checkboxClick);
	}

	@FindBy(xpath = "//button[.='Select Action']")
	private WebElement SelectAction;

	public void ClickonSelectAction() {
		action.clickElement(SelectAction);
	}

	@FindBy(xpath = "//button[.='Assign To Adviser']")
	private WebElement AssignAdv;

	public void ClickonAssigntoAdviser() {
		action.clickElement(AssignAdv);
	}

	@FindBy(xpath = "(//div[@class=\"css-hlgwow\"])")
	private WebElement AssignCandidate;

	@FindBy(xpath = "//div[.='Vinayak Sagar - cinayak@ymail.com']")
	private WebElement ASsignADv;

	@FindBy(xpath = "(//button[.='Assign'])[2]")
	private WebElement ASsignButton;

	@FindBy(xpath = "//button[.='Logout']")
	private WebElement LogoutBtn;

	@FindBy(xpath = "//button[.='Login As']")
	private WebElement LoginAs;

	@FindBy(xpath = "//a[.='Company']")
	private WebElement LoginAsCompany;

	public void SelectAdviser() throws InterruptedException {
		action.clickElement(AssignCandidate);
		Thread.sleep(1000);
		action.clickElement(ASsignADv);
		Thread.sleep(1000);
		action.clickElement(ASsignButton);
		Thread.sleep(1000);
		action.clickElement(LogoutBtn);
		Thread.sleep(1000);
		action.clickElement(LoginAs);
		Thread.sleep(1000);
		action.clickElement(LoginAsCompany);
	}

	@FindBy(id = "emailId")
	private WebElement EmailidComp;
	@FindBy(xpath = "//button[.='Login Via OTP']")
	private WebElement LoginviaOTpBtn;

	public void EnterAdviserID() throws InterruptedException {
		action.sendKeysElement(EmailidComp, "cinayak@ymail.com");
		Thread.sleep(1000);
		action.clickElement(LoginviaOTpBtn);
	}

	@FindBy(xpath = "//div[@class='w-full space-y-4']//input[1]")
	private WebElement Enterotp1;

	@FindBy(xpath = "//input[2]")
	private WebElement Enterotp2;

	@FindBy(xpath = "//input[3]")
	private WebElement Enterotp3;

	@FindBy(xpath = "//input[4]")
	private WebElement Enterotp4;

	@FindBy(xpath = "//input[5]")
	private WebElement Enterotp5;

	@FindBy(xpath = "//input[6]")
	private WebElement Enterotp6;

	@FindBy(xpath = "(//button[.='Verify'])")
	private WebElement verifyOTPBtn;

	public void EnterAdviserOTP() throws InterruptedException {
		action.sendKeysElement(Enterotp1, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp2, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp3, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp4, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp5, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp6, "4");
		Thread.sleep(500);
//		action.clickElement(verifyOTPBtn);

	}

	@FindBy(xpath = "//a[.='Job Board']")
	private WebElement JobBoard;

	public void ClickonJobBoard() {
		action.clickElement(JobBoard);
	}

	@FindBy(xpath = "(//h1[@class=\"text-lg text-black font-semibold line-clamp-2 self-start flex-1\"])[1]")
	private WebElement Jobclk;;

	public void adviserClickonJob() {
		action.clickElement(Jobclk);
	}

	public void SelectActionAdviser() throws InterruptedException {
		action.clickElement(checkboxClick);
		Thread.sleep(1000);
		action.clickElement(SelectAction);
	}

	@FindBy(xpath = "//button[.='Approve']")
	private WebElement SelectApprove;

	@FindBy(xpath = "//button[.='Reject']")
	private WebElement SelectReject;
	
	public void ClickonApprove() throws InterruptedException {
		action.clickElement(SelectAction);
		Thread.sleep(3000);
		action.clickElement(SelectApprove);
		Thread.sleep(3000);
//		action.clickElement(SelectAction);
//		Thread.sleep(3000);
//		action.clickElement(SelectApprove);
	}
	
	
	
	public void ClickonReject() throws InterruptedException {
		action.clickElement(SelectAction);
		Thread.sleep(3000);
		action.clickElement(SelectReject);
		Thread.sleep(3000);
//		action.clickElement(SelectAction);
//		Thread.sleep(3000);
//		action.clickElement(SelectApprove);
	}

	@FindBy(xpath = "//button[.='Advisor Approved']")
	private WebElement verifyAdviser;

	public boolean VerifyAdviserStatus() {
		return action.isDisplay(verifyAdviser);
	}
	
	public void LoginasCompany() throws InterruptedException {
	
		action.clickElement(LogoutBtn);
		Thread.sleep(1000);
		action.clickElement(LoginAs);
		Thread.sleep(1000);
		action.clickElement(LoginAsCompany);
	}

	@FindBy(id = "emailId")
	private WebElement EmailidComp1;
	@FindBy(xpath = "//button[.='Login Via OTP']")
	private WebElement LoginviaOTpBtn1;

	public void EnterCompanyEmailid() throws InterruptedException {
		action.sendKeysElement(EmailidComp, "cr1@apmosys.com");
		Thread.sleep(1000);
		action.clickElement(LoginviaOTpBtn);
	}

	@FindBy(xpath = "//div[@class='w-full space-y-4']//input[1]")
	private WebElement Enterotp11;

	@FindBy(xpath = "//input[2]")
	private WebElement Enterotp22;

	@FindBy(xpath = "//input[3]")
	private WebElement Enterotp33;

	@FindBy(xpath = "//input[4]")
	private WebElement Enterotp44;

	@FindBy(xpath = "//input[5]")
	private WebElement Enterotp55;

	@FindBy(xpath = "//input[6]")
	private WebElement Enterotp66;

	public void EnterOTP() throws InterruptedException {
		action.sendKeysElement(Enterotp11, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp22, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp33, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp44, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp55, "4");
		Thread.sleep(500);
		action.sendKeysElement(Enterotp66, "4");
		Thread.sleep(500);
//		action.clickElement(verifyOTPBtn);
		action.clickElement(JobBoard);
		Thread.sleep(500);
		action.clickElement(Jobclk);

	}
	
	//h1[.='Approved']
	
	@FindBy(xpath = "//h1[.='Approved']")
	private WebElement verifyAdviserinCompany;

	public boolean VerifyAdviserStatusinCompany() {
		return action.isDisplay(verifyAdviserinCompany);
	}
	
//	candidate move Forward and status change
	@FindBy(xpath = "//h1[.='Rejected']")
	private WebElement verifyAdviserRejectinCompany;

	public boolean VerifyAdviserStatusasRejectinCompany() {
		return action.isDisplay(verifyAdviserRejectinCompany);
	}

	@FindBy(xpath = "//button[.='Tagged List']")
	private WebElement TaggedList;
	public void ClickonTaggedList()
	{
		action.clickElement(TaggedList);
	}
	@FindBy(xpath = "(//div[@class=\"rotate-90 \"])[1]")
	private WebElement threeDotMenu;
	public void ClickonThreeDot()
	{
		action.clickElement(threeDotMenu);
	}
	//
	

	@FindBy(xpath = "//button[.='Move Forward']")
	private WebElement MoveForwardBtn;
	public void ClickonMoveForward()
	{
		action.clickElement(MoveForwardBtn);
	}
	
	
	
	public boolean VerifyMoveForward()
	{
		return action.isDisplay(VerifyColumnName);
	}
	
	//////Edit Column Name/////
	
	@FindBy(xpath = "(//button[@class=\"active:scale-95\"])[2]")
	private WebElement EditColClk;
	public void clickonEditColumn()
	{
		action.clickElement(EditColClk);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Column Name\"]")
	private WebElement ColumnName;
	
	@FindBy(xpath = "//input[@class=\"w-full pr-2 outline-none bg-transparent text-base text-primary-400 font-semibold\"]")
	private WebElement ColumnName1;
	public void EditColumnName() throws InterruptedException, AWTException
	{
		Robot rb= new Robot();
		Thread.sleep(3000);
//		for (int i = 0; i < 11; i++) {
//		    rb.keyPress(KeyEvent.VK_BACK_SPACE);
//		}
		
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		
//		action.clearElement(ColumnName1);
		Thread.sleep(5000);
		action.sendKeysElement(ColumnName1, "Interview Round 2");
//		Robot rb= new Robot();
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
				
		
	}
	
	public boolean VerifyColumnNameEdited()
	{
		return action.isDisplay(VerifyColumnName);
	}
	
	@FindBy(xpath = "//button[.='+ Add Columns']")
	private WebElement AddColumn;
	public void ClickonAddColumn()
	{
		action.clickElement(AddColumn);
	}
	
	public void EnterNewColumnname() throws AWTException, InterruptedException
	{
		action.sendKeysElement(ColumnName, "Final Round");
		Robot rb= new Robot();
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	@FindBy(xpath = "(//div[@class=\"flex items-center justify-between bg-exwhite-100 border-b-2 border-b-secondary-400 px-4 py-1 rounded-t-md\"])[2]")
	private WebElement VerifyColumnName;

	public boolean VerifyColumnAdded()
	{
		return action.isDisplay(VerifyColumnName);
	}
	
}
