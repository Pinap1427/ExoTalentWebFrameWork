package ExoTalentWeb.TestCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ExoTalentWeb.BaseClass.TestBaseClassWeb;
import ExoTalentWeb.Utils.ActionKeywords;
import ExoTalentWeb.Utils.TestUtilsWeb;
import ExoTalentWebWeb.Pages.WebLoginWithMobileNumber;
import ExoTalentWebWeb.Pages.editProfessionalDetails;
import ExoTalentWeb.Utils.ExcelUtils;
import ExoTalentWebWeb.Pages.Adviserflow;
import ExoTalentWebWeb.Pages.CandidateApplyJob;
import ExoTalentWebWeb.Pages.CandidateSaveandUnsaveJob;
import ExoTalentWebWeb.Pages.CandidateSignup;
import ExoTalentWebWeb.Pages.CandidateWithdrawJob;
import ExoTalentWebWeb.Pages.CanidateReferManually;
import ExoTalentWebWeb.Pages.CompanyLogin;
import ExoTalentWebWeb.Pages.CompanySignupPage;
import ExoTalentWebWeb.Pages.CreateEmployee;
import ExoTalentWebWeb.Pages.EditAdditionalDetails;
import ExoTalentWebWeb.Pages.RecruiterReferCandiadte;
import ExoTalentWebWeb.Pages.RecruiterSignup;
import ExoTalentWebWeb.Pages.RecruiterLogin;
import ExoTalentWebWeb.Pages.CompanyJobCreate;
import ExoTalentWebWeb.Pages.CompanyAssignJob;
import ExoTalentWebWeb.Pages.EditJob;
import ExoTalentWebWeb.Pages.EditPersonalInformation;

public class WebTestCases extends TestBaseClassWeb {
	public static WebDriver driver;

	@Override
	public void TestBaseClassWeb() throws IOException {
//		 super();
//		 this.driver = driver;
		driver = TestBaseClassWeb.driver;
	}

	TestUtilsWeb testutilsWeb;
	ActionKeywords action1;
	ExcelUtils excel;
	WebLoginWithMobileNumber loginmethodweb;
	CandidateSignup signupCandidate;
	CandidateApplyJob applyjobCandidate;
	CandidateSaveandUnsaveJob saveunsaveJob;
	CandidateWithdrawJob withdrawJob;
	RecruiterSignup signupRecruiter;
	RecruiterReferCandiadte referCandidaterecuriter;
	RecruiterLogin loginRecruiter;

	//////////// New ///////////////
	CompanySignupPage signupCompany;
	CompanyLogin loginCompany;
	CompanyJobCreate createJobCompany;
	CompanyAssignJob AssignJobCompany;
	EditJob jobEdit;
	CanidateReferManually candidatereferman;
	Adviserflow advflow;
	CreateEmployee empcreate;
	EditPersonalInformation editPersInfo;
	editProfessionalDetails editProfDetails;
	EditAdditionalDetails editAddDetails;

	@BeforeTest
	public void setUp() throws IOException {
		System.out.println("Inside before");
		InitializeBrowser();

//		String excelPath = System.getProperty("user.dir") + File.separator + "AndroidAppVersion2.0New" + File.separator + "TestData" + File.separator + "Datasheet.xlsx";
		String excelPath = System.getProperty("user.dir") + "\\TestData\\Datasheet.xlsx";
		System.out.println(excelPath);
		// Create an instance of ExcelUtils to read data
		excel = new ExcelUtils(excelPath, "Sheet1");

//		initializeBrowserEdge();
		testutilsWeb = new TestUtilsWeb(driver);
		action1 = new ActionKeywords();
		loginmethodweb = new WebLoginWithMobileNumber();
		signupCandidate = new CandidateSignup();
		applyjobCandidate = new CandidateApplyJob();
		saveunsaveJob = new CandidateSaveandUnsaveJob();
		withdrawJob = new CandidateWithdrawJob();
		signupRecruiter = new RecruiterSignup();
		referCandidaterecuriter = new RecruiterReferCandiadte();
		loginRecruiter = new RecruiterLogin();

		signupCompany = new CompanySignupPage();
		loginCompany = new CompanyLogin();
		createJobCompany = new CompanyJobCreate();
		AssignJobCompany = new CompanyAssignJob();
		jobEdit = new EditJob();

		candidatereferman = new CanidateReferManually();

		advflow = new Adviserflow();

		empcreate = new CreateEmployee();

		editPersInfo = new EditPersonalInformation();

		editProfDetails = new editProfessionalDetails();

		editAddDetails = new EditAdditionalDetails();
	}

	@Test(priority = 1, enabled = false)
	public void CompanyLogin() throws IOException {

		testutilsWeb.extentReport();

		testutilsWeb.testCaseCreate("Tc 1: Company Page Login");

		try {

//			System.out
//					.println(org.openqa.selenium.remote.RemoteWebDriver.class.getPackage().getImplementationVersion());

			loginCompany.ClickonJoinAsButton();
			testutilsWeb.test.log(Status.INFO, "Click on join as button");
			loginCompany.ClickonCompanyButton();
			testutilsWeb.test.log(Status.INFO, "Click on Company button");
			String CompanyEmailid = excel.getCellData(1, 4);
			loginCompany.EnterCompanyEmailid(CompanyEmailid);
			testutilsWeb.test.log(Status.INFO, "Enter Email id");
			loginCompany.EnterOTP();
			testutilsWeb.test.log(Status.INFO, "Enter Otp");
			Thread.sleep(2000);
			if (loginCompany.VerifyCompanyCreated()) {
				testutilsWeb.passTestCase("Company Login Succesfully");
			}

		} catch (Exception e) {
			testutilsWeb.failTestCase("Exception occurred during Company Login:" + e.getMessage());
			e.printStackTrace(); // Log the exception for debugging

		}

	}

	@Test(priority = 1, enabled = true)
	public void CompanyLoginProduction() throws IOException {

		testutilsWeb.extentReport();

		testutilsWeb.testCaseCreate("Tc 1: Company Page Login");

		try {

//			System.out
//					.println(org.openqa.selenium.remote.RemoteWebDriver.class.getPackage().getImplementationVersion());

			loginCompany.ClickonJoinAsButton();
			testutilsWeb.test.log(Status.INFO, "Click on join as button");
			loginCompany.ClickonCompanyButton();
			testutilsWeb.test.log(Status.INFO, "Click on Company button");
			loginCompany.EnterCompanyEmailidProd();
			testutilsWeb.test.log(Status.INFO, "Enter Email id");
//			loginCompany.EnterOTP();
//			testutilsWeb.test.log(Status.INFO, "Enter Otp");
			Thread.sleep(20000);
			if (loginCompany.VerifyCompanyCreated()) {
				testutilsWeb.passTestCase("Company Login Succesfully");
			}

		} catch (Exception e) {
			testutilsWeb.failTestCase("Exception occurred during Company Login:" + e.getMessage());
			e.printStackTrace(); // Log the exception for debugging

		}

	}

