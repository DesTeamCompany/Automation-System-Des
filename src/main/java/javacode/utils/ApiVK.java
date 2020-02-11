package javacode.utils;

import com.vk.api.sdk.client.ClientResponse;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.httpclient.HttpTransportClient;

import java.io.IOException;
import java.util.*;

/**
 * Created by Юра on 20.01.2019.
 */
public class ApiVK {

    public VkApiClient getApi(){
        TransportClient transportClient = HttpTransportClient.getInstance();
        return new VkApiClient(transportClient);
    }

    private Map<String, String> getResponse(String authResponse) {
        Map<String,String> responseVk= new HashMap<>();
        String[] list = authResponse.substring(1).replaceAll("}","")
                .replaceAll("\"","").split(",");

        for (String string : list){
            responseVk.put(string.substring(0,string.indexOf(":")),string.substring(string.indexOf(":")+1));
        }

        return responseVk;
    }

    public UserActor getActor() {
        int appId = Integer.parseInt(Props.getProperty("appId"));
        String appKey = Props.getProperty("appKey");
        String userName = Props.getProperty("userName");
        String userPassword = Props.getProperty("userPassword");
        TransportClient transportClient = HttpTransportClient.getInstance();
        ClientResponse authResponse = null;
        try {
            authResponse =  transportClient.post("https://oauth.vk.com/token?grant_type=password&client_id=" + appId + "&client_secret=" + appKey + "&username=" + userName + "&password=" + userPassword + "&v=5.92&2fa_supported=1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert authResponse != null;
        Map<String,String> responseVk = getResponse(authResponse.getContent());


        return new UserActor(Integer.parseInt(responseVk.get("user_id")), responseVk.get("access_token"));
    }
}
