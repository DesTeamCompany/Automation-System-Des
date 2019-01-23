package javacode.stepdefs;


import cucumber.api.java.ru.Тогда;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.exceptions.PageException;

import java.util.List;

/**
 * Created by Юра on 09.01.2019.
 */
public class CommonStepDefs {

    @Тогда("^нажать на кнопку \"([^\"]*)\"$")
    public void buttonClick(String name) throws InterruptedException {
        try {
            PageFactory.getInstance().getCurrentPage().clickElementByTitle(name);
        } catch (PageException e) {
            e.printStackTrace();
        }
    }
    @Тогда ("^список онлайн$")
        public void Write(){
        try {
            List<WebElement> list = PageFactory.getWebDriver().findElements(By.xpath("//div[contains(@class,'friends_field friends_field_title')]"));
            list.forEach(x-> System.out.println(x.getText()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