	@Test(priority = 2, enabled = false)
	public void CompanyJobCreate() throws IOException {

		testutilsWeb.testCaseCreate("Tc 2: Company Page Job Create");

		try {

			createJobCompany.ClickonAtSOpen();
			testutilsWeb.test.log(Status.INFO, "Click on ATs");
			createJobCompany.ClickonJobBoard();
			testutilsWeb.test.log(Status.INFO, "Click on Job board");
			createJobCompany.ClickonCreateJobButton();
			testutilsWeb.test.log(Status.INFO, "Click on create job");
			createJobCompany.UploadJD();
			testutilsWeb.test.log(Status.INFO, "Upload JD");
			WebDriverWait wait = new WebDriverWait(TestBaseClassWeb.driver, 15); // Use integer timeout instead of
																					// Duration
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Jd Extracted Successfully')]")));

			// Thread.sleep(20000);

			createJobCompany.SelectFunction();
			testutilsWeb.test.log(Status.INFO, "Select Function from list");
			createJobCompany.ScrollTillPostJob();
			testutilsWeb.test.log(Status.INFO, "Scroll till Post Job");
			createJobCompany.ClickonPostJobButton();
			testutilsWeb.test.log(Status.INFO, "Click on Post Job Button");
			try {
				if (createJobCompany.VerifyJobCreated()) {
					testutilsWeb.passTestCase("Able to Create Job Succesfully");
				}
			} catch (Exception e) {

				testutilsWeb.failTestCase("Not Able to Create Job Succesfully");

			}

		} catch (Exception e) {
			testutilsWeb.failTestCase("Exception occurred during Company Job Create:" + e.getMessage());
			e.printStackTrace(); // Log the exception for debugging
		}
	}

	@Test(priority = 3, enabled = false)
	public void CompanyAssignJob() throws IOException {

		testutilsWeb.testCaseCreate("Tc 3: Company Page Assign Job");

		try {

			AssignJobCompany.ClickonFirstJob();
			testutilsWeb.test.log(Status.INFO, "Click on First Job in The List");
			AssignJobCompany.ClickonThreeDot();
			testutilsWeb.test.log(Status.INFO, "Click on Three Dot");
			AssignJobCompany.ClickonAssignJob();
			testutilsWeb.test.log(Status.INFO, "Click on Assign Job");
			AssignJobCompany.SelectRecruiterID();
			testutilsWeb.test.log(Status.INFO, "Select Recruiter Email id from list");
			AssignJobCompany.ClickonAssignButton();
			testutilsWeb.test.log(Status.INFO, "Click on ASsign Button");
			try {
				if (AssignJobCompany.VerifyJobAssign()) {

					testutilsWeb.passTestCase("Able to Assign Job Succesfully");

				}

			} catch (Exception e) {
				testutilsWeb.failTestCase("Not Able to Assign Job Succesfully");

			}

		} catch (Exception e) {
			testutilsWeb.failTestCase("Exception occurred during Company Job Assign:" + e.getMessage());
			e.printStackTrace(); // Log the exception for debugging

		}

	}

	@Test(priority = 4, enabled = false)
	public void EditJob() throws IOException, InterruptedException, AWTException {

		testutilsWeb.testCaseCreate("TC 4: Company Page Edit Job");

		try {

			jobEdit.ClickonThreeDot();
			testutilsWeb.test.log(Status.INFO, "Click on three Dot");
			jobEdit.ClickonEditJob();
			testutilsWeb.test.log(Status.INFO, "Click on Edit Job");
			jobEdit.EnterJobTitle();
			testutilsWeb.test.log(Status.INFO, "Enter Job Title");
			jobEdit.EnterCompanyName();
			testutilsWeb.test.log(Status.INFO, "Enter Company Name");
			jobEdit.SelectJobTypeFromDropdown();
			testutilsWeb.test.log(Status.INFO, "Select Job Type From Dropdown");
			jobEdit.SelectWorkPlaceTypeFromDropdown();
			testutilsWeb.test.log(Status.INFO, "Select Workplace Type From Dropdown");
			jobEdit.SelectLocationFromDropdown();
			testutilsWeb.test.log(Status.INFO, "Select Location From Dropdown");
			jobEdit.SelectFunctionFromDropdown();
			testutilsWeb.test.log(Status.INFO, "Select Function From Dropdown");
			jobEdit.SelectQualificationFromDropdown();
			testutilsWeb.test.log(Status.INFO, "Select Qualification From Dropdown");
			jobEdit.EnterNewSkill();
			testutilsWeb.test.log(Status.INFO, "Add and Remove Skills");
			jobEdit.SelectMinSalaryFromDropdown();
			testutilsWeb.test.log(Status.INFO, "Select Minimum Salary From Dropdown");
			jobEdit.SelectMAxSalaryFromDropdown();
			testutilsWeb.test.log(Status.INFO, "Select Maximum Salary From Dropdown");
			jobEdit.EditJobDescription();
			testutilsWeb.test.log(Status.INFO, "Edit Job Description");
			jobEdit.ClickonSaveButton();
			testutilsWeb.test.log(Status.INFO, "Click on Save Button");
			try {
				if (jobEdit.VerifyEditedJob()) {

					testutilsWeb.passTestCase("Able to Edit Job Succesfully");
				}

			} catch (Exception e) {

				testutilsWeb.failTestCase("Not Able to Edit Job Succesfully");

			}

		} catch (Exception e) {
			testutilsWeb.failTestCase("Exception occurred during Company Job Edit:" + e.getMessage());
			e.printStackTrace(); // Log the exception for debugging

		}

	}

	@Test(priority = 5, enabled = false)

