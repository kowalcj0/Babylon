package com.example.jk.babylon.screens;

import com.example.jk.babylon.Utils.RandomString;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by jk on 19/08/2016.
 */
public class Register {
    private static String lblScreenTitle = "action_bar_title";
    private static String btnBack = "action_bar_back_arrow";
    private static String inptEmail = "emailEdt";
    private static String inptName = "nameEdt";
    private static String inptLastName = "lastNameEdt";
    private static String inptDoB = "dateofBirthEdt";
    private static String inptPassw = "passwordEdt";
    private static String spnnrLocation = "location_spinner";
    private static String inptPromoCode = "promo_code_edit_text";
    private static String chbxTC = "create_account_terms_and_conditions_check_box";
    private static String btnCreateAccount = "createAccountBtn";

    public static void allImportantElementsAreVisible(AppiumDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnBack)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(lblScreenTitle)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(inptEmail)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(inptPassw)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(inptName)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(inptLastName)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(inptDoB)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(spnnrLocation)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(inptPromoCode)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(chbxTC)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnCreateAccount)));
    }

    public static void pressGoBackButton(AppiumDriver driver) {
        driver.findElementById(btnBack).click();
    }

    public static void enterRandomDetails(AppiumDriver driver){
        RandomString rnd = new RandomString(16);
        String rndString = rnd.nextString();
        String email = "kowalczykjanusz+appium+"+rndString+"+@gmail.com";
        String passw = "password12345";
        String firstName = "Janusz";
        String lastName = "Kowalczyk";

        driver.findElementById(inptEmail).sendKeys(email);
        driver.findElementById(inptPassw).sendKeys(passw);
        driver.findElementById(inptName).sendKeys(firstName);
        driver.findElementById(inptLastName).sendKeys(lastName);
        driver.findElementById(inptDoB).click();
        setTheDoBDate(driver, "01", "Jan", "1980");
    }

    public static void submitTheForm(AppiumDriver driver) {
        //driver.hideKeyboard();
        driver.findElementById(btnCreateAccount).click();
    }

    public static void setTheDoBDate(AppiumDriver driver, String day, String month, String year) {
        driver.findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys(day);
        driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys(month);
        driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys(year);
        driver.findElement(By.id("android:id/button1")).click();
    }

    public static void tickTheTermsAndCOnditionsCheckbox(AppiumDriver driver) {
        driver.findElementById(chbxTC).click();
    }
}
