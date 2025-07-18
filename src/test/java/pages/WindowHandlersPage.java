package pages;

import constants.LocatorConstants;
import org.openqa.selenium.By;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.elements.interfaces.IElement;
import aquality.selenium.forms.Form;

public class WindowHandlersPage extends Form {
    private static final String NAME = "Window Handlers";
    private final IElement clickHere = AqualityServices.getElementFactory()
            .getLink(By.xpath("//a[@href='/windows/new']"), "Click Here");

    public WindowHandlersPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public boolean isClickHereLinkDisplayed() {
        return clickHere.state().isDisplayed();
    }

    public void clickClickHereLink() {
        clickHere.click();
    }
}
