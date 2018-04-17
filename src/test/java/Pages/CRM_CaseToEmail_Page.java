package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Pages.GenerateRegoEmailPage.getWindow;

public class CRM_CaseToEmail_Page extends BaseUtil {

    public String Enq_status = null;


    public CRM_CaseToEmail_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void Click_ACPLink_FromApplication() {
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
                                no_cols.get(k).click();
                                break;

                            }
                        }

                    }

                }
            }
        }



    }


    public void Click_On_ACPDetails_Link() throws InterruptedException {

        driver.switchTo().parentFrame();
        driver.switchTo().frame("ext-comp-1033");

//      driver.switchTo().frame("//*[@id='ext-comp-1018']");
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("/html/body/div[2]"));
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


    public void Click_SendEmailButton_FromACP()
    {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("ext-comp-1033");
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[2]"));
        WebElement element2 = element1.findElement(By.xpath("//*[@class='efObjectDetails']/div[1]/div[2]/div[1]/div[1]"));
        List<WebElement> no_cols = element2.findElements(By.tagName("td"));
        int cols_size = no_cols.size();
        for(int i=0;i<=cols_size ; i++)
        {
            if(i ==1)
            {
                no_cols.get(i).findElement(By.name("send_email_popup")).click();
//                *[@id="topButtonRow"]/input[5]
                break;
            }
        }


    }

    public void Set_NewEmailAddress_into_ToEmail()
    {
        String newwindow = getWindow();
        driver.switchTo().window(newwindow);
        WebElement element1 = driver.findElement(By.xpath("html/body/form"));
        List<WebElement> input_tags = element1.findElements(By.tagName("textarea"));
        int count = input_tags.size();
        for(int i=0; i<=count; i++)
        {
            if(input_tags.get(i).getAttribute("class").contains("recipsFieldTextArea toTextArea"))
            {
                input_tags.get(i).sendKeys("rupa.testingstuff@gmail.com", Keys.TAB);
                break;
            }
        }



}

    public String Get_Enquiry_Ref_Number()
    {

//
        WebElement element1 = driver.findElement(By.xpath("html/body/form"));
        List<WebElement> input_tags = element1.findElements(By.tagName("textarea"));
        int count = input_tags.size();
        String enquiry = null;
        label:for(int i=0; i<=count; i++)
        {
            if(input_tags.get(i).getAttribute("class").contains("subjectTextArea"))
            {
               String sub_Fulltext = input_tags.get(i).getText();
                ArrayList aList = new ArrayList(Arrays.asList(sub_Fulltext.split(" ")));
                for(int j=0;j<aList.size(); j++)
                {
                    if(aList.get(j).toString().contains("#"))
                    {
                        enquiry = aList.get(j).toString();
                        break label;
                    }
                }
            }
        }

        return enquiry;

    }

    public void Send_Email_ToApplicant()
    {
//        String newwindow = getWindow();
//        driver.switchTo().window(newwindow);
        WebElement element1 = driver.findElement(By.xpath("html/body/form"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 250)", "");
          List<WebElement> input_tags = element1.findElements(By.tagName("input"));
          int count = input_tags.size();
          for(int i=0; i<=count; i++)
          {
             if(input_tags.get(i).getAttribute("value").contains("Send Email"))
             {
                 input_tags.get(i).click();
                 break;
             }
          }

    }
    public void Close_SendEmai_Window()
    {
        String newwindow = getWindow();
        driver.switchTo().window(newwindow).close();
    }


  public void Clear_Text_FromSearchField()
  {
      driver.findElement(By.xpath("//*[@id='phSearchInput']")).click();

      for(int i=0;i<=10;i++) {
          driver.findElement(By.xpath("//*[@id='phSearchInput']")).sendKeys(Keys.BACK_SPACE);
      }
  }


    public String Get_EnquiryStatus_AfterSendAnEmail() throws InterruptedException {

        driver.switchTo().frame("ext-comp-1037");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("/html/body/div[2]"));
        WebElement no_tables = element.findElement(By.tagName("table"));
        String  Enq_status = null;
        List<WebElement> no_rows = no_tables.findElements(By.tagName("tr"));

        int rows_count = no_rows.size();
        System.out.println(rows_count);

        Label:for (int i = 0; i <= rows_count; i++) {
            if (i == 3) {

                List<WebElement> no_cols =   no_rows.get(i).findElements(By.tagName("td"));
                int cols_count = no_cols.size();

                for(int j=0;j<=cols_count;j++)
                {
                    if(no_cols.get(j).getText().contains("Closed")) {
                        Enq_status = no_cols.get(j).getText();
                        break Label;
                    }
                }


            }
        }
        return Enq_status;
    }

   public void select_FirstRow_FromInbox()
   {
       WebElement element = driver.findElement(By.xpath("//*[@id=':23']/div[2]/div[1]"));
      List<WebElement> row_list = element.findElements(By.tagName("tr"));
      label:for(WebElement list:row_list)
      {
         List<WebElement> cols_liat =   list.findElements(By.tagName("td"));
         for(WebElement items:cols_liat )
         {
             items.findElement(By.xpath("//*[@id=':3d']/b")).click();
             break label;
         }


      }
   }

   public void Click_ReplyButton_FromEmail()
    {
        driver.findElement(By.xpath("//*[@class='gs']/div[1]/table/tbody/tr[1]/td[4]/div[1]/img")).click();

    }

    public void EnterText_InTextArea_ToReply()
    {


        driver.findElement(By.xpath(" //*[@class='Am aO9 Al editable LW-avf']")).sendKeys("Reply To Test Email");

    }

    public void Click_SendButton()
    {
        driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();

    }

    public String Get_Enquiry_Status_FromEnquiryGrid()
    {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("ext-comp-1005");
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/form/div[3]"));
        WebElement table_row = element.findElement(By.xpath("//*[@class='x-grid3-body']/div[1]/table/tbody/tr"));
        List<WebElement> cell_data = table_row.findElements(By.tagName("td"));
        int Cnt = cell_data.size();
        for (int i = 0; i <= Cnt; i++) {
            if (i == 10)
            {
                Enq_status = cell_data.get(i).getText();
                break;

            }

        }

        return Enq_status;
    }

}
