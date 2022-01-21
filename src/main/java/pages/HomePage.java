package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@class='header-icon-wrapper account-wrapper']")
    private WebElement officeIcon;
    @FindBy(xpath = "//span[@class='profile-menu-header-avatar profile-menu-header-avatar-white']")
    private WebElement loggedUserOfficeIcon;
    @FindBy(xpath = "//input[@class='search-input']")
    private WebElement searchInput;
    @FindBy(xpath = "//img[@class='search-icon-button-red']")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@class='header-icon-wrapper']//div[@class='counter counter-cart active']")
    private WebElement amountOfProductsInCart;
    @FindBy(xpath = "//div[@class='main-category']//a[contains(text(),'Смартфон')]")
    private WebElement smartphonesAndPhonesCatalogueCategory;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAmountOfProductsInCartDiv() {
        return amountOfProductsInCart;
    }

    public WebElement getLoggedUserSpan() {
        return loggedUserOfficeIcon;
    }

    public void clickOnOfficeDiv() {
        officeIcon.click();
    }

    public void fillSearchInput(String keyword) {
        searchInput.clear();
        searchInput.sendKeys(keyword);
    }

    public void clickOnFindProductsButton() {
        searchButton.click();
    }

    public String getAmountOfProductsInCart() {
        return amountOfProductsInCart.getText();
    }
}
