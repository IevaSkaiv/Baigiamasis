package pages;

import org.openqa.selenium.By;

public class Locators {
    public static class HomePage {
        public static By frameAd = By.xpath("//*[@class= 'modal-advert-box']");
        public static By buttonCloseAd = By.xpath("//*[@class= 'close js-close-modal-advert']");
        public static By buttonAcceptCookies = By.xpath("//*[@id = 'cookiescript_accept']");
        public static By inputSearch = By.xpath("//*[@id ='mainsearch']");
        public static By buttonSearchIcon = By.xpath("(//*[@type ='submit'])[1]");
        public static By buttonLogInInHomePage = By.xpath("//*[@id ='OnlyLogin']");
        public static By inputEmail = By.xpath("//*[@id ='txtLoginName']");
        public static By inputPassword = By.xpath("//*[@id ='txtLoginPsw']");
        public static By buttonLogIn = By.xpath("//*[@id ='btnLogin']");
        public static By buttonUser = By.xpath("//*[@class='first-name']");
    }

    public static class Search{
        //couldn't get shorter xpath, cause with shorter xpath (checking in site it works) in test it takes wrong elements
        public static By fieldFoundEvent = By.xpath("//*[@id='eventsContainter']/div[3]/div/div/div/a/div[2]/div[1]/p");
    }

    public static class User{
        public static By buttonUserInfo = By.xpath("//*[@href ='/LT/User/Info']");
        public static By buttonChangePassword = By.xpath("(//*[@class='slidedown-arrow arrow-indicator'])[4]");
        public static By buttonPersonalUserInfo = By.xpath("(//*[@class='slidedown-arrow arrow-indicator'])[1]");
        public static By fieldInfoChangedMessage = By.xpath("//*[@class='user-data-ok']");
        public static By inputFirstName = By.xpath("//*[@id='txtFirstname']");
        public static By inputLastName = By.xpath("//*[@id='txtLastname']");
        public static By buttonSaveData = By.xpath("//*[@id='saveData']");
        public static By fieldFirstName = By.xpath("//*[@class='first-name']");
        public static By fieldLastName = By.xpath("//*[@class='second-name text-uppercase']");
        public static By inputNewPassword = By.xpath("//*[@id ='txtNewPassword']");
        public static By inputRepeatNewPassword = By.xpath("//*[@id ='txtRepeatPassword']");
        public static By buttonSubmitNewPassword = By.xpath("(//*[@type='submit' and text()='Išsaugoti'])[4]");
        public static By fieldChangedPasswordMessage = By.xpath("//*[@class = 'user-pass-ok']");
    }
}
