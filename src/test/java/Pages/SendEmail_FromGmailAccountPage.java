package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class SendEmail_FromGmailAccountPage extends BaseUtil{

    public SendEmail_FromGmailAccountPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }




    public void Click_Signin_From_Gmail()
    {
        WebElement Element  =  driver.findElement(By.xpath("/html/body"));
        List<WebElement> links = Element.findElements(By.tagName("a"));
        for(WebElement link:links) {
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



    public void Send_OutBound_Email_FromGmailAccount()
    {
        driver.findElement(By.xpath("//*[@class='aic']/div/div")).click();



    }

    public void Compose_Email() throws InterruptedException, IOException {
        driver.findElement(By.name("to")).sendKeys("srregsample@gmail.com");
        driver.findElement(By.name("subjectbox")).sendKeys("Test Email", Keys.TAB);
        driver.findElement(By.xpath("//*[@class='Am Al editable LW-avf']")).click();
        driver.findElement(By.xpath("//*[@class='Am Al editable LW-avf']")).sendKeys("TestEmail From My Gmail Account");
        driver.findElement(By.xpath("//*[@class='a1 aaA aMZ']")).click();

        Runtime.getRuntime().exec("C:\\Users\\rtan0001\\Downloads\\AutoIT\\test.exe");
        Thread.sleep(15000);
        driver.findElement(By.xpath("//*[@class='a8X gU']/div/input")).click();
        Runtime.getRuntime().exec("C:\\Users\\rtan0001\\Downloads\\AutoIT\\test2.exe");
        Thread.sleep(14000);
        driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();

    }

    public void LogOut_Gmail() throws InterruptedException {


        driver.findElement(By.xpath("//*[@class='gb_Ec gb_Lg gb_R']/div[5]/div[1]/a/span")).click();
        Thread.sleep(1000);

    }

    public void Singout_Gmail() throws InterruptedException {
        driver.findElement(By.xpath("//*[@class='gb_Ea gb_Wf gb_4f gb_Le gb_Jb']")).click();
        Thread.sleep(3000);
    }

    public void Close_broeswr_window()
    {
        driver.close();
    }


}
