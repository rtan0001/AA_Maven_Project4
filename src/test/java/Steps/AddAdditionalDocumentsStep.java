package Steps;

import Base.BaseUtil;
import Pages.AddAdditionalDocumentsPage;
import cucumber.api.java.en.And;

public class AddAdditionalDocumentsStep extends BaseUtil {

//    public static WebDriver driver;

    AddAdditionalDocumentsPage page7 = new AddAdditionalDocumentsPage(driver);

    @And("^I Select upload button to choose a file  to upload$")
    public void i_Select_upload_button_to_choose_a_file_to_upload() throws Throwable {


        String file_name2 =  page7.GetTiemStamp();
        page7.Set_Document_InDocuments(file_name2);


    }

    @And("^I select DocumentType ([^\"]*) From Document attachment Section$")
    public void i_select_DocumentType_Proof_of_citizenship_residency_or_identity_From_Document_attachment_Section(String DocType) throws Throwable {

        page7.Select_DocumentType_FromDocuments(DocType);
    }

    @And("^I Set the comments in Textbox ([^\"]*) from documents$")
    public void i_Set_the_comments_in_Textbox_Enter_Application_Document_Comments_in_TextArea_from_documents(String comments) throws Throwable {

        page7.Set_Comments_DocumentLevel(comments);

    }

    @And("^I click on Upload button ([^\"]*) from Documents section$")
    public void i_click_on_Upload_button_Upload_from_Documents_section(String upload) throws Throwable {

        Thread.sleep(3000);
        page7.Click_On_Buttons(upload);
        Thread.sleep(5000);

    }


    @And("^I click on Add New Document button$")
    public void iClickOnAddNewDocumentButton() throws Throwable {
        page7.Add_NewDocuments();
        Thread.sleep(3000);
    }
}
