package org.testassignment.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultPage {

    WebDriver driver;

    private WebElement searchResultWebelement;

    public GoogleResultPage (WebDriver driver) {
        this.driver = driver;
    }

    public String getSearchResult() {
        searchResultWebelement = driver.findElement(By.id("resultStats"));
        return searchResultWebelement.getText();
    }

}
