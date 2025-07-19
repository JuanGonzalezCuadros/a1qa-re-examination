package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.qameta.allure.Allure.step;
import pages.CheckboxesPage;
import utils.BrowserUtils;

public class CheckboxesPageSteps {
    CheckboxesPage checkboxesPage = new CheckboxesPage();

    @Then("Checkboxes page is open")
    public void isCheckboxesPageDisplayed() {
        step("Checkboxes page is open");
        Assert.assertTrue(checkboxesPage.state().isDisplayed(), "The Checkboxes page is not open");
    }

    @When("I select Checkbox 1")
    public void selectCheckbox1() {
        step("I select Checkbox 1");
        checkboxesPage.selectCheckbox1();
    }

    @Then("Checkbox 1 is selected")
    public void isCheckbox1Selected() {
        step("Checkbox 1 is selected");
        Assert.assertTrue(checkboxesPage.isCheckbox1Selected(), "The Checkbox 1 is not selected");
    }

    @When("I refresh the page")
    public void pageRefresh() {
        step("I refresh the page");
        BrowserUtils.RefreshPage();
    }

    @Then("Checkbox 1 is not selected")
    public void isCheckbox1NotSelected() {
        step("Checkbox 1 is not selected");
        Assert.assertTrue(!checkboxesPage.isCheckbox1Selected(), "The Checkbox 1 is selected");
    }
}
