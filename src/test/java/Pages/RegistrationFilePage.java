package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegistrationFilePage  {


    public WebDriver driver;


    GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);
    public String email;

    public RegistrationFilePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    public void Registration_Link_Click() throws InterruptedException {
//       driver.findElement(By.xpath("//*[@id='sfdc_forgot'/span[2]/a")).click();
//        Thread.sleep(2000);
//    }
//
//    public void set_GivenName_FamilyName_Email(String given, String Family)
//    {
//        driver.findElement(By.xpath("//*[@placeholder='Given Name']")).sendKeys(given);
//        driver.findElement(By.xpath("//*[@placeholder='Family Name']")).sendKeys(Family);
//        email = reg_email.Set_Email_In_Mailitanor();
//        driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys(email);
//    }
//
//    public void Click_On_SignUp_Button()
//    {
//        driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div[4]/div/div[5]/button")).click();
//    }




}
