package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class GenerateRegoEmailPage extends BaseUtil {


//    public WebDriver driver;

//    GenerateRegoEmailPage reg_email = new GenerateRegoEmailPage(driver);
//    public String email;


//    WebDriverWait wait = new WebDriverWait(GenerateRegoEmailStep.driver, 10);

    public static Set<String> windows ;


    public GenerateRegoEmailPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


        public void Navigate_To_Mailinator()
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Lib\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.mailinator.com/");
        }
//
        public String Set_Email_In_Mailitanor() {

        Random rad = new Random();
        String email = null;
        for (int j = 1; j <= 1; j++) {
            System.out.println("rupa" + rad.nextInt(100));

            email = ("rupa" + rad.nextInt(100));

            System.out.println(email);

            driver.findElement(By.xpath("//*[@id='inboxfield']")).sendKeys(email);
        }

        return email;
    }

      public void  Click_GoButton()
      {
          driver.findElement(By.xpath("//*[@class='btn btn-dark']")).click();

      }

      public String Get_Title() {
          String full_text = driver.findElement(By.xpath("//*[@title='This Inbox receives all email sent to this address']")).getText();
          String[] str_split = full_text.split("@");
          String title_text = null;
          for (int i = 0; i < str_split.length; i++) {
              System.out.println(str_split[0]);
              title_text = str_split[0];
              break;
          }

          return title_text;
      }

    public String Get_Full_Title() {
        String full_Full_text = driver.findElement(By.xpath("//*[@title='This Inbox receives all email sent to this address']")).getText();

        return full_Full_text;
    }


    public void Registration_Link_Click() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='sfdc_forgot']/span[2]/a")).click();
        Thread.sleep(2000);
    }

    public void set_GivenName_FamilyName_Email(String given, String Family, String title)
    {
        driver.findElement(By.xpath("//*[@placeholder='Given Name']")).sendKeys(given);
        driver.findElement(By.xpath("//*[@placeholder='Family Name']")).sendKeys(Family);
        driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys(title);
    }

    public void Click_On_SignUp_Button()
    {
       driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div[4]/div/div[5]/button")).click();

    }

    public void  Set_Created_Email_into_Inbox(String created_email)
    {
        driver.findElement(By.xpath("//*[@id='inboxfield']")).sendKeys(created_email);
    }

    public void Click_Welcome_Email() throws InterruptedException

    {

        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='FROM']")));

        element.click();




    }
    public void Click_Complete_Registration() throws InterruptedException

    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='msgpane']")));
        element.click();

        Thread.sleep(3000);

        driver.switchTo().frame("msg_body");

        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/a")).click();

//
//        List<WebElement> elements = element.findElements(By.tagName("td"));
//
//        for(WebElement ele_links: elements)
//        {
//            if(ele_links.getText().equals("Complete Registration"))
//            {
//                ele_links.click();
//            }
//        }

//         element.click();



    }


    public String Get_textEmailFrom_WelcomePage() throws InterruptedException {

//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='msgpane']")));
//        element.click();

        Thread.sleep(3000);

//        driver.switchTo().frame("msg_body");

        driver.findElement(By.xpath("//*[@id='query_data']/div[4]")).click();
        String webtext = driver.findElement(By.xpath("//*[@id='query_data']/div[4]")).getText();

        return webtext;
    }

    public static void setWindows()
    {
        windows = new HashSet<String>();
        driver.getWindowHandles().stream().forEach(n -> windows.add(n));
    }

    public static String getWindow()
    {
        windows = new HashSet<String>();
        List<String> newWindow = driver.getWindowHandles().stream()
                .filter(n -> !windows.contains(n)).collect(Collectors.toList());
        System.out.println(newWindow.get(1));
        return newWindow.get(1);
    }

    public static String getWindow_First()
    {
        windows = new HashSet<String>();
        List<String> newWindow = driver.getWindowHandles().stream()
                .filter(n -> !windows.contains(n)).collect(Collectors.toList());
        System.out.println(newWindow.get(0));
        return newWindow.get(0);
    }


    public void  Set_password() throws InterruptedException {

        Thread.sleep(9000);

        String newwindow = getWindow();
        driver.switchTo().window(newwindow);

        driver.findElement(By.xpath("//*[@id='content']")).click();
        driver.findElement(By.xpath("//*[@id='editPage']/div[1]/label[1]")).click();
        driver.findElement(By.xpath("//*[@id='editPage']/div[1]/div[1]/input")).sendKeys("monash@2017");
    }

    public void  Set_ConfirmPassword()
    {

       driver.findElement(By.xpath("//*[@id='editPage']/div[1]/label[2]")).click();
        driver.findElement(By.xpath("//*[@id='editPage']/div[1]/div[2]/input")).sendKeys("monash@2017");

    }

    public void  Click_Change_Password() throws InterruptedException {

//        Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id='password-button']")).click();

        Thread.sleep(4000);
    }


    public void Click_Logout(String Logout) throws InterruptedException {
        //*[@class=" profileIcon"]



        windows = new HashSet<String>();

        String newwindow = getWindow();
        driver.switchTo().window(newwindow);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=' profileIcon']")).click();

        WebElement element = driver.findElement(By.xpath("//*[@id='header']/div[1]/div[3]/div/div/div/div[2]/div/ul"));

        List<WebElement> list_items = element.findElements(By.tagName("li"));

        for (WebElement items : list_items) {
            if (items.getText().trim().equals(Logout)) {

                items.click();
            }

        }
    }






}
