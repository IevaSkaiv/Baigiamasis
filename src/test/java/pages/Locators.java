package pages;

import org.openqa.selenium.By;

public class Locators {
    public static class HomePage {
        public static By frameAd = By.xpath("//*[@class= 'modal-advert-box']");
        public static By buttonCloseAd = By.xpath("//*[@class= 'close js-close-modal-advert']");
        public static By buttonAcceptCookies = By.xpath("//*[@id = 'cookiescript_accept']");
        public static By inputSearch = By.xpath("//*[@id ='mainsearch']");
        public static By buttonSearchIcon = By.xpath("(//*[@type ='submit'])[1]");
        public static By fieldFoundEvent = By.xpath("//*[@id='eventsContainter']/div[3]/div/div/div/a/div[2]/div[1]/p");
    }
}
