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

        String email = "skaivydaite@gmail.com";
        String password = "testas111";
        pages.tiketa.HomePage.clickLogInHomePage();
        pages.tiketa.HomePage.enterEmails(email);
        pages.tiketa.HomePage.enterPassword(password);
        pages.tiketa.HomePage.clickToLogIn();
        pages.tiketa.HomePage.waitForUserIconAppears();
        pages.tiketa.HomePage.clickOnUser();
        pages.tiketa.HomePage.clickGiftCards();
     }

     @Test//trying to put 10eur gift card to cart (can't do it causes of iframes, so we check if we are able to go to gift card price choices)
     public void putGiftCardInCart(){
        String expectedMessage = "Bilietų pasirinkimas";
        pages.tiketa.GiftCard.clickOnGiftCard();
        pages.tiketa.GiftCard.clickBuyGiftCard();
        String actualMessage = pages.tiketa.GiftCard.getMessageForTicketChoice();
        Assert.assertEquals(actualMessage, expectedMessage);
//        pages.tiketa.GiftCard.waitForPriceChoiceToAppear();
//        pages.tiketa.GiftCard.clickBuyFor10Eur();
//        pages.tiketa.GiftCard.clickFindTicket();
//        boolean doesCartAppears = pages.tiketa.GiftCard.checkIfCartAppears();
//        Assert.assertTrue(doesCartAppears);
     }

}
