package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseUtil {

    public static WebDriver driver;


    @BeforeMethod
    public static void initialization()
    {
            System.setProperty("webdriver.chrome.driver", "C:\\Lib\\chromedriver.exe");
            driver = new ChromeDriver();

    }

    @AfterMethod
    public static void tearDown()
    {
        driver.quit();
    }






}
