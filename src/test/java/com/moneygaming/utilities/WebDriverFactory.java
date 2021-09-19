package com.moneygaming.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//Static method that has a string parameter name : browserType
//based on the value of the parameter
//it will setup the browser and
//the method will return chromedriver object
//name of this method is getDriver

public class WebDriverFactory {
//here I see the name of this method getDriver
    //and the String parameter with the browserType name

    public static WebDriver getDriver(String browserType) {

        WebDriver driver = null;

        switch (browserType.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();


        }

        return driver;
    }
}