package javacode.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Юра on 09.01.2019.
 */
public class Props {
    protected static FileInputStream fileInputStream;

    public static Properties getPROPERTIES() {
        return PROPERTIES;
    }

    protected static Properties PROPERTIES;

    static {
        try {
            fileInputStream = new FileInputStream("D:\\javaProject\\Automation-System-Des\\src\\test\\resources\\config\\application.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}
