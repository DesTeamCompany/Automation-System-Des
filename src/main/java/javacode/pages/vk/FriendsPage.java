package javacode.pages.vk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

import java.util.List;

/**
 * Created by Юра on 18.01.2019.
 */
@PageEntry(title = "Друзья")
public class FriendsPage extends UserPage
{
    @ElementTitle("Друзья онлайн")
    @FindBy(xpath = "//*[@id=\"friends_tab_online\"]/a")
    public WebElement FriendOnline;

    @ActionTitle("вернуть список друзей онлайн")
    public void Write(){
        try {
            List<WebElement> list = PageFactory.getWebDriver().findElements(By.xpath("//div[contains(@class,'friends_field friends_field_title')]"));
            list.forEach(x-> System.out.println(x.getText()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
