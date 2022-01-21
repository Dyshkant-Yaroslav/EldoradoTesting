package business;


import org.openqa.selenium.WebElement;

public class BusinessProductsBuying {
    private FactoryPages factoryPages = new FactoryPages();


    public void fillAndSearch(String keyword, long time, WebElement element1) {
        factoryPages.getHomePage().fillSearchInput(keyword);
        factoryPages.getHomePage().clickOnFindProductsButton();
        factoryPages.getHomePage().waitForElementIsVisible(time, element1);
    }

    public void buyProductFull(String keyword, long time, WebElement element1, WebElement element2, WebElement element3) {
        fillAndSearch(keyword, time, element1);
        factoryPages.getSearchResultsPage().waitForElementIsVisible(time, element2);
        factoryPages.getSearchResultsPage().buyFirstProduct();
        factoryPages.getHomePage().waitForElementIsVisible(time, element3);
    }

    public FactoryPages getFactoryPages() {
        return factoryPages;
    }

    public void setFactoryPages(FactoryPages factoryPages) {
        this.factoryPages = factoryPages;
    }
}
