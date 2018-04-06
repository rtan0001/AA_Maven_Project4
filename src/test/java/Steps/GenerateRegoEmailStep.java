package Steps;

import Base.BaseUtil;
import Pages.GenerateRegoEmailPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class GenerateRegoEmailStep extends BaseUtil {

//    public static WebDriver driver;




    GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);
    public String email;
    public String title;
    public String Full_Title;

    @Given("^I navigate to the public website$")
    public void i_navigate_to_the_public_website() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Lib\\chromedriver.exe");
//        driver = new ChromeDriver();
        initialization();
        driver.get("https://www.mailinator.com/");
        Thread .sleep(2000);
        driver.manage().window().maximize();
    }

    @Given("^I Set a new email$")
    public void i_Set_a_new_email() throws Throwable {

        GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);
        email = reg_email.Set_Email_In_Mailitanor();
        System.out.println(email);

    }

    @Given("^I click Go button$")
    public void i_click_Go_button() throws Throwable {

        GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);
        reg_email.Click_GoButton();

    }

    @Then("^I should see public site inbox$")
    public void i_should_see_public_site_inbox() throws Throwable {

        GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);
        Thread.sleep(3000);
        title = reg_email.Get_Title();
        Assert.assertEquals(email,title);
        Full_Title = reg_email.Get_Full_Title();



    }

    @Then("^I close the browser$")
    public void iCloseTheBrowser() throws Throwable {
     driver.close();
    }



    @Given("^I navigate to the AA Registration login page$")
    public void iNavigateToTheAARegistrationLoginPage() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Lib\\chromedriver.exe");
//        driver = new ChromeDriver();
        initialization();
        driver.get("https://staging-monashpartner.cs6.force.com/admissions/s/login/");
        Thread .sleep(5000);
        driver.manage().window().maximize();
    }


    @And("^I click on Register as a New Applicant link from Registration Page$")
    public void iClickOnRegisterAsANewApplicantLinkFromRegistrationPage() throws InterruptedException {

        reg_email.Registration_Link_Click();

    }

    @Then("^I Enter ([^\"]*) and ([^\"]*) and Email$")
    public void iEnterGivenNameAndFamilyNameAndEmail(String given, String family)  {

        reg_email.set_GivenName_FamilyName_Email(given,family,Full_Title);

    }

    @Then("^I Click on SignUp button$")
    public void iClickOnSignUpButton()  {

        reg_email.Click_On_SignUp_Button();
    }


    @And("^I set an email into inbox$")
    public void iSetAnEmailIntoInbox() throws Throwable {

        reg_email.Set_Created_Email_into_Inbox(Full_Title);

    }

    @And("^I click on welcome message$")
    public void iClickOnWelcomeMessage() throws Throwable {
        reg_email.Click_Welcome_Email();
    }

    @Then("^I click on Complete Registration button from Email$")
    public void iClickOnCompleteRegistrationButtonFromEmail() throws Throwable {
        reg_email.Click_Complete_Registration();
    }

    @Then("^T Set password and Change Password$")
    public void tSetPasswordAndChangePassword() throws Throwable {
        reg_email.Set_password();
        reg_email.Set_ConfirmPassword();
        reg_email.Click_Change_Password();

    }

    @Then("^Logout ([^\"]*) of the Application$")
    public void logoutLogoutOfTheApplication(String logout) throws Throwable {

        reg_email.Click_Logout(logout);
        Thread.sleep(4000);
    }


    @And("^Close the browser$")
    public void closeTheBrowser() throws Throwable {
        tearDown();
    }
}
