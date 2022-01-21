package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {
    @FindBy(xpath = "//div[@class='buy-button-placeholder button  ']//div")
    private List<WebElement> buyProductButtonList;
    @FindBy(xpath = "//span[text()='ACER ASPIRE 3']")
    private WebElement searchResultTextSpan;
    @FindBy(xpath = "//div[@class='search-not-found-text-1']")
    private WebElement incorrectSearchingResultDiv;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchResultTextSpan() {
        return searchResultTextSpan;
    }

    public void buyFirstProduct() {
        if (buyProductButtonList.get(0) == null) {
            waitForElementIsVisible(10, buyProductButtonList.get(0));
        }
        buyProductButtonList.get(0).click();
    }

    public String getIncorrectSearchDivText() {
        return incorrectSearchingResultDiv.getText();
    }

    public WebElement getIncorrectSearchingResultDiv() {
        return incorrectSearchingResultDiv;
    }
}
