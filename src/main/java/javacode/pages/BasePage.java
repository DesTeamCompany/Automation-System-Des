package javacode.pages;


import org.junit.After;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Юра on 09.01.2019.
 */
public class BasePage extends Page {
    static Map<String, String> urls = new HashMap<>();

    static {
        urls.put("страница с логином", "webdriver.starting.url");
        urls.put("стартовая страница", "startingpage");
    }

    public BasePage() {
      PageFactory.initElements(PageFactory.getWebDriver(), this);
    }

    public static Map<String, String> getSystemUrl() {
        return urls;
    }

    @After
    private void exit(){
    }
}
