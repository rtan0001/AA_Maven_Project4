package Steps;

import Base.BaseUtil;
import Pages.AddQualificationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddQualificationStep extends BaseUtil {


//    public static WebDriver driver;

    AddQualificationPage page4 = new AddQualificationPage(driver);

    @Given("^I click Add New Qualification button$")
    public void i_click_Add_New_Qualification_button() throws Throwable {


      page4.Click_AddNewQualification();

    }


    @Given("^I Select Country ([^\"]*) where i studied$")
    public void i_Select_Country_Australia_where_i_studied(String country) throws Throwable {
        page4.Select_CountryStudied(country);

    }

    @Given("^I select Firstyear Enrolled ([^\"]*)$")
    public void i_select_Firstyear_Enrolled(String first_year) throws Throwable {
        page4.Select_FirstYear(first_year);
    }

    @Given("^I select Lastyear Enrolled ([^\"]*)$")
    public void i_select_Lastyear_Enrolled(String Last_Year) throws Throwable {
      page4.Select_LastYear(Last_Year);
    }

    @Given("^I select Qualification ([^\"]*)$")
    public void i_select_Qualification_Masters_in_IT(String Qualification) throws Throwable {
       page4.Set_Qualification_TertiaryLevel(Qualification);
    }

    @Given("^I select Institution ([^\"]*)$")
    public void i_select_Institution_SWINBURNE_TAFE(String institution) throws Throwable {
      page4.Set_Institution(institution);
    }

    @Given("^I select Level of Completion ([^\"]*)$")
    public void i_select_Level_of_Completion_SUCCESSFULLY_COMPLETED_AND_OBTAINED(String Level_Comp) throws Throwable {
      page4.Select_LevelOf_Completion(Level_Comp);
    }

    @Given("^I select a file to upload filename$")
    public void i_select_a_file_to_upload_filename() throws Throwable {
        String file_name1 = page4.GetTiemStamp();
        page4.Set_Document_InQualification(file_name1);
    }

    @Given("^I select Document Type ([^\"]*)$")
    public void i_select_Document_Type_Results_from_tertiary_studies(String Doc_Type) throws Throwable {

        page4.Select_DocumentType(Doc_Type);

    }

    @Given("^I set Comments into ([^\"]*) box$")
    public void i_set_Comments_into_Enter_Comments_in_TextArea_box(String comments) throws Throwable {
        page4.Set_Comments(comments);
    }

    @Then("^I click save to save the Qualification$")
    public void i_click_save_to_save_the_Qualification() throws Throwable {
      page4.Click_SaveButton_TertiaryQual();
      Thread.sleep(10000);
    }

    @Then("^I verify the Qualification from application Grid$")
    public void i_verify_the_Qualification_from_application_Grid() throws Throwable {
        Thread.sleep(2000);
    }


    @And("^I select QualificationType from qualification ([^\"]*)$")
    public void iSelectQualificationTypeFromQualificationQualType(String Qual_Type) throws Throwable {
        page4.Select_QualificationType(Qual_Type);
    }
}
