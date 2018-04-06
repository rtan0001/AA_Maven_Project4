package Steps;

import Base.BaseUtil;
import Pages.GenerateRegoEmailPage;
import Pages.LoginPage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginStep extends BaseUtil {

//    static {
//        System.setProperty("webdriver.chrome.driver", "C:\\Lib\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://staging-monashpartner.cs6.force.com/admissions/s/login/");
//
//    }

    LoginPage page = new LoginPage(driver);


//        MyDetailsPage page2;



    GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);

    public String Full_Title;

//  @Given("^I navigate to the AA portal login page$")
//    public void iNavigateToTheAAPortalLoginPage() throws Throwable  {
//        initialization();
//
////       System.setProperty("webdriver.chrome.driver", "C:\\Lib\\chromedriver.exe");
////       driver = new ChromeDriver();
//         driver.get("https://ucuat-monashpartner.cs72.force.com/admissions/s/login/");
//         Thread .sleep(5000);
//         driver.manage().window().maximize();
//    }

//
//    @And("^I click login button$")
//    public void iClickLoginButton() throws Throwable {
//         LoginPage page = new LoginPage(driver);
//           page.ClickLogin();
//         Thread .sleep(2500);
////         page2 = page.ClickLogin();
//
//        }

    @Then("^I should see the home page$")
    public void iShouldSeeTheHomePage() throws Throwable {

        Thread .sleep(10000);
        String title = driver.getTitle();
        Assert.assertEquals("My Details", title);
    }



//
//    @And("^I entered username and password$")
//    public void iEnteredUsernameAndPassword() throws Throwable {
//
////        GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);
////         email = reg_email.Set_Email_In_Mailitanor();
//        GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);
//        Thread.sleep(3000);
//        Full_Title = reg_email.Get_Full_Title();
//         LoginPage page = new LoginPage(driver);
//         page.Login(Full_Title, "monash@2017");
//
//    }



//
//    @Then("^Logout ([^\"]*) of the Application$")
//    public void logoutLogoutOfTheApplication(String logout) throws Exception {
//        page.Click_Logout(logout);
//        Thread.sleep(2000);
//    }

//
//    @And("^Close the browser$")
//    public void closeTheBrowser() throws Throwable {
//
//       Thread .sleep(1000);
////       driver.close();
//    }


}
