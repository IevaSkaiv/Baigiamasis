package tests.tiketa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class GiftCard extends BaseTest {
    @BeforeMethod
    public void initialize(){
        pages.tiketa.HomePage.open();
        pages.tiketa.HomePage.closeAd();
        pages.tiketa.HomePage.loggingToSite();
        pages.tiketa.HomePage.clickGiftCards();
     }

     @Test//trying to put 10eur gift card to cart
     public void putGiftCardInCart(){
        String expectedText = "1";
        pages.tiketa.GiftCard.clickOnGiftCard();
        pages.tiketa.GiftCard.clickBuyGiftCard();
        pages.tiketa.GiftCard.clickBuyFor10Eur();
        pages.tiketa.GiftCard.clickFindTicket();
        String text = pages.tiketa.GiftCard.checkIfCartAppears();
        Assert.assertEquals(text, expectedText);
     }

}
