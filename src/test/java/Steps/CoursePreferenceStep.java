package Steps;

import Base.BaseUtil;
import Pages.CoursePreferencePage;
import Pages.MyDetailsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CoursePreferenceStep extends BaseUtil{

//    public static WebDriver driver;

    MyDetailsPage page2 = new MyDetailsPage(driver);
    CoursePreferencePage page3 = new CoursePreferencePage(driver);

    @Given("^I navigate to the home ([^\"]*) page$")
    public void i_navigate_to_the_home_Home_page(String home_link) throws Throwable {

       Thread.sleep(3000);
//      String newwindow = getWindow();
//      driver.switchTo().window(newwindow);
      page2.Click_MyDetails_Link(home_link);
      Thread.sleep(6000);

    }

    @Given("^I click Create New Application button$")
    public void i_click_Create_New_Application_button() throws Throwable {
     page3.Click_CreateNewButton();
     Thread.sleep(3000);

    }

    @Given("^I Enter Course Preference code ([^\"]*) into Search Field$")
    public void i_Enter_Course_Preference_code_master_into_Search_Field(String Course_Code) throws Throwable {

        page3.Set_CoursePreference(Course_Code);

    }

    @When("^I click Search button$")
    public void i_click_Search_button() throws Throwable {

        page3.Click_Search_Button();
        Thread.sleep(3000);

    }

    @Then("^I select attendance Type ([^\"]*)$")
    public void i_select_attendance_Type_FullTime(String Type) throws Throwable {

       page3.Select_AttendanceType(Type);
    }

    @Then("^I select location ([^\"]*)$")
    public void i_select_location_CITY(String location) throws Throwable {
        page3.Select_CourseLocation(location);

    }

    @Then("^I select commencementPeriod ([^\"]*)$")
    public void i_select_commencementPeriod_SummerSemester(String period) throws Throwable {

        page3.Select_CommencementPeriod(period);
    }

    @Then("^I click on apply filters$")
    public void i_click_on_apply_filters() throws Throwable {

    page3.Click_ApplyFilters();

    }

    @Then("^I select list of courses and Add them to the application$")
    public void i_select_list_of_courses_and_Add_them_to_the_application() throws Throwable {

        page3.Select_CourseCodes_Checkbox();
    }


    @Then("^I click AddCourse$")
    public void iClickAddCourse() throws Throwable {

         page3.Click_AddCourse();
         Thread.sleep(3000);
    }

    @Then("^I should see the list of courses added ([^\"]*) to the application$")
    public void iShouldSeeTheListOfCoursesAddedCoursePreToTheApplication(String exp_res) throws Throwable {

        String Actual_res = page3.Validate_CourseText_OnGrid();
        Assert.assertEquals(exp_res, Actual_res);

    }

    @Then("^I click CloseSearch$")
    public void iClickCloseSearch() throws Throwable {

        page3.Click_CloseSearch();
    }
}
