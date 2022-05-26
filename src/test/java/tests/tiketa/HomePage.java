package tests.tiketa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class HomePage extends BaseTest {
    @BeforeMethod
    public void initialize() {
        pages.tiketa.HomePage.open();
        pages.tiketa.HomePage.closeAd();
    }

    @Test
    //In search tab enter text 'labas', click search button(we get one event with this text in its title), check if the first event found contains expected text
    public void searchForEvents() {
        String expectedText = "labas";
        pages.tiketa.HomePage.enterTextInSearch(expectedText);
        pages.tiketa.HomePage.clickSearchIcon();
        String actualText = pages.tiketa.Search.getTextFromFoundEvent();

        Assert.assertTrue(actualText.toLowerCase().contains(expectedText.toLowerCase())); //before comparing changing all text to lower case letters
    }

    @Test
    //Logging in with already existing account, to see if it was successful check if user icon (on top left corner appears)
    public void loggingInToSite() {
        String email = "skaivydaite@gmail.com";
        String password = "ievute1";
        pages.tiketa.HomePage.clickLogInHomePage();
        pages.tiketa.HomePage.enterEmails(email);
        pages.tiketa.HomePage.enterPassword(password);
        pages.tiketa.HomePage.clickToLogIn();

        Assert.assertTrue(pages.tiketa.HomePage.checkIfUserIconAppears()); //method returns true if the icon is visible
    }
}
