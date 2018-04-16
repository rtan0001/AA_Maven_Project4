package Pages;

import Base.BaseUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class CRM_Login_Form_Page extends BaseUtil {

    GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);



    public CRM_Login_Form_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void Set_username_password(String username, String password) {
        driver.findElement(By.xpath("//*[@id='username']")).clear();

        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);

        driver.findElement(By.xpath("//*[@id='password']")).clear();

        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);

    }


    public void click_login_button() {
        driver.findElement(By.xpath("//*[@id='Login']")).click();
    }

    public void verify_Logout() {
        driver.findElement(By.xpath("//*[@id='userNavLabel']")).click();

        String text = driver.findElement(By.xpath("//*[@id='app_logout']")).getText();

        if (!text.equals("")) {
            System.out.println("Successfully login into CRM");
        }
    }


    public void Salesforce_Logout() {
        driver.findElement(By.xpath("//*[@id='app_logout']")).click();
    }

    public void Set_Receipt_number_into_SearchField(String receiptID) {
        driver.findElement(By.xpath("//*[@id='phSearchInput']")).click();

//      driver.findElement(By.xpath("//*[@id='phSearchInput']")).sendKeys(A-266295, Keys.ENTER);

        driver.findElement(By.xpath("//*[@id='phSearchInput']")).sendKeys(receiptID, Keys.ENTER);


    }


    public void Click_Application_Reference_Link() throws InterruptedException {


        driver.switchTo().frame("ext-comp-1013");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("/html/body/div[2]"));
        WebElement no_tables = element.findElement(By.tagName("table"));

        List<WebElement> no_rows = no_tables.findElements(By.tagName("tr"));

        int rows_count = no_rows.size();
        System.out.println(rows_count);

        for (int i = 0; i <= rows_count; i++) {
            if (i == 3) {

              List<WebElement> no_cols =   no_rows.get(i).findElements(By.tagName("th"));
              int cols_count = no_cols.size();

              for(int j=0; j<=cols_count; j++)
              {
                  if(j == 0) {
                      no_cols.get(j).findElement(By.tagName("a")).click();
                      break;
                  }
              }


            }
        }

    }

    public void Click_On_Details_Link() throws InterruptedException {

        driver.switchTo().parentFrame();
        driver.switchTo().frame("ext-comp-1018");

//      driver.switchTo().frame("//*[@id='ext-comp-1018']");
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("/html/body"));
        WebElement under_list = ele.findElement(By.tagName("ul"));
        List<WebElement> list_items = under_list.findElements(By.tagName("li"));
        int items_size = list_items.size();
        for (int i = 0; i <= items_size; i++) {
            if (i == 1) {


                WebElement ele_links = list_items.get(i).findElement(By.tagName("a"));
//              JavascriptExecutor executor = (JavascriptExecutor) driver;
//              executor.executeScript("arguments[0].click();", ele_links);
                Actions act = new Actions(driver);
                act.moveToElement(ele_links).click().build().perform();


            }

        }
    }


    public void Click_Signin_From_Gmail() {
        WebElement Element = driver.findElement(By.xpath("/html/body"));
        List<WebElement> links = Element.findElements(By.tagName("a"));
        for (WebElement link : links) {
            if (link.getText().equals("SIGN IN")) {
                link.click();
                break;
            }
        }
    }

    public void Logon_With_GmailAccount() throws InterruptedException {
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("rupa.testingstuff@gmail.com");
        driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Venkateswararao1");
        driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();

    }

    public void Send_OutBound_Email_FromGmailAccount() {
        driver.findElement(By.xpath("//*[@class='aic']/div/div")).click();


    }

    public void Compose_Email() throws InterruptedException, IOException {
        driver.findElement(By.name("to")).sendKeys("srregsample@gmail.com");
        driver.findElement(By.name("subjectbox")).sendKeys("Test Email", Keys.TAB);
        driver.findElement(By.xpath("//*[@class='Am Al editable LW-avf']")).click();
        driver.findElement(By.xpath("//*[@class='Am Al editable LW-avf']")).sendKeys("TestEmail From My Gmail Account");
        driver.findElement(By.xpath("//*[@class='a1 aaA aMZ']")).click();
        Runtime.getRuntime().exec("C:\\Users\\rtan0001\\Downloads\\AutoIT\\test.exe");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();

    }

    public void LogOut_Gmail() throws InterruptedException {


        driver.findElement(By.xpath("//*[@class='gb_Ec gb_Lg gb_R']/div[5]/div[1]/a/span")).click();
        Thread.sleep(1000);

    }


    public void Singout_Gmail() throws InterruptedException {
        driver.findElement(By.xpath("//*[@class='gb_Ea gb_Wf gb_4f gb_Le gb_Jb']")).click();
        Thread.sleep(5000);
    }

    public void Close_broeswr_window() {
        driver.close();
    }




    public void Goto_Enquiries_List() throws InterruptedException {

//        Thread.sleep(4000);

        driver.switchTo().parentFrame();

        WebElement table_ele = driver.findElement(By.xpath("/html/body"));

        WebElement no_table = table_ele.findElement(By.xpath("//*[@id='servicedesk']"));

        List<WebElement> row_list = no_table.findElements(By.tagName("tr"));

        int row_cnt = row_list.size();

        for (int i = 0; i <= row_cnt; i++) {
            if (i == 1) {
                List<WebElement> col_list = row_list.get(i).findElements(By.tagName("td"));

                int col_cnt = col_list.size();

                for (int j = 0; j <= col_cnt; j++) {
                    if (j == 1) {
                        WebElement ele_tag = col_list.get(j).findElement(By.tagName("button"));
                        Actions act = new Actions(driver);
                        WebElement ele_txt = ele_tag.findElement(By.xpath("//*[@id='ext-gen33']/span"));
                        act.moveToElement(ele_txt).click().build().perform();
                        break;


                    }
                }
            }
        }

    }

    public String Get_ACPCode_FromApplication() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("ext-comp-1018");
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[2]"));
        WebElement element2 = element1.findElement(By.xpath("//*[@class='efObjectDetails']/div[1]/div[3]/div[1]/div[1]"));
        List<WebElement> no_tables = element2.findElements(By.tagName("table"));
        int cnt_table = no_tables.size();
        String ACPLink_Text = null;
        for (int i = 0; i <= cnt_table; i++) {
            if (i == 1) {
                List<WebElement> no_rows = no_tables.get(i).findElements(By.tagName("tr"));
                int cnt_rows = no_rows.size();
                for (int j = 0; j <= cnt_rows; j++) {
                    if (j == 1) {
                        List<WebElement> no_cols = no_rows.get(j).findElements(By.tagName("td"));
                        int cnt_cols = no_cols.size();
                        for (int k = 0; k <= cnt_cols; k++) {
                            if(k==1) {
                                    ACPLink_Text = no_cols.get(k).getText();
                                    break;

                                }
                            }

                        }

                    }
                }
            }

        return ACPLink_Text;

    }

    public void Click_RefreshIcon_Enquiry()
    {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("ext-comp-1005");
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/form/div[2]/div[1]/div[1]"));
        List<WebElement> list_items = element.findElements(By.tagName("li"));
        int cnt = list_items.size();
        for(int i=0;i<=cnt;i++)
        {
            if(i==1)
            {
                list_items.get(i).findElement(By.xpath("//*[@id='00B2800000AJIae_refresh']")).click();

            }
        }



    }

    public void Select_First_Enquiry_FromQueue() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("ext-comp-1005");
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/form/div[3]"));
        WebElement table_row = element.findElement(By.xpath("//*[@class='x-grid3-body']/div[1]/table/tbody/tr"));
        List<WebElement> cell_data = table_row.findElements(By.tagName("td"));
        int Cnt = cell_data.size();
        for (int i = 0; i <= Cnt; i++) {
            if (i == 3) {
                  cell_data.get(i).click();
                  break;

            }

        }


    }

    public void Click_Details_FromEnquiry()
    {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("ext-comp-1035");
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[1]"));
        WebElement list_name =  element.findElement(By.tagName("ul"));
        List<WebElement> list_items = list_name.findElements(By.tagName("li"));
        int cnt_list = list_items.size();
        for(int i=0;i<=cnt_list;i++)
        {
            if(i==1)
            {
                WebElement ele_links = list_items.get(i).findElement(By.tagName("a"));
                Actions act = new Actions(driver);
                act.moveToElement(ele_links).click().build().perform();

            }
        }


    }


    public void Click_Edit_ToLinkACPToEnquiry(String acpcode) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("ext-comp-1035");
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]"));
        WebElement element2 = element1.findElement(By.xpath("//*[@id='ep']/div[2]/div[2]/div[5]"));
        List<WebElement> no_tables = element2.findElements(By.tagName("table"));
        int Cnt_tble = no_tables.size();
       label1: for(int i=0;i<=Cnt_tble;i++)
        {
          List<WebElement> no_rows =  no_tables.get(i).findElements(By.tagName("tr"));
          int Cnt_rows =  no_rows.size();
            int row_cnt = no_rows.size();
            for(int j=0;j<=Cnt_rows ;j++)
            {
                if(j==0)
                {
                   List<WebElement> no_cols =  no_rows.get(j).findElements(By.tagName("td"));
                   int Cnt_cols = no_cols.size();
                   for(int k =0;k<=Cnt_cols; k++)
                   {
                       if(k==1)
                       {
                           no_cols.get(k).click();
                           Thread.sleep(300);
                           no_cols.get(k).sendKeys(Keys.ENTER, acpcode);
                           break label1 ;
                       }
                   }
                }

            }
        }

    }


       public void Click_Save_Button()
    {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("ext-comp-1035");
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]"));
        WebElement element2 = element1.findElement(By.xpath("//*[@id='ep']/div[1]"));
        List<WebElement> no_tables = element2.findElements(By.tagName("table"));
        int Cnt_tble = no_tables.size();
        label1: for(int i=0;i<=Cnt_tble;i++) {
            List<WebElement> no_rows = no_tables.get(i).findElements(By.tagName("tr"));
            int Cnt_rows = no_rows.size();
            int row_cnt = no_rows.size();
            for (int j = 0; j <= Cnt_rows; j++) {
                if (j == 0) {
                    List<WebElement> no_cols = no_rows.get(j).findElements(By.tagName("td"));
                    int Cnt_cols = no_cols.size();
                    for (int k = 0; k <= Cnt_cols; k++) {
                        if (k == 1) {
                            no_cols.get(k).findElement(By.xpath("//*[@id='topButtonRow']/input[1]")).click();
                            break label1;
                        }
                    }
                }

            }
        }



    }


    public void Click_Cancel_Button()
    {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("ext-comp-1035");
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]"));
        WebElement element2 = element1.findElement(By.xpath("//*[@id='ep']/div[1]"));
        List<WebElement> no_tables = element2.findElements(By.tagName("table"));
        int Cnt_tble = no_tables.size();
        label1: for(int i=0;i<=Cnt_tble;i++) {
            List<WebElement> no_rows = no_tables.get(i).findElements(By.tagName("tr"));
            int Cnt_rows = no_rows.size();
            int row_cnt = no_rows.size();
            for (int j = 0; j <= Cnt_rows; j++) {
                if (j == 0) {
                    List<WebElement> no_cols = no_rows.get(j).findElements(By.tagName("td"));
                    int Cnt_cols = no_cols.size();
                    for (int k = 0; k <= Cnt_cols; k++) {
                        if (k == 1) {
                            no_cols.get(k).findElement(By.xpath("//*[@id='topButtonRow']/input[2]")).click();
                            element1.findElement(By.xpath("//*[@id='ep']/div[2]/div[2]/div[5]/table/tbody/tr[1]/td[1]")).click();
                            break label1;
                        }
                    }
                }

            }
        }



    }



    public void Click_Delete_OR_UnlinkACP_ToEnquiry() throws InterruptedException {

        driver.switchTo().parentFrame();
        driver.switchTo().frame("ext-comp-1035");
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]"));
        WebElement element2 = element1.findElement(By.xpath("//*[@id='ep']/div[2]/div[2]/div[5]"));
        List<WebElement> no_tables = element2.findElements(By.tagName("table"));
        int Cnt_tble = no_tables.size();
        label1: for(int i=0;i<=Cnt_tble;i++)
        {
            List<WebElement> no_rows =  no_tables.get(i).findElements(By.tagName("tr"));
            int Cnt_rows =  no_rows.size();
            int row_cnt = no_rows.size();
            for(int j=0;j<=Cnt_rows ;j++)
            {
                if(j==0)
                {
                    List<WebElement> no_cols =  no_rows.get(j).findElements(By.tagName("td"));
                    int Cnt_cols = no_cols.size();
                    for(int k =0;k<=Cnt_cols; k++)
                    {
                        if(k==1)
                        {
                            no_cols.get(k).click();
                            no_cols.get(k).sendKeys(Keys.ENTER);
                            no_cols.get(k).findElement(By.xpath("//*[@type='text']")).click();

                            for(int l=0;l<10;l++) {
                                no_cols.get(k).findElement(By.xpath("//*[@type='text']")).sendKeys(Keys.BACK_SPACE);

                            }
                            break label1 ;
                        }
                    }
                }

            }
        }


    }

    public void Capture_ACPValidation_Error_MessageFrom_Enquiry()
    {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("ext-comp-1035");
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]"));
        WebElement element2 = element1.findElement(By.xpath("//*[@id='ep']/div[2]"));
        String Input_Text =   element2.findElement(By.xpath("//*[@id='errorDiv_ep']")).getText();
        String Output_Text = "Error:Once an ACP is set for the enquiry it cannot be changed.";
        Assert.assertEquals(Input_Text, Output_Text);


    }

    public void Close_FirstTab()
    {
         driver.switchTo().parentFrame();
//         driver.switchTo().frame("ext-comp-1035");
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]"));
        WebElement list_name =  element1.findElement(By.tagName("ul"));
        List<WebElement> list_items = list_name.findElements(By.tagName("li"));
        int cnt_list = list_items.size();
        label:for(int i=0;i<=cnt_list;i++)
        {
            if(i==1)
            {
                List<WebElement> ele_links = list_items.get(i).findElements(By.tagName("a"));
                int tag_links = ele_links.size();
                for(int j=0;j<=tag_links; j++) {
                    if(j==0) {
                        Actions act = new Actions(driver);
                        act.moveToElement(ele_links.get(j)).click().build().perform();
                        break label;
                    }
                }

            }
        }
    }


    public void Close_SecondTab()
    {

        WebElement element1 = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]"));
        WebElement list_name =  element1.findElement(By.tagName("ul"));
        List<WebElement> list_items = list_name.findElements(By.tagName("li"));
        int cnt_list = list_items.size();
        label:for(int i=0;i<=cnt_list;i++)
        {
            if(i==2)
            {
                List<WebElement> ele_links = list_items.get(i).findElements(By.tagName("a"));
                int tag_links = ele_links.size();
                for(int j=0;j<=tag_links; j++) {
                    if(j==0) {
                        Actions act = new Actions(driver);
                        act.moveToElement(ele_links.get(j)).click().build().perform();
                        break label;
                    }
                }

            }
        }
    }


    public void Close_ThirdTab()
    {
//        driver.switchTo().parentFrame();
//        driver.switchTo().frame("ext-comp-1035");
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]"));
        WebElement list_name =  element1.findElement(By.tagName("ul"));
        List<WebElement> list_items = list_name.findElements(By.tagName("li"));
        int cnt_list = list_items.size();
       label: for(int i=0;i<=cnt_list;i++)
        {
            if(i==1)
            {
                List<WebElement> ele_links = list_items.get(i).findElements(By.tagName("a"));
                int tag_links = ele_links.size();
                for(int j=0;j<=tag_links; j++) {
                    if(j==0) {
                        Actions act = new Actions(driver);
                        act.moveToElement(ele_links.get(j)).click().build().perform();
                        break label;
                    }
                }

            }
        }
    }


public void Click_Logout()
{
    driver.findElement(By.xpath("//*[@id='userNavLabel']")).click();

     driver.findElement(By.xpath("//*[@id='app_logout']")).click();

}
public void Tear_Down()
{
    driver.quit();
}


}








