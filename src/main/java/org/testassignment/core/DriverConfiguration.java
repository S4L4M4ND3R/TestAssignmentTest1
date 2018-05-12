package org.testassignment.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class DriverConfiguration {

    protected String browser;

    public DriverConfiguration(String browser){
        this.browser = browser;
    }

    public String getBrowser(){
        return browser;
    }

    public WebDriver getLocalDriver(){

        String driverLocation = getDriverLocation(browser);

        switch(browser){
            case "firefox":
                System.setProperty("webdriver.gecko.driver",driverLocation);
                return new FirefoxDriver();
            case "ie11":
                System.setProperty("webdriver.IEDriverServer.driver",driverLocation);
                return new InternetExplorerDriver();
            default:
            case "chrome":
                System.setProperty("webdriver.chrome.driver",driverLocation);
                return new ChromeDriver();
        }
    }

    private String getDriverLocation(String browser){

        if (browser.equalsIgnoreCase("firefox")){
            return new File(".src\\resources\\drivers\\geckodriver.exe").getAbsolutePath();
        } else if (browser.equalsIgnoreCase("chrome")){
            return new File(".src\\resources\\drivers\\chromedriver.exe").getAbsolutePath();
        } else if (browser.equalsIgnoreCase("ie11")){
            return new File(".src\\resources\\drivers\\IEDriverServer.exe").getAbsolutePath();
        }
        return null;
    }

}
