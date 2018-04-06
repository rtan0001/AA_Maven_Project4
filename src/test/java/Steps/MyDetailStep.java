package Steps;

import Base.BaseUtil;
import Pages.GenerateRegoEmailPage;
import Pages.LoginPage;
import Pages.MyDetailsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Pages.GenerateRegoEmailPage.getWindow;
import static Pages.GenerateRegoEmailPage.getWindow_First;

public class MyDetailStep extends BaseUtil{




    MyDetailsPage page2 = new MyDetailsPage(driver);
    GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);

    public String username;


//    public String Full_Title;

//    public static WebDriver driver;


//    @Given("^I navigate to the AA portal login page$")
//    public void iNavigateToTheAAPortalLoginPage() throws Throwable  {
//        initialization();
//
////       System.setProperty("webdriver.chrome.driver", "C:\\Lib\\chromedriver.exe");
////       driver = new ChromeDriver();
//        driver.get("https://ucuat-monashpartner.cs72.force.com/admissions/s/login/");
//        Thread .sleep(5000);
//        driver.manage().window().maximize();
//    }


    @And("^I entered username and password$")
    public void iEnteredUsernameAndPassword() throws Throwable {


        String newwindow = getWindow();
        driver.switchTo().window(newwindow);
        LoginPage page = new LoginPage(driver);
        page.Login(username, "monash@2017");

    }


    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        LoginPage page = new LoginPage(driver);
        page.ClickLogin();
        Thread .sleep(2500);
//         page2 = page.ClickLogin();

    }




    @And("^I navigate to the details ([^\"]*) page$")
    public void iNavigateToTheDetailsMyDetailsPage(String DetailsLink) throws Exception {
         Thread.sleep(10000);

//         MyDetailsPage page2 = new MyDetailsPage(driver);
//       MyDetailsPage page2 =  PageFactory.initElements(driver, MyDetailsPage.class);
//         page2.Click_MyDetails_Link(DetailsLink);
           page2.Click_MyDetails_Link(DetailsLink);

    }


    @And("^I Select title from page ([^\"]*)$")
    public void iSelectTitleFromPageTitle(String title) throws Exception {

        page2.select_title(title);


    }

    @Then("^I Click on Save button$")
    public void iClickOnSaveButton() throws Exception {

    }

    @And("^I Select gender ([^\"]*)$")
    public void iSelectGenderGender(String gender) throws Exception {

        page2.Select_Gender(gender);

    }

    @And("^I Set dateofbirth ([^\"]*)$")
    public void iSetDateofbirthDateOfBirth(String Dateofbirth) throws Exception {

        page2.Enter_DateOfBirth(Dateofbirth);

    }

    @And("^I Set mobilenumber ([^\"]*)$")
    public void iSetMobilenumberMobileNumber(String mobilenumber) throws Exception {

        page2.Set_Mobile(mobilenumber);

    }

    @And("^I Set homephone ([^\"]*)$")
    public void iSetHomephoneHomePhone(String homephone) throws Exception {

        page2.Set_HomePhone(homephone);


    }

    @And("^I Set workphone ([^\"]*)$")
    public void iSetWorkphoneWorkPhone(String worhphone) throws Exception {

        page2.Set_WorkPhone(worhphone);

    }

    @And("^I Set currentpostal ([^\"]*)$")
    public void iSetCurrentphoneCurrentPostal(String postalAddress) throws Exception {

        page2.Select_PostalAddress(postalAddress);

    }

    @And("^I Set streetnumber ([^\"]*)$")
    public void iSetStreetnumberStreetNumber(String street) throws Exception {

        page2.Set_StreetNumber(street);

    }

    @And("^I Set suburb ([^\"]*)$")
    public void iSetSuburbSuburb(String suburb) throws Exception {

        page2.Set_Suburb(suburb);

    }

    @And("^I Set state ([^\"]*)$")
    public void iSetStateState(String state) throws Exception {

       page2.Select_State(state);

    }

    @And("^I Set postalcode ([^\"]*)$")
    public void iSetPostalcodePostalCode(String postalcode) throws Exception {

         page2.Set_PostCode(postalcode);

    }

    @And("^I Set location ([^\"]*)$")
    public void iSetLocationLocation(String location) throws Exception {

        page2.Select_Location(location);

    }

    @And("^I Set citizenship ([^\"]*)$")
    public void iSetCitizenshipCitizenShipType(String citizenship) throws Exception {

        page2.Select_CitizenShip(citizenship);

    }

    @And("^I Set aborigional ([^\"]*)$")
    public void iSetAborigionalAboriginalIslander(String oborigional) throws Exception {

        page2.Select_Aboriginal(oborigional);

    }

    @When("^I Click on Save button to save the details$")
    public void iClickOnSaveButtonToSaveTheDetails() throws Exception {

      page2.Click_SaveButton();

      Thread.sleep(3500);


    }

    @Given("^I navigate to mailinator window to get email$")
    public void iNavigateToMailinatorWindowToGetEmail() throws Throwable {

        Thread.sleep(2000);
        String newwindow = getWindow_First();
        driver.switchTo().window(newwindow);
        username = reg_email.Get_textEmailFrom_WelcomePage();
        System.out.println(username);
        Thread.sleep(2000);

    }
}



