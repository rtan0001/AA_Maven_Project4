package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Test1 {

    WebDriver driver = null;

    public void Test_Method1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ucuat-monashpartner.cs72.force.com/admissions/");
        Thread.sleep(7000);
        driver.manage().window().maximize();

     }

     public void Test_Method2() throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\Lib\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://staging-monashpartner.cs6.force.com/admissions/s/login/");
         Thread .sleep(5000);
         driver.manage().window().maximize();
     }

     public void Test_Login(String username, String password) throws InterruptedException {

         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys(username);
         driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(password);
         driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div[4]/div/div[3]/button/span")).click();
     }

     public void Click_MyDetails_Link(String details) throws InterruptedException {

             Thread.sleep(5000);

//            WebDriverWait wait = new WebDriverWait(driver, 4000);
            WebElement ul_items = driver.findElement(By.xpath("//*[@id='navigationMenu']"));

//            wait.until(ExpectedConditions.visibilityOf(ul_items));

             List<WebElement> list_items = ul_items.findElements(By.tagName("li"));

            for (WebElement li : list_items) {
             List<WebElement> all_links = li.findElements(By.tagName("a"));

             for (WebElement link : all_links) {
                 if (link.getText().equals(details)) {

                     link.click();
                     System.out.println("Element Found");
                 }
             }
         }
     }


     public void  select_title(String  Title) throws InterruptedException {

             Thread.sleep(3000);

             WebElement list_items =  driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[2]/div[1]/div[1]/div[1]/select"));

            List<WebElement> options =  list_items.findElements(By.tagName("option"));

            for(WebElement option: options)
            {
               if(option.getText().trim().equals(Title))
               {
                   option.click();
                   break;
               }

            }

         }

    public void  Select_Gender(String  Gender) throws InterruptedException {

        Thread.sleep(2000);

        WebElement list_items =  driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[6]/div[1]/div[1]/div[1]/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(Gender))
            {
                option.click();
                break;
            }

        }

    }
    public void Enter_DateOfBirth(String DatOfBirth) throws InterruptedException {


        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[7]/div[1]/div[1]/div[1]/input")).sendKeys(DatOfBirth);

       }


    public void Set_Mobile(String Mobile) throws InterruptedException {


        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[11]/div[1]/div[1]/div[1]/input")).sendKeys(Mobile);

    }

    public void Set_HomePhone(String HomePhone) throws InterruptedException {


        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[12]/div[1]/div[1]/div[1]/input")).sendKeys(HomePhone);

    }
    public void Set_WorkPhone(String WorkPhone) throws InterruptedException {


        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[13]/div[1]/div[1]/div[1]/input")).sendKeys(WorkPhone);

    }

    public void  Select_PostalAddress(String  AddressFlag) throws InterruptedException {

        Thread.sleep(2000);

        WebElement list_items =  driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[15]/div[1]/div[1]/div[1]/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(AddressFlag))
            {
                option.click();
                break;
            }

        }

    }
    public void Set_StreetNumber(String Street) throws InterruptedException {


        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[16]/div[1]/div[1]/div[1]/div[1]/input")).sendKeys(Street);

    }

    public void Set_Suburb(String Suburb) throws InterruptedException {


        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[16]/div[1]/div[1]/div[1]/div[2]/input")).sendKeys(Suburb);

    }

    public void  Select_State(String  State) throws InterruptedException {

        Thread.sleep(2000);

        WebElement list_items =  driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[16]/div[1]/div[1]/div[1]/div[3]/div[1]/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(State))
            {
                option.click();
                break;
            }

        }

    }

    public void Set_PostCode(String PostCode) throws InterruptedException {


        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[16]/div[1]/div[1]/div[1]/div[3]/div[2]/input")).sendKeys(PostCode);

    }

    public void  Select_Location(String  Location) throws InterruptedException {

        Thread.sleep(2000);

        WebElement list_items =  driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[18]/div[1]/div[1]/div[1]/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(Location))
            {
                option.click();
                break;
            }

        }

    }

    public void  Select_CitizenShip(String  CitizenShip) throws InterruptedException {

        Thread.sleep(2000);

        WebElement list_items =  driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[19]/div[1]/div[1]/div[1]/div[1]/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(CitizenShip))
            {
                option.click();
                break;
            }

        }

    }

    public void  Select_Aboriginal(String  Aboriginal) throws InterruptedException {

        Thread.sleep(2000);

        WebElement list_items =  driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[25]/div[1]/div[1]/div[1]/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(Aboriginal))
            {
                option.click();
                break;
            }

        }

    }
    public void  Click_SaveButton() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[27]/center/div[1]/button[1]")).click();
    }

    public void  Click_CreateNewButton() throws InterruptedException {

        Thread.sleep(7000);

        driver.findElement(By.xpath(" //*[@id='NapiliCommunityTemplate']/div[2]/div/div[2]/div/div/div/div/div/div/button")).click();

    }
    public void Set_CoursePreference(String course) throws InterruptedException {

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id='searchCourse']/div[1]")).click();

       driver.findElement(By.xpath("//*[@id='searchCourse']/div[5]/form/div[1]/div[1]/input")).sendKeys(course);
    }

    public void Click_Search_Button()
    {

        driver.findElement(By.xpath("//*[@id='searchCourse']/div[5]/form/div[2]/div/button")).click();



    }
    public void Select_AttendanceType(String attandanceType) throws InterruptedException
    {
        Thread.sleep(2000);

        WebElement list_items =  driver.findElement(By.xpath("//*[@id='courseList']/div[1]/form/div[1]/div/select"));

         List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(attandanceType))
            {
                option.click();
                break;
            }

        }

    }


    public void Select_CourseLocation(String courseLocation) throws InterruptedException
    {

        Thread.sleep(2000);

        WebElement list_items =  driver.findElement(By.xpath("//*[@id='courseList']/div[1]/form/div[2]/div/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(courseLocation))
            {
                option.click();
                break;
            }

        }

    }

    public void Select_CommencementPeriod(String Period) throws InterruptedException
    {

        Thread.sleep(2000);

        WebElement list_items =  driver.findElement(By.xpath("//*[@id='courseList']/div[1]/form/div[3]/div/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(Period))
            {
                option.click();
                break;
            }

        }

    }

    public void Click_ApplyFilters() throws InterruptedException
    {

        Thread.sleep(2000);

       driver.findElement(By.xpath("//*[@id='courseList']/div[1]/form/div[4]/button")).click();



    }

    public void Select_CourseCodes_Checkbox() throws InterruptedException
    {

        Thread.sleep(2000);

        WebElement table_collection = driver.findElement(By.xpath("//*[@id='courseList']/table"));
        List<WebElement> rows = table_collection.findElements(By.tagName("tr"));
        int row_Count = rows.size();
        System.out.println("Number of ws:"+ row_Count);

        for(int i=0; i<=row_Count-7 ;i++) {

//           List<WebElement> cols =  rows.get(i).findElements(By.tagName("td"));
//           int col_Count = cols.size();
//           System.out.println("Number of Columns in each row:" +col_Count);
//           for(int j=0; j<col_Count-6; j++) {
//           System.out.println("row value is:" +rows.get(i));

               List<WebElement> elements = driver.findElements(By.xpath("//*[@type='checkbox']"));
               elements.get(i).click();
//           }

//            List<WebElement> cols =  rows.get(i).findElements(By.tagName("td"));
//            for(WebElement col : cols)
//            {
//                List<WebElement> elements = driver.findElements(By.xpath("//*[@type='checkbox']"));
//                elements.get(i).click();
//            }





        }
    }
    public void Click_AddCourse() throws InterruptedException
    {

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='courseList']/div[3]/button[1]")).click();



    }

    public void Click_AddNewQualification() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[1]/div[1]/button")).click();

         }

    public void Select_QualificationType(String Qual_Type) throws InterruptedException
    {

        Thread.sleep(2000);

        WebElement dropdown_elements =  driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[2]/div[1]/div[1]/div[1]/select"));

       List<WebElement> list_items =  dropdown_elements.findElements(By.tagName("option"));

       for(WebElement items: list_items)
       {
          if(items.getText().trim().equals(Qual_Type))
          {
              items.click();
              break;
          }

       }


       }

       public void Select_CountryStudied(String Country_studied) throws InterruptedException {

           Thread.sleep(2000);

           WebElement list_items =  driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/div[4]/div/div/div/div/select"));
           List<WebElement> options =  list_items.findElements(By.tagName("option"));

           for(WebElement option: options)
           {
               if(option.getText().trim().equals(Country_studied))
               {
                   option.click();
                   break;
               }

           }
       }
    public void Select_FirstYear(String First_year) throws InterruptedException {

        Thread.sleep(1000);

        WebElement list_items =  driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/div[5]/div[1]/div/div/div/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(First_year))
            {
                option.click();
                break;
            }


        }

    }

    public void Select_LastYear(String Last_year) throws InterruptedException {

        Thread.sleep(1000);

        WebElement list_items =  driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/div[5]/div[2]/div/div/div/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(Last_year))
            {

                option.click();
                break;
            }

        }
    }

    public void Set_Qualification_TertiaryLevel(String qual_text) throws InterruptedException {

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"qualSection\"]/div/div/div[2]/div[2]/form/div[5]/div[3]/div/div/div/input")).sendKeys(qual_text);

    }

    public void Set_Institution(String institution) throws InterruptedException {

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/div[5]/div[5]/div/div/div/div/div[1]/div/input")).sendKeys(institution);

        Thread.sleep(3000);

        List<WebElement> list_items = driver.findElements(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/div[5]/div[5]/div/div/div/div/div[2]/ul"));

        for(WebElement items : list_items)
        {
            if(items.getText().trim().equals(institution))
            {
                items.click();
                break;
            }

        }


    }

    public void Select_LevelOf_Completion(String Level_Completion) throws InterruptedException {

        Thread.sleep(2000);

       WebElement element =  driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/div[5]/div[6]/div/div/div/select"));

        List<WebElement> list_items = element.findElements(By.tagName("option"));

        for(WebElement items : list_items)
        {
            if(items.getText().trim().equals(Level_Completion))
            {
                items.click();
                break;
            }

        }


    }

    public static String GetCurrentTimeStamp()
    {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;

    }

    public void Create_ANewFile_WithTiemStamp(String filename) throws InterruptedException {

        Thread.sleep(1000);
       //Steps to read and rename a file with time stamp.
//        String filepath = System.getProperty("C:\\Users\\rtan0001\\Downloads\\TestUploadFiles");
        //create a new file with timestamp
        File file = new File("C:\\Users\\rtan0001\\Downloads\\TestUploadFiles" + "\\" +filename+GetCurrentTimeStamp().replace(":","_").replace(".","_")+".txt");
        File NewFile = new File("C:\\Users\\rtan0001\\Downloads\\TestUploadFiles" + "\\"+"backup_"+file.getName());

        try
        {
            if(!file.exists()) {
                file.createNewFile();
                System.out.println("File is created; file name is" + file.getName());
                String filepathname = file.getName();
                String TestFile = ("C:\\Users\\rtan0001\\Downloads\\TestUploadFiles" + "\\" + filepathname);

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

               WebElement element1 =  driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/h3"));
               WebElement element2 =  driver.findElement(By.xpath("//*[@id='NapiliCommunityTemplate']/div[2]/div/div[2]/div/div[5]/div/div/h3/button"));


               if(element1.getText().trim().equals("Qualification Document")) {
                   driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/div[10]/div/form/div[2]/div/div/input")).sendKeys("C:\\Users\\rtan0001\\Downloads\\TestUploadFiles" + "\\" + filepathname);
               }
               else
                   if(element2.getText().trim().equals("Application Documents"))
                   {
                       driver.findElement(By.xpath("//*[@id='uploadFile']/form/div[3]/div/input")).sendKeys("C:\\Users\\rtan0001\\Downloads\\TestUploadFiles" + "\\" + filepathname);
                   }

            }

        } catch(IOException e)
        {
            e.printStackTrace();
        }



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

    public void Set_Document_InQualification(String fileinput1)
    {
//        WebElement element1 =  driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/h3"));

        driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/div[10]/div/form/div[2]/div/div/input")).sendKeys(fileinput1);

    }

    public void Set_Document_InDocuments(String fileinput2)
    {

        driver.findElement(By.xpath("//*[@id='uploadFile']/form/div[3]/div/input")).sendKeys(fileinput2);

    }




 //Select Docuement Type from MyQualification Documents
    public void Select_DocumentType(String DocumentType) throws InterruptedException {

        Thread.sleep(1000);

        WebElement element =  driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/div[10]/div/form/div[3]/div/div/div/div/select"));


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
   //Select Docuemnt Type from Documents
    public void Select_DocumentType_FromDocuments(String DocumentType) throws InterruptedException {

        Thread.sleep(1000);

        WebElement element =  driver.findElement(By.xpath("//*[@id='uploadFile']/form/div[4]/div/div[1]/div/select"));

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




//Set comments from MyQualification Level

    public void Set_Comments(String Comments) throws InterruptedException {

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/div[10]/div/form/div[4]/div/div/div/textarea")).sendKeys(Comments);
    }



    //Set comments from Application Documents Level

    public void Set_Comments_DocumentLevel(String Comments) throws InterruptedException {

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id='uploadFile']/form/div[4]/div/div[2]/textarea")).sendKeys(Comments);
    }


    public void Click_SaveButton_TertiaryQual() throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id='qualSection']/div/div/div[2]/div[2]/form/center/div/button[1]")).click();
    }

    public void Credit_Intention_Click(String Intention) throws InterruptedException {

        Thread.sleep(2000);

        WebElement element =  driver.findElement(By.xpath("//*[@id='NapiliCommunityTemplate']/div[2]/div/div[2]/div/div[3]/div/div[4]/div/div/div[2]/div/form/div[2]/div/div[1]/div/div/select"));


        List<WebElement> list_items = element.findElements(By.tagName("option"));

        for(WebElement items : list_items)
        {
            if(items.getText().trim().equals(Intention))
            {
                items.click();
                break;
            }

        }
    }

    public void Click_AddWorkExperince() throws InterruptedException {

        Thread.sleep(1000);

//        driver.findElement(By.xpath("//*[@id='myWorkExpDiv']/button")).click();

        driver.findElement(By.xpath("//*[@id='NapiliCommunityTemplate']/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div[2]/div[1]/button")).click();

    }

    public void Set_Position(String position_title) throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[2]/div/div/div/input")).sendKeys(position_title);
    }

    public void Set_Employer(String Employer) throws InterruptedException {

        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[3]/div/div/div/input")).sendKeys(Employer);


    }
    public void Set_StartDate() throws InterruptedException, ParseException {

        Thread.sleep(500);

        String date = "Sat Jun 01 12:53:10 IST 2013";
       SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd hh:mm:ss Z yyyy");
        Date currentdate = dateFormat.parse(date);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println(dateFormat2.format(currentdate));
        String startdate = dateFormat2.format(currentdate);
        driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[4]/div/div[1]/div/input")).sendKeys(startdate, Keys.TAB);


    }
    public void Set_EndDate() throws InterruptedException {

        Thread.sleep(2000);
        Date todayDate = new Date();
        DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
        String EndDate =  df.format(todayDate);
        System.out.println("String in dd/MMM/yyyy format is:" + EndDate);
        driver.findElement(By.xpath("//*[@id='NapiliCommunityTemplate']/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div[2]/form/div[5]/div/div/div[1]/div/input")).sendKeys(EndDate, Keys.TAB);

    }

    public void Add_NewDocuments() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='documentList']/div[1]/div/button")).click();


    }



    public void Click_SaveButton_WorkExperice() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='NapiliCommunityTemplate']/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div[2]/form/center/div/button[1]")).click();


    }

    public void Click_On_Buttons(String button)
    {
        WebElement element  = driver.findElement(By.xpath("//*[@id='uploadFile']/form/center"));

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
    public void Registration_Link_Click() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='sfdc_forgot']/span[2]/a")).click();


        Thread.sleep(2000);
    }

    public void set_GivenName_FamilyName_Email(String given, String Family)
    {
        driver.findElement(By.xpath("//*[@placeholder='Given Name']")).sendKeys(given);
        driver.findElement(By.xpath("//*[@placeholder='Family Name']")).sendKeys(Family);
//        driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys(email);
    }

    public void Click_On_SignUp_Button()
    {
        driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div[4]/div/div[5]/button")).click();
    }



    public static void main(String [] args) throws InterruptedException, ParseException

    {
         Test1 t1 = new Test1();
         t1.Test_Method2();
         t1.Registration_Link_Click();


//         t1.Test_Login("tanneerurupa.qtp@gmail.com", "monash@2017");
//         Thread.sleep(10000);
//         t1.Click_MyDetails_Link("MY DETAILS");
//         t1.select_title("Mrs");
//         t1.Select_Gender("Female");
//         t1.Enter_DateOfBirth("12/01/1985");
//         t1.Set_Mobile("04375847568");
//         t1.Set_HomePhone("0357845985");
//         t1.Set_WorkPhone("04765847896");
//         t1.Select_PostalAddress("Yes");
//         t1.Set_StreetNumber("738 Blackburn Rd");
//         t1.Set_Suburb("Clayton");
//         t1.Select_State("Victoria");
//         t1.Set_PostCode("3000");
//         t1.Select_Location("Australian campus and any location not listed below");
//         t1.Select_CitizenShip("I hold an Australian permanent resident visa");
    //         t1.Select_Aboriginal("Yes");
//         t1.Click_SaveButton();

//         t1.Click_MyDetails_Link("HOME");
//          Thread.sleep(6000);
//         t1.Click_CreateNewButton();
//         Thread.sleep(5000);
//
//         //Add Course Preference
//         t1.Set_CoursePreference("master");
//         t1.Click_Search_Button();
//         t1.Select_AttendanceType("Full Time");
//         t1.Select_CourseLocation("CITY");
//         t1.Select_CommencementPeriod("2019 Summer Semester");
//         t1.Click_ApplyFilters();
//          Thread.sleep(3000);
//         t1.Select_CourseCodes_Checkbox();
//         t1.Click_AddCourse();
//
//        //Add Qualification to the application
//         Thread.sleep(5000);
//         t1.Click_AddNewQualification();
//         t1.Select_QualificationType("Tertiary Education/Post Secondary");
//         t1.Select_CountryStudied("Australia");
//         t1.Select_FirstYear("2006");
//         t1.Select_LastYear("2012");
//         t1.Set_Qualification_TertiaryLevel("Masters in IT");
//         t1.Set_Institution("SWINBURNE TAFE");
//         t1.Select_LevelOf_Completion("SUCCESSFULLY COMPLETED AND OBTAINED");
//
//        //Add timestamp to the file to upload a file
//        String file_name1 = t1.GetTiemStamp();
//        t1.Set_Document_InQualification(file_name1);
//
//        //Upload documents from Tertiary Qualification
//         t1.Select_DocumentType("Results from tertiary studies");
//         t1.Set_Comments("Enter Comments in TextArea");
//         t1.Click_SaveButton_TertiaryQual();
//
////        Add Credit Intention
//         Thread.sleep(12000);
//         t1.Credit_Intention_Click("Yes");
//
//        //Add Work Experience
//         t1.Click_AddWorkExperince();
//         t1.Set_Position("Test Manager");
//         t1.Set_Employer("Monash University");
//         t1.Set_StartDate();
//         t1.Set_EndDate();
//         t1.Click_SaveButton_WorkExperice();
//
//
//        //Add New Documents
//        t1.Add_NewDocuments();
//        String file_name2 = t1.GetTiemStamp();
//        t1.Set_Document_InDocuments(file_name2);
//        t1.Select_DocumentType_FromDocuments("Proof of citizenship/residency or identity");
//        t1.Set_Comments_DocumentLevel("Enter Application Document Comments in TextArea");
//        t1.Click_On_Buttons("Upload");
//
//        //Click Continue button to continue the application process
//          Thread.sleep(5000);
//          t1.Click_On_Buttons("Continue");








     }



}
