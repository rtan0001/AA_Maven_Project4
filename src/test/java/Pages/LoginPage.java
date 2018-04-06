package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;


public class LoginPage extends BaseUtil{

//      public WebDriver driver;

    public static Set<String> windows ;




    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }





  @FindBy(how = How.XPATH, using = "//*[@placeholder='Email']")
    public WebElement txtUserName;

  @FindBy(how= How.XPATH, using = "//*[@placeholder='Password']")
    public WebElement txtPassWord;

  @FindBy(how= How.XPATH, using = "//*[@id='content']/div/div[2]/div/div[4]/div/div[3]/button/span")
    public WebElement btnLogin;

//
//    public static void setWindows()
//    {
//        windows = new HashSet<String>();
//        GenerateRegoEmailStep.driver.getWindowHandles().stream().forEach(n -> windows.add(n));
//    }
//
//    public static String getWindow()
//    {
//        windows = new HashSet<String>();
//        List<String> newWindow = GenerateRegoEmailStep.driver.getWindowHandles().stream()
//                .filter(n -> !windows.contains(n)).collect(Collectors.toList());
//        System.out.println(newWindow.get(0));
//        return newWindow.get(0);
//    }
//





  public void Login(String username, String password)
  {
//      String newwindow = getWindow();
//      GenerateRegoEmailStep.driver.switchTo().window(newwindow);
      txtUserName.sendKeys(username);
      txtPassWord.sendKeys(password);

  }
  public MyDetailsPage ClickLogin()
  {
      btnLogin.click();

       MyDetailsPage page2 = new MyDetailsPage(driver);

        return page2;
  }

  public void Click_Logout(String Logout) {
      //*[@class=" profileIcon"]

      driver.findElement(By.xpath("//*[@class=' profileIcon']")).click();

      WebElement element = driver.findElement(By.xpath("//*[@id='header']/div[1]/div[3]/div/div/div/div[2]/div/ul"));

      List<WebElement> list_items = element.findElements(By.tagName("li"));

      for (WebElement items : list_items) {
          if (items.getText().trim().equals(Logout)) {

              items.click();
          }

      }
  }

//    public void Close_Browser() {
//
//      driver.close();
//
//    }








}
