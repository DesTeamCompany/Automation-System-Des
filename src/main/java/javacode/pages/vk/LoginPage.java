package javacode.pages.vk;

import cucumber.api.java.ru.Тогда;
import javacode.pages.BasePage;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.qautils.properties.Props;

/**
 * Created by Юра on 09.01.2019.
 */

@PageEntry(title = "страница с логином")
public class LoginPage extends BasePage {

    @FindBy(id = "index_email")
    private WebElement login;

    @FindBy(id = "index_pass")
    private WebElement password;

    @FindBy(id = "index_login_button")
    private WebElement loginButton;

    @Тогда("^залогиниться в вк$")
    public void login() {
        login.sendKeys(Props.get("userName"));
        password.sendKeys(Props.get("userPassword"));
        loginButton.click();
    }
}
