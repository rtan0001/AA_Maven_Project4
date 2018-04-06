package Pages;

import Base.BaseUtil;
import Steps.LoginStep;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddWorkExperincePage extends BaseUtil {

//    public WebDriver driver;

    public AddWorkExperincePage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Click_AddWorkExperince() throws InterruptedException {

        Thread.sleep(1000);

//        driver.findElement(By.xpath("//*[@id='myWorkExpDiv']/button")).click();

        LoginStep.driver.findElement(By.xpath("//*[@id='NapiliCommunityTemplate']/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div[2]/div[1]/button")).click();

    }

    public void Set_Position(String position_title) throws InterruptedException {

        Thread.sleep(1000);
        LoginStep.driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[2]/div/div/div/input")).sendKeys(position_title);
    }

    public void Set_Employer(String Employer) throws InterruptedException {

        Thread.sleep(500);

        LoginStep.driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[3]/div/div/div/input")).sendKeys(Employer);


    }
    public void Set_StartDate() throws InterruptedException, ParseException {

        Thread.sleep(500);

        String date = "Sat Jun 01 12:53:10 IST 2013";
        SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd hh:mm:ss Z yyyy");
        Date currentdate = dateFormat.parse(date);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println(dateFormat2.format(currentdate));
        String startdate = dateFormat2.format(currentdate);
        LoginStep.driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[4]/div/div[1]/div/input")).sendKeys(startdate, Keys.TAB);


    }
    public void Set_EndDate() throws InterruptedException {

        Thread.sleep(2000);
        Date todayDate = new Date();
        DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
        String EndDate =  df.format(todayDate);
        System.out.println("String in dd/MMM/yyyy format is:" + EndDate);
        LoginStep.driver.findElement(By.xpath("//*[@id='NapiliCommunityTemplate']/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div[2]/form/div[5]/div/div/div[1]/div/input")).sendKeys(EndDate, Keys.TAB);

    }


    public void Click_SaveButton_WorkExperice() throws InterruptedException
    {
        Thread.sleep(2000);
        LoginStep.driver.findElement(By.xpath("//*[@id='NapiliCommunityTemplate']/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div[2]/form/center/div/button[1]")).click();


    }




}
