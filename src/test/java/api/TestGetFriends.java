package api;

import com.vk.api.sdk.client.Lang;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.users.UserCounters;
import com.vk.api.sdk.objects.users.UserFull;
import com.vk.api.sdk.objects.users.UserXtrCounters;
import com.vk.api.sdk.queries.users.UserField;
import javacode.utils.ApiVK;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Юра on 28.01.2019.
 */
public class TestGetFriends {

    @Test()
    public void testInformationAboutUser() throws ClientException, ApiException {
        ApiVK apiVK = new ApiVK();
        VkApiClient vk = apiVK.getApi();
        UserActor actor = apiVK.getActor();

        List<UserField> userFields = Arrays.asList(UserField.values());

        List<UserXtrCounters> users = vk.users().get(actor)
                .fields(userFields)
                .lang(Lang.RU)
                .execute();


        for (UserXtrCounters userXtrCounters : users) {
            userXtrCounters.getCounters().toString();
        }
    }
}
