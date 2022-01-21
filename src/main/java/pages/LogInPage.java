package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {
    @FindBy(xpath = "//div[@class='rodal-dialog']//input[@placeholder='380']")
    private WebElement phoneInput;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//span[@class='new-not-require-input-error-text']")
    private WebElement incorrectPhoneNumber;
    @FindBy(xpath = "//div[@class='sub-title']")
    private WebElement subTitleDiv;

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public void fillPhoneInput(String key) {
        phoneInput.sendKeys(key, Keys.ARROW_UP);
    }

    public void fillPasswordInput(String key) {
        passwordInput.sendKeys(key, Keys.ARROW_UP, Keys.ARROW_UP, Keys.ARROW_UP);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public String getIncorrectNumberText() {
        return incorrectPhoneNumber.getAttribute("class");
    }

    public void clickOnSubTitleDiv() {
        subTitleDiv.click();
    }

    public WebElement getPhoneInput() {
        return phoneInput;
    }

    public WebElement getIncorrectPhoneNumber() {
        return incorrectPhoneNumber;
    }
}
