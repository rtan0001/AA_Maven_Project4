package Pages;

import Base.BaseUtil;
import Steps.LoginStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AddAdditionalDocumentsPage extends BaseUtil {


//    public WebDriver driver;

    public AddAdditionalDocumentsPage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void Add_NewDocuments() throws InterruptedException {

        Thread.sleep(2000);
        LoginStep.driver.findElement(By.xpath("//*[@id='documentList']/div[1]/div/button")).click();


    }


    public static String GetCurrentTimeStamp()
    {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;

    }


    public String GetTiemStamp() throws InterruptedException {

        Thread.sleep(1000);
        //Steps to read and rename a file with time stamp.
//        String filepath = System.getProperty("C:\\Users\\rtan0001\\Downloads\\TestUploadFiles");
        //create a new file with timestamp

        String filename = "Test1";
        File file = new File("C:\\Users\\rtan0001\\Downloads\\TestUploadFiles" + "\\" + filename + GetCurrentTimeStamp().replace(":", "_").replace(".", "_") + ".txt");
        File NewFile = new File("C:\\Users\\rtan0001\\Downloads\\TestUploadFiles" + "\\" + "backup_" + file.getName());

        String TestFile = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File is created; file name is" + file.getName());
                String filepathname = file.getName();
                TestFile = ("C:\\Users\\rtan0001\\Downloads\\TestUploadFiles" + "\\" + filepathname);

//               driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/div[10]/div/form/div[2]/div/div/input")).click();
                FileWriter FW = new FileWriter(TestFile);
                BufferedWriter BW = new BufferedWriter(FW);

                for (int i = 0; i <= 600; i++) {

                    BW.write("Steps 2-5 of the File Import Wizard will open a sample copy of your text file to determine the layout of data and other file characteristics.  This can be either the file currently collecting your real-time data or a copy of this file in a different folder.  Enter the name and location of this sample file in the Sample text file containing data box");
                    BW.newLine();
                    BW.write("Prior to the Java SE 7 release, the java.io.File class was the mechanism used for file I/O, but it had several drawbacks.\n" +
                            "\n" +
                            "Many methods didn't throw exceptions when they failed, so it was impossible to obtain a useful error message. For example, if a file deletion failed, the program would receive a \"delete fail\" but wouldn't know if it was because the file didn't exist, the user didn't have permissions, or there was some other problem.\n" +
                            "The rename method didn't work consistently across platforms.\n" +
                            "There was no real support for symbolic links.\n" +
                            "More support for metadata was desired, such as file permissions, file owner, and other security attributes. Accessing file metadata was inefficient.\n" +
                            "Many of the File methods didn't scale. Requesting a large directory listing over a server could result in a hang. Large directories could also cause memory resource problems, resulting in a denial of service.\n" +
                            "It was not possible to write reliable code that could recursively walk a file tree and respond appropriately if there were circular symbolic links. ");
                    BW.newLine();

                    BW.write("Steps 2-5 of the File Import Wizard will open a sample copy of your text file to determine the layout of data and other file characteristics.  This can be either the file currently collecting your real-time data or a copy of this file in a different folder.  Enter the name and location of this sample file in the Sample text file containing data box");
                    BW.newLine();
                    BW.write("Prior to the Java SE 7 release, the java.io.File class was the mechanism used for file I/O, but it had several drawbacks.\n" +
                            "\n" +
                            "Many methods didn't throw exceptions when they failed, so it was impossible to obtain a useful error message. For example, if a file deletion failed, the program would receive a \"delete fail\" but wouldn't know if it was because the file didn't exist, the user didn't have permissions, or there was some other problem.\n" +
                            "The rename method didn't work consistently across platforms.\n" +
                            "There was no real support for symbolic links.\n" +
                            "More support for metadata was desired, such as file permissions, file owner, and other security attributes. Accessing file metadata was inefficient.\n" +
                            "Many of the File methods didn't scale. Requesting a large directory listing over a server could result in a hang. Large directories could also cause memory resource problems, resulting in a denial of service.\n" +
                            "It was not possible to write reliable code that could recursively walk a file tree and respond appropriately if there were circular symbolic links. ");
                    BW.newLine();

                }

                BW.close();


//                driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/div[10]/div/form/div[2]/div/div/input")).sendKeys("C:\\Users\\rtan0001\\Downloads\\TestUploadFiles" + "\\" + filepathname);

            }

            //*[@id="uploadFile"]/form/div[3]/div/input
            //*[@id="uploadFile"]/form/div[3]/div/input

        } catch (IOException e) {
            e.printStackTrace();
        }


        return TestFile;
    }

    public void Set_Document_InDocuments(String fileinput2)
    {

        LoginStep.driver.findElement(By.xpath("//*[@id='uploadFile']/form/div[3]/div/input")).sendKeys(fileinput2);

    }

    public void Set_Comments_DocumentLevel(String Comments) throws InterruptedException {

        Thread.sleep(1000);

        LoginStep.driver.findElement(By.xpath("//*[@id='uploadFile']/form/div[4]/div/div[2]/textarea")).sendKeys(Comments);
    }
    public void Click_On_Buttons(String button)
    {
        WebElement element  = LoginStep.driver.findElement(By.xpath("//*[@id='uploadFile']/form/center"));

        List<WebElement> list_items = element.findElements(By.xpath("//*[@type='button']"));

        for(WebElement items: list_items)
        {
            if(items.getText().trim().equals(button))
            {
                items.click();
                break;
            }
        }

    }

    //Select Docuemnt Type from Documents
    public void Select_DocumentType_FromDocuments(String DocumentType) throws InterruptedException {

        Thread.sleep(1000);

        WebElement element =  LoginStep.driver.findElement(By.xpath("//*[@id='uploadFile']/form/div[4]/div/div[1]/div/select"));

        List<WebElement> list_items = element.findElements(By.tagName("option"));

        for(WebElement items : list_items)
        {
            if(items.getText().trim().equals(DocumentType))
            {
                items.click();
                break;
            }

        }
    }










}
