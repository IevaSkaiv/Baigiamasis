package pages.tiketa;

import pages.Common;
import pages.Locators;

public class HomePage {
    public static void open() {
        Common.openUrl("https://www.tiketa.lt/LT");
    }

    public static void closeAd() {
        Common.waitForElementToBeClickable(Locators.HomePage.frameAd);
        Common.clickElement(Locators.HomePage.buttonCloseAd);
        Common.clickElement(Locators.HomePage.buttonAcceptCookies);
    }

    public static void enterTextInSearch(String text) {
        Common.sendKeysToElement(Locators.HomePage.inputSearch, text);
    }

    public static void clickSearchIcon() {
        Common.clickElement(Locators.HomePage.buttonSearchIcon);
    }

    public static void clickLogInHomePage() {
        Common.clickElement(Locators.HomePage.buttonLogInInHomePage);
    }

    public static void enterEmails(String text) {
        Common.sendKeysToElement(Locators.HomePage.inputEmail, text);
    }

    public static void enterPassword(String text) {
        Common.sendKeysToElement(Locators.HomePage.inputPassword, text);
    }

    public static void clickToLogIn() {
        Common.clickElement(Locators.HomePage.buttonLogIn);
    }

    public static boolean doesUserIconAppears() {
        Common.waitForElementToBeClickable(Locators.HomePage.buttonUser);
        return true;
    }
    public static void waitForUserIconAppears() {
        Common.waitForElementToBeClickable(Locators.HomePage.buttonUser);
    }

    public static void clickOnUser() {
        Common.clickElement(Locators.HomePage.buttonUser);
    }
}

