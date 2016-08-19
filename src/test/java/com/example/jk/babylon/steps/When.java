package com.example.jk.babylon.steps;

import com.example.jk.babylon.screens.Intro;
import com.example.jk.babylon.screens.Login;
import com.example.jk.babylon.screens.Register;
import io.appium.java_client.AppiumDriver;

/**
 * Created by jk on 19/08/2016.
 */
public class When {

    public static void IChooseToLoginWithEmail(AppiumDriver driver){
        Intro.goToLoginWithEmail(driver);
    }

    public static void IPressGoBackOnTheLoginWithEmailScreen(AppiumDriver driver) {
        Login.pressGoBackButton(driver);
    }

    public static void IChooseToRegister(AppiumDriver driver) {
        Intro.goToSignUp(driver);
    }

    public static void IPressGoBackOnTheRegistrationScreen(AppiumDriver driver) {
        Register.pressGoBackButton(driver);
    }

    public static void IEnterRandomDetails(AppiumDriver driver) {
        Register.enterRandomDetails(driver);
    }

    public void ISubmitTheRegistrationForm(AppiumDriver driver) {
        Register.submitTheForm(driver);
    }

    public void IAcceptTheTermsAndConditions(AppiumDriver driver) {
        Register.tickTheTermsAndCOnditionsCheckbox(driver);
    }
}
