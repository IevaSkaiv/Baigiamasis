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
        Common.click(Locators.GiftCard.button10Eur);
    }

    public static void waitForPriceChoiceToAppear() {
        Common.waitForElementToBeVisible(Locators.GiftCard.button10Eur);
    }

    public static String getMessageForTicketChoice() {
        return Common.getElementText(Locators.GiftCard.fieldMessageForGiftCardPrice);
    }
}
