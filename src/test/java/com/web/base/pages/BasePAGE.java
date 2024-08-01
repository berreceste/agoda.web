package com.web.base.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.web.base.utils.driver.DriverFactory.getDriver;

public class BasePAGE {
    public class BasePage {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));

        public String getCurrentUrl() {
            return getDriver().getCurrentUrl();
        }

        public WebElement findElement(By by) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }

        public List<WebElement> findElements(By by) {
            return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        }

        public void click(By by) {
            findElement(by).click();
        }

        public void click(By by, int order) {
            findElements(by).get(order).click();
        }
    }

}
