package Steps;

import Base.BaseUtil;
import Pages.AddCreditIntentionPage;
import cucumber.api.java.en.Given;

public class AddCreditIntentionStep extends BaseUtil {

//    public static WebDriver driver;

    AddCreditIntentionPage page5 = new AddCreditIntentionPage(driver);

    @Given("^I select credit intention ([^\"]*)$")
    public void i_select_credit_intention_Yes(String intention) throws Throwable {

     page5.Credit_Intention_Click(intention);

    }

}
