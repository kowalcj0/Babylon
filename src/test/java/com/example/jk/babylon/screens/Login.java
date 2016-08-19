package com.example.jk.babylon.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Created by jk on 19/08/2016.
 */
public class Login {
    private static String lblScreenTitle = "action_bar_title";
    private static String btnBack = "action_bar_back_arrow";
    private static String inptEmail = "emailEdt";
    private static String inptPassw = "passwordEdt";
    private static String btnResetPassword = "resetPasswordTxt";
    private static String btnSignIn = "signInBtn";

    public static void allImportantElementsAreVisible(AppiumDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnBack)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(lblScreenTitle)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(inptEmail)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(inptPassw)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnResetPassword)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnSignIn)));
    }

    public static void pressGoBackButton(AppiumDriver driver) {
        driver.findElementById(btnBack).click();
    }
}
