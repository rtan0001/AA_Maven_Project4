package Steps;

import Base.BaseUtil;
import Pages.SubmitTheApplicationPage;
import cucumber.api.java.en.And;

public class SubmitTheApplicationStep extends BaseUtil {

//    public static WebDriver driver;


    SubmitTheApplicationPage page8 = new SubmitTheApplicationPage(driver);

    public String App_ID;

    @And("^I Click on Continue button ([^\"]*)$")
    public void i_Click_on_Continue_button_Continue(String button1) throws Throwable {
        page8.Click_On_Buttons(button1);
        Thread.sleep(5000);
    }

    @And("^I click on Continue button ([^\"]*)  on review page$")
    public void i_click_on_Continue_button_Continue_on_review_page(String button2) throws Throwable {

        page8.Click_On_Buttons(button2);
        Thread.sleep(5000);
    }


    @And("^I Click on Accept and Submit button after review$")
    public void iClickOnAcceptAndSubmitButtonAfterReview() throws Throwable {

        page8.Click_On_Accept_Submit_Button();
        Thread.sleep(4000);

    }

    @And("^I capture receipt number ApplicationID after application submission$")
    public void iCaptureReceiptNumberApplicationIDAfterApplicationSubmission() throws Throwable {

      App_ID = page8.Extract_ApplicantID();
      System.out.println(App_ID);

    }


}
