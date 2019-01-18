package javacode.pages.vk;

import javacode.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

/**
 * Created by Юра on 16.01.2019.
 * Updated by Витя on 18.01.2019
 */
@PageEntry(title = "Моя страница")
public class UserPage extends BasePage {

    @ElementTitle("Моя страница")
    @FindBy(id = "l_pr")
    public WebElement MainPage;

    @ElementTitle("Новости")
    @FindBy(id = "l_nwsf")
    public WebElement News;

    @ElementTitle("Сообщения")
    @FindBy(id = "l_msg")
    public WebElement Messeges;

    @ElementTitle("Друзья")
    @FindBy(id = "l_fr")
    public WebElement Friends;

    @ElementTitle("Группы")
    @FindBy(id = "l_gr")
    public WebElement Groups;

    @ElementTitle("Фотографии")
    @FindBy(id = "l_ph")
    public WebElement Photos;

    @ElementTitle("Музыка")
    @FindBy(id = "l_aud")
    public WebElement Music;

    @ElementTitle("Видео")
    @FindBy(id = "l_vid")
    public WebElement Videos;
}
