package business;

import org.openqa.selenium.WebElement;

public class BusinessLogging {
    private FactoryPages factoryPages = new FactoryPages();


    public void fillPhone(String keyword, long time, WebElement element1) {
        factoryPages.getHomePage().clickOnOfficeDiv();
        factoryPages.getLogInPage().waitForElementIsVisible(time, element1);
        factoryPages.getLogInPage().fillPhoneInput(keyword);
        factoryPages.getLogInPage().clickOnSubmitButton();
    }

    public void fillPassword(String keyword, long time, WebElement element1, WebElement element2, String password) {
        fillPhone(keyword, time, element1);
        factoryPages.getOfficePage().waitForElementIsVisible(time, element2);
        factoryPages.getLogInPage().fillPasswordInput(password);
        factoryPages.getLogInPage().clickOnSubmitButton();
    }

    public void logInFull(String keyword, long time, WebElement element1, WebElement element2, String password,
                          WebElement element3, WebElement element4) {
        fillPassword(keyword, time, element1, element2, password);
        factoryPages.getHomePage().waitForElementIsVisible(time, element3);
        factoryPages.getHomePage().clickOnOfficeDiv();
        factoryPages.getOfficePage().waitForElementIsVisible(time, element4);
    }

    public FactoryPages getFactoryPages() {
        return factoryPages;
    }

    public void setFactoryPages(FactoryPages factoryPages) {
        this.factoryPages = factoryPages;
    }
}
