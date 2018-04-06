package Pages;

import Base.BaseUtil;
import Steps.LoginStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CoursePreferencePage extends BaseUtil {



//    public WebDriver driver;

    public CoursePreferencePage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void  Click_CreateNewButton() throws InterruptedException {

        Thread.sleep(3000);

        LoginStep.driver.findElement(By.xpath("//*[@id='NapiliCommunityTemplate']/div[2]/div/div[2]/div/div[1]/div/div/div/button")).click();

    }

    public void Set_CoursePreference(String course) throws InterruptedException {

        Thread.sleep(3000);

        LoginStep.driver.findElement(By.xpath("//*[@id='searchCourse']/div[1]")).click();

        LoginStep.driver.findElement(By.xpath("//*[@id='searchCourse']/div[5]/form/div[1]/div[1]/input")).sendKeys(course);
    }

    public void Click_Search_Button()
    {
        LoginStep.driver.findElement(By.xpath("//*[@id='searchCourse']/div[5]/form/div[2]/div/button")).click();

    }

    public void Select_AttendanceType(String attandanceType) throws InterruptedException
    {
        Thread.sleep(1000);

        WebElement list_items =  LoginStep.driver.findElement(By.xpath("//*[@id='courseList']/div[1]/form/div[1]/div/select"));

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

        Thread.sleep(1000);

        WebElement list_items =  LoginStep.driver.findElement(By.xpath("//*[@id='courseList']/div[1]/form/div[2]/div/select"));

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

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat formatNowYear = new SimpleDateFormat("YYYY");

        String currentYear = formatNowYear.format(date);

        System.out.println(currentYear);

        Period = currentYear+(" "+"Semester"+" "+2+" "+"("+"July"+" "+"start"+")");


        Thread.sleep(1000);

        WebElement list_items =  LoginStep.driver.findElement(By.xpath("//*[@id='courseList']/div[1]/form/div[3]/div/select"));

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

        LoginStep.driver.findElement(By.xpath("//*[@id='courseList']/div[1]/form/div[4]/button")).click();

    }


    public void Select_CourseCodes_Checkbox() throws InterruptedException
    {
        Thread.sleep(3000);

        WebElement table_collection = LoginStep.driver.findElement(By.xpath("//*[@id='courseList']/table"));
        List<WebElement> rows = table_collection.findElements(By.tagName("tr"));
        int row_Count = rows.size();
        System.out.println("Number of rows:"+ row_Count);

        for(int i=0; i<=row_Count-19 ;i++) {

//           List<WebElement> cols =  rows.get(i).findElements(By.tagName("td"));
//           int col_Count = cols.size();
//           System.out.println("Number of Columns in each row:" +col_Count);
//           for(int j=0; j<col_Count-6; j++) {
//           System.out.println("row value is:" +rows.get(i));

            List<WebElement> elements = LoginStep.driver.findElements(By.xpath("//*[@type='checkbox']"));
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
        LoginStep.driver.findElement(By.xpath("//*[@id='courseList']/div[3]/button[1]")).click();

    }

    public void Click_CloseSearch() throws InterruptedException {

        Thread.sleep(2000);
        LoginStep.driver.findElement(By.xpath("//*[@id='courseList']/div[3]/button[2]")).click();

    }

    public String Validate_CourseText_OnGrid() throws InterruptedException {

        Thread.sleep(4000);

        WebElement table_collection = LoginStep.driver.findElement(By.xpath("//*[@id='appCourseTable']/tbody"));
        List<WebElement> rows = table_collection.findElements(By.tagName("tr"));
        int row_Count = rows.size();
        System.out.println("Number of rows:" + row_Count);

        String pre_text = null;
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            int col_Count = cols.size();
            System.out.println("number of columns:" + col_Count);

            for (WebElement col : cols) {
                if (col.getText().equals("1")) {
                    pre_text = col.getText();
                    break;
                }

            }

        }
        return pre_text;
    }

}
