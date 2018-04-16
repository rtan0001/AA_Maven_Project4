package Steps;

import Base.BaseUtil;
import Pages.CRM_Login_Form_Page;
import Pages.SubmitTheApplicationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CRM_Loginstepdefinition_Step extends BaseUtil {

    CRM_Login_Form_Page CRM_Login_Page = new  CRM_Login_Form_Page(driver);

    SubmitTheApplicationPage page8 = new SubmitTheApplicationPage(driver);

    SubmitTheApplicationStep sub_page = new SubmitTheApplicationStep();

    public String receipt_number;
    public String ACP_Code;



//    @Given("^I navigate to the Salesforce login page$")
//    public void iNavigateToTheSalesforceLoginPage() throws Throwable {
//
////        initialization();
//        driver.get("https://test.salesforce.com/");
//        Thread.sleep(2000);
////        driver.manage().window().maximize();
//
//    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String UserName, String Password) throws Throwable {
        CRM_Login_Page.Set_username_password(UserName, Password);
    }


    @And("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {

        CRM_Login_Page.click_login_button();
    }


//    @Then("^I should see the Salesfroce home page$")
//    public void iShouldSeeTheSalesfroceHomePage() throws Throwable {
//
//        Thread.sleep(3000);
//        CRM_Login_Page.verify_Logout();
//
//    }


    @Then("^Logout of the Application Salesforce Application$")
    public void logoutOfTheApplicationSalesforceApplication() throws Throwable {

        CRM_Login_Page.Salesforce_Logout();
    }


    @Given("^I Enter receipt number into search field and hit Enter key$")
    public void iEnterReceiptNumberIntoSearchFieldAndHitEnterKey() throws Throwable {

//        Thread.sleep(9000);
//
//        String newwindow = getWindow();
//        driver.switchTo().window(newwindow);
//        receipt_number =  page8.Extract_ApplicantID();
//
//        Thread.sleep(2000);
//        String newwindow1 = getWindow_First();
//        driver.switchTo().window(newwindow1);
//        Thread.sleep(2000);
        CRM_Login_Page.Set_Receipt_number_into_SearchField(receipt_number);
    }

//    @Given("^I switch to first window to navigate to the Salesforce login page$")
//    public void iSwitchToFirstWindowToNavigateToTheSalesforceLoginPage() throws Throwable {
//
//        Thread.sleep(2000);
//        String newwindow = getWindow_First();
//        driver.switchTo().window(newwindow);
//        driver.get("https://test.salesforce.com/");
//        Thread.sleep(3000);
//    }

    @Then("^Click on Application Reference Number link$")
    public void clickOnApplicationReferenceNumberLink() throws Throwable {

        CRM_Login_Page.Click_Application_Reference_Link();
        Thread.sleep(5000);


    }

    @And("^Send an outbond email from gmail account using personal account$")
    public void sendAnOutbondEmailFromGmailAccountUsingPersonalAccount() throws Throwable {

        initialization();
        driver.get("https://www.google.com/gmail/about/#");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        CRM_Login_Page.Click_Signin_From_Gmail();
        Thread.sleep(4000);
        CRM_Login_Page.Logon_With_GmailAccount();
        Thread.sleep(5000);
        CRM_Login_Page.Send_OutBound_Email_FromGmailAccount();
        Thread.sleep(2000);
        CRM_Login_Page.Compose_Email();
        Thread.sleep(7000);
        CRM_Login_Page.LogOut_Gmail();
        CRM_Login_Page.Singout_Gmail();
        CRM_Login_Page.Close_broeswr_window();

    }

    @Given("^I navigate to the Salesforce URL login page$")
    public void iNavigateToTheSalesforceURLLoginPage() throws Throwable {

        initialization();
        driver.get("https://test.salesforce.com/");
        Thread.sleep(2000);
       driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @Given("^I Enter receipt number ([^\"]*) into search field and hit Enter key$")
    public void iEnterReceiptNumberNumberIntoSearchFieldAndHitEnterKey(String number) throws Throwable {

        CRM_Login_Page.Set_Receipt_number_into_SearchField(number);

    }

    @Then("^check the enquiry is created in CRM under MUDocs Enquiry queue Flow$")
    public void check_the_enquiry_is_created_in_CRM_under_MUDocs_Enquiry_queue_Flow() throws Throwable {
        Thread.sleep(2000);
        CRM_Login_Page.Goto_Enquiries_List();
        CRM_Login_Page.Click_RefreshIcon_Enquiry();
        Thread.sleep(3000);
        CRM_Login_Page.Select_First_Enquiry_FromQueue();
        Thread.sleep(5000);

    }

    @Then("^open the enquiry and link ACP to the enquiry$")
    public void open_the_enquiry_and_link_ACP_to_the_enquiry() throws Throwable {

        CRM_Login_Page.Click_Details_FromEnquiry();
        Thread.sleep(5000);
        CRM_Login_Page.Click_Edit_ToLinkACPToEnquiry(ACP_Code);



    }

    @Then("^Click Save to save the page layout$")
    public void click_Save_to_save_the_page_layout() throws Throwable {

        CRM_Login_Page.Click_Save_Button();
        Thread.sleep(6000);

    }

    @Then("^Unlink ACP from the same enquiry hit save button$")
    public void unlink_ACP_from_the_same_enquiry_hit_save_button() throws Throwable {

        CRM_Login_Page.Click_Delete_OR_UnlinkACP_ToEnquiry();
        Thread.sleep(1000);
        CRM_Login_Page.Click_Save_Button();
        Thread.sleep(3000);

    }

    @Then("^System should show us validation and validate them$")
    public void system_should_show_us_validation_and_validate_them() throws Throwable {

        CRM_Login_Page.Capture_ACPValidation_Error_MessageFrom_Enquiry();
        Thread.sleep(4000);
        CRM_Login_Page.Click_Cancel_Button();
    }

    @And("^Click on Details link$")
    public void clickOnDetailsLink() throws Throwable {
        CRM_Login_Page.Click_On_Details_Link();
        Thread.sleep(3000);
    }

    @And("^I get the ACP code from the application$")
    public void iGetTheACPCodeFromTheApplication() throws Throwable {

       ACP_Code =  CRM_Login_Page.Get_ACPCode_FromApplication();

    }



    @Given("^I Navigate to Close All the Tabs$")
    public void iNavigateToCloseAllTheTabs() throws Throwable {


        CRM_Login_Page.Close_FirstTab();
        CRM_Login_Page.Close_SecondTab();
        CRM_Login_Page.Close_ThirdTab();


    }

    @Then("^I logout from the application$")
    public void iLogoutFromTheApplication() throws Throwable {
        CRM_Login_Page.Click_Logout();
        CRM_Login_Page.Tear_Down();
    }


    @Then("^I should see the Salesforce home page$")
    public void iShouldSeeTheSalesforceHomePage() throws Throwable {

        Thread.sleep(3000);
        CRM_Login_Page.verify_Logout();
    }


}
