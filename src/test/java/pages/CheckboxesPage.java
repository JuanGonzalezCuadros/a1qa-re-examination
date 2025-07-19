package pages;

import constants.LocatorConstants;
import org.openqa.selenium.By;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.forms.Form;

public class CheckboxesPage extends Form {
    private static final String name = "Checkboxes";
    private final ICheckBox checkbox1 = AqualityServices.getElementFactory()
            .getCheckBox(By.xpath("//form[@id='checkboxes']//input[@type='checkbox'][1]"), "Checkbox 1");

    public CheckboxesPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, name)), name);
    }

    public void selectCheckbox1() {
        checkbox1.click();
    }

    public boolean isCheckbox1Selected() {
        return checkbox1.isChecked();
    }
}
