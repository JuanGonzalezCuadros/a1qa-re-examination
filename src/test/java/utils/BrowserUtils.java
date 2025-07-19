package utils;

import java.util.List;

import aquality.selenium.browser.Browser;
import org.openqa.selenium.WebDriver;

import aquality.selenium.browser.AqualityServices;
import lombok.experimental.UtilityClass;

@UtilityClass
public class BrowserUtils {
    Browser browser = AqualityServices.getBrowser();
    WebDriver driver = AqualityServices.getBrowser().getDriver();
    List<String> handles = List.copyOf(driver.getWindowHandles());

    public static void navigateBack() {
        browser.goBack();
    }

    public static void RefreshPage() {
        browser.refresh();
    }

    public static void switchToTab(int tabIndex) {
        driver.switchTo().window(handles.get(tabIndex));
    }

    public static void closeTab() {
        browser.tabs().close();
    }
}
