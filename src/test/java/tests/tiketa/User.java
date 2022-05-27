package tests.tiketa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Constants;
import tests.BaseTest;

public class User extends BaseTest {

    @BeforeMethod //Opening home page and logging in to already existing account, all of these steps are done in Home Page
    public void initialize() {
        pages.tiketa.HomePage.open();
        pages.tiketa.HomePage.closeAd();

        pages.tiketa.HomePage.loggingToSite();
        pages.tiketa.HomePage.clickOnUser();
    }

    @Test //Changing password
    public void changePassword(){
        String expectedMessage = "Vartotojo slaptažodis pakeistas.";
        String newPassword = Constants.PASSWORD;
        pages.tiketa.User.clickUserInfo();
        pages.tiketa.User.changePassword();
        pages.tiketa.User.enterNewPassword(newPassword);
        pages.tiketa.User.enterRepeatNewPassword(newPassword);
        pages.tiketa.User.clickChangePassword();
        String message = pages.tiketa.User.getChangedPasswordMessage();
        Assert.assertEquals(message,expectedMessage);
    }

    @Test //Changing user info (first name and last name) after changing we wait for confirmation to appear (we could assert with that but it might not be accurate)
         //we check if a change was made (we need to refresh a page to see that change) by checking first name and last name shown in the top left corner
    public void changeUserInfo(){
        pages.tiketa.User.clickUserInfo();
        String expectedFirstName = "firstName";
        String expectedLastName = "lastName";
        pages.tiketa.User.clickPersonalUserInfo();
        pages.tiketa.User.enterFirstName(expectedFirstName);
        pages.tiketa.User.enterLastName(expectedLastName);
        pages.tiketa.User.clickSubmitInfo();
        pages.tiketa.User.refresh();
        String actualFirstName = pages.tiketa.User.getFirstNameText();
        String actualLastName = pages.tiketa.User.getLastNameText();
        Assert.assertEquals(actualFirstName.toLowerCase(), expectedFirstName.toLowerCase());
        Assert.assertEquals(actualLastName.toLowerCase(), expectedLastName.toLowerCase());
    }
}
