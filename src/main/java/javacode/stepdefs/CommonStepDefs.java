package javacode.stepdefs;


import cucumber.api.java.ru.Тогда;

import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.exceptions.PageException;

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
