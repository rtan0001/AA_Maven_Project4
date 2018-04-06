package Steps;

import Base.BaseUtil;
import Pages.SendEmail_FromGmailAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SendEmail_FromGmailAccountStep extends BaseUtil {

    SendEmail_FromGmailAccountPage gmail_page = new SendEmail_FromGmailAccountPage(driver);


    @Given("^I navigate to the gmail Login Page$")
    public void iNavigateToTheGmailLoginPage() throws Throwable {

        initialization();
        driver.get("https://www.google.com/gmail/about/#");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }



    @Then("^I Send an outbond Email with attachments to the admissions team$")
    public void iSendAnOutbondEmailWithAttachmentsToTheAdmissionsTeam() throws Throwable {

        gmail_page.Send_OutBound_Email_FromGmailAccount();
        Thread.sleep(2000);
        gmail_page.Compose_Email();
        Thread.sleep(7000);
        gmail_page.LogOut_Gmail();
        gmail_page.Singout_Gmail();
        gmail_page.Close_broeswr_window();

    }

    @And("^I given gmail Account username and password hit login$")
    public void iGivenGmailAccountUsernameAndPasswordHitLogin() throws Throwable {
        gmail_page.Click_Signin_From_Gmail();
        Thread.sleep(4000);
        gmail_page.Logon_With_GmailAccount();
        Thread.sleep(5000);

    }
}