	public void CandidateReferbyManua() throws IOException, InterruptedException, AWTException {

		testutilsWeb.testCaseCreate("TC 5: Company - Refer Candidate to Job");

		try {

			candidatereferman.ClickonAddCandidate();
			testutilsWeb.test.log(Status.INFO, "Click on Add Candidate Button");
			candidatereferman.EneterCandidateEmailid();
			testutilsWeb.test.log(Status.INFO, "Enter Candidate Email id ");
			candidatereferman.ScrollTillClearBtn();
			testutilsWeb.test.log(Status.INFO, "Scroll till Clear Button");
			candidatereferman.ClickonReferButton();
			testutilsWeb.test.log(Status.INFO, "Click on Refer Button");

			try {
				if (candidatereferman.VerifyCandidateReferorNot()) {

					testutilsWeb.passTestCase("Able to Refer Candidate in Job Succesfully");
				}

			} catch (Exception e) {

				testutilsWeb.failTestCase("Not Able to Refer Candidate in Job Succesfully");

			}

		} catch (Exception e) {

			testutilsWeb.failTestCase("Exception occurred during Refer Candidate:" + e.getMessage());
			e.printStackTrace(); // Log the exception for debugging
		}

	}

	@Test(priority = 6, enabled = false)

	public void AssignCandidatetoAdviser() throws IOException, InterruptedException, AWTException {

		testutilsWeb.testCaseCreate("TC 6: Company - Assign job to Adviser and Change status as Approved");
		try {

			advflow.ClickonCheckBox();
			testutilsWeb.test.log(Status.INFO, "Click on Checkbox");
			advflow.ClickonSelectAction();
			testutilsWeb.test.log(Status.INFO, "Click on Select Action");
			advflow.ClickonAssigntoAdviser();
			testutilsWeb.test.log(Status.INFO, "Click on Assign To Adviser");
			advflow.SelectAdviser();
			testutilsWeb.test.log(Status.INFO, "Select Adviser");
			advflow.EnterAdviserID();
			testutilsWeb.test.log(Status.INFO, "Enter Adviser Emailid");
			advflow.EnterAdviserOTP();
			testutilsWeb.test.log(Status.INFO, "Enter Adviser OTP");
			advflow.ClickonJobBoard();
			testutilsWeb.test.log(Status.INFO, "Click on Job Board");
			advflow.adviserClickonJob();
			testutilsWeb.test.log(Status.INFO, "Click on First Job");
			advflow.SelectActionAdviser();
			testutilsWeb.test.log(Status.INFO, "Select Adviser Action");
			advflow.ClickonApprove();
			testutilsWeb.test.log(Status.INFO, "Click on Approve");
//			advflow.VerifyAdviserStatus();
//			testutilsWeb.test.log(Status.INFO, "Verify Adviser Status");
			Thread.sleep(3000);
			advflow.LoginasCompany();
			testutilsWeb.test.log(Status.INFO, "Login as Company");
			advflow.EnterCompanyEmailid();
			testutilsWeb.test.log(Status.INFO, "Enter Company Email id");
			advflow.EnterOTP();
			testutilsWeb.test.log(Status.INFO, "Enter OTP");

			try {
				if (advflow.VerifyAdviserStatusinCompany()) {

					testutilsWeb.passTestCase("Able to Refer Candidate in Job Succesfully");
				}

			} catch (Exception e) {

				testutilsWeb.failTestCase("Not Able to Refer Candidate in Job Succesfully");

			}

		} catch (Exception e) {
			testutilsWeb.failTestCase("Exception occurred during Adviser flow:" + e.getMessage());
			e.printStackTrace(); // Log the exception for debugging

		}
	}

	@Test(priority = 7, enabled = false)

	public void AssignCandidatetoAdviserReject() throws IOException, InterruptedException, AWTException {

		testutilsWeb.testCaseCreate("TC 7: Company - Assign job to Adviser and Change status as Reject");
		try {

			candidatereferman.ClickonAddCandidate();
			testutilsWeb.test.log(Status.INFO, "Click on Add Candidate Button");
			candidatereferman.EneterCandidateEmailid1();
			testutilsWeb.test.log(Status.INFO, "Enter Candidate Email id ");
			candidatereferman.ScrollTillClearBtn();
			testutilsWeb.test.log(Status.INFO, "Scroll till Clear Button");
			candidatereferman.ClickonReferButton();
			testutilsWeb.test.log(Status.INFO, "Click on Refer Button");
			Thread.sleep(1000);
			advflow.ClickonCheckBox();
			testutilsWeb.test.log(Status.INFO, "Click on Checkbox");
			advflow.ClickonSelectAction();
			testutilsWeb.test.log(Status.INFO, "Click on Select Action");
			advflow.ClickonAssigntoAdviser();
			testutilsWeb.test.log(Status.INFO, "Click on Assign To Adviser");
			advflow.SelectAdviser();
			testutilsWeb.test.log(Status.INFO, "Select Adviser");
			advflow.EnterAdviserID();
			testutilsWeb.test.log(Status.INFO, "Enter Adviser Emailid");
			advflow.EnterAdviserOTP();
			testutilsWeb.test.log(Status.INFO, "Enter Adviser OTP");
			advflow.ClickonJobBoard();
			testutilsWeb.test.log(Status.INFO, "Click on Job Board");
			advflow.adviserClickonJob();
			testutilsWeb.test.log(Status.INFO, "Click on First Job");
			advflow.SelectActionAdviser();
			testutilsWeb.test.log(Status.INFO, "Select Adviser Action");
			advflow.ClickonReject();
			testutilsWeb.test.log(Status.INFO, "Click on Reject");
//			advflow.VerifyAdviserStatus();
//			testutilsWeb.test.log(Status.INFO, "Verify Adviser Status");
			Thread.sleep(3000);
			advflow.LoginasCompany();
			testutilsWeb.test.log(Status.INFO, "Login as Company");
			advflow.EnterCompanyEmailid();
			testutilsWeb.test.log(Status.INFO, "Enter Company Email id");
			advflow.EnterOTP();
			testutilsWeb.test.log(Status.INFO, "Enter OTP");

			try {
				if (advflow.VerifyAdviserStatusasRejectinCompany()) {

					testutilsWeb.passTestCase("Able to Change Candidate status as Rejected adviser flow");
				}

			} catch (Exception e) {

				testutilsWeb.failTestCase("Not Able to Change Candidate status as Rejected adviser flow");

			}

		} catch (Exception e) {
			testutilsWeb.failTestCase("Exception occurred during Adviser flow:" + e.getMessage());
			e.printStackTrace(); // Log the exception for debugging

		}
	}

	@Test(priority = 8, enabled = false)

