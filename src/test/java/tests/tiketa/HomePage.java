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
    //In search tab enter text 'labas', click search button(we get one event with this text in it's title), check if the first event found contains expected text
    public void searchForEvents() {
        String expectedText = "labas";
        pages.tiketa.HomePage.enterTextInSearch(expectedText);
        pages.tiketa.HomePage.clickSearchIcon();
        String actualText = pages.tiketa.HomePage.getTextFromFoundEvent();
        System.out.println(actualText);
        Assert.assertTrue(actualText.toLowerCase().contains(expectedText.toLowerCase()));
    }

}
