package com.web.base.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePAGE {

    By emailTextBox = By.id("email");
    By passwordTextBox = By.id("password");
    By submitButton = By.className("sc-fzoiQi hsJTpM");
 

    public void login(String email, String password, boolean isSuccess) {
        findElement(emailTextBox).sendKeys(email);
        findElement(passwordTextBox).sendKeys(password);
        click(submitButton);

        if (isSuccess) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(successElement));
        } else {
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorBox));
        }
    }

    private void click(By submitButton) {
    }
}