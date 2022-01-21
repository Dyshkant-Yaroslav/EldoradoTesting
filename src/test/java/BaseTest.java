import business.BusinessLogging;
import business.BusinessProductsBuying;
import business.FactoryPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.LogInPage;
import pages.OfficePage;
import pages.SearchResultsPage;
import util.PropertiesReader;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    PropertiesReader propertiesReader = new PropertiesReader();
    WebDriver driver;
    BusinessLogging logging = new BusinessLogging();
    BusinessProductsBuying productsBuying = new BusinessProductsBuying();
    FactoryPages factoryPages = new FactoryPages();


    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://eldorado.ua/");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BusinessProductsBuying getProductsBuying() {
        productsBuying.setFactoryPages(getFactoryPages());
        return productsBuying;
    }

    public BusinessLogging getLogging() {
        logging.setFactoryPages(getFactoryPages());
        return logging;
    }

    public FactoryPages getFactoryPages() {
        factoryPages.setHomePage(getHomePage());
        factoryPages.setLogInPage(getLogInPage());
        factoryPages.setOfficePage(getOfficePage());
        factoryPages.setSearchResultsPage(getSearchResultsPage());
        return factoryPages;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public LogInPage getLogInPage() {
        return new LogInPage(getDriver());
    }

    public OfficePage getOfficePage() {
        return new OfficePage(getDriver());
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(getDriver());
    }

}
