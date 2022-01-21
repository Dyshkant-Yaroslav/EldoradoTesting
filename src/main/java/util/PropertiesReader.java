package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    Properties properties = new Properties();

    public PropertiesReader() {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("src/main/resources/data.properties");
            properties.load(fileInputStream);
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public String getBaseUrl() {
        return properties.getProperty("BASE_URL");
    }

    public int getDefaultWaitTime() {
        return Integer.parseInt(properties.getProperty("DEFAULT_WAIT_TIME"));
    }

    public String getRealProductName() {
        return properties.getProperty("REAL_PRODUCT_NAME");
    }

    public String getExpectedAmount() {
        return properties.getProperty("EXPECTED_AMOUNT");
    }
    public String getUnrealProductName() {
        return properties.getProperty("UNREAL_PRODUCT_NAME");
    }
    public String getCorrectPhoneNumber() {
        return properties.getProperty("LOGGING_CORRECT_PHONE_NUMBER");
    }
    public String getIncorrectPhoneNumber() {
        return properties.getProperty("LOGGING_INCORRECT_PHONE_NUMBER");
    }
    public String getCorrectPassword() {
        return properties.getProperty("LOGGING_CORRECT_PASSWORD");
    }
    public String getIncorrectPassword() {
        return properties.getProperty("LOGGING_INCORRECT_PASSWORD");
    }
    public String getWelcomeText() {
        return properties.getProperty("WELCOME_TEXT");
    }
    public String getErrorText() {
        return properties.getProperty("INCORRECT_NUMBER_PASSWORD_TEXT");
    }

}
