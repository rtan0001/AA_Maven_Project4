package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.util.List;

public class Test2 {


    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, ParseException {
//        Date date = new Date();
//       System.out.println(date);
//
//
//        SimpleDateFormat formatNowMonth = new SimpleDateFormat("MM");
//        SimpleDateFormat formatNowYear = new SimpleDateFormat("YYYY");
//
//        String currentMonth = formatNowMonth.format(date);
//        String currentYear = formatNowYear.format(date);
//
//       System.out.println(currentYear);
//
//     String Period = currentYear+(" "+"Semester"+" "+2+" "+"("+"July"+" "+"start"+")");

        System.setProperty("webdriver.chrome.driver", "C:\\Lib\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://test.salesforce.com/");
        Thread.sleep(4000);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='username']")).clear();

        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("rupa.tanneero@monash.edu.staging");

        driver.findElement(By.xpath("//*[@id='password']")).clear();

        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("monash@2017");

        driver.findElement(By.xpath("//*[@id='Login']")).click();

        Thread.sleep(6000);

//        Insert receipt number into search field.

        driver.findElement(By.xpath("//*[@id='phSearchInput']")).click();

        driver.findElement(By.xpath("//*[@id='phSearchInput']")).sendKeys("A-266295", Keys.ENTER);

        Thread.sleep(5000);

//Switch to frames and identify links and perform click operations'
        driver.switchTo().frame("ext-comp-1018");
        WebElement element = driver.findElement(By.xpath("/html/body/div[2]"));

        WebElement no_tables = element.findElement(By.tagName("table"));

        List<WebElement> no_rows = no_tables.findElements(By.tagName("tr"));

          int rows_count = no_rows.size();
          System.out.println(rows_count);

        for (int i = 0; i <= rows_count; i++) {
            if (i == 3) {

                no_rows.get(i).findElement(By.tagName("a")).click();

            }
        }

    }


    }