	public void CandidateMoveStatus() throws IOException, InterruptedException, AWTException {

		testutilsWeb.testCaseCreate("TC 8: Company - Move Candidate To Tagged List and Move Forward");
		try {

			Thread.sleep(15000);
			advflow.ClickonTaggedList();
			testutilsWeb.test.log(Status.INFO, "Click on Tagged List");
			advflow.ClickonThreeDot();
			testutilsWeb.test.log(Status.INFO, "Click on Three Dot");
			advflow.ClickonMoveForward();
			testutilsWeb.test.log(Status.INFO, "Click on Move Forward");
			Thread.sleep(3000);
			try {
				if (advflow.VerifyMoveForward()) {

					testutilsWeb.passTestCase("Able to Move Forward Candidate");

				}

			} catch (Exception e) {

				testutilsWeb.failTestCase("Not Able to Move Forward Candidate");
			}

			advflow.clickonEditColumn();
			testutilsWeb.test.log(Status.INFO, "Click on Edit Column");
			advflow.EditColumnName();
			testutilsWeb.test.log(Status.INFO, "Enter Column Name");
			Thread.sleep(3000);
			try {
				if (advflow.VerifyColumnNameEdited()) {

					testutilsWeb.passTestCase("Able to Edit Column Name");

				}

			} catch (Exception e) {

				testutilsWeb.failTestCase("Not Able to Edit Column Name");

			}

			advflow.ClickonAddColumn();
			testutilsWeb.test.log(Status.INFO, "Click on Add Column");
			advflow.EnterNewColumnname();
			testutilsWeb.test.log(Status.INFO, "Enter New Column Name");
			Thread.sleep(3000);
			try {
				if (advflow.VerifyColumnAdded()) {

					testutilsWeb.passTestCase("Able to Add New Column");

				}

			} catch (Exception e) {

				testutilsWeb.failTestCase("Not Able to Add New Column");

			}

		} catch (Exception e) {
			testutilsWeb.failTestCase("Exception occurred during Adviser flow:" + e.getMessage());
			e.printStackTrace();

		}
	}

	@Test(priority = 2, enabled = true)

	public void CreateEmployee() throws IOException {

		testutilsWeb.testCaseCreate("Tc 2: Company Page Create Employee");
		try {

			empcreate.ClickonCreateEmployee();
			testutilsWeb.test.log(Status.INFO, "Click on Create Employee");
			empcreate.ClickonSubmitButton();
			testutilsWeb.test.log(Status.INFO, "Click on Submit Button");

			if (empcreate.VerifyMandatoryFields()) {

				testutilsWeb.passTestCase(
						"User is able to Verify Mandatory Fields after Clicking on Submit Button Without entering any data");

			} else {
				testutilsWeb.failTestCase(
						"User is not able to Verify Mandatory Fields after Clicking on Submit Button Without entering any data");
			}
			String FirstName = excel.getCellData(1, 0);
			empcreate.EnterFirstName(FirstName);
			testutilsWeb.test.log(Status.INFO, "Enter First Name");
			String LastName = excel.getCellData(1, 1);
			empcreate.EnterlastName(LastName);
			testutilsWeb.test.log(Status.INFO, "Enter Last Name");
			empcreate.ClickonRoleDropdown();
			testutilsWeb.test.log(Status.INFO, "Click on Role Drodpdown");
			empcreate.SelectRole();
			testutilsWeb.test.log(Status.INFO, "Select Role From Dropdown");
			empcreate.ClickonDepartmentDropdown();
			testutilsWeb.test.log(Status.INFO, "Select Department From Dropdown");
			String Email = excel.getCellData(1, 2);
			empcreate.EnterEmaild(Email);
			testutilsWeb.test.log(Status.INFO, "Enter Emaild");
			String MobileNumber = excel.getCellData(1, 3);
//			System.out.println("------------" +MobileNumber);
			empcreate.EnterMobilenumber(MobileNumber);
			testutilsWeb.test.log(Status.INFO, "Enter Mobile mumber");
			empcreate.SelectGenderDropdown();
			testutilsWeb.test.log(Status.INFO, "Select Gender");
			empcreate.SelectReportingManagerDropdown();
			testutilsWeb.test.log(Status.INFO, "SElect Reporting Manager");
			empcreate.EnterJoiningDate();
			testutilsWeb.test.log(Status.INFO, "Enter joining Date");
			empcreate.EnterEmployeeCode();
			testutilsWeb.test.log(Status.INFO, "Enter Employee Code");
			empcreate.SelectBandFromDropdown();
			testutilsWeb.test.log(Status.INFO, "Select Band From Dropdown");
			empcreate.SelectDesignationDropdown();
			testutilsWeb.test.log(Status.INFO, "Select Designation From dropdown");
			empcreate.ClickonFinalSubmitButton();
			testutilsWeb.test.log(Status.INFO, "Click on Final Submit Button");

			Thread.sleep(1000);

			if (empcreate.VerifyEmpCreated()) {
				testutilsWeb.passTestCase("User is able to Create New Employee");
			} else {
				testutilsWeb.failTestCase("User is not able to Create New Employee");

			}

		} catch (Exception e) {
			testutilsWeb.failTestCase("Exception occurred during Company Employee Creation flow:" + e.getMessage());
			e.printStackTrace(); // Log the exception for debugging

		}
	}

	@Test(priority = 3, enabled = true)

	public void PersonalInformation() throws IOException {

		testutilsWeb.testCaseCreate("Tc 3: Company Page Edit Personal Details");

		try {
			Thread.sleep(5000);
			editPersInfo.ClickonLastEmployee();
			testutilsWeb.test.log(Status.INFO, "Click on Last Employee");

			editPersInfo.ScrollTop();
			editPersInfo.ClickonEditDetails();
			testutilsWeb.test.log(Status.INFO, "Click on Edit Details");
			editPersInfo.ClickonSubmitButton();
			testutilsWeb.test.log(Status.INFO, "Click on Submit button");

			if (editPersInfo.verifyFields()) {

				testutilsWeb.passTestCase(
						"User is able to Verify Mandatory Fields after Clicking on Submit Button Without entering any data");

			} else {
				testutilsWeb.failTestCase(
						"User is not able to Verify Mandatory Fields after Clicking on Submit Button Without entering any data");
			}

			editPersInfo.EnterBirthdate();
			testutilsWeb.test.log(Status.INFO, "Enter Birthdate");
			editPersInfo.SelectMaritialStatus();
			testutilsWeb.test.log(Status.INFO, "Select Maritial Status");
			editPersInfo.SelectNationality();
			testutilsWeb.test.log(Status.INFO, "Select Nationality from Dropdown");
			editPersInfo.EnterCurrentAddress();
			testutilsWeb.test.log(Status.INFO, "Enter Current Address");
			editPersInfo.EnterPermenantAddress();
			testutilsWeb.test.log(Status.INFO, "Enter Permenant Address");
			editPersInfo.ClickonFinalSubmitBtn();
			testutilsWeb.test.log(Status.INFO, "Click on Submit button");
			Thread.sleep(3000);
			if (editPersInfo.verifyDetailsEdited()) {
				testutilsWeb.passTestCase("User is able to Edit Personal Information Details");
			} else {
				testutilsWeb.failTestCase("User is not able to Edit Personal Information Details");
			}

		} catch (Exception e) {
			testutilsWeb.failTestCase(
					"Exception occurred during Company Employee Personal Information Flow:" + e.getMessage());
			e.printStackTrace(); // Log the exception for debugging
		}

	}

