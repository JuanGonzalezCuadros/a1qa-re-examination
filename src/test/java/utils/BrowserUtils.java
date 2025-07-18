package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

    public static void switchToNewTab() {
        driver.switchTo().window(handles.get(1));
    }

    public static void returnToMainPage() {
        browser.tabs().close();
        driver.switchTo().window(handles.get(0));
        navigateBack();
    }
}
