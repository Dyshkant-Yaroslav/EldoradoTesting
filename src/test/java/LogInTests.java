import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void logInPositive() {
        getLogging().logInFull(propertiesReader.getCorrectPhoneNumber(), propertiesReader.getDefaultWaitTime(),
                getLogging().getFactoryPages().getLogInPage().getPhoneInput(),
                getLogging().getFactoryPages().getLogInPage().getPasswordInput(), propertiesReader.getCorrectPassword(),
                getLogging().getFactoryPages().getHomePage().getLoggedUserSpan(),
                getLogging().getFactoryPages().getOfficePage().getWelcomeTextDiv());

        Assert.assertTrue(getLogging().getFactoryPages().getOfficePage().getTextFromWelcomeTextDiv().
                contains(propertiesReader.getWelcomeText()));
    }


    @Test(retryAnalyzer = Retry.class)
    public void logInWithWrongPhoneNumber() {
        logging.fillPhone(propertiesReader.getIncorrectPhoneNumber(), propertiesReader.getDefaultWaitTime(),
                getLogging().getFactoryPages().getLogInPage().getPhoneInput());

        logging.getFactoryPages().getLogInPage().clickOnSubTitleDiv();

        Assert.assertTrue(logging.getFactoryPages().getLogInPage().getIncorrectNumberText()
                .contains(propertiesReader.getErrorText()));
    }


    @Test(retryAnalyzer = Retry.class)
    public void logInWithWrongPassword() {
        logging.fillPassword(propertiesReader.getCorrectPhoneNumber(), propertiesReader.getDefaultWaitTime(),
                getLogging().getFactoryPages().getLogInPage().getPhoneInput(),
                logging.getFactoryPages().getLogInPage().getPasswordInput(), propertiesReader.getIncorrectPassword());

        logging.getFactoryPages().getLogInPage().waitForElementIsVisible(propertiesReader.getDefaultWaitTime(),
                logging.getFactoryPages().getLogInPage().getIncorrectPhoneNumber());

        Assert.assertTrue(logging.getFactoryPages().getLogInPage().getIncorrectNumberText().
                contains(propertiesReader.getErrorText()));
    }


}