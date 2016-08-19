package com.example.jk.babylon.steps;

import com.example.jk.babylon.screens.Login;
import com.example.jk.babylon.screens.Register;
import io.appium.java_client.AppiumDriver;

import com.example.jk.babylon.screens.Intro;

/**
 * Created by jk on 19/08/2016.
 */
public class Then {

    public static void IShouldBeOnTheIntroScreen(AppiumDriver driver){
        Intro.allImportantElementsAreVisible(driver);
    }

    public static void IShouldBeOnTheLoginScreen(AppiumDriver driver){
        Login.allImportantElementsAreVisible(driver);
    }

    public static void IShouldBeOnTheRegistrationScreen(AppiumDriver driver){
        Register.allImportantElementsAreVisible(driver);
    }

    public static void IShouldBeOnTheMainScreen(AppiumDriver driver) {
    }
}
