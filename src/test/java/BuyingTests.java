import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyingTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void buyProductPositive() {
        getProductsBuying().buyProductFull(propertiesReader.getRealProductName(), propertiesReader.getDefaultWaitTime(),
                getProductsBuying().getFactoryPages().getSearchResultsPage().getSearchResultTextSpan(),
                getProductsBuying().getFactoryPages().getSearchResultsPage().getSearchResultTextSpan(),
                getProductsBuying().getFactoryPages().getHomePage().getAmountOfProductsInCartDiv());

        Assert.assertEquals(getProductsBuying().getFactoryPages().getHomePage().getAmountOfProductsInCart(),
                propertiesReader.getExpectedAmount());
    }


    @Test(retryAnalyzer = Retry.class)
    public void buyUnrealProduct() {
        getProductsBuying().fillAndSearch(propertiesReader.getUnrealProductName(), propertiesReader.getDefaultWaitTime(),
                getProductsBuying().getFactoryPages().getSearchResultsPage().getIncorrectSearchingResultDiv());

        Assert.assertTrue(getProductsBuying().getFactoryPages().getSearchResultsPage().getIncorrectSearchDivText().
                contains(propertiesReader.getUnrealProductName()));
    }
}

