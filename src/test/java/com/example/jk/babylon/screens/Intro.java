package com.example.jk.babylon.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by jk on 19/08/2016.
 */
public class Intro {

    private static String btnLoginWEmail = "activity_registration_login_email";
    private static String btnLoginWFacebook = "activity_registration_login_facebook";
    private static String btnRegisterWEmail = "activity_registration_sign_up";
    private static String btnShareInfo = "share_info_text_view";

    public static void allImportantElementsAreVisible(AppiumDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnLoginWEmail)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnLoginWFacebook)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnRegisterWEmail)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnShareInfo)));
    }

    public static void goToLoginWithEmail(AppiumDriver driver) {
        driver.findElementById(btnLoginWEmail).click();
    }

    public static void goToSignUp(AppiumDriver driver) {
        driver.findElementById(btnRegisterWEmail).click();
    }
}
