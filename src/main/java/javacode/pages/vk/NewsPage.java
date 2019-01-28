package javacode.pages.vk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

import java.util.List;

/**
 * Created by Юра on 18.01.2019.
 */
@PageEntry(title = "Новости")
public class NewsPage extends UserPage {
    @ActionTitle("вернуть список новостей")
    public void WriteNews() {
        List<WebElement> list = PageFactory.getWebDriver().findElements(By.xpath("//h5[contains(@class,'post_author')]"));
        list.forEach(x -> System.out.println(x.getText()));
    }
}
