package javacode.stepdefs;


import cucumber.api.java.ru.Тогда;
import javacode.pages.BasePage;

import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.qautils.properties.Props;

/**
 * Created by Юра on 09.01.2019.
 */
public class CommonStepDefs {

    @Тогда("^открыта страница \"([^\"]*)\"$")
    public void pageIsOpen(String title) throws Throwable {
        if (BasePage.getSystemUrl().containsKey(title)) {
            PageFactory.getWebDriver().get(Props.get(BasePage.getSystemUrl().get(title)));
        }
        PageFactory.getInstance().getPage(title);
    }

}
