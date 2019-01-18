package javacode.pages.vk;

import cucumber.api.java.ru.Тогда;
import javacode.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.qautils.properties.Props;

/**
 * Created by Юра on 16.01.2019.
 * Updated by Витя on 18.01.2019
 */
@PageEntry(title = "стартовая страница")
public class UserPage extends BasePage {
    @FindBy(id = "l_pr")
    private WebElement MainPage;

    @FindBy(id = "l_nwsf")
    private WebElement News;

    @FindBy(id = "l_msg")
    private WebElement Messeges;

    @FindBy(id = "l_fr")
    private WebElement Friends;

    @FindBy(id = "l_gr")
    private WebElement Groups;

    @FindBy(id = "l_ph")
    private WebElement Photos;

    @FindBy(id = "l_aud")
    private WebElement Music;

    @FindBy(id = "l_vid")
    private WebElement Videos;

    @FindBy(id = "l_ap")
    private WebElement Applic;

    @Тогда("^нажми на ссылки$")
    public void links() {
        MainPage.click();
        Messeges.click();
        Friends.click();
        Groups.click();
        Photos.click();
        Music.click();
        Videos.click();
        Applic.click();
        News.click();
    }
}
