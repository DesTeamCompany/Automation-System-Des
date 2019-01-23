package javacode.pages.vk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

/**
 * Created by Юра on 18.01.2019.
 */
@PageEntry(title = "Друзья")
public class FriendsPage extends UserPage {@ElementTitle("Друзья онлайн")
@FindBy(xpath = "//*[@id=\"friends_tab_online\"]/a")
public WebElement FriendOnline;
}
