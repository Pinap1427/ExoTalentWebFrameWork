package ExoTalentWebWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class EditAdditionalDetails extends TestBaseClassWeb {

	public EditAdditionalDetails() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//h1[text()='Additional Details']/ancestor::div[contains(@class, 'flex')]/div/div[@class='mt-1.5 mr-3']")
//	@FindBy(xpath = "//h1[text()=\"Personal Information\"]/following-sibling::div//div[@class='mt-1.5 mr-3']")
	private WebElement EditAddDetails;

	public void ClickonEditAdditionalDetails() throws InterruptedException {
		action.clickElement(EditAddDetails);
	}

	@FindBy(xpath = "//button[.='Submit']")
	private WebElement ClickonSubmitBtn;

	public void ClickonAddSubmitButton() {
		action.clickElement(ClickonSubmitBtn);
	}

	@FindBy(xpath = "//label[.='First Name *']")
	private WebElement VerifyMadnFieldsAddi;

	public boolean VerifyAddDetailsMandatoryFields() {
		return action.isDisplay(VerifyMadnFieldsAddi);
	}

	@FindBy(id = "firstName")
	private WebElement firstName;

	public void EnterFirstNAme(String AdditionalFirstName) {
		action.sendKeysElement(firstName, AdditionalFirstName);
	}

	@FindBy(id = "lastName")
	private WebElement lastName;

	public void EnterLastNAme(String AdditionalLastName) {
		action.sendKeysElement(lastName, AdditionalLastName);
	}

	@FindBy(id = "relationship")
	private WebElement relation;

	public void EnterRelation(String AdditionalRelation) {
		action.sendKeysElement(relation, AdditionalRelation);
	}

	@FindBy(id = "phone")
	private WebElement phoneNum;

	public void EnterAdditionalPhone(String AdditionalPhone) {
		action.sendKeysElement(phoneNum, AdditionalPhone);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")
	private WebElement currentAdd;

	public void EnterAdditionalCurrentadd(String AdditionalCurrentadd) {
		action.sendKeysElement(currentAdd, AdditionalCurrentadd);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/form[1]/div[3]/div[2]/div[1]/input[1]")
	private WebElement permanenttAdd;

	public void EnterAdditionalPermanentadd(String AdditionalPermanentadd) {
		action.sendKeysElement(permanenttAdd, AdditionalPermanentadd);
	}

	public void ClickonFinalSubmit() {
		action.clickElement(ClickonSubmitBtn);
	}

	@FindBy(xpath = "//h1[.='Additional Details']")
	private WebElement verifyAddDet;

	public boolean VerifyAdditionalDetails() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		return action.isDisplay(verifyAddDet);
	}
}