	@Test(priority = 4, enabled = true)

	public void ProfessionalDetails() throws IOException {

		testutilsWeb.testCaseCreate("Tc 4: Company Page Edit Professional Details");

		try {

			editProfDetails.ClickonEditProfessional();
			testutilsWeb.test.log(Status.INFO, "Click on Edit Professional Details");
			editProfDetails.ClickonSubmitButton();
			testutilsWeb.test.log(Status.INFO, "Click on Submit Button");

			if (editProfDetails.VerifyRequiredFields()) {
				testutilsWeb.passTestCase(
						"User is able to Verify Mandatory Fields after Clicking on Submit Button Without entering any data");
			} else {
				testutilsWeb.failTestCase(
						"User is not able to Verify Mandatory Fields after Clicking on Submit Button Without entering any data");
			}
			editProfDetails.SelectWorkmode();
			testutilsWeb.test.log(Status.INFO, "Select Work Mode");
			editProfDetails.SelectEmployementType();
			testutilsWeb.test.log(Status.INFO, "Select Employement Type");
			editProfDetails.SelectWorkLocation();
			testutilsWeb.test.log(Status.INFO, "Select Work Location");
			editProfDetails.EnterLeaveBalance();
			testutilsWeb.test.log(Status.INFO, "Enter Leave Balance");
			editProfDetails.ClickonFinalSubmit();
			testutilsWeb.test.log(Status.INFO, "Click on Final Submit");
			Thread.sleep(3000);
			if (editProfDetails.VerifyEditedProfessionalDetails()) {
				testutilsWeb.passTestCase("User is able to Edit Professional Information Details");
			} else {
				testutilsWeb.failTestCase("User is not able to Edit Professional Information Details");
			}
		} catch (Exception e) {
			testutilsWeb.failTestCase(
					"Exception occurred during Company Employee Professional Details Edit Flow:" + e.getMessage());
			e.printStackTrace(); // Log the exception for debugging
		}
	}

	@Test(priority = 5, enabled = true)

	public void AdditionalDetails() throws IOException {

		testutilsWeb.testCaseCreate("Tc 5: Company Page Edit Additional Details");

		try {

			editAddDetails.ClickonEditAdditionalDetails();
			testutilsWeb.test.log(Status.INFO, "Click on Additional Details");
			editAddDetails.ClickonAddSubmitButton();
			testutilsWeb.test.log(Status.INFO, "Click on Submit button");
			if (editAddDetails.VerifyAddDetailsMandatoryFields()) {
				testutilsWeb.passTestCase(
						"User is able to Verify Mandatory Fields after Clicking on Submit Button Without entering any data");
			} else {
				testutilsWeb.failTestCase(
						"User is not able to Verify Mandatory Fields after Clicking on Submit Button Without entering any data");
			}
			String AdditionalFirstName = excel.getCellData(1, 4);
			editAddDetails.EnterFirstNAme(AdditionalFirstName);
			testutilsWeb.test.log(Status.INFO, "Enter First name");
			String AdditionalLastName = excel.getCellData(1, 5);
			editAddDetails.EnterLastNAme(AdditionalLastName);
			testutilsWeb.test.log(Status.INFO, "Enter Last Name");
			String AdditionalRelation = excel.getCellData(1, 6);
			editAddDetails.EnterRelation(AdditionalRelation);
			testutilsWeb.test.log(Status.INFO, "Enter Relation");
			String AdditionalPhone = excel.getCellData(1, 7);
			editAddDetails.EnterAdditionalPhone(AdditionalPhone);
			testutilsWeb.test.log(Status.INFO, "Enter Phone Number");
			String AdditionalCurrentadd = excel.getCellData(1, 8);
			editAddDetails.EnterAdditionalCurrentadd(AdditionalCurrentadd);
			testutilsWeb.test.log(Status.INFO, "Enter Current Address");
			String AdditionalPermanentadd = excel.getCellData(1, 9);
			editAddDetails.EnterAdditionalPermanentadd(AdditionalPermanentadd);
			testutilsWeb.test.log(Status.INFO, "Enter Permanent Address");
			editAddDetails.ClickonFinalSubmit();
			testutilsWeb.test.log(Status.INFO, "Click on Submit button");
			Thread.sleep(6000);
			if (editAddDetails.VerifyAdditionalDetails()) {
				testutilsWeb.passTestCase("User is able to Edit Additional Details");
			} else {
				testutilsWeb.failTestCase("User is not able to Edit Additional Details");
			}

		} catch (Exception e) {
			testutilsWeb.failTestCase(
					"Exception occurred during Company Employee Additional Details Edit Flow:" + e.getMessage());
			e.printStackTrace(); // Log the exception for debugging
			// TODO: handle exception
		}
	}

	@AfterTest
	public void teardown() {
		testutilsWeb.ExtentFlush();
//			driver.quit();
		TestBaseClassWeb.driver.quit();
	}
}

