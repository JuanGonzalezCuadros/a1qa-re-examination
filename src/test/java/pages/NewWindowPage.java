package pages;

import constants.LocatorConstants;
import org.openqa.selenium.By;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.elements.interfaces.IElement;
import aquality.selenium.forms.Form;

public class NewWindowPage extends Form {
    private static final String name = "New Window";
    private final IElement header = AqualityServices.getElementFactory()
            .getLink(By.xpath("//h3"), "New Window");

    public NewWindowPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, name)), name);
    }

    public String getHeaderText() {
        return header.getText();
    }
}
