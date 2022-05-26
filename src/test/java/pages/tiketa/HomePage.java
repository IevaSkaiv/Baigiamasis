package pages.tiketa;

import pages.Common;
import pages.Locators;

public class HomePage {
    public static void open() {
        Common.openUrl("https://www.tiketa.lt/LT");
    }

    public static void closeAd() {
        Common.waitForElementToBeVisible(Locators.HomePage.frameAd);
        Common.clickElement(Locators.HomePage.buttonCloseAd);
        Common.clickElement(Locators.HomePage.buttonAcceptCookies);
    }

    public static void enterTextInSearch(String text) {
        Common.sendKeysToElement(Locators.HomePage.inputSearch, text);
    }

    public static void clickSearchIcon() {
        Common.clickElement(Locators.HomePage.buttonSearchIcon);
    }
}

