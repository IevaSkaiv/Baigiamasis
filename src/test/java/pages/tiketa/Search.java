package pages.tiketa;

import pages.Common;
import pages.Locators;

public class Search {
    public static String getTextFromFoundEvent() {
        return Common.getElementText(Locators.Search.fieldFoundEvent);
    }
}
