package Pages;

import Base.BaseUtil;
import Steps.LoginStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.google.common.base.CharMatcher.digit;
import static com.google.common.base.CharMatcher.is;

public class SubmitTheApplicationPage extends BaseUtil {


//    public WebDriver driver;

    public SubmitTheApplicationPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Click_On_Buttons(String button)
    {
        WebElement element  = driver.findElement(By.xpath("//*[@id='uploadFile']/form/center"));

        List<WebElement> list_items = element.findElements(By.xpath("//*[@type='button']"));

       label: for(WebElement items: list_items)
        {
            if(items.getText().trim().equals(button))
            {
                items.click();
                break label;
            }

        }




    }

    public void Click_On_Accept_Submit_Button()
    {

        LoginStep.driver.findElement(By.xpath("//*[@id='NapiliCommunityTemplate']/div[2]/div/div[2]/div/div/div/center/div/button[2]")).click();

    }

    public String Extract_ApplicantID()
    {

        String text =  LoginStep.driver.findElement(By.xpath("//*[@id='NapiliCommunityTemplate']/div[2]/div/div[2]/div/div/div/div/div[2]/div[2]")).getText();

//        StringBuilder builder = new StringBuilder();
//         for( int i=0; i<text.length(); i++) {
//            char c =  text.charAt(i);
//            if( Character.isDigit(c) && )
//            {
//              builder.append(c);
//            }
//       }
        String output = is('A').or(is('-')).or( digit() ).retainFrom(text);
        System.out.println(output);
        return output;
    }

}