//
//@Test(priority = 1, enabled = false)
//public void loginviaMobileNumber() throws IOException {
//
//	testutilsWeb.extentReport();
////	testutilsWeb.CreateHtmlTable(0, 0, 0);
//	testutilsWeb.testCaseCreate("Tc 01 : Login With Mobile Number");
//	try {
//		loginmethodweb.ClickonJoinAsButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Join as button");
//
//		loginmethodweb.ClickonCompanyButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Company button");
//
//		loginmethodweb.EnterEmailid();
//		testutilsWeb.test.log(Status.INFO, "Enter Company Email id ");
//
//		loginmethodweb.ClickonLoginViaOtp();
//		testutilsWeb.test.log(Status.INFO, "Click on Login Via Otp");
//		loginmethodweb.EnterOTP();
//		testutilsWeb.test.log(Status.INFO, "Enter enter otp");
//		Thread.sleep(3000);
//		try {
//			if (loginmethodweb.verifyUserIsAbletoLogin()) {
//				testutilsWeb.passTestCase("User is able to login succesfully");
//			}
//		} catch (Exception e) {
//			testutilsWeb.failTestCase("User is not able to login");
//		}
//		Thread.sleep(4000);
//	} catch (Exception e) {
//		e.printStackTrace();
//		testutilsWeb.failTestCase("");
//	}
//
//}
//
//@Test(priority = 2, enabled = false)
//public void CandidateSignup() throws IOException, InterruptedException {
//
//	testutilsWeb.extentReport();
//	testutilsWeb.testCaseCreate("Tc 02 : New Candidate Signup");
//
//	try {
//
//		signupCandidate.ClickonJoinAsButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Join as button");
//
//		signupCandidate.ClickonCandidateButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Candidate button");
//
//		signupCandidate.ClickonSignupButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Signup button");
//
//		signupCandidate.EnterFirstName();
//		testutilsWeb.test.log(Status.INFO, "Enter First Name");
//		signupCandidate.EnterLastName();
//		testutilsWeb.test.log(Status.INFO, "Enter Last Name");
//		signupCandidate.EnterEmailid();
//		testutilsWeb.test.log(Status.INFO, "Enter EMail id ");
//		signupCandidate.EnterMobileNo();
//		testutilsWeb.test.log(Status.INFO, "Enter Mobile Number");
//		signupCandidate.ClickonVerifyButton();
//		testutilsWeb.test.log(Status.INFO, "Click on verify Button");
//		signupCandidate.EnterOTP();
//		testutilsWeb.test.log(Status.INFO, "Enter Otp");
//		signupCandidate.ClickonLocationDropdown();
//		testutilsWeb.test.log(Status.INFO, "Select Location");
//		signupCandidate.EnterCompanyName();
//		testutilsWeb.test.log(Status.INFO, "Enter Company NAme");
//		signupCandidate.Enterdesignantion();
//		testutilsWeb.test.log(Status.INFO, "Enter Designation");
//		signupCandidate.EnterYOE();
//		testutilsWeb.test.log(Status.INFO, "Enter Years of Experience");
//		signupCandidate.ClickonCheckbox();
//		testutilsWeb.test.log(Status.INFO, "Click on Checkbox");
//		signupCandidate.ClickonFinalSignupButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Final Signup Button");
//
//		Thread.sleep(3000);
//		try {
//			if (signupCandidate.VerifySignup()) {
//				testutilsWeb.passTestCase("Candidate is able to Signup succesfully");
//			}
//		} catch (Exception e) {
//			testutilsWeb.failTestCase("Candidate is not able to Signup succesfully");
//		}
//
//	} catch (Exception e) {
//		e.printStackTrace();
//		testutilsWeb.failTestCase("");
//	}
//
//}
//
//@Test(priority = 3, enabled = false)
//public void CandidateApplyJob() throws IOException {
//	testutilsWeb.extentReport();
//
//	testutilsWeb.testCaseCreate("Tc 03 :Candidate Job Apply");
//	try {
//
////		signupCandidate.ClickonLogout();
////		testutilsWeb.test.log(Status.INFO, "Click on Logout");
//		signupCandidate.ClickonJoinAsButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Join as button");
//
//		signupCandidate.ClickonCandidateButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Candidate button");
//
//		signupCandidate.ClickonToggleButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Toggle Button");
//		signupCandidate.EnterMobileNotosignup();
//		testutilsWeb.test.log(Status.INFO, "Enter Mobile Number");
//		Thread.sleep(3000);
//		signupCandidate.ClickonLoginViaOtp();
//		testutilsWeb.test.log(Status.INFO, "Click on Login via otp");
//		signupCandidate.EnterLoginOTP();
//		testutilsWeb.test.log(Status.INFO, "Enter Otp and click on Verify");
//		Thread.sleep(4000);
//		applyjobCandidate.ClickonjobsButton();
//		testutilsWeb.test.log(Status.INFO, "Click on jobs Tab");
//		applyjobCandidate.ClickonFirstJob();
//		testutilsWeb.test.log(Status.INFO, "Click on First Job");
//		applyjobCandidate.ClickonApplyButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Apply Button");
//		applyjobCandidate.ClickonSalaryDropdown();
//		testutilsWeb.test.log(Status.INFO, "Select Salary");
//		applyjobCandidate.ClickonIndustryDropdown();
//		testutilsWeb.test.log(Status.INFO, "Select industry");
//		applyjobCandidate.ClickonLocationDropdown();
//		testutilsWeb.test.log(Status.INFO, "Select Location");
//		Thread.sleep(4000);
//		applyjobCandidate.uploadResume();
//		testutilsWeb.test.log(Status.INFO, "Upload Resume");
//		Thread.sleep(5000);
//		applyjobCandidate.ClickonApplyJobButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Final Apply Job Button");
//
//		Thread.sleep(3000);
//
//		try {
//			if (applyjobCandidate.VerifyJobAppliedSuccesfully()) {
//				testutilsWeb.passTestCase("Candidate is able to Apply for Job succesfully");
//			}
//		} catch (Exception e) {
//			testutilsWeb.failTestCase("Candidate is not able to Apply for Job succesfully");
//		}
//
//		withdrawJob.ClickonFirstJob();
//		testutilsWeb.test.log(Status.INFO, "Click on First Job");
//		withdrawJob.ClickonWithdrawButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Withdraw Job Button");
//		Thread.sleep(1000);
//
//		;
//		try {
//			if (withdrawJob.VerifyJobisWithdrwan()) {
//				testutilsWeb.passTestCase("Candidate is able to Withdraw  Job succesfully");
//			}
//		} catch (Exception e) {
//			testutilsWeb.failTestCase("Candidate is not able to Withdraw Job succesfully");
//		}
//
//	} catch (Exception e) {
//		
//		e.printStackTrace();
//		testutilsWeb.failTestCase("Candidate is not able to Apply for Job succesfully or Withdraw");
//	}
//}
//
////
////@Test(priority = 4, enabled = false)
////public void CandidateJobWithdraw()throws IOException
////{
////	testutilsWeb.testCaseCreate("Tc 04 :Candidate Withdraw Job");
////	try {
////		
////		
////		
////	} catch (Exception e) {
////		
////	}
////}
//
//@Test(priority = 4, enabled = false)
//public void CandidateJobSaveandUnsave() throws IOException {
//
//	testutilsWeb.testCaseCreate("Tc 04 A :Candidate Save Job");
//
//	try {
//
//		String ActualSavedJobname = saveunsaveJob.GettextofFirstJob();
//		Thread.sleep(1000);
//		System.out.println(ActualSavedJobname);
//		saveunsaveJob.ClickonFirstJob();
//		testutilsWeb.test.log(Status.INFO, "Click on First Job");
//		saveunsaveJob.ClickonSaveJobButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Save Job");
//
//		saveunsaveJob.ClickonProfilebutton();
//		testutilsWeb.test.log(Status.INFO, "Click on Profile Button");
//		saveunsaveJob.ClickonSavedJobsButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Saved Jobs Tab");
//		String ExpectedSavedJobname = saveunsaveJob.ExpectedSavedJobGettext();
//		System.out.println(ExpectedSavedJobname);
//		Thread.sleep(2000);
////		if (ActualSavedJobname.equals(ExpectedSavedJobname)) {
//		if (saveunsaveJob.VerifyUnsaveJob()) {
//			System.out.println("inside if block");
//			testutilsWeb.passTestCase("User is able to Save Job");
//			System.out.println("after ss method");
//		} else {
//			testutilsWeb.failTestCase("User is not able to Save Job");
//		}
//
//		testutilsWeb.testCaseCreate("Tc 04 B :Candidate Unsave Job");
//
//		saveunsaveJob.ClickonFirstJob();
//		testutilsWeb.test.log(Status.INFO, "Click on First Job");
//
//		try {
//			System.out.println("before Unsave");
//			saveunsaveJob.ClickonUnsaveJob();
//			System.out.println("After Unsave");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		testutilsWeb.test.log(Status.INFO, "Click on UnSave Job");
//		Thread.sleep(5000);
//		try {
//			if (saveunsaveJob.VerifyUnsaveJob()) {
//				testutilsWeb.passTestCase("User is able to UnSave Job");
//			}
//		} catch (Exception e) {
//
//			testutilsWeb.failTestCase("User is not able to UnSave Job");
//
//		}
//
//	} catch (Exception e) {
//		
//		testutilsWeb.failTestCase("User is not able to Save or UnSave Job");
//	}
//
//}
//
//@Test(priority = 5, enabled = false)
//public void JobApplyFromInvitation() throws IOException {
//
//	testutilsWeb.testCaseCreate("Tc 05: Candidate Job Apply from Invivations");
//
//	try {
//
//		applyjobCandidate.ClickonInvitationsTab();
//		testutilsWeb.test.log(Status.INFO, "Click on Invitations");
//		Thread.sleep(3000);
//		applyjobCandidate.ClickonFirstJob();
//		testutilsWeb.test.log(Status.INFO, "Click on First Job");
//		applyjobCandidate.ClickonApplyButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Apply Button");
//		applyjobCandidate.ClickonSalaryDropdownInvite();
//		testutilsWeb.test.log(Status.INFO, "Select Salary");
//		applyjobCandidate.ClickonIndustryDropdownInvite();
//		testutilsWeb.test.log(Status.INFO, "Select industry");
//		applyjobCandidate.ClickonLocationDropdownInvite();
//		testutilsWeb.test.log(Status.INFO, "Select Location");
//		Thread.sleep(4000);
//		applyjobCandidate.uploadResume();
//		testutilsWeb.test.log(Status.INFO, "Upload Resume");
//		Thread.sleep(5000);
//		applyjobCandidate.ClickonApplyJobButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Final Apply Job Button");
//
//		Thread.sleep(3000);
//
//		try {
//			if (applyjobCandidate.VerifyJobAppliedSuccesfully()) {
//				testutilsWeb.passTestCase("Candidate is able to Apply for Job From Invivation succesfully");
//			}
//		} catch (Exception e) {
//			testutilsWeb.failTestCase("Candidate is not able to Apply for Job From Invivation succesfully");
//		}
//
//	} catch (Exception e) {
//		testutilsWeb.failTestCase("Candidate is not able to Apply for Job From Invivation succesfully");
//		
//	}
//
//}
//
//@Test(priority = 6, enabled = false)
//public void RecruiterSignup() throws IOException {
//
//	testutilsWeb.extentReport();
//
//	testutilsWeb.testCaseCreate("Tc 06: New Recruiter Sign up");
//
//	try {
//
//		signupRecruiter.ClickonJoinAsButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Join as Button");
//		signupRecruiter.ClickonRecruiterButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Recruiter Button");
//		signupRecruiter.EnterRecruiterEmail();
//		testutilsWeb.test.log(Status.INFO, "Enter Email id ");
//		signupRecruiter.ClickonLoginViaOtpButton();
//		testutilsWeb.test.log(Status.INFO, "Click on login via otp button");
//		signupRecruiter.EnterOTP();
//		testutilsWeb.test.log(Status.INFO, "Enter OTP");
//		signupRecruiter.EnterFirstName();
//		testutilsWeb.test.log(Status.INFO, "Enter First Name");
//		signupRecruiter.EnterLastName();
//		testutilsWeb.test.log(Status.INFO, "Enter Last Name");
//		signupRecruiter.EnterMobileNo();
//		testutilsWeb.test.log(Status.INFO, "Enter Mobile Number");
//		signupRecruiter.enterCompanyName();
//		testutilsWeb.test.log(Status.INFO, "Enter Company Name");
//		signupRecruiter.enterPAN();
//		testutilsWeb.test.log(Status.INFO, "Enter Pan Number");
//		signupRecruiter.enterAadhar();
//		testutilsWeb.test.log(Status.INFO, "Enter Aadhar Card Number");
//		signupRecruiter.uploadPAnImage();
//		testutilsWeb.test.log(Status.INFO, "Upload PAN Card Image");
//		Thread.sleep(2000);
//		signupRecruiter.ClickonSignupButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Sign Up Button");
//		Thread.sleep(4000);
//
//		if (signupRecruiter.VerifyRecruiterSignup()) {
//			testutilsWeb.passTestCase("Able to Signup as Recruiter Successfully");
//		} else {
//			testutilsWeb.failTestCase("Not Able to Signup as Recruiter Successfully");
//		}
//
//	} catch (Exception e) {
//		testutilsWeb.failTestCase("Exception occurred during Recruiter Signup: " + e.getMessage());
//		e.printStackTrace(); // Log the exception for debugging
//	}
//
//	signupCandidate.ClickonLogout();
//	testutilsWeb.test.log(Status.INFO, "Click on Logout");
//
//}
//
//@Test(priority = 7, enabled = false)
//public void RecruiterLogin() throws IOException {
//
//	testutilsWeb.extentReport();
//
//	testutilsWeb.testCaseCreate("Tc 07: Recruiter Login");
//	try {
//		loginRecruiter.ClickonJoinAsButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Join as Button");
//		loginRecruiter.ClickonRecruiterButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Recruiter Button");
//		loginRecruiter.EnterEmailidRecruiter();
//		testutilsWeb.test.log(Status.INFO, "Enter Email id ");
//		loginRecruiter.EnterOTP();
//		testutilsWeb.test.log(Status.INFO, "Click on login via otp button");
//		loginRecruiter.VerifyRecruiterLogin();
//
//		if (signupRecruiter.VerifyRecruiterSignup()) {
//			testutilsWeb.passTestCase("Able to Login as Recruiter Successfully");
//		} else {
//			testutilsWeb.failTestCase("Not Able to Login as Recruiter Successfully");
//		}
//
//	} catch (Exception e) {
//		testutilsWeb.failTestCase("Exception occurred during Recruiter Login: " + e.getMessage());
//		e.printStackTrace(); // Log the exception for debugging
//		
//	}
//}
//
//@Test(priority = 8, enabled = false)
//public void RecruiterCandidateRefer() throws IOException {
//
//	testutilsWeb.extentReport();
//
//	testutilsWeb.testCaseCreate("Tc 08: Recruiter Candidate Refer");
//
//	try {
//
//		referCandidaterecuriter.ClickonJobsButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Jobs");
//		referCandidaterecuriter.ClickonFirstJobinTheLIst();
//		testutilsWeb.test.log(Status.INFO, "Click on First Job");
//		referCandidaterecuriter.ClickonReferButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Refer Button");
//		referCandidaterecuriter.EnterMobileNumbertoRefer();
//		testutilsWeb.test.log(Status.INFO, "Enter Mobile Number to Search");
//		referCandidaterecuriter.ClickonReferCandidateButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Refer Candidate Button");
//		Thread.sleep(2000);
//		referCandidaterecuriter.ClickonProfile();
//		testutilsWeb.test.log(Status.INFO, "Click on Profile");
//		referCandidaterecuriter.latestAddedJobClick();
//		testutilsWeb.test.log(Status.INFO, "Click on Latest Job Added in the list");
//		referCandidaterecuriter.ClickonReferalList();
//		testutilsWeb.test.log(Status.INFO, "Click on Referral List");
//		if (referCandidaterecuriter.VerifyReferalUserinList()) {
//			testutilsWeb.passTestCase("Recruiter is Able to Refer Successfully");
//		} else {
//			testutilsWeb.passTestCase("Recruiter is not Able to Refer Successfully");
//
//		}
//
//	} catch (Exception e) {
//
//		
//		testutilsWeb.failTestCase("Exception occurred during Recruiter Signup: " + e.getMessage());
//		e.printStackTrace(); // Log the exception for debugging
//	}
//}
//
///*
// * Company Page Signup
// */
//@Test(priority = 9, enabled = false)
//public void CompanyPageSignup() throws IOException {
//
//	testutilsWeb.extentReport();
//
//	testutilsWeb.testCaseCreate("Tc 08: Company Page Signup");
//	try {
//
//		signupCompany.ClickonJoinAsButton();
//		testutilsWeb.test.log(Status.INFO, "Click on join as button");
//		signupCompany.ClickonCompanyButton();
//		testutilsWeb.test.log(Status.INFO, "Click on company button");
//		signupCompany.ClickonSignupButton();
//		testutilsWeb.test.log(Status.INFO, "Click on Signup button");
//		signupCompany.EnterDomain();
//		testutilsWeb.test.log(Status.INFO, "Enter Domain");
//		signupCompany.EnterCompanyEmailid();
//		testutilsWeb.test.log(Status.INFO, "Enter Company Email id ");
//		signupCompany.EnterOTP();
//		testutilsWeb.test.log(Status.INFO, "Enter Otp");
//		signupCompany.EnterCompanyName();
//		testutilsWeb.test.log(Status.INFO, "Enter Company Name");
//		signupCompany.EnterCompanyDescription();
//		testutilsWeb.test.log(Status.INFO, "enter Company Description");
//		signupCompany.EnterCompanyTagline();
//		testutilsWeb.test.log(Status.INFO, "Enter Company Tagline");
//		signupCompany.SelectOrgTypeFromDropdown();
//		testutilsWeb.test.log(Status.INFO, "Select Organization Type from dropdown");
//		signupCompany.SelectIndTypeFromDropdown();
//		testutilsWeb.test.log(Status.INFO, "Select Industry from Dropdown");
//		signupCompany.SelectTeamSizeTypeFromDropdown();
//		testutilsWeb.test.log(Status.INFO, "Select Team Size From Dropdown");
//		signupCompany.EnterYearofEstablishment();
//		testutilsWeb.test.log(Status.INFO, "Enter Year of Establishment");
//		signupCompany.EnterCompanyWebSite();
//		testutilsWeb.test.log(Status.INFO, "Enter Company WebSite");
//		signupCompany.SelectHeadOfficeLocationTypeFromDropdown();
//		testutilsWeb.test.log(Status.INFO, "Select Head Office Location from Dropdown");
//		signupCompany.ClickonSaveButtonCompany();
//		testutilsWeb.test.log(Status.INFO, "Click on Save Button");
//		Thread.sleep(2000);
//		signupCompany.ClickonViewDashborad();
//		testutilsWeb.test.log(Status.INFO, "Click on Dashboard");
////		signupCompany.uploadLogoImage();
////		testutilsWeb.test.log(Status.INFO, "Upload Logo Image");
////		signupCompany.uploadBannerImage();
////		testutilsWeb.test.log(Status.INFO, "Upload Banner Image");
//		Thread.sleep(1000);
//		if (signupCompany.VerifyCompanyCreated()) {
//			testutilsWeb.passTestCase("Company Created Succesfully");
//		} else {
//			testutilsWeb.passTestCase("Company creation failed.");
//
//		}
//
//	} catch (Exception e) {
//		testutilsWeb.failTestCase("Exception occurred during Company Signup:" + e.getMessage());
//		e.printStackTrace(); // Log the exception for debugging
//		
//	}
//}
