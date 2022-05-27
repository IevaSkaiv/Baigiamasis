package pages.tiketa;

import pages.Common;
import pages.Locators;

public class User {
    public static void open() {
        Common.openUrl("https://www.tiketa.lt/LT/User/Info");
    }
    public static void clickUserInfo() {
        Common.clickElement(Locators.User.buttonUserInfo);
    }

    public static void changePassword() {
        Common.clickElement(Locators.User.buttonChangePassword);
    }

    public static void enterNewPassword(String text) {
        Common.sendKeysToElement(Locators.User.inputNewPassword, text);
    }

    public static void enterRepeatNewPassword(String text) {
        Common.sendKeysToElement(Locators.User.inputRepeatNewPassword, text);
    }

    public static void waitForPasswordInputToAppear(){
        Common.waitForElementToBeClickable(Locators.User.inputNewPassword);
    }

    public static void clickChangePassword() {
        Common.clickElement(Locators.User.buttonSubmitNewPassword);
    }

    public static String getChangedPasswordMessage() {
        return Common.getElementText(Locators.User.fieldChangedPasswordMessage);
    }

    public static void waitForInfoMessage() {
        Common.waitForElementToBeVisible(Locators.User.fieldChangedPasswordMessage);
    }

    public static void clickPersonalUserInfo() {
        Common.clickElement(Locators.User.buttonPersonalUserInfo);
    }

    //this method before inputting text clears the field form previously entered text
    public static void enterFirstName(String text) {
        Common.clearText(Locators.User.inputFirstName);
        Common.sendKeysToElement(Locators.User.inputFirstName, text);
    }

    public static void enterLastName(String text) {
        Common.clearText(Locators.User.inputLastName);
        Common.sendKeysToElement(Locators.User.inputLastName, text);
    }

    public static void clickSubmitInfo() {
        Common.clickElement(Locators.User.buttonSaveData);
    }

    public static void refresh() {
        Common.refreshPage();
    }

    public static void waitForNameInputToAppear() {
        Common.waitForElementToBeVisible(Locators.User.inputFirstName);
    }

    public static void waitForChangedInfoMessage() {
        Common.waitForElementToBeVisible(Locators.User.fieldInfoChangedMessage);
    }

    public static String getFirstNameText() {
        return Common.getElementText(Locators.User.fieldFirstName);
    }

    public static String getLastNameText() {
        return Common.getElementText(Locators.User.fieldLastName);
    }
}
