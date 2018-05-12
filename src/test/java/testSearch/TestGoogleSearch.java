package testSearch;

import static org.junit.Assert.*;
import main.GoogleSearchPage;
import main.GoogleResultPage;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGoogleSearch {

    WebDriver driver;

    @Test
    public void testGoogleSearchResultValue() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\saboa\\IdeaProjects\\TestAssignmentProject1\\src\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com/");

        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.fillSearchText("cheese");
        GoogleResultPage resultPage = googleSearchPage.clickSearchButton();
        assertTrue("There is too much cheese on the internet! ", resultPage.getSearchResult().contains("777"));

        driver.quit();
    }

}
