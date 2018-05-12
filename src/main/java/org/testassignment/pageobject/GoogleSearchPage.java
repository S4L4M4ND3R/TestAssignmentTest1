package org.testassignment.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

    WebDriver driver;

    private WebElement searchFieldWebelement;
    private WebElement searchButtonWebelement;

    public GoogleSearchPage (WebDriver driver) {
        this.driver = driver;
    }

    public void fillSearchText (String searchtext) {
        searchFieldWebelement = driver.findElement(By.id("lst-ib"));
        searchFieldWebelement.sendKeys(searchtext);
    }

    public GoogleResultPage clickSearchButton() {
        searchButtonWebelement = driver.findElement(By.name("btnK"));
        searchButtonWebelement.click();
        return new GoogleResultPage(driver);
    }

//	public GoogleResultPage fillSearchText (String searchtext) {
//		searchFieldWebelement = driver.findElement(By.id("lst-ib"));
//		searchFieldWebelement.sendKeys(searchtext);
//		searchFieldWebelement.submit();
//		return new GoogleResultPage(driver);
//	}

}
