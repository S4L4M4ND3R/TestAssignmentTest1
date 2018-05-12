package testSearch;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.testassignment.core.DriverConfiguration;
import org.testassignment.pageobject.GoogleSearchPage;
import org.testassignment.pageobject.GoogleResultPage;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGoogleSearch {

    DriverConfiguration browser = new DriverConfiguration("chrome");
    WebDriver driver = browser.getLocalDriver();

    @Test
    public void testGoogleSearchResultValue() {

        driver.get("https://www.google.com/");

        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.fillSearchText("cheese");
        GoogleResultPage resultPage = googleSearchPage.clickSearchButton();
        assertTrue("There is too much cheese on the internet! ", resultPage.getSearchResult().contains("777"));

        driver.quit();
    }

}
