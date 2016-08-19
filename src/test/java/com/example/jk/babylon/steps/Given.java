package com.example.jk.babylon.steps;

import io.appium.java_client.AppiumDriver;

import com.example.jk.babylon.screens.Intro;

/**
 * Created by jk on 19/08/2016.
 */
public class Given {

    public static void IAmOnTheIntroScreen(AppiumDriver driver){
        Intro.allImportantElementsAreVisible(driver);
    }

    public static void IAmOnTheLoginWithEmailScreen(AppiumDriver driver){
        Given.IAmOnTheIntroScreen(driver);
        When.IChooseToLoginWithEmail(driver);
        Then.IShouldBeOnTheLoginScreen(driver);
    }

    public static void IAmOnTheRegistrationScreen(AppiumDriver driver) {
        Given.IAmOnTheIntroScreen(driver);
        When.IChooseToRegister(driver);
        Then.IShouldBeOnTheRegistrationScreen(driver);
    }
}
