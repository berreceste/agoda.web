package com.web.base.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    @BeforeMethod
    public void startUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserName", "chrome");
        try {
            driver.set(new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        getDriver().get("https://www.agoda.com/tr-tr/account/signin.html?ottoken=eyJhbGciOiJBMjU2S1ciLCJlbmMiOiJBMjU2Q0JDLUhTNTEyIn0.nC-K5Gd5JbX3ycnTsGt6syx036QJObN_kyvXCMdkVkZqZgt2gXpMWJkKeyoYsSna3JUkFo9pmdcXRmPCzsrsz8b-BIXxcvGz.d18EorDX3JFEMYNhcA9UwA.ywan74NMuHgWaLDkljM7fskp5EdZRfqBMq3BnXn7YSw3bnhXzvnXOlR_CD0OnLAg.UXSG9yUd3vAKu_HshFyBsKC07yTCr-rqNDQVzo4bO7Y&returnurl=%2Ftr-tr%2F%3Fds%3DOft73XdlazbLTEjF");
        getDriver().findElement(By.className("modal-close"))
                .click();
        getDriver().findElement(By.id("onetrust-accept-btn-handler"))
                .click();
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }
}

