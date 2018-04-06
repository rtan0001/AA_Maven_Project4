package Steps;

import Base.BaseUtil;
import Pages.AddWorkExperincePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class AddWorkExperinceStep extends BaseUtil {

//    public static WebDriver driver;

    AddWorkExperincePage page6 = new AddWorkExperincePage(driver);

    @Given("^I click Add work experience button$")
    public void i_click_Add_work_experience_button() throws Throwable {

        page6.Click_AddWorkExperince();


    }

    @Given("^I set the employer ([^\"]*)$")
    public void i_set_the_employer_employer(String employer) throws Throwable {

        page6.Set_Employer(employer);
    }

    @Given("^I Set Start Date$")
    public void i_Set_Start_Date() throws Throwable {
        page6.Set_StartDate();
    }

    @Given("^I Set End Date$")
    public void i_Set_End_Date() throws Throwable {

        page6.Set_EndDate();

    }

    @Given("^I Click on Save button From Work Experience$")
    public void i_Click_on_Save_button_From_Work_Experience() throws Throwable {

        page6.Click_SaveButton_WorkExperice();
        Thread.sleep(3000);

    }


    @And("^I set the position ([^\"]*)$")
    public void iSetThePositionPosition(String position) throws Throwable {
        page6.Set_Position(position);

    }
}
