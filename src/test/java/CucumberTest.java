import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.pagefactory.PageFactory;

/**
 * Created by Юра on 09.01.2019.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        junit = {"--step-notifications"},
        plugin = "pretty",
        features = "src/test/java/features",
        glue = {"javacode/stepdefs",
                "javacode/utils",
                "javacode/pages",
                "ru.sbtqa.tag.stepdefs.ru"},
        tags = {"@getListOfFriendsOnline"}
)
public class CucumberTest {
    public void killAll() {
        PageFactory.dispose();
    }
}
