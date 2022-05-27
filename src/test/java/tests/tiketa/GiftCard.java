package tests.tiketa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Constants;
import tests.BaseTest;

public class GiftCard extends BaseTest {
    @BeforeMethod
    public void initialize(){
        pages.tiketa.HomePage.open();
        pages.tiketa.HomePage.closeAd();

        String email = Constants.EMAIL;
        String password = Constants.PASSWORD;
        pages.tiketa.HomePage.clickLogInHomePage();
        pages.tiketa.HomePage.enterEmails(email);
        pages.tiketa.HomePage.enterPassword(password);
        pages.tiketa.HomePage.clickToLogIn();
        pages.tiketa.HomePage.clickOnUser();
        pages.tiketa.HomePage.clickGiftCards();
     }

     @Test//trying to put 10eur gift card to cart
     public void putGiftCardInCart(){
        String expectedText = "1";
        pages.tiketa.GiftCard.clickOnGiftCard();
        pages.tiketa.GiftCard.clickBuyGiftCard();
        pages.tiketa.GiftCard.switchToFrame();
        pages.tiketa.GiftCard.clickBuyFor10Eur();
        pages.tiketa.GiftCard.switchToParentFrame();
        pages.tiketa.GiftCard.clickFindTicket();
        String text = pages.tiketa.GiftCard.checkIfCartAppears();
        Assert.assertEquals(text, expectedText);
     }

}
