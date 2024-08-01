package com.web.base.pages;
import com.web.base.pageElement.PageElementModel;
import com.web.base.pageElement.TestiniumButton;
import com.web.base.pageElement.TestiniumLabel;
import com.web.base.utils.driver.Driver;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
public class MainPage {
    private static final Log log = LogFactory.getLog(ExamplePage.class);
    private static ExamplePage instance;
    private static TestiniumLabel Label_Destination = new TestiniumLabel(PageElementModel.selectorNames.ID, "textInput");
    private static TestiniumButton BTN_Destination = new TestiniumButton(PageElementModel.selectorNames.ID,"property-suggestion-icon-container-7493");
    private static TestiniumButton BTN_EnterDate = new TestiniumButton(PageElementModel.selectorNames.ID, "check-in-box");
    private static List<WebElement> spans;
    public static synchronized ExamplePage getInstance() {
        if (instance == null)
            instance = new ExamplePage();
        return instance;
    }
    public static void mainPage() throws InterruptedException {
        //Destination gir
        Label_Destination.setLabelText("Antalya");
        Thread.sleep(1000);
        BTN_Destination.click();
        //Date gir
        Thread.sleep(1000);
        BTN_EnterDate.click();
        Thread.sleep(1000);
        spans= Driver.webDriver.findElements(By.xpath("//*[contains(@class, 'PriceSurgePicker-Day__label') and contains(@class, 'PriceSurgePicker-Day__label--wide')]"));
        for (WebElement element : spans){
            System.out.println(element.getText());
        }//fghjttjtyıuı77
        for (WebElement element : spans){
            if (element.getText().equals("5")){
                element.click();
            }
        }


        //Ara butonuna tıkla
    }
}
