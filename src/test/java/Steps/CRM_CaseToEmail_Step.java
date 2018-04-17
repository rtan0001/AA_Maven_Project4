package Steps;

import Base.BaseUtil;
import Pages.CRM_CaseToEmail_Page;
import Pages.CRM_Login_Form_Page;
import Pages.SendEmail_FromGmailAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static Pages.GenerateRegoEmailPage.getWindow_First;

public class CRM_CaseToEmail_Step extends BaseUtil {



    SendEmail_FromGmailAccountPage gmail_page = new SendEmail_FromGmailAccountPage(driver);

    CRM_CaseToEmail_Page App_Page = new CRM_CaseToEmail_Page(driver);
    CRM_Login_Form_Page  crm_page = new CRM_Login_Form_Page(driver);
    SendEmail_FromGmailAccountStep Gmail_steps = new SendEmail_FromGmailAccountStep();

    public String Enquiry_ref= null;

    public String newwindow = null;
    public String newwindow1 = null;
    public String Enq_status = null;


    @And("^I go to Course Preference Grid click on ACPCode Link$")
    public void iGoToCoursePreferenceGridClickOnACPCodeLink() throws Throwable {

        App_Page.Click_ACPLink_FromApplication();
        Thread.sleep(4000);
        App_Page.Click_On_ACPDetails_Link();


    }

    @And("^I Click on Send Email to communicate with Applicant$")
    public void iClickOnSendEmailToCommunicateWithApplicant() throws Throwable {

        App_Page.Click_SendEmailButton_FromACP();
        Thread.sleep(13000);
        App_Page.Set_NewEmailAddress_into_ToEmail();
        Thread.sleep(2000);
        Enquiry_ref = App_Page.Get_Enquiry_Ref_Number();
        Thread.sleep(2000);
        App_Page.Send_Email_ToApplicant();
        Thread.sleep(4000);
        App_Page.Close_SendEmai_Window();
        Thread.sleep(1000);

    }

    @And("^Applicant should receive an email to confirm an enquiry gets created in CRM$")
    public void applicantShouldReceiveAnEmailToConfirmAnEnquiryGetsCreatedInCRM() throws Throwable {

        newwindow = getWindow_First();
        driver.switchTo().window(newwindow);
        crm_page.Close_FirstTab();
        Thread.sleep(2000);
        crm_page.Close_ThirdTab();
        Thread.sleep(1000);
        App_Page.Clear_Text_FromSearchField();
        crm_page.Set_Receipt_number_into_SearchField(Enquiry_ref);
        Thread.sleep(2000);
    }

    @Then("^check the status of the enquiry$")
    public void checkTheStatusOfTheEnquiry() throws Throwable {

       Enq_status =  App_Page.Get_EnquiryStatus_AfterSendAnEmail();
       Assert.assertEquals(Enq_status, "Closed");
        Thread.sleep(2000);

    }

    @Then("^Close the Enquiry Tab$")
    public void closeTheEnquiryTab() throws Throwable {

        crm_page.Close_FirstTab();

    }

    @Given("^I Reply back to an email enquiry from Gmail Account$")
    public void iReplyBackToAnEmailEnquiryFromGmailAccount() throws Throwable {

        Gmail_steps.iNavigateToTheGmailLoginPage();
        Gmail_steps.iGivenGmailAccountUsernameAndPasswordHitLogin();
        App_Page.select_FirstRow_FromInbox();
        Thread.sleep(3000);
        App_Page.Click_ReplyButton_FromEmail();
        Thread.sleep(3000);
        App_Page.EnterText_InTextArea_ToReply();
        App_Page.Click_SendButton();
        Thread.sleep(3000);
    }


    @Then("^The Enquiry status should be changed to Open$")
    public void theEnquiryStatusShouldBeChangedToOpen() throws Throwable {


        Assert.assertEquals(Enq_status, "Open");
    }

    @And("^I logout of gmail account$")
    public void iLogoutOfGmailAccount() throws Throwable {

        gmail_page.LogOut_Gmail();
        gmail_page.Singout_Gmail();
        gmail_page.Close_broeswr_window();

    }



    @When("^Assessor Select first enquiry From Enquiries list$")
    public void assessorSelectFirstEnquiryFromEnquiriesList() throws Throwable {

        Thread.sleep(2000);
        crm_page.Goto_Enquiries_List();
        crm_page.Click_RefreshIcon_Enquiry();
        Thread.sleep(3000);

    }

    @Given("^Assessors logon into Salesforce CRM and Navigate to Enquiries$")
    public void assessorsLogonIntoSalesforceCRMAndNavigateToEnquiries() throws Throwable {


        initialization();
        driver.get("https://test.salesforce.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        crm_page.Set_username_password("rupa.tanneero@monash.edu.staging", "monash@2017");
        crm_page.click_login_button();
        Thread.sleep(3000);

    }

    @And("^Assessor check the status of the Enquiry should be in Open$")
    public void assessorCheckTheStatusOfTheEnquiryShouldBeInOpen() throws Throwable {

        Enq_status =  App_Page.Get_Enquiry_Status_FromEnquiryGrid();
        Assert.assertEquals(Enq_status, "Open");
        Thread.sleep(2000);

    }
}
