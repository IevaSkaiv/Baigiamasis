package tests.tiketa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class User extends BaseTest {

    @BeforeMethod //Opening home page and logging in to already existing account, all of these steps are done in Home Page
    public void initialize() {
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
    }

    @Test //Changing password (can't to assertion cause there is no message while doing in automatically)
    public void changePassword(){
        String newPassword = "testas111";
        pages.tiketa.User.clickUserInfo();
        pages.tiketa.User.changePassword();
        pages.tiketa.User.waitForPass();
        pages.tiketa.User.enterNewPassword(newPassword);
        pages.tiketa.User.enterRepeatNewPassword(newPassword);
    }
}
