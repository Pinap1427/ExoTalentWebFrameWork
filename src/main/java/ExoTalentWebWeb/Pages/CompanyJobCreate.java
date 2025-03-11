package ExoTalentWebWeb.Pages;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;

public class CompanyJobCreate extends TestBaseClassWeb {

	public CompanyJobCreate() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//button[.='ATS']")
	private WebElement AtsOpen;

	public void ClickonAtSOpen() {
		action.clickElement(AtsOpen);
	}

	@FindBy(xpath = "//a[.='Job Board']")
	private WebElement JobBoard;

	public void ClickonJobBoard() {
		action.clickElement(JobBoard);
	}

	@FindBy(xpath = "//a[.=' Create Job']")
	private WebElement CreateJobBtn;

	public void ClickonCreateJobButton() {
		action.clickElement(CreateJobBtn);
	}

	File file = new File("TestData/Dummu JD Sample (1).docx");
	String absolutePathJD = file.getAbsolutePath();
//     System.out.println("Uploading: " + absolutePath);

	@FindBy(xpath = "//input[@type=\"file\"]")
	private WebElement UploadJD;

	public void UploadJD() {
		action.sendKeysElement(UploadJD, absolutePathJD);
	}

	@FindBy(xpath = "//label[.='Functions *']")
	private WebElement scrollTillFunc;

	public void ScrollTilFunction() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(scrollTillFunc).perform();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//label[.='Functions *']//following::div[1]")
	private WebElement ClickFuncion;

	@FindBy(xpath = "//p[.='Human Resources and Administration']")
	private WebElement SelectFunc;

	@FindBy(xpath = "//button[.='Add']")
	private WebElement Sideclk;

	public void SelectFunction() throws InterruptedException {
		action.clickElement(ClickFuncion);
		Thread.sleep(1000);
		action.clickElement(SelectFunc);
		Thread.sleep(1000);
		action.clickElement(Sideclk);

	}

	@FindBy(xpath = "//button[.='Post Job ']")
	private WebElement PostJobBtn;

	public void ScrollTillPostJob() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(PostJobBtn).perform();
		Thread.sleep(1000);
	}

	public void ClickonPostJobButton() {
		action.clickElement(PostJobBtn);
	}

	@FindBy(xpath = "(//h1[@class=\"text-lg text-black font-semibold line-clamp-2 self-start flex-1\"])[1]")
	public WebElement VerifyJob;

	public boolean VerifyJobCreated() {
		return action.isDisplay(VerifyJob);
		


	}

}
