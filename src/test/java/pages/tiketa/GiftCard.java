package pages.tiketa;

import pages.Common;
import pages.Locators;

public class GiftCard {
    public static void open() {
        Common.openUrl("https://www.tiketa.lt/LT/lietuvos_valstybinio_simfoninio_orkestro_dovanu_kuponas_9778");
    }

    public static void clickOnGiftCard() {
        Common.clickElement(Locators.GiftCard.buttonGetGiftCard);
    }

    public static void clickBuyGiftCard() {
        Common.clickElement(Locators.GiftCard.buttonBuyGiftCard);
    }

    public static void clickBuyFor10Eur() {
        waitForPriceChoiceToBeVisible();
        Common.click(Locators.GiftCard.button10Eur);
    }

    public static void switchToFrame() {
        Common.switchToFrame();
    }

    public static void switchToParentFrame(){
        Common.switchToParentFrame();
    }

    public static void clickFindTicket() {
        waitForFindTicketToAppear();
        Common.clickElement(Locators.GiftCard.buttonFindTicket);
    }

    public static void waitForFindTicketToAppear() {
        Common.waitForElementToBeVisible(Locators.GiftCard.buttonFindTicket);
    }

    public static String checkIfCartAppears() {
        waitForTicketToAdd();
        return Common.getElementText(Locators.GiftCard.fieldNumberOfItemsInCard);
    }

    public static void waitForTicketToAdd() {
        Common.waitForElementToBeVisible(Locators.GiftCard.fieldTicket);
    }

    public static void waitForPriceChoiceToBeVisible() {
        Common.waitForElementToBeVisible(Locators.GiftCard.button10Eur);
    }
}
