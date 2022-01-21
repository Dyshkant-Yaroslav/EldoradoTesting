package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OfficePage extends BasePage {

    @FindBy(xpath = "//div[@class='profile-menu-header']")
    private WebElement welcomeTextDiv;

    public OfficePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWelcomeTextDiv() {
        return welcomeTextDiv;
    }

    public String getTextFromWelcomeTextDiv() {
        return welcomeTextDiv.getText();
    }
}
