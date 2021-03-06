package javacode.stepdefs;


import cucumber.api.java.ru.Тогда;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
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
}
