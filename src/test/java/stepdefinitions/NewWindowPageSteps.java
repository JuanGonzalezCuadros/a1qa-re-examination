package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.qameta.allure.Allure.step;
import pages.NewWindowPage;
import utils.BrowserUtils;

public class NewWindowPageSteps {
    NewWindowPage newWindowPage = new NewWindowPage();
    private final String expectedHeader = "New Window";

    @Then("The header of the opened tab is New Window")
    public void NewWindowPage() {
        step("The header of the opened tab is New Window");
        BrowserUtils.switchToNewTab();
        Assert.assertEquals(newWindowPage.getHeaderText(), expectedHeader, "The header is not New Window");
    }

    @When("I go back to the main page using the browser navigation")
    public void returnToMainPage() {
        step("I go back to the main page using the browser navigation");
        BrowserUtils.returnToMainPage();
    }
}
