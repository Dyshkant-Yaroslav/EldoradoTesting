package business;

import pages.HomePage;
import pages.LogInPage;
import pages.OfficePage;
import pages.SearchResultsPage;
import util.PropertiesReader;

public class FactoryPages {

    private HomePage homePage;
    private LogInPage logInPage;
    private OfficePage officePage;
    private SearchResultsPage searchResultsPage;

    public HomePage getHomePage() {
        return homePage;
    }

    public void setHomePage(HomePage homePage) {
        this.homePage = homePage;
    }

    public LogInPage getLogInPage() {
        return logInPage;
    }

    public void setLogInPage(LogInPage logInPage) {
        this.logInPage = logInPage;
    }

    public OfficePage getOfficePage() {
        return officePage;
    }

    public void setOfficePage(OfficePage officePage) {
        this.officePage = officePage;
    }

    public SearchResultsPage getSearchResultsPage() {
        return searchResultsPage;
    }

    public void setSearchResultsPage(SearchResultsPage searchResultsPage) {
        this.searchResultsPage = searchResultsPage;
    }

}
