package Pages;

import Base.BaseUtil;
import Steps.LoginStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddCreditIntentionPage extends BaseUtil{


//    public WebDriver driver;

    public AddCreditIntentionPage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void Credit_Intention_Click(String Intention) throws InterruptedException {

        Thread.sleep(2000);

        WebElement element = LoginStep.driver.findElement(By.xpath("//*[@id='NapiliCommunityTemplate']/div[2]/div/div[2]/div/div[3]/div/div[4]/div/div/div[2]/div/form/div[2]/div/div[1]/div/div/select"));


        List<WebElement> list_items = element.findElements(By.tagName("option"));

        for(WebElement items : list_items)
        {
            if(items.getText().trim().equals(Intention))
            {
                items.click();
                break;
            }

        }
    }


}
