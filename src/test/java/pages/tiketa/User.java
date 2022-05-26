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

    public static void waitForPass(){
        Common.waitForElementToBeVisible(Locators.User.inputNewPassword);
    }
}
