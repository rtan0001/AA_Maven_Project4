package Pages;

import Base.BaseUtil;
import Steps.GenerateRegoEmailStep;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class MyDetailsPage extends BaseUtil {

//    public WebDriver driver;


    public static Set<String> windows ;

    public MyDetailsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


//    @FindBy(how = How.XPATH, using = "//*[@id='navigationMenu']")
//    public WebElement DetailLink;
//    List<WebElement> list_items;


//        public static void setWindows()
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




    public void Click_MyDetails_Link(String details) {

        WebElement ul_items = driver.findElement(By.xpath("//*[@id='navigationMenu']"));
        List<WebElement> list_items = ul_items.findElements(By.tagName("li"));
       label: for(WebElement li : list_items) {
            List<WebElement> all_links = li.findElements(By.tagName("a"));
            for (WebElement link : all_links) {
                if (link.getText().equals(details)) {
                    link.click();
                    break label;
                }
                System.out.println("Element Found");
            }
        }
    }

    public void  select_title(String Title) throws InterruptedException {

        Thread.sleep(2000);
        WebElement list_items =  driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[2]/div[1]/div[1]/div[1]/select"));
        List<WebElement> options =  list_items.findElements(By.tagName("option"));
        for(WebElement option: options)        {
            if(option.getText().trim().equals(Title))            {
                option.click();
                break;
            }

        }

    }

    public void  Select_Gender(String  Gender) throws InterruptedException {

        Thread.sleep(1000);

        WebElement list_items = driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[6]/div[1]/div[1]/div[1]/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(Gender))
            {
                option.click();
                break;
            }

        }

    }

    public void Enter_DateOfBirth(String DatOfBirth) throws InterruptedException {


        Thread.sleep(1000);

       driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[7]/div[1]/div[1]/div[1]/input")).sendKeys(DatOfBirth, Keys.TAB);

    }
    public void Set_Mobile(String Mobile) throws InterruptedException {


        Thread.sleep(1000);

        GenerateRegoEmailStep.driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[11]/div[1]/div[1]/div[1]/input")).sendKeys(Mobile);

    }

    public void Set_HomePhone(String HomePhone) throws InterruptedException {


        Thread.sleep(1000);

       driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[12]/div[1]/div[1]/div[1]/input")).sendKeys(HomePhone);

    }

    public void Set_WorkPhone(String WorkPhone) throws InterruptedException {


        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[13]/div[1]/div[1]/div[1]/input")).sendKeys(WorkPhone);

    }

    public void  Select_PostalAddress(String  AddressFlag) throws InterruptedException {

        Thread.sleep(1000);

        WebElement list_items = driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[15]/div[1]/div[1]/div[1]/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(AddressFlag))
            {
                option.click();
                break;
            }

        }

    }

    public void Set_StreetNumber(String Street) throws InterruptedException {


        Thread.sleep(1000);

       driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[16]/div[1]/div[1]/div[1]/div[1]/input")).sendKeys(Street);

    }

    public void Set_Suburb(String Suburb) throws InterruptedException {


        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[16]/div[1]/div[1]/div[1]/div[2]/input")).sendKeys(Suburb);

    }

    public void  Select_State(String  State) throws InterruptedException {

        Thread.sleep(1000);

        WebElement list_items =  driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[16]/div[1]/div[1]/div[1]/div[3]/div[1]/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(State))
            {
                option.click();
                break;
            }

        }

    }

    public void Set_PostCode(String PostCode) throws InterruptedException {


        Thread.sleep(1000);

       driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[16]/div[1]/div[1]/div[1]/div[3]/div[2]/input")).sendKeys(PostCode);

    }

    public void  Select_Location(String  Location) throws InterruptedException {

        Thread.sleep(1000);

        WebElement list_items =  driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[18]/div[1]/div[1]/div[1]/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(Location))
            {
                option.click();
                break;
            }

        }

    }

    public void  Select_CitizenShip(String  CitizenShip) throws InterruptedException {

        Thread.sleep(1000);

        WebElement list_items = driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[19]/div[1]/div[1]/div[1]/div[1]/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(CitizenShip))
            {
                option.click();
                break;
            }

        }

    }

    public void  Select_Aboriginal(String  Aboriginal) throws InterruptedException {

        Thread.sleep(1000);

        WebElement list_items = driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[25]/div[1]/div[1]/div[1]/select"));

        List<WebElement> options =  list_items.findElements(By.tagName("option"));

        for(WebElement option: options)
        {
            if(option.getText().trim().equals(Aboriginal))
            {
                option.click();
                break;
            }

        }

    }

    public void  Click_SaveButton() throws InterruptedException {

        Thread.sleep(1000);

        GenerateRegoEmailStep.driver.findElement(By.xpath("//*[@class='slds-form--stacked']/div[27]/center/div[1]/button[1]")).click();

        Thread.sleep(4000);
    }



}




